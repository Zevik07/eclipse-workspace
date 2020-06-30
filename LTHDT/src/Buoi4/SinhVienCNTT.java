package Buoi4;
import java.util.Scanner;

import Buoi2.Date_old;
import Buoi3.SinhVien;
public class SinhVienCNTT extends SinhVien{
	private String taikhoan,matkhau,email;
	public SinhVienCNTT()
	{
		super();
		taikhoan=new String();
		matkhau=new String ();
		email=new String ();
	}
	public SinhVienCNTT(String mssv1, String ten1, Date_old ngaysinh1,int soluong1, String []tenhp1,String []diem1,String taikhoan1,String matkhau1,String email1)
	{
		super(mssv1,ten1,ngaysinh1,soluong1,tenhp1,diem1);
		taikhoan=new String(taikhoan1);
		matkhau=new String(matkhau1);
	}
	public SinhVienCNTT(SinhVienCNTT a)
	{
		super((SinhVien) a);
		taikhoan=new String(a.taikhoan);
		matkhau=new String(a.matkhau);
		email=new String(a.email);
	}
	public void nhap()
	{
		super.nhap();
		super.nhapDiem();
		System.out.print("Nhap tai khoan,mat khau va email: ");
		Scanner temp=new Scanner(System.in);
		taikhoan=temp.nextLine();
		matkhau=temp.nextLine();
		email=temp.nextLine();
	}
	public String toString(){
		return super.toString() + "Tk:"+taikhoan+", Mk:"+matkhau+", Email:"+email; 
	}
	public void doiMatKhau(String newpass)
	{
		matkhau=new String (matkhau);
	}
	public String getEmail()
	{
		return email;
	}


}
