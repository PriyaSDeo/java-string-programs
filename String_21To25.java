import java.util.*;
public class String_21To25{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		
		char ch = 'y';
		do{
			System.out.println("Enter choice");
			System.out.println("1:Remove first Occurrence of given char\n2:Remove last occurrence of given char in string\n3:Remove All Occurrence of given char\n4:Remove all repeated char in string\n5:count frequency of each char in string");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice){
				case 1: RemoveFirstOccurrenceInString();break;
				case 2: RemoveLastOccurrenceInString();break;
				case 3: RemoveAllOccurrenceInString();break;
				case 4: RemoveAllRepeatedInString();break;
				default:System.out.println("invalid choice");
			}
			 System.out.println("do you want to continue (y/n)?");
			ch = sc.next().toLowerCase().charAt(0);
			
		}while(ch=='y');
		
		
	}
	public static void RemoveFirstOccurrenceInString(){
		//21.Write a JAVA program to remove first occurrence of a character from string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		int index = s.indexOf(ch+"");
		if(index==-1){System.out.println("character not found");}
		else{
			s.delete(index,index+1);
			System.out.println(s);
		}
	}
	public static void RemoveLastOccurrenceInString(){
		//22.Write a JAVA program to remove last occurrence of a character from string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		int index = s.lastIndexOf(ch+"");
		if(index==-1){System.out.println("character not found");}
		else{
			s.delete(index,index+1);
			System.out.println(s);
		}
	}
	public static void RemoveAllOccurrenceInString(){
		//23.Write a JAVA program to remove all occurrences of a character from string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		
		int index = s.indexOf(ch+"");
		if(index==-1){System.out.println("character not found");}
		else{
			for(int i=0;i<s.length();i++){
				if(ch==s.charAt(i)){s.delete(i,i+1);i--;}
			}
			System.out.println(s);
		}

	}
	public static void RemoveAllRepeatedInString(){
		//25.Write a JAVA program to remove all repeated characters from a given string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		for(int i=0;i<s.length();i++){
			if(i!=s.lastIndexOf(s.charAt(i)+"") && s.charAt(i)!=' '){
				char ch = s.charAt(i);
				for(int j=i;j<s.length();j++){
					if(ch==s.charAt(j)){
						s.delete(j,j+1);
						j--;
					}
				}
				i--;
			}
		}
		System.out.println(s);
	}
	
}




