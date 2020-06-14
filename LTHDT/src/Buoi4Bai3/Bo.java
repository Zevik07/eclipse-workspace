package Buoi4Bai3;

import java.util.Scanner;

public class Bo extends ConVat{
	Scanner temp= new Scanner(System.in);
	public Bo()
	{
		super();
	}
	public Bo(String giong,String maulong, String cannang)
	{	
		super(giong,maulong,cannang);
	}
	public Bo(Bo a)
	{
		super(a);
	}
	public void Keu()
	{
		super.Keu();
		System.out.print("\n Bobo!");
		
	}
	public void nhap()
	{
		super.nhap();
	}
}
