package lab2_Question2;

public class question2 {

	public static void main(String[] args) {
		
		//makeBricks testcases
		
		if(makeBricks(3, 1, 8) == true) {
			System.out.println("makeBricks(3, 1, 8) -> Correct!");
		} else System.out.println("makeBricks(3, 1, 8) -> False!");
		if(makeBricks(3, 1, 9) == false) {
			System.out.println("makeBricks(3, 1, 9) -> Correct!");
		} else System.out.println("makeBricks(3, 1, 9) -> False!");
		if(makeBricks(3, 2, 10) == true) {
			System.out.println("makeBricks(3, 2, 10) -> Correct!");
		} else System.out.println("makeBricks(3, 2, 10) -> False!");
		if(makeBricks(1, 4, 12) == false) {
			System.out.println("makeBricks(3, 1, 8) -> Correct!");
		} else System.out.println("makeBricks(3, 1, 8) -> False!");
		
		//roundSum testcases
		
		if(roundSum(16, 17, 18) == 60) {
			System.out.println("roundSum(16, 17, 18) -> Correct!");
		} else System.out.println("roundSum(16, 17, 18) -> False!");
		if(roundSum(12, 13, 14) == 30) {
			System.out.println("roundSum(12, 13, 14) -> Correct!");
		} else System.out.println("roundSum(12, 14, 14) -> False!");
		if(roundSum(6, 4, 4) == 10) {
			System.out.println("roundSum(6, 4, 4) -> Correct!");
		} else System.out.println("roundSum(6, 4, 4) -> False!");
		if(roundSum(20, 30, 40) == 90) {
			System.out.println("roundSum(20, 30, 40) -> Correct!");
		} else System.out.println("roundSum(20, 30, 40) -> False!");
	}
	
	
	//Make a row of bricks that is GOAL inches long. We have a number of small bricks (1 inch each) and big bricks(5 inches each)
	//Return true if possible to make the goal by choosing from the given bricks
	public static boolean makeBricks(int small, int big, int goal) {
		return false;
		
	}
	
	//Return the sum of the int values a, b, and c which are all to be rounded to the next multiple of 10. 
	//Write a separate helper "public int round10(int num){}" and call it 3 times for a, b and c respectively, to avoid code repetition
	public static int roundSum(int a, int b, int c) {
		return 0;
	}
	
}
