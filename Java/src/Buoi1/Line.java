package Buoi1;

public class Line extends Point{
	private Point a;
	private Point b;
	public Line()
	{
		Point a=new Point();
		Point b=new Point();
	}
	public Line(Point x,Point y)
	{
		Point a=new Point(x);			
		Point b=new Point(y);
	}
	public void Giao(Line d2) {
		double a1,b1,a2,b2;
		a1=(a.y-b.y)/(a.x-b.x);
		b1=a.y-a1*a.x;	
		a2=(d2.a.y-d2.b.y)/(d2.a.x-d2.b.x);
		b2=d2.a.y-a2*d2.a.x;
		//Diem giao
		double x1=(b2-b1)/(a1-a2);
		double y1=a1*x1+b1;
		System.out.println("Diem giao cua hai duong nay la ("+x1+","+y1+")");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a=new Point(1,1);
		Point b=new Point(2,2);
		Point c=new Point(1,2);
		Point d=new Point(2,1);
		Line d1=new Line(a,b);
		Line d2=new Line(c,d);
		//d1.Giao(d2);
	}

}
