package testpack;

public class feminapalindrome {
	
public static void main(String[] args) {
		
		String s1 = "141";
		String reverse="";
		int j = s1.length();
		
		for( j=j-1;j>=0;j--)
		{
		reverse=reverse+ s1.charAt(j);
		
		
		}
		
		if (reverse .equals(s1)) {
			
			System.out.println("Palindrome");
		}else
			System.out.println("not a palindrome");
	}

}
