public class Board_Grid
{
    int[][] Grid;
    Board_Grid()
    {
        Grid = new int[10][10];
    }
    void Set_Ship_Mark (int x, int y)
    {
        this.Grid[x-1][y-1] = 2;
    }
    void Set_X_Mark (int x, int y)
    {
        this.Grid[x-1][y-1] = 1;
    }
    int Check_Coordinates (int x, int y)
    {
        return this.Grid [x-1][y-1];
    }
}
