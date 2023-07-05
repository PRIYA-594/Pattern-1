package PatternBasic2;
import java.util.*;
public class Program5 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			char ch='A';
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print((ch++));
			}
			for(int j=0;j<=i;j++)
			{
				if(j%2==0)
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
