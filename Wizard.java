import java.awt.*;
/**
 * This is a Wizard subclass of MashUpPlayer.
 * It overrides the getMove() method from abstract superclass.
 * 
 * If a Wizard faces an OTHER, it FIGHTS. 
 * Otherwise, a Wizard travels around its domain: 
 * five MOVES in one direction, then turn RIGHT, five MOVES in this new direction, 
 * then turn RIGHT, repeatedly. 
 * If it runs into a wall or another Wizard, turn RIGHT and start over again. 
 * 
 *  @author Anthony Wocken
 */

public class Wizard extends MashUpPlayer
{
    
    private int currentWizardMoveIndex = 0;
    private Action[] sequentialMoves = {Action.MOVE, Action.MOVE, Action.MOVE,
                                        Action.MOVE, Action.MOVE, Action.RIGHT};
    
    /**
     * Initializes this character's state
     * Invokes constructor of superclass with initial parameter values
     */
    public Wizard() {
        super("^\u221e^",Color.GRAY);
    }
    
    /**
     * This method provides the character's actions.
     * It overrides the superclass method.
     * 
     * @param MashUpPlayerInfo simulation information about this character
     * @return the current Action
     */
    public Action getMove(MashUpPlayerInfo info) {
        
        if(info.getFront() == Neighbor.OTHER){             
            return Action.FIGHT;         
        } else if(info.getFront() == Neighbor.WALL) {
            
            
            currentWizardMoveIndex = 0;
            return Action.RIGHT; 
                    
        } else {
            if((currentWizardMoveIndex + 1) > (sequentialMoves.length)) {
                currentWizardMoveIndex = 0;
            }
            return sequentialMoves[currentWizardMoveIndex++];
        }
    
    }
  
}