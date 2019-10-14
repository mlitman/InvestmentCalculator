
public class Driver 
{
	public static void main(String[] args) 
	{
		Investment a = new Investment();
		Investment b = new Investment();
		a.addContribution(new Contribution(1200, 1));
		int month = 1;
		for(int i = 0; i < 12; i++)
		{
			b.addContribution(new Contribution(100, month));
		    month = month + 12;
		}
		
		int totalInvestmentTime = 156;
		System.out.println(a.getCurrentValue(totalInvestmentTime));
		System.out.println(b.getCurrentValue(totalInvestmentTime));
	}
}
