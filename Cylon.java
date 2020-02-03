import java.awt.*;

/**
 * This is a Cylon subclass of MashUpPlayer.
 * It overrides the getMove() method from abstract superclass.
 * 
 * Cylons like to zig zag around.
 * However, be wary of crossing them. They will attack when they encounter any foreign species head on.
 * If a Cylon ever finds itself with two or more OTHER neighbors, it becomes
 * very aggressive and changes its string state to /\/\
 * 
 * 
 *  @author Anthony Wocken
 */



public class Cylon extends MashUpPlayer {

    private final Action[] sequentialMoves = {Action.MOVE, Action.RIGHT, Action.MOVE, Action.LEFT};
    private int currentMoveIndex = 0;
    
    /**
     * Initializes this character's state
     * Invokes constructor of superclass with initial parameter values
     */
    public Cylon() {
        super("//", Color.RED);
    }
    
    /**
     * This method provides the character's actions.
     * It overrides the superclass method.
     * 
     * @param MashUpPlayerInfo simulation information about this character
     * @return the current Action
     */
    public Action getMove(MashUpPlayerInfo info) {

        int otherNeighborCount = getOtherNeighborCount(info);

        if(info.getFront() == Neighbor.OTHER) {
            return Action.FIGHT;
        } else if(otherNeighborCount >= 2) {
            setDisplay("/\\/\\");
        }

        if(info.getFront() == Neighbor.WALL || info.getFront().equals(Cylon.class)) {
            currentMoveIndex = 0;
            return Action.TURN_AROUND;
        } else {
            if((currentMoveIndex + 1) > (sequentialMoves.length)) {
                currentMoveIndex = 0;
            }
            return sequentialMoves[currentMoveIndex++];
        }

    }
    
    /**
     * This method tracks and provides information about the character's current neighbors
     * 
     * @param MashUpPlayerInfo simulation information about this character
     * @return existingNeighborCount counts existing neighbors
     */
    private int getOtherNeighborCount(MashUpPlayerInfo info) {
        Neighbor frontNeighbor = info.getFront();
        Neighbor backNeighbor = info.getBack();
        Neighbor leftNeighbor = info.getLeft();
        Neighbor rightNeighbor = info.getRight();

        int existingNeighborCount = 0;
        if(frontNeighbor == Neighbor.OTHER) existingNeighborCount++;
        if(backNeighbor == Neighbor.OTHER) existingNeighborCount++;
        if(leftNeighbor == Neighbor.OTHER) existingNeighborCount++;
        if(rightNeighbor == Neighbor.OTHER) existingNeighborCount++;

        return existingNeighborCount;
    }
}
