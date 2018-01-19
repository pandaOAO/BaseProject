package com.github.pandaOAO;

import java.util.Scanner;

import choice1.data.Choice1;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    chooseList();

  }

  public static void chooseList() {

    System.out.println("你有什麼樣的困擾呢？");
    System.out.println("1.懶得洗頭");
    System.out.println("2.眼睛太大");
    System.out.println("3.被自己帥醒");
    System.out.println("4.覺得自己太美");
    System.out.println("5.一直想上廁所");
    System.out.print("請選擇：");

    int choose = 0;
    Scanner scanner = new Scanner(System.in);

    boolean IsMatch = false;

    while (!IsMatch) {

      try {
        choose = scanner.nextInt();
        IsMatch = true;
      } catch (Exception e) {

        scanner.nextLine();
        System.out.println("請輸入正整數：");
      }

    }

    switch (choose) {

    case 1:
      Choice1.choose1();
      break;
    case 2:
      function2 f2 = new function2();
      f2.run();
      break;
    case 3:
      clock clocka = new clock();
      clocka.clockk();
      break;
    case 4:
      beautifull beautiful = new beautifull();
      beautiful.beautifula(null);
      break;
    case 5:
      System.out.println("開始時間:" + new java.util.Date());
      restroomQ rest = new restroomQ();
      rest.rest();
      break;
    default:
      System.out.println("---請輸入1~5之正整數---");
      chooseList();
      break;
    }
    scanner.close();
  }

}
