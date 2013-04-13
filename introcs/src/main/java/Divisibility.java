//@formatter:off
/*************************************************************************
 *  Compilation:  javac Divisibility.java
 *  Execution:    java Divisibility X Y
 *
 *  Reads in two command line inputs X and Y and prints "true" if both
 *  are divisible by 7, and false otherwise.
 *
 *  % java Divisibility 14 21
 *  true
 *
 *  % java Divisibility 4 21
 *  false
 *
 *  % java Divisibility 100 200
 *  false
 *
 *  a % 7 is the remainder when you divide 7 into a. If the remainder
 *  is 0, then a is divisible by 7.
 *
 *************************************************************************/
  //@formatter:on
public class Divisibility
{
	public static void main(String[] args)
	{
		int X = Integer.parseInt(args[0]);
		int Y = Integer.parseInt(args[1]);
		
		boolean isDivisible = (X % 7 == 0) && (Y % 7 == 0);
		
		System.out.println(isDivisible);
	}
}
