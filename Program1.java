package PatternBasic2;
import java.util.*;
public class Program1 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j =0;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("@");
				}
			}
			System.out.println();
		}
		s.close();
	}
}
