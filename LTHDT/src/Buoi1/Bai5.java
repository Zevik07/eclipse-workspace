package Buoi1;
import java.util.Scanner;
public class Bai5 {
	public static void tinhbac1(double a, double b)
	{
		if (a!=0)
		{
			System.out.print("Phuong trinh co nghiem duy nhat la "+(-b/a));
		}
		else if (a==0 && b!=0)
		{
			System.out.print("Phuong trinh vo nghiem");
		}
		else 
		{
			System.out.print("Phuong trinh co vo so nghiem");
		}
	}
	public static void tinhbac2(double a, double b, double c)
	{
		double delta=b*b-4*a*c;
		if (delta==0)
			System.out.print("Phuong trinh co nghiem kep la "+(-b/2*a));
		else if (delta <0 )
			System.out.print("Phuong trinh vo nghiem");
		else 
			System.out.printf("Phuong trinh co hai nghiem x1=%f va x2=%f",(-b+Math.sqrt(delta))/2*a,(-b-Math.sqrt(delta))/2*a);
	}
	public static void main(String []args)
	{
		Scanner temp= new Scanner(System.in);
		double a=temp.nextDouble();
		double b=temp.nextDouble();
		double c=temp.nextDouble();
		System.out.print("Bac 1 voi a va b\n");
		tinhbac1(a,b);
		System.out.print("\n");
		System.out.print("Bac 2 voi a,b va c\n");
		tinhbac2(a,b,c);
	}
}
