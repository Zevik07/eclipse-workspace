package testgui;
import javax.swing.*;
import java.awt.*;
public class helloworld {
	public static void main(String []args)
	{
		JFrame f=new JFrame("Hello world Swing");
		f.setLayout(new FlowLayout());
		JLabel lbHello= new JLabel("Hello world");
		JButton btPressMe= new JButton("Press me");
		f.getContentPane().add(lbHello);
		f.getContentPane().add(btPressMe);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setSize(600, 300);
		f.setVisible(true);
	}
}