package basic.task.integer;

import java.util.Scanner;

public class Sumofdigits {
	
	public static Integer Sum(Integer n) { 
	int Sum=0;
	while(n!=0) {
		int r=n%10;
		n=n/10;
		Sum=Sum+r;
	}
	System.out.println(Sum);
	return Sum;
	}
}
