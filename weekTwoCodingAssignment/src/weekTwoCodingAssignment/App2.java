package weekTwoCodingAssignment;

public class App2 {

	public static void main(String[] args) {
		// Java Week 2 Coding Assignment
		//What do each of the following Boolean expressions evaluate to?
		//true && false . . . . . . . .false
		//true || false . . . . . . . .true
		//false && false . . . . . . . false
		//true && (false || true) . . .true
		//false || (true && false) . . false
		//false || 1 < 5 . . . . . . . true
		//5 >= 4 && 1 > 3 . . . . . . .false
		//10 < 4 || 1 > 4 . . . . . . .false
		//("Hello".charAt(0) == 'h'). .false, H = H; H != h
		
		//Create Boolean variables and choose what values they hold.
		boolean isHotOutside = true;
			System.out.println("isHotOutside");
		boolean isWeekday = true;
			System.out.println("isWeekday");
		boolean hasMoneyInPocket = true;
			System.out.println("hasMoneyInPocket");
		//Create the following variables, choose the best data type.
		double costOfMilk = 5;
		double moneyInWallet = 15;
		int thirstLevel = 3;
		//Create variables for the following scenarios: 
		boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket;
			System.out.println(shouldBuyIceCream); 
		boolean willGoSwimming = isHotOutside && !isWeekday; 
			System.out.println(willGoSwimming); 
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
			System.out.println(isAGoodDay);
		boolean willBuyMilk = (isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= (2 * costOfMilk))); 
			System.out.println(willBuyMilk); 
		}
		
	}
		
