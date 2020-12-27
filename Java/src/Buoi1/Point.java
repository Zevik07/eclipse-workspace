package Buoi1;

import java.util.Scanner;

public class Point {
	protected double x,y;
	public Point()
	{
		x=0;y=0;
	}
	public Point(Point a)
	{
		x=a.x;
		y=a.y;
	}
	public Point(double a, double b)
	{
		x=a;y=b;
	}
	public double distance(Point b)
	{
		return Math.sqrt(Math.pow(b.x-x, 2)+Math.pow(b.y-y, 2));
	}
	public void inPut(){
		System.out.println("Nhap toa do cua diem: ");
		Scanner temp=new Scanner(System.in);
		x=temp.nextDouble();
		y=temp.nextDouble();
	}
	public void outPut()
	{
		System.out.println("("+x+","+y+")");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
