package Buoi1;

import java.util.Scanner;

public class Doidiem {
	private double diem;
	public Doidiem()
	{
		diem=0;
	}
	public void nhapDiem()
	{
		Scanner temp=new Scanner(System.in);
		System.out.print("Nhap diem: ");
		diem=temp.nextDouble();
	}
	public void quyDoi()
	{
		char kq='F';
		if (diem>=4&&diem<5.5) kq='D';
		if (diem>=5.5&&diem<7) kq='C';
		if (diem>=7&&diem<8.5) kq='B';
		if (diem>=8.5) kq='A';
		System.out.print("Diem quy doi: "+kq);
	}
	public static void main(String[] args)
	{
		Doidiem a=new Doidiem();
		a.nhapDiem();a.quyDoi();
	}
}
