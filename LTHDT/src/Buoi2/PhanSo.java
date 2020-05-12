package Buoi2;

import java.util.Scanner;

public class PhanSo {
	private int tu;
	private int mau;
	public PhanSo()
	{
		tu=mau=1;
	}
	public PhanSo(int tu, int mau)
	{
		this.tu=tu;
		this.mau=mau;
	}
	public PhanSo(PhanSo p)
	{
		tu=p.tu;
		mau=p.mau;
	}
	public void nhapPhanso()
	{
		Scanner temp=new Scanner(System.in);
		tu=temp.nextInt();
		mau=temp.nextInt();
		while (mau==0) {
			System.out.print("Mau bang 0, moi nhap lai !!!");
			mau=temp.nextInt();
		}
		System.out.print("Nhap xong !!!\n");
	}
	public void hienthiPhanso()
	{
		if(tu==0) System.out.print(tu);
		else if (tu==mau||mau==1) System.out.print(tu/mau);
		else 
			{
				if (tu*mau<0) System.out.print("-");
				System.out.printf(tu+"/"+mau);
			}
	}
	public void nghichDao()
	{
		if (tu==0) System.out.print("Tu bang 0, khong the nghich dao duoc");
		else {
			int temp=tu;
			tu=mau;
			mau=temp;
			System.out.print("Da nghich dao !!!");
		}
	}
	public float giaTriNghichDao()
	{
		return (float)mau/tu;
	}
	public float gtThuc()
	{
		return (float)tu/mau;
	}
	boolean  lonHon(PhanSo a)
	{
		return gtThuc()>a.gtThuc();
	}
	public int UCLN(int a, int b){
		while(a!= b){
			if(a>b) a= a-b;
			else b= b-a;
		}
		return (a);
	}
	
	public void toiGian(){
		int us = UCLN(tu, mau);
		tu = tu/us;
		mau = mau/us;
	}
	public PhanSo cong(PhanSo a){
		int tu1= (tu*a.mau) +(a.tu*mau);
		int mau1=a.mau*mau;
		return new PhanSo(tu1,mau1);
	}
	public PhanSo tru(PhanSo a){
		int tu1= (tu*a.mau)  - (a.tu*mau);
		int mau1=a.mau*mau;
		return new PhanSo(tu1, mau1);		
	}
	public PhanSo nhan(PhanSo a){
		return new PhanSo(tu*a.tu, mau*a.mau);
	}
	public PhanSo chia(PhanSo a){
		return new PhanSo(tu*a.mau, mau*a.tu);
	}
	public PhanSo cong(int a){
		int tu1= tu + a*mau;
		int mau1=mau;
		return new PhanSo(tu1,mau1);
	}
	public PhanSo tru(int a){
		int tu1= tu - a*mau;
		int mau1=mau;
		return new PhanSo(tu1,mau1);
	}
	public PhanSo nhan(int a){
		return new PhanSo(tu*a, mau);
	}
	public PhanSo chia(int a){
		return new PhanSo(tu, mau*a);
	}
}
