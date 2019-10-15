
public class Contribution 
{
	double initialAmount;
	double currentAmount; //change this over time as interest is applied
	int monthNumber;
	
	public Contribution(double initialAmount, int monthNumber)
	{
		this.initialAmount = initialAmount;
		this.currentAmount = initialAmount;
		this.monthNumber = monthNumber;
	}
	
	public double attemptToDebitAmount(double amount, int month)
	{
		//return the amount of money left after any debit occurs
		if(this.monthNumber <= month)
		{
			double whatsLeft = this.currentAmount - amount;
			if(whatsLeft > 0) //have enough money to fully fulfill
			{
				this.currentAmount = whatsLeft; //adjust the currentAmount
				return 0; //return zero for what is still owed to fullfil debit
			}
			else //we partially fulllllllfilled the debit
			{
				this.currentAmount = 0;
				return whatsLeft * -1;
			}
		}
		return amount; //we could not participate in this debit, so return total balance
	}
	
	public double getCurrentAmountGivenMonth(int month)
	{
		if(this.monthNumber <= month)
		{
			return this.currentAmount;
		}
		else
		{
			return 0;
		}
	}
	
	public void tryToApplyInterest(double interestPercent, int monthNumber)
	{
		//ATTEMPTS to apply interest to this contribution in the given month
		if(this.monthNumber <= monthNumber)
		{
			this.currentAmount = this.currentAmount * (1 + (interestPercent/100));
		}
	}
}
