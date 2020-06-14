package Buoi4Bai3;

import java.util.Scanner;

public class De extends ConVat{
	Scanner temp= new Scanner(System.in);
	public De()
	{
		super();
	}
	public De(String giong,String maulong, String cannang, String tiengkeu)
	{	
		super(giong,maulong,cannang);
	}
	public De(De a)
	{
		super(a);
	}
	public void Keu()
	{
		super.Keu();
		System.out.print("\n Dede!");
		
	}
	public void nhap()
	{
		super.nhap();
	}
}
