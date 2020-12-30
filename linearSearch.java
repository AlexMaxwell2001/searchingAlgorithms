import java.util.*;
public class linearSearch{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int count =0 ;
		boolean found=false;
		System.out.println("Enter the target for the search");
		int target = sc.nextInt();
		System.out.println("Enter the sizes for the 2D array");
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		int ar[][] = new int[size1][size2];
		System.out.println("Enter the array values for the search");
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				if(target == ar[i][j])
				{
					found=true;
					break;
				}
				else{
					count++;
				}
			}
		}
		if(!found)
		{
			System.out.println("The target was not found!")
		}else{
			System.out.println("The search took "  + count + " searches to find the target");
	}
}