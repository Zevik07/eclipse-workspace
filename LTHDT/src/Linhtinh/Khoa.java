package Linhtinh;

import java.util.Scanner;

public class Khoa {
	private String makhoa,tenkhoa;
	public Khoa()
	{
		makhoa=new String();
		tenkhoa=new String();
	}
	public Khoa(String a, String b)
	{
		makhoa=new String(a);
		tenkhoa=new String(b);
	}
	public Khoa(Khoa a)
	{
		makhoa=new String(a.makhoa);
		tenkhoa=new String(a.tenkhoa);
	}
	public void nhapKhoa()
	{
		System.out.print("Nhap ma khoa,ten khoa: ");
		Scanner temp=new Scanner(System.in);
		makhoa=temp.nextLine();
		tenkhoa=temp.nextLine();
	}
	public String toString()
	{
		return "Ma khoa: "+makhoa+ " Ten khoa: "+tenkhoa;
	}
	public void xuatKhoa()
	{
		System.out.print(" Ma khoa,ten khoa: "+makhoa+tenkhoa);
	}
	

}
