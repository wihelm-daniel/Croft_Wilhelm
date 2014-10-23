package byui.cit260.superAdventure.control;

public class RoomObjectControl {

    public int checkLockCover(int radius, int height) {

        if (radius < 1) {
            System.out.println("Enter a number between 1.0 and 8.0");
            return -1;
        }
        if (radius > 8) {
            System.out.println("Enter a number less than 8.0");
        }
        
        int volumeLow = 0; // The other class doesn't exist yet, this is just a temporary holder.
        int volumeHigh = 537; //The other class doesn't exist yet, this is just a temporary holder.
        float power = (float) Math.pow(radius, 2);
        float divisor =  (float) height/3;
        int volume = (int)( Math.PI * power * divisor);
        System.out.println("volume = " + volume);
        if (volume >= volumeLow && volume <= volumeHigh) {
            return volume;

        } else if (volume < volumeLow) {
            System.out.println("Volume too low. Sand dumped out.");

            return -1;
        } else {
            System.out.println(" Volume too high. Sand dumped out");
            return -1;

        }
    }
}
