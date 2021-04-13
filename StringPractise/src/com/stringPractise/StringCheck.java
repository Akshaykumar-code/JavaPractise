package com.stringPractise;

public class StringCheck {
	
	public static void main(String[] args) {
		
		// case 1 
		String s = new String("durga");
		s.concat("software");
		
		System.out.println(s); // durga
		
		StringBuffer sb = new StringBuffer("durga");
		sb.append("software");
		
		System.out.println(sb); // durgasoftware
		
		//case 2 
		
		String s1 = new String("durga");
		
		String s2 = new String("durga");
		
		System.out.println(s1==s2); // false
		System.out.println(s1.equals(s2)); // true
		
		StringBuffer sb1 = new StringBuffer("durga");
		
		StringBuffer sb2 = new StringBuffer("durga");
		
		System.out.println(sb1==sb2); // false
		System.out.println(sb1.equals(sb2)); // false - because there is no equals method overrided in Stringbuffer class
		
		String s3 = "durga" ; // only one object will be created
		String s4 = new String("durga") ; // two object will be created - one in heap and one in string constant pool area
		
		String s5 = new String("spring"); //2
		s5.concat("fall"); // 2
		String s6 = s5.concat("winter"); //2 
		s6.concat("summer");//2
		System.out.println(s5); //spring
		System.out.println(s6);//springwinter
		
		
		String s7 = new String();
		
	}

}
