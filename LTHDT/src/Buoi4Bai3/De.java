package Buoi4Bai3;

import java.util.Scanner;

public class De extends ConVat{
	private String tiengkeu;
	Scanner temp= new Scanner(System.in);
	public De()
	{
		super();
		tiengkeu=new String();
	}
	public De(String giong,String maulong, String cannang, String tiengkeu)
	{	
		super(giong,maulong,cannang);
		this.tiengkeu=new String(tiengkeu);
	}
	public De(De a)
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
		return super.toString()+"Tieng keu: "+tiengkeu;
	}
}
