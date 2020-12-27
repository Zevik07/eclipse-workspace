package Buoi1;

import java.util.Scanner;

public class Bansach {
	public String tensach;
	public int soluong;
	public int dongia;
	public Bansach()
	{
		tensach=new String();
		soluong=0;
		dongia=0;
	}
	public void nhapSach()
	{
		Scanner temp=new Scanner(System.in);
		System.out.print("Nhap ten sach, so luong va gia ban moi quyen ");
		tensach=temp.next();
		soluong=temp.nextInt();
		dongia=temp.nextInt();
	}
	public double giaBan()
	{
		return soluong*dongia;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bansach a=new Bansach();
		a.nhapSach();
		System.out.print("Gia ban sach la: "+a.giaBan());
	}

}
