package basic.task.integer;

public class ProDig {
	static void ofDigit(int n)
	{
		int r;
		int Pro=1;
		while (n!=0)
		{
			r=n%10;
			n=n/10;
			Pro=Pro*r;
		}
		System.out.println(Pro);
	}
}
