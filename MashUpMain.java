
/**
 * MashUpMain provides the main method for a simple simulation program.  Alter
 * the number of each entity added to the simulation if you want to experiment
 * with different scenarios.  You can also alter the width and height passed to
 * the MashUpFrame constructor.

 * by Stuart Reges and Marty Stepp
 */

public class MashUpMain {
    public static int COUNT = 30;
    public static void main(String[] args) {
        MashUpFrame frame = new MashUpFrame(60, 40);

        // uncomment each of these lines as you complete these classes
        frame.add(COUNT, Munchkin.class);
        frame.add(COUNT, Cylon.class);
        frame.add(COUNT, Wizard.class);
        frame.add(COUNT, DireWolf.class);
       

        frame.start();
    }
}
