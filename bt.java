package com.company;
import java.util.Scanner;
import com.sun.org.apache.xerces.internal.util.SymbolTable;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.awt.*;

/**
 * Created by Windows 7 on 9/21/2016.
 */
public class bt {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("moi nhap a:");
        int a=x.nextInt();
        System.out.println("moi nhap b:");
        int b=x.nextInt();
        System.out.println("moi nhap c:");
        int c=x.nextInt();
        int max;
        int min;
        if (a>b) {
            if (b > c) {
                max = a;
                min = c;
            } else {
                min = b;
                if (c > a) {
                    max = c;
                } else {
                    max = a;
                }
            }
            }
         else{
                if (b < c) {
                    max = c;
                    min = a;
                } else {
                    max = b;
                    if (a > c) {
                        min = c;
                    } else {
                        min = a;
                    }
                }



        }

        System.out.println("max la:"+max);
        System.out.println("min la:"+min);
    }
}
