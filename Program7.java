package PatternBasic2;
import java.util.*;
public class Program7 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int j;
		char ch;
		for(int i=0;i<n;i++)
		{
			for(j=0;i+j<n-1;j++)
			{
				System.out.print(" ");
			}
			for(j=0,ch='A';j<=i;j++,ch++)
			{
				System.out.print(ch);
			}
			for(j=0,ch='A';j<i;j++,ch++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
		s.close();
	}
}
