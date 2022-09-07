package org.udemy.practice.loop;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		for(int i=0;i<4;i++)

		{
			for(int k=4-i; k>1 ; k--)
			{
				System.out.print(" ");
			}
			for (int j=0;j<=i;j++)
			{
				System.out.print("* ");

			}
			System.out.println("");

		}

		//reverse pyramid
		for(int i=1;i<=4;i++)

		{
			for(int k=1; k<i ; k++)
			{
				System.out.print(" ");
			}
			for (int j=i;j<=4;j++)
			{
				System.out.print("* ");

			}
			System.out.println("");

		}
	
	int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
	
	for(int i=0; i<3; i++)
	{
		for (int j=0; j<3; j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println(" ");
	}

	//max number from array
	int max = a[0][0];
	for(int i=0; i<3; i++)
	{
		for (int j=0; j<3; j++)
		{
			if(a[i][j]>max)
				max=a[i][j];
		}
	}
	System.out.println(max);
}
} 

 

