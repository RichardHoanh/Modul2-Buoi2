package Buoi2;

import java.util.Scanner;

public class SNTnhohon100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int a = 2; a < 100; a++) {
            boolean checkSNT = true;
            for (int i = 2; i < a; i++) {
                if (a % i == 0){
                   checkSNT=false;
                }
            }
            if(checkSNT==true){
                System.out.println(a);
            }
        }

    }
}

