package basic.training;

import java.util.Scanner;

public class palindrom {
	public static Integer pal(Integer n) {
	int ans=0;
	int temp=n;
	while(n!=0) 
	{
		int r=n%10;
		ans=ans*10+r;
		n=n/10;
	}
	if (temp==ans) 
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
	return ans;
}
}
