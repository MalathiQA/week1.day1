package week1.assignment;

public class ArmtstrongNumber {

	public static void main(String[] args) {
			int num = 371;
			int sum, quo, remsplit,original;
			original = num;
			sum=0;
	while(num>0)
	{
			remsplit = num%10;
			quo = num/10;
			num=quo;
			sum = (remsplit*remsplit*remsplit)+sum;
			//System.out.println("num:"+ num);
			//System.out.println("sum:"+ sum);
	}
	if (sum==original)
	{
	System.out.println("It is armstrong number");
	}
	else System.out.println("It is not an armstrong number");
 }
}