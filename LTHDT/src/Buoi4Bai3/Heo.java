package Buoi4Bai3;

import java.util.Scanner;

public class Heo extends ConVat{
	Scanner temp= new Scanner(System.in);
	public Heo()
	{
		super();
	}
	public Heo(String giong,String maulong, String cannang, String tiengkeu)
	{	
		super(giong,maulong,cannang);
	}
	public Heo(Heo a)
	{
		super(a);
	}
	public void Keu()
	{
		super.Keu();
		System.out.print("\n Heoheo!");
		
	}
	public void nhap()
	{
		super.nhap();
	}
}
