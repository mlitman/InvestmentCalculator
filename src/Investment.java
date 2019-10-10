import java.util.ArrayList;

public class Investment 
{
	ArrayList<Contribution> theContributions;
	
	public Investment()
	{
		this.theContributions = new ArrayList<Contribution>();
	}
	
	void addContribution(Contribution c)
	{
		this.theContributions.add(c);
	}
	
	double getCurrentValue(int afterHowManyMonth)
	{
		//return the current value of this investment taking
		//time and an average 8% yearly or 0.67% monthly return
		//over afterHowManyMonths number of months
	}
	
	double getTotalContributions()
	{
		//return the total amount ever investment not taking into
		//account interest.
	}
	
}
