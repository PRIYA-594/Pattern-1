package PatternBasic2;
import java.util.*;
public class Program3 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k =1,p=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++,k*=(p++))
			{
				System.out.print(k);
			}
			System.out.println();
		}
		s.close();
	}
}
