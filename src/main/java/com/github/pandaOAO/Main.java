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

    int choose;

    Scanner scanner = new Scanner(System.in);
    choose = scanner.nextInt();
    System.out.println("");

    switch (choose) {

    case 1:
      Choice1.choose1();
      break;
    case 2:
      break;
    case 3:
      break;
    case 4:
      break;
    case 5:
      break;
    default:
      chooseList();
      break;
    }
    scanner.close();
  }

}
