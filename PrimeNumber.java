package week1.assignment;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int num = 45;
		int rem;
		boolean isPrime = true;
		for (int i=2; i<num; i++)
		{
			rem = num%i;
			System.out.println("rem:" + rem);
			System.out.println("i:" + i);
			if(rem == 0)
			{
				isPrime = false;
				System.out.println(isPrime);
				break;
			}
			else
			{
				isPrime = true;
			}
		}
		if(isPrime == true)
		{
			System.out.println("Is is prime number");
		}
		else
		{
			System.out.println("Is is composite number");
		}
	}
}