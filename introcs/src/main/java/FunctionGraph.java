//@formatter:off
/*************************************************************************
 *  Compilation:  javac FunctionGraph.java 
 *  Execution:    java FunctionGraph
 *  Dependencies: StdDraw.java
 *
 *  Plots the function y = sin(4x) + sin(20x) between x = 0 and x = pi
 *  by drawing N line segments.
 *
 *************************************************************************/
//@formatter:on

public class FunctionGraph
{
	public static void main(String[] args)
	{
		
		// number of line segments to plot
		int N = Integer.parseInt(args[0]);
		
		// the function y = sin(4x) + sin(20x), sampled at N points
		// between x = 0 and x = pi
		double[] x = new double[N + 1];
		double[] y = new double[N + 1];
		for (int i = 0; i <= N; i++)
		{
			x[i] = Math.PI * i / N;
			y[i] = Math.sin(4 * x[i]) + Math.sin(20 * x[i]);
		}
		
		// rescale the coordinate system
		StdDraw.setXscale(0, Math.PI);
		StdDraw.setYscale(-2.0, +2.0);
		
		// plot the approximation to the function
		for (int i = 0; i < N; i++)
		{
			StdDraw.line(x[i], y[i], x[i + 1], y[i + 1]);
		}
	}
}
