package com.company;

import com.sun.org.apache.xerces.internal.util.SymbolTable;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("moi nhap a: ");
        float a = s.nextInt();
        System.out.println("moi nhap b: ");
        float b = s.nextInt();
        System.out.println("moi nhap c: ");
        float c = s.nextInt();

            if(a==0){
            System.out.println("phuong trinh co mot nghiem duy nhat x= "+(-c/b));}
            else
            {
                float delta = (b * b) - 4 * a * c;
                double x1;
                double x2;
                if (delta > 0) {
                    x1 = (b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b + Math.sqrt(delta)) / (2 * a);
                    System.out.println("phuong trinh co nghiem x1=" + x1);
                    System.out.println("phuong trinh co nghiem x2=" + x2);
                } else if (delta == 0) {
                    System.out.println("phuong trinh co nghiem kep  ");
                    x1 = x2 = -b / 2 * a;
                    System.out.println(x1 = x2);
                } else

                {
                    System.out.println("phuong trinh vo nghiem");
                }


            }




    }
}


