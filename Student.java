package qlsinhvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Windows 7 on 11/2/2016.
 */
public class Student {
    private String Name;
    private  int Age;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + Name+ '\'' +
                ", age=" + Age +
                '}';
    }
    public void NhapTongTin(){
        Scanner a=new Scanner(System.in);
        System.out.println("moi nhap ten sinh vien:");
         String ten=a.nextLine();
        System.out.print("moi nhap tuoi sinh vien:");
        int tuoi=a.nextInt();
    }
}
