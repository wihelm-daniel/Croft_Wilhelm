package byui.cit260.superAdventure.control;

public class RoomObjectControl {

    public float checkLockCover(int radius, int height) {

        if (radius < 1) {
            System.out.println("Enter a number between 1.0 and 8.0");
            return -1;
        }
        if (radius > 8) {
            System.out.println("Enter a number less than 8.0");
        }
        
        float volumeLow = 1; // The other class doesn't exist yet, this is just a temporary holder.
        float volumeHigh = 536; //The other class doesn't exist yet, this is just a temporary holder.
        float volume = (float)((float) Math.PI * (Math.pow(radius, 2) * (height / 3)));
        int answer = Math.round(volume);
        if (answer >= volumeLow && answer <= volumeHigh) {
            return answer;

        } else if (volume < volumeLow) {
            System.out.println("Volume too low. Sand dumped out.");

            return 0;
        } else {
            System.out.println(" Volume too high. Sand dumped out");
            return 0;

        }
    }
}
