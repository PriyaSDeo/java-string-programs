

import java.util.*;
public class CheckString{

	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First STring:");
		StringBuffer rev = new StringBuffer(sc.nextLine());
		
		
		StringBuffer rev2 = new StringBuffer(rev);
		
		System.out.println("After Reverse :"+rev.reverse());
		
		
		int result = rev.compareTo(rev2);
		System.out.println("Result :"+result);
		
	if(result==0){
			System.out.println("yess ");
	}else{
			System.out.println("No ");
	}
	
	
	
	}
		
	
	
}