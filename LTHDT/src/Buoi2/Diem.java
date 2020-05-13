package Buoi2;

import java.util.Scanner;

public class Diem {
	private int x;
	private int y;
	public Diem()
	{
		x=y=0;
	}
	public Diem(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public Diem(Diem a)
	{
		x=a.x;
		y=a.y;
	}
	public void makecopy(Diem a)
	{
		x=a.x;
		y=a.y;
	}
	public void nhapDiem()
	{
		Scanner temp=new Scanner(System.in);
		x=temp.nextInt();
		y=temp.nextInt();
	}
	public void doiDiem(int dx, int dy)
	{
		x+=dx;
		y+=dy;
		System.out.print("Da doi xong !!!");
	}
	public void xuatDiem()
	{
		System.out.print("("+x+","+y+")");
	}
	public String toString()
	{
		return("("+x+","+y+")");
	}
	public int giaTriX()
	{
		return x;
	}
	public int giatTriY()
	{
		return y;
	}
	public double khoangCach()
	{
		
		return (Math.sqrt(x*x+y*y));
	}
	public double khoangCach(Diem d)
	{
		return (Math.sqrt((x-d.x)*(x-d.x)+(y-d.y)*(y-d.y)));
	}
}
