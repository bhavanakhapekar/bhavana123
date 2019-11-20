
public class CheckPallindrome {
	
	public static void main(String[] args) {
		
		String s, revs=" ";
		String temp = "";
		
		s="radar";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			temp=temp+s.charAt(i);
			
			System.out.println(temp);
		}
		
		if(s.equals(temp)) {
			System.out.println("String is pallindrome :"+temp);
		}
		
		else
			System.out.println("String isnt pallindrome..");
	}

}
