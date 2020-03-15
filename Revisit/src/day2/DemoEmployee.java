package day2;

public class DemoEmployee {

	public static void main(String[] args) {
		Employee mun=new Employee();
		Employee kum=new Employee();
		mun.sal=500;
		mun.bonus=50;
		mun.sal=600;
		mun.bonus=60;
		System.out.println("Total salary is: "+mun.calsal());
		System.out.println("Total salary is: "+kum.calsal());
	}

}
