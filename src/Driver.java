
public class Driver 
{
	public static void main(String[] args) 
	{
		Investment smithYTY = new Investment();
		smithYTY.addContribution(new Contribution(1200, 1));
		int month = 13;
		for(int i = 0; i < 12; i++)
		{
			smithYTY.debitAccount(100, month);
		    month = month + 12;
		}
		
		int totalInvestmentTime = 156;
		System.out.println(smithYTY.getCurrentValue(totalInvestmentTime));
	}
}
