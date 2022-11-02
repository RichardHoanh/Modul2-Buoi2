package Buoi2;

import java.util.Scanner;

public class KiemtraSNT {
    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean check = true;
        if (a == 0 || a == 1) {
            check = true;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    check = false;
                }
            }
        }
        if (check == true) {
            System.out.println(a + " la so nguyen to");
        } else {
            System.out.println(a + " khong la so nguyen to");
        }
    }
}
