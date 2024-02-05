package assignments;

public class PerfectSquare {
	
	public static boolean isPerfectSquare(int n)
	{
		for(int i=1;i*i<=n;i++)
		{
			if((n%i==0) && (n/i==i))
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		int n=25;
		if(isPerfectSquare(n))
			System.out.println("given num is a perfect square");
		else
			System.out.println("given num is not a perfect square");
			
	}

}
