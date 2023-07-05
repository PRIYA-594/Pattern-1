package PatternBasic2;
import java.util.Scanner;
public class Program4 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			char c='A';
			char ch='a';
			for(int j =0;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print((c++)+" ");
				}
				else
				{
					System.out.print((ch++)+" ");
				}
			}
			System.out.println();
		}
		s.close();
	}
}
