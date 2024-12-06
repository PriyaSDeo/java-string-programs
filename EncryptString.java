import java.util.*;
public class EncryptString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		
		String str="";
		for(int i=0;i<s.length();i++){
			char ch =s.charAt(i);
			if(!str.contains(ch+"") && ch!=' '){
				str += ch;
				int count=0;
				for(int j=i;j<s.length();j++){
					if(ch==s.charAt(j))count++;
				}
				str+=count;
			}
		}
		System.out.println(str);
	}
}