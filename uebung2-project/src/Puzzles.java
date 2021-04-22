
public class Puzzles {
	
	/*
	 * Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. 
     * Return 0 if they both go over.
     * 
     * blackjack(19, 21) ->  21
     * blackjack(21, 19) ->  21
     * blackjack(19, 22) ->  19
	 * 
	 */
	
	public int blackJack(int a, int b) {
		if(a > 21 && b > 21) {
			return 0 ;
    }
			if(a > 21){
			 return b;
			}else if(b > 21){
			  return a;
			} else if(a > b){
			  return a;
			} else if(a < b){
			  return b;
			}
		
		return 0;
	}
		
	
	/*
	 * Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count 
	 * towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
     *
     * luckySum(1, 2, 3)  ->  6
     * luckySum(1, 2, 13) ->  3
     * luckySum(1, 13, 3) ->  1
	 * 
	 */
	
	public int luckySum(int a, int b, int c) {
		  int sum = 0;
		  
		  if(a != 13){
		  sum = sum + a;
		  }
		  if(a != 13 && b != 13){
		  sum = sum + b;
		  }
		  if(b != 13 && c != 13 && a != 13){
		  sum = sum + c;
		  }
		  return sum;
	}

		
		
	public static void main(String[] args) {

		}

}
