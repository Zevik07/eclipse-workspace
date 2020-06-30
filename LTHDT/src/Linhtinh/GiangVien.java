package Linhtinh;

import java.util.InputMismatchException;
import java.util.Scanner;

import Buoi2.Date;

public class GiangVien extends ConNguoi{
	private String MSCB;
	private double hesoluong;
	private String chucdanh;
	private String hocvi;
	private String hocham;
	private String chucvu;
	private BoMon bm;
	public GiangVien()
	{
		super();
		MSCB=new String();
		hesoluong=0;
		chucdanh=new String();
		hocvi= new String();
		hocham= new String();
		chucvu= new String();
		bm=new BoMon();
	}
	public GiangVien(String a, double b, String c, String d, String e, String f,String cmnd, String hoten, Date ngaysinh, Boolean gioitinh,String diachi,BoMon bm1)
	{
		super(cmnd,hoten,ngaysinh,gioitinh,diachi);
		MSCB=new String(a);
		hesoluong=b;
		chucdanh=new String(c);
		hocvi= new String(d);
		hocham= new String(e);
		chucvu= new String(f);
		bm=new BoMon(bm1);
	}
	public GiangVien(GiangVien a)
	{
		super((GiangVien) a);
		MSCB=new String(a.MSCB);
		hesoluong=a.hesoluong;
		chucdanh=new String(a.chucdanh);
		hocvi= new String(a.hocvi);
		hocham= new String(a.hocvi);
		chucvu= new String(a.hocvi);
		bm=new BoMon(a.bm);
	}
	public void nhap()
	{
		super.nhap();
		Scanner temp=new Scanner(System.in);
		System.out.print("Nhap MSCB: "); MSCB=temp.nextLine();
		try {
			System.out.print("Nhap he so luong: "); hesoluong=temp.nextDouble();
		}
		catch (Exception e)
		{
			temp.nextLine();
		}
		temp.nextLine();
		System.out.print("Nhap chuc danh: "); chucdanh=temp.nextLine();
		System.out.print("Nhap hoc vi: "); hocvi=temp.nextLine();
		System.out.print("Nhap hoc ham: "); hocham=temp.nextLine();
		System.out.print("Nhap chuc vu: "); chucvu=temp.nextLine();
		bm.nhapBoMon();
	}
	public void xuat()
	{
		super.xuat();
		System.out.print(" MSCB: "+ MSCB);
		System.out.print(" He so luong: "+ hesoluong); 
		System.out.print(" Chuc danh: "+ chucdanh); 
		System.out.print(" Hoc vi: "+ hocvi); 
		System.out.print(" Hoc ham: "+hocham); 
		System.out.print(" Chuc vu: "+chucvu);
		bm.xuatBoMon();
	}
	public static void main(String args[])
	{
		GiangVien a[]=new GiangVien[3];
		for (int i=0;i<3;i++)
		{
			a[i]=new GiangVien();
			a[i].nhap();
		}
		int k=0;
		for (int i=1;i<3;i++)
		{
			int Nam0=a[k].ngaysinh.layNam();
			int Thang0=a[k].ngaysinh.layThang();
			int Ngay0=a[k].ngaysinh.layNgay();
			int Nami=a[i].ngaysinh.layNam();
			int Thangi=a[i].ngaysinh.layThang();
			int Ngayi=a[i].ngaysinh.layNgay();
			if (Nami>Nam0||Nami==Nam0&&Thangi>Thang0||Nami==Nam0&&Thangi==Thang0&&Ngayi>Ngay0)
			{
				k=i;
			}
		}
		a[k].xuat();
	}

}
