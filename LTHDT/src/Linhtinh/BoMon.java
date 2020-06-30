package Linhtinh;

import java.util.Scanner;

public class BoMon {
	private String mabomon;
	private String tenbomon;
	private Khoa khoabomon;
	public BoMon()
	{
		mabomon=new String();
		tenbomon= new String();
		khoabomon=new Khoa();
	}
	public BoMon(String mabomon1, String tenbomon1, Khoa khoabomon1)
	{
		mabomon=new String(mabomon1);
		tenbomon=new String(tenbomon1);
		khoabomon=new Khoa(khoabomon1);
	}
	public BoMon(BoMon a)
	{
		mabomon=new String(a.mabomon);
		tenbomon=new String(a.tenbomon);
		khoabomon=new Khoa(a.khoabomon);
	}
	public void nhapBoMon()
	{
		Scanner temp=new Scanner(System.in);
		System.out.print("Nhap ma bo mon: "); mabomon=temp.nextLine(); 
		System.out.print("Nhap ten bo mon: "); tenbomon=temp.nextLine();
		khoabomon.nhapKhoa();
	}
	public String toString()
	{
		return "Ma bo mon: "+mabomon+"Ten bo mon: " +tenbomon;
	}
	public void xuatBoMon()
	{

		System.out.print(" Ma bo mon: "+mabomon); 
		System.out.print(" Ten bo mon: "+tenbomon); 
		khoabomon.xuatKhoa();
	}
}
