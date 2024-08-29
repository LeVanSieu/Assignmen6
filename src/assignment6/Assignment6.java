
package assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment6 {
    public static int nhonhat(int k,int mang[]){
        int gtnn=mang[0];
        for (int i=0; i<k;i++){
            if (gtnn>mang[i]){
                gtnn=mang[i];
            }
        }
        return gtnn;
    }
    public static int lonnhat(int k,int mang[]){
        int gtln=mang[0];
        for (int i=0; i<k-1;i++){
            if (gtln< mang[i]){
                gtln=mang[i];
            }
        }
        return gtln;
    }
    public static void main(String[] args) {
        Scanner nhap= new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int phantu= nhap.nextInt();
        int[] mang= new int[phantu];
        for (int i=0;i<phantu;i++){
            System.out.print("Nhap phan tu vi tri "+i+" : ");
            mang[i]=nhap.nextInt();
        }
            System.out.println("Mang "+Arrays.toString(mang));
            nhonhat(phantu,mang);
            lonnhat(phantu,mang);
            System.out.println("Gia tri nho nhat cua mang: "+ nhonhat(phantu,mang));
            System.out.println("Gia tri lon nhat cua mang: "+ lonnhat(phantu,mang));
    }
    
}
