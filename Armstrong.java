package basic.task.integer;

import java.util.Scanner;

public class Armstrong {
public static Integer Arm(int n) {
	int a,sum=0;
	int temp=n;
	while(n!=0) {
		int r=n%10;
		n=n/10;
		a=r*r*r;
		sum=sum+a;
		
	}
	if (temp==sum) 
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
	return sum;
}
}
