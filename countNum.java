package basic.task.integer;


public class countNum {
	static void len(int n) {
		int len=(int) Math.log10(n)+1;
		System.out.println(len);//method 1
		int r;
		int sum = 0;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			if (r!=0)
			{
				sum+=1;
			}
		}
		System.out.println(sum);//method 2
	}
	
}
