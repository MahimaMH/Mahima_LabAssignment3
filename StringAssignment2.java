/**
 * Nmae:Mahima M Hampali
 * Description: program to display mirror image of string
 * Date :18/03/21
  */

import java.util.Scanner;

public class StringAssignment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str=sc.next();
		System.out.println(getImage(str));
	    
	}
    private static String getImage(String pStr)
    {
    	StringBuffer reverseStr=new  StringBuffer(pStr);
    	reverseStr.reverse();
    	return pStr+"|"+reverseStr;
    
    }
}
