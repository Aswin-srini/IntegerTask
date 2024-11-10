package basic.task.integer;

import java.util.Scanner;

public class Perfectnum {
 public static Integer Perfec(Integer n) {
		int sum = 0;
		for (int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
	
		}
		if (n==sum) {
			System.out.println("True");
			}
		else 
		{
			System.out.println("False");
		}
		
	 return sum;
 }
}
