package PatternBasic2;
import java.util.*;
public class Program9 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		char ch='A';
		int j;
		for(int i=0;i<n;i++)
		{
			for(j=0;i+j<n-1;j++)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print((ch++)+" ");
			}
			System.out.println();
		}
		s.close();
	}
}
