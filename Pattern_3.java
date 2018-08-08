package program;

import java.util.Scanner;

public class Pattern_3 
{

	public static void main(String[] args) 
	{

		int i,j,n;
		Scanner nu=new Scanner(System.in);
		System.out.println("enter the number of rows");
		n=nu.nextInt();
		for (i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}

}
