package basic.task.integer;

public class Sumofsq {
 static void sqans(int n) {
	 int a,sum=0;
	 
		while(n!=0) {
			int r=n%10;
			n=n/10;
			a=r*r;
			sum=sum+a;
		}
		System.out.println(sum);
 }
}
