package practice;

public class Checkleapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 3;
		boolean leap = false;
		
		if(year%4 == 0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					leap = true;
				}
				else {
					leap = false;
					}
			}
			
			else {
			leap = true;
			}
		
			}
	
	
	if(leap==true)
	{
		System.out.println("LeapYear");
	}
	else
	{
		System.out.println("NotaLeapyear");
	}
}
}

