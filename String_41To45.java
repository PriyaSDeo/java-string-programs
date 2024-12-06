import java.util.*;
public class String_41To45{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		
		char ch = 'y';
		do{
			System.out.println("Enter choice");
			System.out.println("1:Check if given strings are anagram or not"+"\n"+"2:first non-repeated character from String"+"\n"+"3:check If String Contains Only Digits");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice){
				case 1: AnagramOrnot();break;
				case 2: firstNonRepeatedCharInString();break;
				case 3: checkIfStringContainsOnlyDigits();break;
				
				default:System.out.println("invalid choice");
			}
			 System.out.println("do you want to continue (y/n)?");
			ch = sc.next().toLowerCase().charAt(0);
			
		}while(ch=='y');
	}
	
	public static void AnagramOrnot(){
		//41. WAP a JAVA Program to check strings are anagram to each other or not ?
		System.out.println("Enter string 1");
		String s1 = sc.nextLine();
		System.out.println("Enter string 2");
		String s2 = sc.nextLine();
		
		char c1[]=s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		s1 = new String(c1);
		s2 = new String(c2);
		
		if(s1.compareTo(s2)==0)System.out.println("Both strings are anagram");
		else System.out.println("Both strings are not anagram");
	}
	public static void firstNonRepeatedCharInString(){
		//42. WAP a JAVA program to print first non-repeated character from String?
		System.out.println("Enter string 1");
		String s = sc.nextLine();
		
		String str="";
		for(int i=0;i<s.length();i++){
			if(i!=s.lastIndexOf(s.charAt(i)))str += s.charAt(i);
			if(i==s.lastIndexOf(s.charAt(i)+"") && !str.contains(s.charAt(i)+""))
			{
				System.out.println("First non repeated char : "+ s.charAt(i));
				return;
			}
		}
		System.out.println("No such char found");	
	}
	public static void checkIfStringContainsOnlyDigits(){
		//43.WAP a JAVA program check if a String contains only digits?
		System.out.println("Enter string 1");
		String s = sc.nextLine();
		try{
			int i = Integer.parseInt(s);
			System.out.println("Given string contains only digits");
		}
		catch(NumberFormatException e){
			System.out.println("Not contain only digits");
		}
		
			
	}
}




