package practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10;
		int t1 = 0;
		int t2 = 1;
		for(int i = 1; i<=a; i++)
		{
			System.out.print(t1+", ");
			int sum = t1+t2;
			t1 = t2;
			t2=sum;
		}

	}

}
