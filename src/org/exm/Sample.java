package org.exm;

public class Sample {
	public static void main(String[] args) {
		String s="WELCOME";
		String s1="";
		
		for (int i=s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			s1=c+s1;
		}
			if (s.equals(s1)) {
			
			}else {
				System.out.println("its not palindrome");
			}
		}
		
	}	
	