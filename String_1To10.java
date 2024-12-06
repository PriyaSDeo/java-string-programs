import java.util.*;
public class String_1To10{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		
		char ch = 'y';
		do{
			System.out.println("Enter choice");
			System.out.println("1:length\n2:Copy\n3:Concatenate\n4:Compare\n5:Lowercase to uppercase\n6:uppercase to lowercase\n7:toggle case\n8:count alpha number and special char\n9:Count Number of vowels\n10:Count no of words in string");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice){
				case 1: calLen();break;
				case 2: copyString();break;
				case 3: concatString();break;
				case 4: compareString();break;
				case 5: LowerToUp();break;
				case 6: UpperToLow();break;
				case 7: ToggleCase();break;
				case 8: CalSpecialChar();break;
				case 9: countVowels();break;
				case 10: countWords();break;
				default:System.out.println("invalid choice");
			}
			 System.out.println("do you want to continue (y/n)?");
			ch = sc.next().toLowerCase().charAt(0);
			
		}while(ch=='y');
		
		
	}
	public static void calLen(){
		System.out.println("Enter a String");
		String s1 = sc.nextLine();
		
		//1. Write a JAVA program to find length of a string.
		System.out.println("Length = "+s1.length());
	}
	public static void copyString(){
		//2. Write a JAVA program to copy one string to another string.
		System.out.println("Enter a String");
		String s1 = sc.nextLine();
		String s2 = s1;
		System.out.println("copied string = "+s2);
	}
	public static void concatString(){
		//3. Write a JAVA program to concatenate two strings.
		System.out.println("Enter 2 strings");
		System.out.println("String 1:");
		String s3 = sc.nextLine();
		System.out.println("String 2:");
		String s4 = sc.nextLine();
		String s5 = s3.concat(s4);
		System.out.println("Concatenated string :"+s5);
	}
	public static void compareString(){
		//4. Write a JAVA program to compare two strings
		System.out.println("Enter two Strings");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int n =s1.compareTo(s2);
		System.out.println(n);
		if(n==0)System.out.println("Both strings are equal");
		else if(n>0)System.out.println("1st string is greater and difference ="+n);
		else System.out.println("2nd string is greater and difference ="+n);
	}
	public static void LowerToUp(){
		//5. Write a JAVA program to convert lowercase string to uppercase.
		System.out.println("Enter a Strings");
		String s = sc.nextLine();
		System.out.println("To upper Case "+ s.toUpperCase());
	}
	public static void UpperToLow(){
		//6. Write a JAVA program to convert uppercase string to lowercase.
		System.out.println("Enter a Strings");
		String s = sc.nextLine();
		System.out.println("To Lower Case "+ s.toLowerCase());
	}
	public static void ToggleCase(){
		//7. Write a JAVA program to toggle case of each character of a string.
		System.out.println("Enter a Strings");
		String s = sc.nextLine();
		String str="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>=64 && s.charAt(i)<=90){
				str += (s.charAt(i)+"").toLowerCase();
			}
			else if(s.charAt(i)>=97 && s.charAt(i)<=122){
				str += (s.charAt(i)+"").toUpperCase();
			}
			else str += s.charAt(i);
		}
		System.out.println("Resultant string = "+str);
	}
	public static void CalSpecialChar(){
		//8. Write a JAVA program to find total number of alphabets, digits or special character in a string.
		System.out.println("Enter a Strings");
		String s = sc.nextLine();
		int number=0,alpha=0,special=0;
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)){
				alpha++;
			}
			else if(s.charAt(i)>=48 && s.charAt(i)<=57){
				number++;
			}
			else if(s.charAt(i) !=' ')special++;
		}
		System.out.println("Count of Numbers      = "+number);
		System.out.println("Count of Alphabets    = "+alpha);
		System.out.println("Count of special char = "+special);
	}
	public static void countVowels(){
		//9. Write a JAVA program to count total number of vowels and consonants in a string.
		System.out.println("Enter a Strings");
		String s = sc.nextLine();
		int count=0;
		String str = "aeiouAEIOU";
		for(int i=0;i<s.length();i++){
			if(str.contains(""+s.charAt(i))){
				count++;
			}
			
		}
		System.out.println("Count of vowels = "+count);
	}
	public static void countWords(){
		//10.Write a JAVA program to count total number of words in a string.
		System.out.println("Enter a Strings");
		String s = sc.nextLine();
		String ch[]=s.split(" ");
		
		System.out.println("Count of vowels = "+ch.length);
	}
}




