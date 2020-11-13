public class Player
{
    String name;
    Board_Grid Player_Board;
    Board_Grid Enemy_Board;
    Player(String Player_name)
    {
        this.name = Player_name;
        Player_Board = new Board_Grid();
        Enemy_Board = new Board_Grid();
    }
}
