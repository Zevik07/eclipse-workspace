package Linhtinh;
import java.util.Scanner;

import Buoi2.Date;
public class ConNguoi {
	private String CMND;
	private String hoten;
	public Date ngaysinh;
	private Boolean gioitinh;
	private String diachi;
	public ConNguoi()
	{
		CMND=new String();
		hoten=new String();
		ngaysinh=new Date();
		gioitinh=true;
		diachi=new String();
	}
	public ConNguoi(String CMND1,String hoten1,Date ngaysinh1, Boolean gioitinh1, String diachi1)
	{
		CMND=new String(CMND1);
		hoten=new String(hoten1);
		ngaysinh=new Date(ngaysinh1);
		gioitinh=true;
		diachi=new String(diachi1);
	}
	public ConNguoi(ConNguoi a)
	{
		CMND=new String(a.CMND);
		hoten=new String(a.hoten);
		ngaysinh=new Date(a.ngaysinh);
		gioitinh=true;
		diachi=new String(a.diachi);
	}
	public void nhap()
	{
		Scanner temp=new Scanner(System.in);
		System.out.print("Nhap CMND: "); CMND=temp.nextLine();
		System.out.print("Nhap Ho ten: "); hoten= temp.nextLine();
		System.out.print("Nhap ngay sinh: ");ngaysinh.nhap();
		System.out.print("Nhap gioi tinh: (true=Nam,false=Nu)");gioitinh=temp.hasNextBoolean();
		temp.nextLine();
		System.out.print("Nhap dia chi: ");diachi=temp.nextLine();
	}
	public void xuat()
	{
		System.out.print("\nCMND: "+ CMND);
		System.out.print(" Ho ten: "+ hoten); 
		System.out.print(" Ngaysinh: "+ ngaysinh.toString()); 
		System.out.print(" Gioi tinh(true=nam,false=nu): "); 
		System.out.print(" Dia chi: "+diachi); 
	}
}
