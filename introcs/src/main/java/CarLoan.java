//@formatter:off
/*************************************************************************
 *  Compilation:  javac CarLoan.java
 *  Execution:    java CarLoan P Y R
 *
 *  Calculate the monthly payments if you take out a $P loan for
 *  Y years with annual interest rate R %, where interested is
 *  compounded monthly.
 *
 *                     P r
 *     payment =  -----------------        where n = 12 * Y, r = R / 12 / 100
 *                1  - (1 + r)^(-n)
 *
 *
 *  % java CarLoan 20000 5 6
 *  Monthly payments = 386.6560305885655
 *  Total interest   = 3199.361835313932
 *
 *
 *  Bugs
 *  ----
 *  Does not work if R = 0% interest. Easy to fix if you know about
 *  if-else statements.
 *
 *************************************************************************/
  //@formatter:on 
public class CarLoan
{
	public static void main(String[] args)
	{
		double P = Double.parseDouble(args[0]);
		double Y = Double.parseDouble(args[1]);
		double R = Double.parseDouble(args[2]);
		
		double r = R / 12 / 100; // monthly interest rate
		double n = 12 * Y; // number of months
		
		double payment = (P * r) / (1 - Math.pow(1 + r, -n));
		double interest = payment * n - P;
		
		System.out.println("Monthly payments = " + payment);
		System.out.println("Total interest   = " + interest);
	}
	
}
