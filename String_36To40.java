import java.util.*;
public class String_36To40{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		
		char ch = 'y';
		do{
			System.out.println("Enter choice");
			System.out.println("1:Remove leading spaces\n2:remove trailing spaces\n3:trim string\n4:Remove extra white spaces\n5:reverse string");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice){
				case 1: trimLeadingWhiteSpacesInString();break;
				case 2: trimTrailingWhiteSpacesInString();break;
				case 3: trimWhiteSpacesInString();break;
				case 4: removeExtraWhiteSpacesInString();break;
				case 5: reverceString();break;
				default:System.out.println("invalid choice");
			}
			 System.out.println("do you want to continue (y/n)?");
			ch = sc.next().toLowerCase().charAt(0);
			
		}while(ch=='y');
	}
	
	public static void trimLeadingWhiteSpacesInString(){
		//36.Write a JAVA program to trim leading white space characters from given string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		String str=s.toString().stripLeading();
		System.out.print(str+str);
		
	}
	public static void trimTrailingWhiteSpacesInString(){
		//37.Write a JAVA program to trim trailing white space characters from given string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		String str=s.toString().stripTrailing();
		System.out.print(str+str);
		
	}
	public static void trimWhiteSpacesInString(){
		//38.Write a JAVA program to trim both leading and trailing white space characters from given string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		String str=s.toString().strip();
		System.out.print(str+str);
	}
	public static void removeExtraWhiteSpacesInString(){
		//39.Write a JAVA program to remove all extra blank spaces from given string.
		System.out.println("Enter a String");
		String s=new String(sc.nextLine());
		s=s.trim();
		while(s.contains("  "))s=s.replace("  "," ");
		System.out.println(s);
	}
	public static void reverceString(){
		//40. WAP a JAVA program to reverse the string without using inbuilt functions ?
		System.out.println("Enter a String");
		String s=new String(sc.nextLine());
		String str="";
		for(int i=0;i<s.length();i++)str = s.charAt(i)+str;
		System.out.println("using new string: "+str);
		
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length/2;i++){
			
			char temp = ch[i];
			ch[i]=ch[ch.length-i-1];
			ch[ch.length-i-1] = temp;
		}
		s = new String(ch);
		System.out.println("changing original String partially "+s);
	}
	
}




