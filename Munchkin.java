import java.awt.*;
/**
 * This is a Munchkin subclass of MashUpPlayer.
 * It overrides the getMove() method from abstract superclass.
 * 
 * Munchkins like to stay put and pivot in place.
 * However, be wary of crossing them. They will attack when encountered by foreign species.
 * Their colors alternate blue/green depending on the current orientation.
 * 
 *  @author Anthony Wocken
 */



public class Munchkin extends MashUpPlayer {
    /**
     * Initializes this character's state
     * Invokes constructor of superclass with initial parameter values
     */
    public Munchkin() {
        super("A",Color.BLUE);
    }
    
    /**
     * This method provides the character's actions.
     * It overrides the superclass method.
     * 
     * @param MashUpPlayerInfo simulation information about this character
     * @return the current Action
     */
    public Action getMove(MashUpPlayerInfo info) {

        if(info.getDirection() == Direction.NORTH || info.getDirection() == Direction.SOUTH) {
            setColor(Color.GREEN);
        } else {
            setColor(Color.BLUE);
        }

        if(info.getFront() == Neighbor.OTHER) {
            return Action.FIGHT;
        } else {
            return Action.LEFT; 
        }
    }
}
