package Buoi2;

import java.util.Scanner;

public class Hienthi20SNT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = input.nextInt();
        int dem = 0;
        for (int a = 2; dem < n; a++) {
            //Kiem tra a co phai SNT hay khong
            boolean checkSNT = true;
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    checkSNT = false;
                }
            } //Ket thuc kiem tra SNT
            if (checkSNT == true) {
                dem++;
                System.out.println(a);
            }
        }

    }
}


