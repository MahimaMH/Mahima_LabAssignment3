/**
 * Nmae:Mahima M Hampali
 * Description: program to modify number
 * Date :18/03/21
  */
import java.util.Scanner;
import java.lang.Math;
public class StringAssignment4 {
	static String temp;
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number=sc.nextInt();
		System.out.println("the modified number is "+modifyNumber(n) +temp);
	}
    private static int modifyNumber(int n)
    {
    	String str=Integer.toString(n);
    	int output=0;
	temp = Integer.toString(n%10);    
	    
    	for(int i=0;i<str.length()-1;i++)
    	{
    		int diff=str.charAt(i)-str.charAt(i+1);
    		output=output*10+Math.abs(diff);
	}
    	return output;
    }
}
