package Buoi1;

public class Hinhcau extends Hinhtron{
	public Hinhcau()
	{
		super();
	}
	public double tinhDT()
	{
		return 4*Math.PI*layBK()*layBK();
	}
	public double tinhMatCat()
	{
		return super.tinhDT();
	}
	public double tinhTT()
	{
		return (4/3)*Math.PI*Math.pow(layBK(), 3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hinhcau a=new Hinhcau();
		a.ganBK(2);
		System.out.println(a.tinhMatCat());

	}

}
