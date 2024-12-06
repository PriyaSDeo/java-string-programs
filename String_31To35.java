import java.util.*;
public class String_31To35{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		
		char ch = 'y';
		do{
			System.out.println("Enter choice");
			System.out.println("1:Search all Occurrence of given word in string\n2:Count occurrence of word in string\n3:Remove first occurrence of word from string\n4:Remove last occurrence of word from string\n5:Remove all occurrence of word from string");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice){
				case 1: AllOccurrenceOfWordInString();break;
				case 2: countOcuurrenceOfWordInString();break;
				case 3: removeFirstOccurrenceOfWordInString();break;
				case 4: removeLastOccurrenceOfWordInString();break;
				case 5: removeAllOccurrenceOfWordInString();break;
				default:System.out.println("invalid choice");
			}
			 System.out.println("do you want to continue (y/n)?");
			ch = sc.next().toLowerCase().charAt(0);
			
		}while(ch=='y');
		
		
	}
	public static void AllOccurrenceOfWordInString(){
		//31.Write a JAVA program to find All occurrence of a word in a given string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		System.out.println("Enter a word which you want to find");
		String word = sc.next();
		if(s.toString().contains(word)){
			int i=0,f=0;
			while(i<s.length()-word.length()){
				i = s.indexOf(word.charAt(0)+"",i);
				if(i==-1)break;
				String str="";
				for(int j=i;j<i+word.length();j++){
					str += s.charAt(j);
				}
				if(word.compareTo(str)==0){
					System.out.println("occurrence at index index :"+i); 
				}
				i++;
			} 
		}
		else{
			System.out.println("Word not found");
		}
	}
	public static void countOcuurrenceOfWordInString(){
		//32.Write a JAVA program to count All occurrence of a word in a given string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		System.out.println("Enter a word which you want to find");
		String word = sc.next();
		if(s.toString().contains(word)){
			int i=0,count=0;
			while(i<s.length()-word.length()){
				i = s.indexOf(word.charAt(0)+"",i);
				if(i==-1)break;
				String str="";
				for(int j=i;j<i+word.length();j++){
					str += s.charAt(j);
				}
				if(word.compareTo(str)==0){
					count++;
				}
				i++;
			} 
			System.out.println("Word found "+count+" times" );
		}
		else{
			System.out.println("Word not found");
		}
	}
	public static void removeFirstOccurrenceOfWordInString(){
		//33.Write a JAVA program to remove first occurrence of a word from string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		System.out.println("Enter a word which you want to find");
		String word = sc.next();
		if(s.toString().contains(word)){
			int i=0;
			while(i<s.length()-word.length()){
				i = s.indexOf(word.charAt(0)+"",i);
				String str="";
				if(i==-1)break;
				for(int j=i;j<i+word.length();j++){
					str += s.charAt(j);
				}
				if(word.compareTo(str)==0){
					System.out.println("first occurrence of given word starts with index :"+i);
					s.delete(i,i+word.length());
					System.out.println(s);
					break;
				}
				i++;
			}
			
			 
		}
		else{
			System.out.println("Word not found");
		}
	}
	public static void removeLastOccurrenceOfWordInString(){
		//34.Write a JAVA program to remove last occurrence of a word from string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		System.out.println("Enter a word which you want to find");
		String word = sc.next();
		if(s.toString().contains(word)){
			int i=0,f=0;
			
			while(i<s.length()){
				i = s.indexOf(word.charAt(0)+"",i);
				if(i==-1)break;
				String str="";
				for(int j=i;j<i+word.length();j++){
					str += s.charAt(j);
				}
				if(word.compareTo(str)==0){
					
					f=i;
				}
				i++;
			}
			System.out.println("last occurrence of given word starts with index :"+f);
			s.delete(f,f+word.length());
			System.out.println(s);
			 
		}
		else{
			System.out.println("Word not found");
		}
	}
	public static void removeAllOccurrenceOfWordInString(){
		//35.Write a JAVA program to remove All occurrence of a word from string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		System.out.println("Enter a word which you want to find");
		String word = sc.next();
		if(s.toString().contains(word)){
			int i=0,f=0;
			while(i<s.length()-word.length()){
				i = s.indexOf(word.charAt(0)+"",i);
				if(i==-1)break;
				String str="";
				for(int j=i;j<i+word.length();j++){
					if(j<s.length())
					str += s.charAt(j);
				}
				if(word.compareTo(str)==0){
					s.delete(i,i+word.length());
				}
				i++;
			}
			
			
			System.out.println(s);
			 
		}
		else{
			System.out.println("Word not found");
		}
	}
	
}




