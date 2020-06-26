package Buoi5;
import java.util.Scanner;

import Buoi2.Date;
public class KhachHang {
	private String id;
	private String HoTen,DiaChi;
	private Date NgaySinh;
	public KhachHang()
	{
		id=new String();
		HoTen=new String();
		DiaChi=new String();
		NgaySinh=new Date();
	}
	public KhachHang(String id, String HoTen, String DiaChi, Date NgaySinh)
	{
		this.id=new String(id);
		this.HoTen=new String (HoTen);
		this.DiaChi=new String (DiaChi);
		this.NgaySinh=new Date(NgaySinh);
	}
	public KhachHang(KhachHang a)
	{
		id=new String(a.id);
		HoTen=new String(a.HoTen);
		DiaChi=new String(a.DiaChi);
		NgaySinh=new Date(a.NgaySinh);
	}
	public void nhap()
	{
		Scanner temp=new Scanner(System.in);
		System.out.print("\nNhap id khach: ");
		id=temp.nextLine();
		System.out.print("Nhap ho ten khach: ");
		HoTen=temp.nextLine();
		System.out.print("Nhap dia chi khach: ");
		DiaChi=temp.nextLine();
		NgaySinh.inPut();
	}
	public void xuat()
	{
		System.out.print("ID: "+id+"Ho ten: "+HoTen+"Ngay sinh: "+NgaySinh.toString()+"Dia chi: "+DiaChi);
	}
}
