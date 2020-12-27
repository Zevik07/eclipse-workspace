package Buoi1;

public class Hinhtron {
	private double bankinh;
	public Hinhtron()
	{
		bankinh=0;
	}
	public double tinhCV()
	{
		return 2*Math.PI*bankinh;
	}
	public double tinhDT()
	{
		return Math.PI*Math.pow(bankinh,2);
	}
	public void ganBK(double a)
	{
		bankinh=a;
	}
	public double layBK()
	{
		return bankinh;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
