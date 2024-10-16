public class Main
{
    public static void main(String[] args)
    {
        GridPath grid = new GridPath();
        System.out.println(grid.getNextLoc(0,0));
        System.out.println(grid.getNextLoc(1,3));
        System.out.println(grid.getNextLoc(2,4));
        System.out.println(grid.getNextLoc(4,3));
    }
}