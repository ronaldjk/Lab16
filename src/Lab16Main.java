
import java.util.Scanner;

public class Lab16Main {

	public static void main(String[] args) {
		char keepGoing = 'y';
		int primeChoice = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Let's locate some primes!");
		System.out.println();
		
		while (keepGoing == 'y' || keepGoing == 'Y') 
		{
		System.out.println("Please enter the sequenced prime that you would like to locate."); // "Sequenced prime" refers to...
																							 //...the position in the prime...
																							 //...number list at where a prime...
																							 //...number is located.
		
		
		primeChoice = scan.nextInt();
		int currentPrime = findPosition(primeChoice); 
		System.out.println("The prime number at position # " + primeChoice + " is " + currentPrime + ".");
		System.out.println();
		System.out.println("Would you like to locate another sequenced prime? (Y/N)");
		keepGoing = scan.next().charAt(0);
		}
		
		System.out.println("Goodbye!");
		
		}
	
	
	/**
	 * @param primeChoice
	 */
	public static int findPosition(int primeChoice) { // We used "Refactor" and "Extend Method" in order to create this method...
												  //...Previous to this method, we had other code written that transformed into this.
		int currentPrime = 0;
		int primeCounter = 0;
		
		for(int i=2; primeCounter < primeChoice; i++) {
			if (isPrime(i) == true) {
			primeCounter++;
			currentPrime = i;
		}
		
		else {
			continue;
		
	}
		}
		
		return currentPrime;
	}
	public static boolean isPrime(int val) {
		boolean isPrime = true;
		for (int i = 2; i< val; i++) {
			if (val % i == 0) {
				isPrime = false;
			}
		}
		
		return isPrime;
	}
	

}
