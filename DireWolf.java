import java.awt.*;

/**
 * This is a DireWolf subclass of MashUpPlayer.
 * It overrides the getMove() method from abstract superclass.
 * 
 * Direwolves are bloodthirsty, cannibalistic, and territorial.
 * They attack their own kind when encountered and turn blood red after they've had the taste.
 * They track around in a designated area.
 * 
 *  @author Anthony Wocken
 */

public class DireWolf extends MashUpPlayer
{
    private int currentMoveIndex = 0;
    private Action[] sequentialMoves = {Action.MOVE, Action.MOVE, Action.RIGHT,
                                        Action.MOVE, Action.LEFT, Action.MOVE, Action.RIGHT};
                                    
    /**
     * Initializes this character's state
     * Invokes constructor of superclass with initial parameter values
     */
    public DireWolf() {
        super("<\\* */>",Color.WHITE);
    }
    
    /**
     * This method provides the character's actions.
     * It overrides the superclass method.
     * 
     * @param MashUpPlayerInfo simulation information about this character
     * @return the current Action
     */
    public Action getMove(MashUpPlayerInfo info) {
        
        if(info.getFront() == Neighbor.SAME | info.getFront() == Neighbor.OTHER){
            setColor(Color.RED);
            return Action.FIGHT;         
        } else if(info.getFront() == Neighbor.WALL) {
            
            setColor(Color.WHITE);
            currentMoveIndex = 0;
            return Action.RIGHT; 
                    
        } else {
            if((currentMoveIndex + 1) > (sequentialMoves.length)) {
                currentMoveIndex = 0;
            }
            return sequentialMoves[currentMoveIndex++];
        }
    
    }
  
}