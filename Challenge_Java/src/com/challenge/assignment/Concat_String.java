package com.challenge.assignment;

public class Concat_String {
 public static void main(String[] args) {
	String str = new String("Dnyaneshwar");
	String new_str = str.concat("_Mauli");
	System.out.println(new_str);
	String s1 = "Welcome";
	String s2 = "Welcome";
	System.out.println(s1.equals(s1));
	String s3 = s2.intern();
	System.out.println(s3);
	String s4 = new_str.repeat(4);
	System.out.println(" "+s4);
	System.out.println(str.strip());
	System.out.println(new_str.charAt(11));
	System.out.println(new_str.codePointAt(2));
}
}
