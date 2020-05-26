package Buoi4Bai3;

import java.util.Scanner;

public class Bo extends ConVat{
	private String tiengkeu;
	Scanner temp= new Scanner(System.in);
	public Bo()
	{
		super();
		tiengkeu=new String();
	}
	public Bo(String giong,String maulong, String cannang, String tiengkeu)
	{	
		super(giong,maulong,cannang);
		this.tiengkeu=new String(tiengkeu);
	}
	public Bo(Bo a)
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
		tiengkeu= temp.nextLine();
	}
	public String toString()
	{
		return super.toString()+"Tieng" +tiengkeu;
	}
}
