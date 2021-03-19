/**
 * Nmae:Mahima M Hampali
 * Description: program to count nubmer of characters,lines and words in text
 * Date :18/03/21
  */

public class StringAssignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" My name is Mahima\n I am from Bengaluru";
		int cc=0,cw=0,cl=1;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='\n') {
				cl++;
			}
			else if (str.charAt(i) ==' ') {
				cw++;
			}
			else if (str.charAt(i)!=' ') {
				cc++;
			}
		}
		 System.out.println("\nNumber of lines : "+cl);
         System.out.println("\nNumber of words : "+cw);
         System.out.println("\nNumber of characters : "+cc);
	}

}
