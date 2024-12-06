import java.util.*;
public class String_16To20{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		
		char ch = 'y';
		do{
			System.out.println("Enter choice");
			System.out.println("1:All Occurrence of given char\n2:Count occurrence of given char in string\n3:Highest frequency char in string\n4:Lowest frequency char in string\n5:count frequency of each char in string");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice){
				case 1: AllOccurrenceOfGivenCharInString();break;
				case 2: CountAllOccurrenceOfGivenCharInString();break;
				case 3: HighestFrequencyCharInString();break;
				case 4: LowestFrequencyCharInString();break;
				case 5: FrequencyOfCharInString();break;
				default:System.out.println("invalid choice");
			}
			 System.out.println("do you want to continue (y/n)?");
			ch = sc.next().toLowerCase().charAt(0);
			
		}while(ch=='y');
		
		
	}
	public static int AllOccurrenceOfGivenCharInString(){
		//16.Write a JAVA program to search all occurrences of a character in given string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++){
			if(ch==s.charAt(i)){
				if(count==0)
					System.out.println("index at which char found");
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		if(count==0)
		System.out.println("Character not found");
		return count;
	}
	public static void CountAllOccurrenceOfGivenCharInString(){
		//17.Write a JAVA program to count occurrences of a character in given string.
		int count = AllOccurrenceOfGivenCharInString();
		System.out.println("count of occurrence :"+count);
	}
	public static void HighestFrequencyCharInString(){
		//18.Write a JAVA program to find highest frequency character in a string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		char ch=' ';
		int max=0;
		for(int i=0;i<s.length();i++){
			int count=0;
			for(int j=i;j<s.length();j++){
					if(s.charAt(i)!=' ' && s.charAt(i)==s.charAt(j))count++;
			}
			if(count>max){max=count;ch=s.charAt(i);}
		}
		System.out.println("max occurred char : "+ch+" count: "+max);
	}
	public static void LowestFrequencyCharInString(){
		//19.Write a JAVA program to find lowest frequency character in a string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		char ch=' ';
		int min=s.length();
		for(int i=0;i<s.length();i++){
			int count=0;
			for(int j=0;j<s.length();j++){
					if(s.charAt(i)!=' ' && s.charAt(i)==s.charAt(j))count++;
			}
			if(count<=min){min=count;ch=s.charAt(i);}
		}
		System.out.println("min occurred char : "+ch+" count: "+min);
	}
	public static void FrequencyOfCharInString(){
		//20.Write a JAVA program to count frequency of each character in a string.
		System.out.println("Enter a String");
		StringBuffer s=new StringBuffer(sc.nextLine());
		for(int i=0;i<s.length();i++){
			int count=0,j=0;
			for(j=i-1;j>=0;j--){
				if(s.charAt(i)==s.charAt(j))break;
			}
			if(j==-1 && s.charAt(i)!=' '){
				for(j=i;j<s.length();j++){
					if(s.charAt(i)==s.charAt(j))count++;
				}
				System.out.println(s.charAt(i)+" -->  "+count);
			}
			
		}
		
	}
}




