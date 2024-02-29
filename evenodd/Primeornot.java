package evenodd;

public class Primeornot {

	public static void main(String[] args) {
		int num=3;
		int count = 0;
		for(int i = 1;i<=num;i++) {
			if(num%i==0) {
				if(count==1) {
					System.out.println("prime");
				}
				else {
					System.out.println("notprime");
				}
				
			}
		}
		
	}

}
