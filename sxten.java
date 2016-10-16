import java.util.Scanner;

/**
 * Created by Windows 7 on 10/16/2016.
 */
public class sxten  {
    public static void main(String[] args) {
            String[] x = new String[10];
            Scanner y = new Scanner(System.in);
            int i;
            String tg;
            System.out.println("moi nhap ten:");
            for (i = 0; i < 10; i++) {
                String a = y.nextLine();
                x[i]=a;
            }
            for(i=0; i<9 ;i++)
                for(int j=i+1;j<10;j++ )
                    if(x[i].charAt(0)>x[j].charAt(0)){
                        tg=x[i];
                        x[i]=x[j];
                        x[j]=tg;

                    }
            System.out.println("day sau khi nhap la");
            for(i=0;i<10;i++){
                System.out.println(x[i]);}

        }
}
