package se;

import java.util.Scanner;
import java.util.Random;

public class function2 {

  public void run() {

    int a[] = new int[25];

    System.out.print("請輸入你的眼球直徑是多少mm");

    Scanner scanner = new Scanner(System.in);

    int cm = scanner.nextInt();

    if (cm > 11) {
      for (int i = 0; i < 25; i++) {
        Random ran = new Random();
        int num = ran.nextInt(2);

        a[i] = num;
        if (i % 5 == 0) {
          System.out.println();
        }
        System.out.print(num);
      }
    }

    System.out.println("請數出幾個0幾個1");
    System.out.println("在數一次按0 結束按1");

    int enter = scanner.nextInt();

    do {
      for (int i = 0; i < 25; i++) {
        Random ran = new Random();
        int num = ran.nextInt(2);

        a[i] = num;
        if (i % 5 == 0) {
          System.out.println();
        }
        System.out.print(num);
      }

      System.out.println("請數出幾個0幾個1");
      System.out.println("在數一次按0 結束按1");

      int enter2 = scanner.nextInt();
      enter = enter2;
    } while (enter == 0);

  }
}