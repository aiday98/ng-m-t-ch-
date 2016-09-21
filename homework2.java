package com.company;
        import java.util.Scanner;
        import com.sun.org.apache.xerces.internal.util.SymbolTable;
        import com.sun.org.apache.xpath.internal.SourceTree;

        import java.awt.*;


/**
 * Created by Windows 7 on 9/20/2016.
 */
public class homework2 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("moi nhap a:");
        int a=x.nextInt();
        System.out.println("moi nhap b:");
        int b=x.nextInt();
        System.out.println("moi nhap c:");
        int c=x.nextInt();
        if ((a+b>c)&&(a+c>b)&&(b+c>a)){
            System.out.println("day la tam giac");
        }
        else
        {
            System.out.println("day khong phai la tam giac");}



    }

}