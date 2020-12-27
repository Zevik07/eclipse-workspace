package Buoi1;

import java.util.Scanner;

public class Hocphi {
	private char chungchi;
	private String lop;
	private boolean lasv;
	public Hocphi()
	{
		chungchi='A';
		lasv=false;
		lop=new String();
	}
	public void nhapHocPhi()
	{
		System.out.print("Ban muon dang ki chung chi nao: ");
		Scanner temp=new Scanner(System.in);
		chungchi=temp.next().charAt(0);
		System.out.print("Ban muon hoc lop nao: ");
		lop=temp.next();
		System.out.print("Ban co la sinh vien (Co nhap 'C'): ");
		if (temp.next().charAt(0)=='C') {
			lasv=true;
		}
	}
	public void tienHocPhi()
	{
		double tongtien=0;
		if (chungchi=='A') tongtien+=400000;
		if (chungchi=='B') {
			if(lop=="VB") tongtien+=350000;
			else tongtien+=450000;
		}
		if (lasv==true) tongtien*=0.9;
		System.out.printf("Tien hoc phi: %.0f",tongtien);
	}
	public static void main(String[] args) {
		Hocphi a=new Hocphi();
		a.nhapHocPhi();a.tienHocPhi();
	}

}
