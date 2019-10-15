import java.util.ArrayList;

public class Investment 
{
	ArrayList<Contribution> theContributions;
	ArrayList<Debit> theDebits;
	
	public Investment()
	{
		this.theContributions = new ArrayList<Contribution>();
		this.theDebits = new ArrayList<Debit>();
	}
	
	void addContribution(Contribution c)
	{
		this.theContributions.add(c);
	}
	
	void debitAccount(double dollarAmount, int month)
	{
		this.theDebits.add(new Debit(dollarAmount, month));
	}
	
	void executeDebits(int month)
	{
		//Make the assumption that AT MOST, there is 1 debit per month
		Debit temp = null;
		for(Debit d : this.theDebits)
		{
			if(d.month == month)
			{
				temp = d;
				break;
			}
		}
		
		if(temp != null)
		{
			//I had found a debit, now I need to take money out of the investment
			//print out of money if we run dry!!!!
			//IMPLEMENT THIS SO THAT DEBITS ARE CORRECTLY TAKEN
		}
	}
	
	double getCurrentValue(int afterHowManyMonths)
	{
		//return the current value of this investment taking
		//time and an average 8% yearly or 0.67% monthly return
		//over afterHowManyMonths number of months
		double earningPercent = 0.67;
		for(int i = 0; i < afterHowManyMonths; i++)
		{
			this.executeDebits(i); //execute debits for the current month
			for(int j = 0; j < this.theContributions.size(); j++)
			{
				this.theContributions.get(j).tryToApplyInterest(earningPercent, i);
			}
		}
		
		double currentTotal = 0;
		for(int i = 0; i < this.theContributions.size(); i++)
		{
			currentTotal += this.theContributions.get(i).getCurrentAmountGivenMonth(afterHowManyMonths);
		}
		return currentTotal;
	}
	
	double getTotalContributions()
	{
		//return the total amount ever investment not taking into
		//account interest.
		double currentContributions = 0;
		for(int i = 0; i < this.theContributions.size(); i++)
		{
			currentContributions += this.theContributions.get(i).initialAmount;
		}
		return currentContributions;
	}
	
}
