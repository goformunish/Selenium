package day2;

public class Greatest {

	public static void main(String[] args) {
		int a=99,b=30,c=99;
if (a>b && a>c)
{
	System.out.println("a is greatest");
}
else if (b>a && b>c) 
{
	System.out.println("b is greatest");
}
else if (a==b && a==c)
{
	System.out.println("All are equal");
}
else
{
	System.out.println("c is greatest");
}
	}

}
