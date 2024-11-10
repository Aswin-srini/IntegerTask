package basic.task.integer;

import java.util.Scanner;

public class Primenum {
public static void prim(Integer n) {
	boolean prime = true; 
	if (n<=1)
	{
		prime=false;
	}
	for (int i=2;i<n;i++)
	{
		if (n%i==0)
		{
			prime=false;
		}
	}
	if (prime==true) {
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
}
}
