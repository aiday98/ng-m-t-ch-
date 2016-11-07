package qlsinhvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Windows 7 on 11/2/2016.
 */
public class main {
    public static void main(String[] args) {
        int n;



        Scanner a=new Scanner(System.in);
        System.out.print("moi nhap so sinh vien:");
        n= a.nextInt();


        ArrayList<Student> hs= new ArrayList<Student>();
        Student[] b=new  Student[n];
        for(int i=0;i<n;i++) {
            System.out.println("moi nhap thong tin sinh vien thu" + (i + 1));
            b[i] = new Student();
            b[i].NhapTongTin();
            hs.add(b[i]);}
        System.out.println("---------------------------");
            Scanner x= new Scanner(System.in);
            System.out.println("moi nhap thông tin cần thêm:");
            Student x1=new Student();
            x1.NhapTongTin();
            hs.add(x1);

        System.out.println("--------------------------");
        System.out.println("nhap thong tin can xoa ");
        Student x2=new Student();
        x2.NhapTongTin();
        for(int j=0;j<hs.size();j++) {
            if (b[j].getName().equals(x2.getName())) {
                hs.remove(b[j]);
            }
        }




    }

}

