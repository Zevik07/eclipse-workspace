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
public class Bai7 {
    public static void tachTen(String a)
    {
        int i=a.lastIndexOf(" ");
        System.out.println("Ten la: "+a.substring(i));
    }
    public static void main(String []args)
    {
        String a="a";
        System.out.println("Nhap ho ten: ");
        Scanner temp=new Scanner(System.in);
        a=temp.nextLine();
        tachTen(a);
    }
}
