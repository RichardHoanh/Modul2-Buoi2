package Buoi2;

import java.util.Scanner;

public class Uocchunglonnhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a");
        int a = scanner.nextInt();
        System.out.println("Nhap b");
        int b = scanner.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("Khong co uoc chung");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
                System.out.println("a = " + a + "; b = " + b);
            }
            System.out.println("Uoc chung lon nhat la : " + a);
        }
    }
}

