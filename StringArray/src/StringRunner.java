
public class StringRunner
{
	public static void main(String[]args)
	{
		int x = 3;
		int y = doubled(x);
		System.out.println(y);
		String foo = "foo";
		String foofoo = doubel(foo);
		System.out.println(foofoo);
	}
	public static int doubled (int x)
	{
		x = x+x;
		return x;
	}
	public static String doubel (String str1) {
		str1 = str1+str1;
		return str1;
	}
	
}
