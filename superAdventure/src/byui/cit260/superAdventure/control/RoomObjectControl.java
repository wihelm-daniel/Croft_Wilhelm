package byui.cit260.superAdventure.control;

public class RoomObjectControl {

    public double checkLockCover(double radius, double height) {

        if (radius < 1) {
            System.out.println("Enter a number between 1.0 and 8.0");
            return -1;
        }
        if (radius > 8) {
            System.out.println("Enter a number less than 8.0");
        }

        double volumeLow = 1; // The other class doesn't exist yet, this is just a temporary holder.
        double volumeHigh = 540.0; //The other class doesn't exist yet, this is just a temporary holder.
        double answer = Math.PI * (Math.pow(radius, 2) * (height / 3));

        if (answer >= volumeLow && answer <= volumeHigh) {
            return answer;

        } else if (answer < volumeLow) {
            System.out.println("Volume too low. Sand dumped out.");

            return answer;
        } else {
            System.out.println("Volume too high. Sand dumped out");
            return answer;

        }
    }
}
