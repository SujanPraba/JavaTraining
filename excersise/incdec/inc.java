import java.util.*;
public class inc
  {
	public static void main(String[] args)
	{
		int a;
		Scanner sc = new Scanner (System.in);
		System.out.println("enetr value to use=");
		a=sc.nextInt();
		System.out.println("preInc"+preinc( a));
		System.out.println("PosInc"+posinc( a));
		System.out.println("preDec"+predec( a));
		System.out.println("postDec"+posdec( a));
		float c = (float) a;
		String str= Integer.toString(a);
		System.out.println("CONVERTED VALUE="+str);
		System.out.println("CONVERTED VALUE="+c);
	}

	public static int preinc(int a)
	{
		return ++a;
	}
	public static int posinc(int a)
	{
		return a++;
	}
	public static int predec(int a)
	{
		return --a;
	}
	public static int posdec(int a)
	{
		return a--;
	}
}
		
		