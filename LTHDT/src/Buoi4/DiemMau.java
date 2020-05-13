package Buoi4;

import java.util.Scanner;

import Buoi2.Diem;

public class DiemMau extends Diem{
	private String mau;
	public DiemMau()
	{
		super();
		mau= new String();
	}
	public DiemMau(int x1,int y1, String mau1)
	{
		super(x1,y1);
		mau=new String(mau1);
	}
	public DiemMau(DiemMau a)
	{
		super ((Diem) a);
		mau=new String(a.mau);
	}
	public void nhapDiem()
	{
		super.nhapDiem();
		System.out.print("Nhap mau cho diem: ");
		Scanner temp=new Scanner(System.in);
		mau=temp.nextLine();
	}
	public void ganMau(String maugan)
	{
		mau=new String(maugan);
	}
	public void xuat()
	{
		super.xuatDiem();
		System.out.print("\nMau cua diem la: "+mau);
	}
	
}
