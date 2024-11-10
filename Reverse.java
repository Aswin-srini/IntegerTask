package basic.task.integer;

import java.util.Scanner;

public class Reverse {

	public static Integer Rev(Integer n) 
	{
		int ans=0;
		while(n!=0) {
			int r=n%10;
			ans=ans*10+r;
			n=n/10;
			
		}
		System.out.println(ans);
		return ans;
	}
}