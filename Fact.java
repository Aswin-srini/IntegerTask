package basic.task.integer;

import java.util.Scanner;

public class Fact {
 public static Integer fact(Integer n) {
		int res=1;
		for (int i=1;i<=n;i++)
		{
			res=i*res;
		}
		
		System.out.println(res);
		return res;
 }
}
