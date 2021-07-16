package week1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fn = 0;
int sn = 1;
int nn;
System.out.println(fn);
for (int i = 0; i<10; i++)
{
	nn = fn + sn;
	sn = fn;
	fn = nn;
	System.out.println(nn);
}
	}

}
