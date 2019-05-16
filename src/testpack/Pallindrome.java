package testpack;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		String original, reverse="";
		
		System.out.println("Enter a String to check for Palindrome.");
		original= sc.nextLine();
		
		for(int i= original.length()-1; i>=0;i--) {
			reverse= reverse + original.charAt(i);
			
		}if(original.equals(reverse)) {
				System.out.println("String Is a pallindrome");
			}else 
				System.out.println("String is NOT a pallindrome");
		}


	}
