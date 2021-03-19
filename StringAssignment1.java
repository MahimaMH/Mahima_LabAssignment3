/**
 * Nmae:Mahima M Hampali
 * Description: program to display sum of integers
 * Date :18/03/21
  */



import java.util.Scanner;
//import java.util.StringTokenizer;

public class StringAssignment1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items:");
		
		final int n=sc.nextInt();
		int sum=0;
		String [] str=new String[n];
		System.out.println("Enter the value of the items: ");
		
		for(int i=0;i<str.length;i++)
			str[i]=sc.next();
		
		for(int i=0;i<str.length;i++)
        	System.out.println(str[i]);
        	
		for(int i=0;i<str.length;i++)
         {
        	 sum+=(Integer.parseInt(str[i]));
         }
		System.out.println("the sum is: "+sum);

	}

}

