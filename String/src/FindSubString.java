import java.util.Scanner;

public class FindSubString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First String :");
		String s1=sc.next();
		
		System.out.println("Enter Second String :");
		String s2=sc.next();
		
		char c,d;
		int count=0;
		
		for(int i=0;i<s1.length();i++) {
			
			c=s1.charAt(i);
			
			for(int j=0;j<s2.length();j++) {
				
				d=s2.charAt(j);
				
				if(c==d)
					
					count++;
				
			}
		}
		
		System.out.println("count :"+ count);
		
		if(count-1==s1.length()) {
			
			System.out.println(" substring");
		}else
			System.out.println(" not a substring ");
	}
}
