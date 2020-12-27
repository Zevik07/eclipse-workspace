package Buoi1;

import java.util.Scanner;

public class Bansachsv extends Bansach{
	private boolean lasv=false;
	public Bansachsv(){
		super();
		lasv=true;
	}
	public void nhapSach(){
		super.nhapSach();
		System.out.print("Ban co la sinh vien khong (Co nhap 'C'): ");
		Scanner temp=new Scanner(System.in);
		if (temp.next().charAt(0)=='C')
		lasv=true;
	}
	public double giaBan(){
		if (lasv==true) return soluong*dongia*0.9;
		else return soluong*dongia;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bansachsv a=new Bansachsv();
		a.nhapSach();
		System.out.print("Gia sach cho sinh vien la: "+a.giaBan());
	}

}
