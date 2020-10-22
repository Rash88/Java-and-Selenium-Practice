package practice;

public class RevereseaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 789887;
		
		while (num!=0)
		{
			int rem = num%10;
			System.out.print(rem);
			num = num/10;
		}
	}

}
