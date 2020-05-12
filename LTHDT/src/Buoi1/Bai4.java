/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1;

/**
 *
 * @author Zevik
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class Bai4 {
    static public void main (String []args)
    {
    int a=0,b=0;
    boolean check=true;
    Scanner temp=new Scanner(System.in);
    do
    {
        try
        {
            System.out.println("Nhap vao 2 so nguyen a va b");
            a=temp.nextInt();
            b=temp.nextInt();
            check=true;
        }
        catch(InputMismatchException e)
                {
                    check=false;
                    System.out.println("Loi, moi nhap lai: ");
                    temp.nextLine();
                }
    }while(!check);
    int tong=a+b;
    System.out.println("Tong 2 so a va b la: "+tong);
}
}