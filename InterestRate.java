package Buoi2;

import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        double tiengui;
        double laisuat;
        int month;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap tien gui");
        tiengui = input.nextDouble();
        System.out.println("Nhap lai suat");
        laisuat = input.nextDouble();
        System.out.println("Nhap so thang gui");
        month = input.nextInt();
        double tienlai = 0;
        for (int i = 0; i < month; i++) {
            tienlai = tienlai + tiengui * (laisuat / 100) / 12 * month;
        }
        System.out.println("Tong so tien lai cua ban la: " + tienlai);


    }
}
