import java.util.*;
public class String_11To15{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		
		char ch = 'y';
		do{
			System.out.println("Enter choice");
			System.out.println("1:Reverse the string\n2:Palindrome or not\n3:Reverse order of words in string\n4:First occurrence of char\n5:Last occurrence of char");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice){
				case 1: reverseString();break;
				case 2: palindromeString();break;
				case 3: revereWordString();break;
				case 4: firstOcuurenceString();break;
				case 5: lastOcuurenceString();break;
				default:System.out.println("invalid choice");
			}
			 System.out.println("do you want to continue (y/n)?");
			ch = sc.next().toLowerCase().charAt(0);
			
		}while(ch=='y');
		
		
	}
	public static void reverseString(){
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		
		//11.Write a JAVA program to find reverse of a string.
		System.out.println("Reverse = "+s.reverse());
	}
	public static void palindromeString(){
		//12. Write a JAVA program to check whether a string is palindrome or not.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());//hello
		StringBuffer s2 = new StringBuffer(s);
		s.reverse();// this will reverse the string itself;
		if(s.compareTo(s2)==0)System.out.println("String is palindrome");
		else System.out.println("String is not palindrome ");
		
		
	}
	
	public static void revereWordString(){
		//13.Write a JAVA program to reverse order of words in a given string.
		System.out.println("Enter a string");
		String s = sc.nextLine(),s2="";
		String str[]= s.split(" ");
		for(int i=0;i<str.length;i++){
			s2 = " "+str[i]+ s2;
		}
		System.out.println(s2);
	}
	
	public static void firstOcuurenceString(){
		//14.Write a JAVA program to find first occurrence of a character in a given string.
		System.out.println("Enter a string");
		String s = sc.nextLine(),s2="";
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		if(s.indexOf(ch)>=0)System.out.println("character found at index "+s.indexOf(ch));
		else System.out.println("Character not found in string");
	}
	public static void lastOcuurenceString(){
		//15.Write a JAVA program to find last occurrence of a character in a given string.
		System.out.println("Enter a string");
		String s = sc.nextLine(),s2="";
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		if(s.lastIndexOf(ch)>=0)System.out.println("character last found at index "+s.lastIndexOf(ch));
		else System.out.println("Character not found in string");
	}
}




