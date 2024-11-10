package basic.task.integer;

public class sumoOfoddeven {
	static void sum(int n)
	{
		int r;
		int odd=0;
		int eve=0;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			if(r%2==0)
			{
				eve=eve+r;
			}
			else
			{
				odd=odd+r;
			}
		}
		System.out.println("Sum of odd:" + odd);
		System.out.println("Sum of even:" + eve);
		
	}
}
