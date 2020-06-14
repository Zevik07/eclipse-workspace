package Buoi4Bai3;

import java.util.Scanner;

public class ConVat {
	private String giong;
	private String maulong;
	private int cannang;
	public ConVat()
	{
		giong=new String();
		maulong=new String();
		cannang=1;
	}
	public ConVat(String giong, String maulong, String cannnang)
	{
		this.giong=new String(giong);
		this.maulong=new String(maulong);
		this.cannang=cannang;
	}
	public ConVat(ConVat a)
	{
		giong=new String(a.giong);
		maulong=new String(a.maulong);
		cannang=a.cannang;
	}
	public void Keu()
	{
		//rerg
	}
	public void nhap()
	{
		
		Scanner temp=new Scanner(System.in);
		System.out.print("Nhap giong, mau long, can nang: ");
		giong=temp.nextLine();
		maulong=temp.nextLine();
		cannang=temp.nextInt();
	}
	public String toString()
	{
		return ("\nGiong: "+giong+" Mau long: "+maulong+" Can nang: "+cannang);
	}
}
