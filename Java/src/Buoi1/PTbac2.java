package Buoi1;

import java.util.Scanner;

public class PTbac2 {
	private double a,b,c;
	public PTbac2() {
		a=b=c=1;
	}
	public PTbac2(double a,double b, double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public PTbac2(PTbac2 x)
	{
		a=x.a;
		b=x.b;
		c=x.c;
	}
	public void nhapPT()
	{
		System.out.print("Nhap lan luot cac he so a,b,c: ");
		Scanner temp= new Scanner(System.in);
		a=temp.nextDouble();
		b=temp.nextDouble();
		c=temp.nextDouble();
		System.out.print("Xong !!!\n");
	}
	public void giatPT()
	{
		double delta=b*b-4*a*c;
		if (delta<0)
		{
			System.out.print("Phuong trinh vo nghiem !");
		}
		else if (delta==0)
		{
			System.out.print("Phuong trinh co nghiem kep x1=x2="+(-b/(2*a)));
		}
		else {
			double x1=(-b+Math.sqrt(delta))/(2*a);
			double x2=(-b-Math.sqrt(delta))/(2*a);
			System.out.print("Phuong trinh co nghiem x1="+x1+" x2="+x2);
		}
	}
	public static void main(String[] args)
	{
		PTbac2 a=new PTbac2();
		a.nhapPT();a.giatPT();
	}

}
