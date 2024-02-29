
public class Reversestring {
	
	
     public static void main(String[] args) {
    	 
    	 String str = "madam";
    	System.out.println(str);
         String rev ="";
  		int len = str.length();
		
		for(int i = len-1;i>=0;i--){
			
			rev=rev+str.charAt(i);
			
			
			
		}
		
		System.out.println(rev);
		


		 if(rev.equals(str)) {
			 System.out.println("given string is a palindrome");
		 }
		 else {
			 System.out.println("not a palindrome");
		 }

}
}


