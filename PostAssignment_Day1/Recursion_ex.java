package addon_day1;

public class Recursion_ex {
	
	public static int name(int num)
	{
		if (num==0)
		{
			return 0;
		}
		return num+name(num-1);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(name(15));

	}
}
