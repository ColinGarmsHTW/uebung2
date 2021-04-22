import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase {

	@Test 
	public void testBlackJack() {
		Puzzles testObject = new Puzzles();
		
		// Test, ob die größere Zahl ausgewählt wird
		int resultBlackJack = testObject.blackJack(7,15);
		assertEquals(15, resultBlackJack);
	}
	
	@Test 
	public void testBlackJackOneOver() {
		Puzzles testObject = new Puzzles();
		
		// Test, ob die Zahl ausgewählt wird, die nicht über 21 liegt
		int resultBlackJackOneOver = testObject.blackJack(13,22);
		assertEquals(13, resultBlackJackOneOver);
		
	}
	
	@Test 
	public void testBlackJackBothOver() {
		Puzzles testObject = new Puzzles();
		
		// Test, ob 0 zurückgegeben wird, weil beide Zahlen über 21 liegen
		int resultBlackJackBothOver = testObject.blackJack(32,22);
		assertEquals(0, resultBlackJackBothOver);
		
	}
	
	@Test 
	public void testLuckySum() {
		Puzzles testObject = new Puzzles();
		
		
		// Test, ob alle Zahlen zusammengerechnet wird
		int resultLuckySum = testObject.luckySum(1,2,3);
		assertEquals(6, resultLuckySum);
	}
	
	@Test 
	public void testLuckySumFirstThirteen() {
		Puzzles testObject = new Puzzles();
		
		
		// Test, ob 0 zurückgegeben wird, weil die erste Zahl 13 ist
		int resultLuckySum = testObject.luckySum(13,5,2);
		assertEquals(0, resultLuckySum);
	}
	
	@Test 
	public void testLuckySumLastThirteen() {
		Puzzles testObject = new Puzzles();
		
		
		// Test, ob die ersten beiden Zahlen zusammengerechnet werden, weil die letzte Zahl 13 ist
		int resultLuckySum = testObject.luckySum(1,4,13);
		assertEquals(5, resultLuckySum);
	}
}
