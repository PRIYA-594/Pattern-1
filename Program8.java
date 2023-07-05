package PatternBasic2;
import java.util.*;
public class Program8 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			int k =i;
			for(int j=0;j<=i;j++)
			{
				System.out.print(k++);
			}
			System.out.println();
		}
		s.close();
	}
}
