import java.util.*;

public class Game
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean Someone_Won = false;
        int x;
        int y;
        int Coordinates_flag;

        Player Player_1 = new Player("Illia");
        Player Player_2 = new Player("Philip");

        while (!Someone_Won)
        {   // this whole part is only a first player's turn
            while (true) // enter coordinates and check if a player shot there before
            {
                System.out.println("Player 1's turn!\nPlease input x and y coordinates for a shot:");
                x = sc.nextInt();
                y = sc.nextInt();
                Coordinates_flag = Player_1.Enemy_Board.Check_Coordinates(x,y);
                if (Coordinates_flag == 1 || Coordinates_flag == 2) // check if a player already shot there
                {
                    System.out.println("You have already shot there before!");
                    System.out.println(Coordinates_flag);
                }
                else break;
            }
            //Shoot an enemy's board (check if there is a ship)
            if (Player_2.Player_Board.Check_Coordinates(x, y) == 2)
            {
                System.out.println("You shot right!");
                Player_1.Enemy_Board.Set_Ship_Mark(x,y);
            }
            else
            {
                System.out.println("You missed :(");
                Player_1.Enemy_Board.Set_X_Mark(x,y);
            }
        }
    }
}
