package Buoi1;

import java.util.Scanner;

public class Phanso {
	private double tu,mau;
	public Phanso(){
		tu=mau=1;
	}
	public Phanso(double a,double b)
	{
		tu=a;mau=b;
	}
	public void nhap()
	{
		Scanner temp=new Scanner(System.in);
		System.out.println("Nhap tu so va mau so");
		tu=temp.nextDouble();
		mau=temp.nextDouble();
	}
	public void in()
	{
		if (mau==1) System.out.println(tu);
		else System.out.println(tu+"/"+mau);
	}
	public void toiGian()
	{
			int i=(int) mau;
			while (i>0)
			{
				if (tu%i==0&&mau%i==0)
				{
					tu/=i;
					mau/=i;
				}
				--i;
			}
	}
	public static void main(String args[])
	{
		Phanso a=new Phanso();
		a.nhap();a.in();
		a.toiGian();
		a.in();
	
	}
	

}
