
public class CarLoan {
	
		
		double CarCost=35000;
		double interestRate=0.1;//10%
		double loanLength= 60;//months
	
		
	public static double Interest(double totalInterest)
	{
		double CarCost=35000;
		double loanLength = 60;
		double interestRate=0.1;
		totalInterest= CarCost*interestRate*loanLength;
		return totalInterest;
		
	}
	
	public static double monthlyPayment(double interestRate, double CarCost,double loanLength )
		{
			double monthlyPayment= CarCost*(CarCost*interestRate*loanLength)/(1-Math.pow(1+(CarCost*interestRate*loanLength),-loanLength));
			return monthlyPayment;
		}
	}


