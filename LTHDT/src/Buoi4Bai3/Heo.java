package Buoi4Bai3;

import java.util.Scanner;

public class Heo extends ConVat{
	private String tiengkeu;
	Scanner temp= new Scanner(System.in);
	public Heo()
	{
		super();
		tiengkeu=new String();
	}
	public Heo(String giong,String maulong, String cannang, String tiengkeu)
	{	
		super(giong,maulong,cannang);
		this.tiengkeu=new String(tiengkeu);
	}
	public Heo(Heo a)
	{
		super(a);
		tiengkeu=new String(a.tiengkeu);
	}
	public void Keu()
	{
		super.Keu();
		System.out.print("\n"+ tiengkeu+ "!");
		
	}
	public void nhap()
	{
		super.nhap();
		temp.nextLine();
		tiengkeu= temp.nextLine();
	}
	public String toString()
	{
		return super.toString()+"Tieng keu"+tiengkeu;
	}
}
