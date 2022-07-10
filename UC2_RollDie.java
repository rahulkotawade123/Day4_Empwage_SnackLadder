package Day_4;

public class UC2_RollDie {

	public static void main(String[] args) {

		int player_1 = 1;
		int player_2 = 6;
		int playerPosition = 0;
		
		System.out.println("Wecome To Snake Ladder Program");
         
		int dice = (int) Math.floor(Math.random()*6+1);
		
		System.out.println("Player Position:"+dice);
	}
}



