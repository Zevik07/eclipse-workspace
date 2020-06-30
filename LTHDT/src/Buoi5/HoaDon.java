package Buoi5;
import java.util.Scanner;

import Buoi2.Date_old;
public class HoaDon {
	private String id;
	private Date_old Ngayxuat;
	private int Soluonghang;
	private String Tenhang[];
	private int Soluongrieng[];
	private double Dongia[];
	private double Thanhtien[];
	private double Tongcong;
	public HoaDon()
	{
		id=new String();
		Ngayxuat=new Date_old();
		Soluonghang=1;
		for (int i=0;i<Soluonghang;i++)
		{
			Tenhang[i]=new String();
			Soluongrieng[i]=1;
			Dongia[i]=1;
		}
		for (int i=0;i<Soluonghang;i++)
		{
			Thanhtien[i]=Soluongrieng[i]*Dongia[i];
		}
		for (int i=0;i<Soluonghang;i++)
		{
			Tongcong+=Thanhtien[i];
		}
	}
	public void nhap()
	{
		Scanner temp=new Scanner(System.in);
		System.out.print("\nNhap ma hoa don: ");
		id=temp.nextLine();
		Ngayxuat.inPut();
		Soluonghang=temp.nextInt();
		for (int i=0;i<Soluonghang;i++)
		{
			System.out.print("Nhap ten mat hang thu "+(i+1));
			Tenhang[i]=temp.nextLine();
			Soluongrieng[i]=temp.nextInt();
			Dongia[i]=temp.nextDouble();
			Thanhtien[i]=Soluongrieng[i]*Dongia[i];
		}
	}
	public void xuat(double discount)
	{
		System.out.print("ID: "+id+"Ngay xuat: "+Ngayxuat.toString());
	}
}
