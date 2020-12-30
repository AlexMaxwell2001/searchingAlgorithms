import java.util.*;
public class binarySearch
{

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int size2 = sc.nextInt();
        int target=sc.nextInt();
        boolean found=false;
        int ar [][] = new int[size][size2];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size2;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
       int low1=0,high1=size-1,i=(high1+low1)/2,high2=size2,low2=0, j= (high2+low2)/2,comparisions=0;
       boolean result = find( ar, target ,0 ,size, 0 ,size2);
       if(result)
       {
           System.out.println("found");
       }
       else{
            System.out.println("not found!")
       }
       
        
    }
    public static boolean find(int[][] mat, int x, int lorow, int hirow,int locol,int hicol)
    {
        if(mat.length==0) return false;
        if(lorow>hirow || locol>hicol) return false;
        if(lorow==hirow && locol==hicol && mat[lorow][locol]!=x) return false;

        int midrow=(lorow+hirow)/2;
        int midcol=(locol+hicol)/2;

        if(mat[midrow][midcol] == x )
        {
            return true;
        }
        else if(mat[midrow][midcol] < x) 
            return find(mat,x,lorow,midrow,midcol+1,hicol) || find(mat,x,midrow+1,hirow,locol,midcol) || find(mat,x,midrow+1,hirow,midcol+1,hicol);
        else 
            return find(mat,x,lorow,midrow,locol,midcol) || find(mat,x,lorow,midrow,midcol+1,hicol) ||find(mat,x,midrow+1,hirow,locol,midcol);
    }
}