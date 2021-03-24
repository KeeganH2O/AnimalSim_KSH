
public class Application{

	public static void main(String[] args) throws InvalidCoordinateException, InvalidSubspeciesException{
		System.out.println("**********************************\n 	  Location Tests");
		
			System.out.println("This is used in goldfinch and BrownBear classes");
			
		System.out.println("**********************************");
		System.out.println("**********************************\n 	  Animal Tests");
		/** won't run b/c it's an abstract class
		 */
		
		System.out.println("This is an Abstract class which will prevent this program from running\nalso used in goldfinch and BrownBear classes");
		// Animal Rawr = new Animal();
		
		
		System.out.println("**********************************");
		
		/** Goldfinch Class Tests
		 *
		 */
		System.out.println("**********************************\n 	  Goldfinch Tests");
		Goldfinch Tweetie = new Goldfinch();
		//WingSpan Tests
		Tweetie.setWingSpan(12.0);
		System.out.println(Tweetie.getWingSpan());
		
		//Eaten Tests (run multiple times to change println result of has eaten.)
		System.out.println("Tweetie has eaten today: " +Tweetie.isFull());
		Tweetie.eat();
		System.out.println("Tweetie it is past lunch time, Have you eaten today? " +Tweetie.isFull()+"\n");
		
		//sleep tests
		System.out.println("Tweetie did you sleep today (nap)? " + Tweetie.isRested());
		Tweetie.sleep();
		System.out.println("Tweetie what about now? " +Tweetie.isRested()+"\n");
		
		//Walk Tests
		Tweetie.walk(1);
		Tweetie.walk(1);
		System.out.println(Tweetie.getLocation()+"\n");
		
		//fly tests
		System.out.println("Tweetie flew to a different area: ");
		Tweetie.Fly(19, -1);
		System.out.println(Tweetie.getLocation());
		
		//set simID
		System.out.println("Set the SimID:");
		Tweetie.setSimID(-1);
		System.out.println(Tweetie.getSimID()+"\n");
		
		System.out.println("**********************************");
		
		/**BrownBear Class Tests
		 */
		System.out.println("**********************************\n 	  BrownBear Tests");
		
		BrownBear BB8 = new BrownBear();
		BB8.setSubSpecies("bear");
	
		System.out.println("--------");
		System.out.println(BB8.getSubSpecies());
		
		//set simID
		System.out.println("Set the SimID:");
		BB8.setSimID(-1);
		System.out.println(BB8.getSimID()+"\n");
		
		//Walk Test
		System.out.println("BB8 is walking.");
		BB8.walk(1);
		System.out.println(BB8.getLocation());
		
		//swim tests
		System.out.println("BB8 is swimming");
		BB8.swim(1);
		System.out.println(BB8.getLocation()+ "\n");
		
		//Eaten Tests (run multiple times to change println result of has eaten.)
		System.out.println("BB8 has eaten today: " +Tweetie.isFull());
		Tweetie.eat();
		System.out.println("BB8 it is past lunch time, Have you eaten today? " +Tweetie.isFull()+"\n");
		
		//sleep tests
		System.out.println("BB8 did you sleep today (nap)? " + Tweetie.isRested());
		Tweetie.sleep();
		System.out.println("BB8 what about now? " +Tweetie.isRested()+"\n");
		
		System.out.println("*********************************");
		
	}//end main
}//end class
