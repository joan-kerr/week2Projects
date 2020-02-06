package weekTwoCodingAssignment;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//A while loop that prints all even numbers from 0 to 100
	int i = 0;
	while ( i <= 50) {
		System.out.println(i * 2);
		 i++; 
	  } 
//A while loop that prints every 3rd number backwards from 100 to 0
	int x = 100; 
	while ( x < 101 && x > 0) {
		System.out.println( x );
		x -= 3;
		}
//A for loop that prints every other number from 1 - 100
	for (int y = 1; y <= 100; y += 2) {
		System.out.println(y);
		}
//A for loop, prints 0 - 100, Hello, World, and Hello World
		for (int z = 0; z <= 100; z++) {
			if (z % 3 == 0 && z % 5 != 0) System.out.println("Hello ");
			if (z % 5 == 0 && z % 3 != 0) System.out.println("World ");
			if (z % 5 == 0 && z % 3 == 0) System.out.println("Hello World! ");
			if (z % 5 != 0 && z % 3 != 0) System.out.println(z);
	    }
      }
    }