public class GridPath 
{
    /**
     * Initialized in the constructor with distinct values that never change
     */
    private int[][] grid;

    public GridPath(int[][] values)
    {
        grid = values;
    }

    public String toString()
    {
        String s = "";
        for(int row = 0; row < grid.length; row++)
        {
            for (int col = 0; col < grid[0].length; col++)
            {
                s += grid[row][col] + " ";
            }
            s += "\n";
        }
        return s;
    }

    /**
     * Returns the Location representing a neighbor of the grid element at row
     * and col, as described in part (a) Preconditions: row is a valid row index
     * and col is a valid column index in grid. row and col do not specify the
     * element in the last row and last column of grid.
     */
    public Location getNextLoc(int row, int col) 
    {
        int belowElement = 999;
        int rightElement = 999;
        if(row+1 <= grid.length)
        {
            rightElement = grid[row+1][col];
        }
        if(col+1 <= grid[0].length)
        {
            belowElement = grid[row][col+1];
        }
        if(belowElement < rightElement){
            return(new Location(row+1,col));
        }
        if(rightElement < belowElement){
            return(new Location(row,col+1));
        }
        return null;
    }

    /**
     * Computes and returns the sum of all values on a path through grid, as
     * described in part (b) Preconditions: row is a valid row index and col is
     * a valid column index in grid. row and col do not specify the element in
     * the last row and last column of grid.
     */
    public int sumPath(int row, int col) 
    {
        int sum = 0;

        return sum;
    }
}