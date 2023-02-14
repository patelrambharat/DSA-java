public class Main
{
	public static void main(String[] args) {
		System.out.println("Main");
		f1(3);
		System.out.println("Done");
	}
	public static void f1(int a)
	{
	    System.out.println(a);
	    System.out.println("Inside f1");
	    f2();
	    System.out.println("yo");
	}
	public static void f2()
	{
	    int a = f3();
	    System.out.println(a);
	    System.out.println("Inside f2");
	    return;
	}
	public static int f3()
	{
	    f4();
	    return 5;
	}
	public static void f4()
	{
	    return;
	}
}
