package se;

import java.util.Scanner;
import java.util.Date;

import choice1.data.Choice1;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    chooseList();

  }

  public static void chooseList() {

    System.out.println("�A������˪��x�Z�O�H");
    System.out.println("1.�i�o�~�Y");
    System.out.println("2.�����Ӥj");
    System.out.println("3.�Q�ۤv�ӿ�");
    System.out.println("4.ı�o�ۤv�Ӭ�");
    System.out.println("5.�@���Q�W�Z��");
    System.out.print("�п�ܡG");

    int choose;
    Scanner scanner = new Scanner(System.in);
    choose = scanner.nextInt();

    switch (choose) {

    case 1:
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
      System.out.println("�}�l�ɶ�:" + new java.util.Date());
      restroomQ rest = new restroomQ();
      rest.rest();
      break;
    default:
      chooseList();
      break;
    }
    scanner.close();
  }

}
