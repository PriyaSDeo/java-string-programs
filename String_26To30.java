import java.util.*;
public class String_26To30{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		
		char ch = 'y';
		do{
			System.out.println("Enter choice");
			System.out.println("1:Replace first Occurrence of given char iin string\n2:replace last occurrence of given char in string\n3:Replace All Occurrence of given char\n4:First Occurrence Of Word In String\n5:last Occurrence Of Word In String");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice){
				case 1: ReplaceFirstOccurrenceInString();break;
				case 2: ReplaceLastOccurrenceInString();break;
				case 3: replaceAllOccurrenceInString();break;
				case 4: FirstOccurrenceOfWordInString();break;
				case 5: LastOccurrenceOfWordInString();break;
				default:System.out.println("invalid choice");
			}
			 System.out.println("do you want to continue (y/n)?");
			ch = sc.next().toLowerCase().charAt(0);
			
		}while(ch=='y');
		
		
	}
	public static void ReplaceFirstOccurrenceInString(){
		//26.Write a JAVA program to replace first occurrence of a character with another in a string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		System.out.println("Enter a character with whom you will replace");
		char ch = sc.next().charAt(0);
		String str="";
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)!=' ')&&(i !=s.lastIndexOf(s.charAt(i)+""))&&(!str.contains(s.charAt(i)+""))){
				str += s.charAt(i);
				s.replace(i,i+1,ch+"");
			}
		}
		System.out.println(s);
	}
	public static void ReplaceLastOccurrenceInString(){
		//27.Write a JAVA program to replace last occurrence of a character with another in a string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		System.out.println("Enter a character with whom you will replace");
		char ch = sc.next().charAt(0);
		String str="";
		//first find out which char are repeated except space and store in str.
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)!=' ')&&(i !=s.lastIndexOf(s.charAt(i)+""))&&(!str.contains(s.charAt(i)+""))){
				str += s.charAt(i);	
			}
		}
		// from str take each char find its last index and replace it
		for(int i=0;i<str.length();i++){
			int j = s.lastIndexOf(str.charAt(i)+"");
			s.replace(j,j+1,ch+"");
		}
		System.out.println(s);
	}
	public static void replaceAllOccurrenceInString(){
		//28.Write a JAVA program to replace all occurrences of a character with another in a string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		System.out.println("Enter a character with whom you will replace");
		char ch = sc.next().charAt(0);
		
		//first find out which char are repeated except space and char with which you are replacing and replace it.
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)!=' ')&&(s.charAt(i)!=ch)&&(i !=s.lastIndexOf(s.charAt(i)+""))){
					char r = s.charAt(i);
					for(int j=i;j<s.length();j++){
						if(s.charAt(j)==r){
							s.replace(j,j+1,ch+"");
						}
					}
			}
		}
		
		System.out.println(s);

	}
	public static void FirstOccurrenceOfWordInString(){
		//29.Write a JAVA program to find first occurrence of a word in a given string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		System.out.println("Enter a word which you want to find");
		String word = sc.next();
		if(s.toString().contains(word)){
			int i=0;
			while(i<s.length()){
				i = s.indexOf(word.charAt(0)+"",i);
				String str="";
				for(int j=i;j<i+word.length();j++){
					str += s.charAt(j);
				}
				if(word.compareTo(str)==0){
					System.out.println("first occurrence of given word starts with index :"+i);
					break;
				}
				i++;
			}
			
			 
		}
		else{
			System.out.println("Word not found");
		}
	}
	public static void LastOccurrenceOfWordInString(){
		//30.Write a JAVA program to find last occurrence of a word in a given string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		System.out.println("Enter a word which you want to find");
		String word = sc.next();
		if(s.toString().contains(word)){
			int i=0,f=0;
			while(i<s.length()-word.length()){
				i = s.indexOf(word.charAt(0)+"",i);
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
		}
		else{
			System.out.println("Word not found");
		}
	}
	
}




