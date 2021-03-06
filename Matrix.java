/** class to model a 3 x 4 matrix of doubles <br>
  * Supports Gaussian row operations
  * <br> In this version, rows and columns start at 0
  * @author csc 142 class
  */

public class Matrix {
    
    public static final int ROW = 3;
    public static final int COL = 4;
    
    // declare the instance variable that will hold the 2-dim array
    
    
    /**Instantiate a ROW x COL matrix, empty
      */
    public Matrix() {
        
    }
    
    
    /** set the value of a particular element in the matrix
      * @param row the row of the element. 0 <= row < Matrix.ROW
      * @param col the column of the element.   0 <= col < Matrix.COL
      * @param value the value to be stored
      * @throws ArrayIndexOutOfBoundsException for invalid row or column
      */
    public void setValue(int row, int col, double value) {
        // Why don't we have to test row/col for validity?
        
    }
    
    /** returns the value of a particular element in the matrix
      * @param row the row of the element. 0 <= row < Matrix.ROW
      * @param col the column of the element.   0 <= col < Matrix.COL
      * @throws ArrayIndexOutOfBoundsException for invalid row or column
      */
    public double getValue(int row, int col) {
        
    }
    
    
    /** swap 2 rows of this matrix
      * @param r1 one of the rows to swap.  0 <= r1 < Matrix.ROW
      * @param r2 the other row to swap.   0 <= r2 < Matrix.ROW
      * @throws ArrayIndexOutOfBoundsException for invalid row or column
      */
    public void swapRows(int r1, int r2) {
        
    }
    
    /** multiply one row by a non-zero constant
      * @param multiple the non-zero constant
      * @param row the row to change
      * @throws IllegalArgumentException if multiple is 0
      * @throws ArrayIndexOutOfBoundsException for invalid row
      */
    public void multiplyRow(double multiple, int row) {
        
    }
    
    /** add row r1 into row r2. Equivalent to r2 += r1 
     * @param r1 the row to add  0 <= r1 < Matrix.ROW
     * @param r2 the row to add into.  0 <= r2 < Matrix.ROW.  This row will change.
     * @throws ArrayIndexOutOfBoundsException for invalid row
     */
    public void addRows (int r2, int r1) {
        
    }
    
    /**
     * set new row in the matrix
     * @param row the new row to insert
     * @param rIdx the index of this new row  0 <= rIdx < Matrix.ROW
     * @return the old row
     * @throws IllegalArgument exception if row is not the correct length of Matrix.COL
     * @throws ArrayIndexOutOfBoundsException for invalid row
     */
    public double[] replace(double[] row, int rIdx){
        
    }
    
    /**
     * Add 2 Matrices together and return a new Matrix
     * @param m the 2nd Matrix
     * @return the matrix sum of this + m
     */
    
    public Matrix sum(Matrix m){
        
    }
    
    
    /** Return this matrix as a String of 3 rows of numbers in 4 columns
      */
    public String toString() {
        
    }
}  