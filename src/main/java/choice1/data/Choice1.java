package choice1.data;

import java.util.Scanner;

public class Choice1 {

  public Choice1() {
    // TODO Auto-generated constructor stub
  }

  public static void choose1() {
    SalonList salonslist = new SalonList();
    Scanner scanner = new Scanner(System.in);
    System.out.println("今天是否有洗頭？1.有2.沒有");
    System.out.print("請輸入：");
    boolean IsWashed = false;
    int choose = 0;

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

    System.out.println("");
    switch (choose) {
    case 1:
      IsWashed = true;
      System.out.println("有洗頭！很棒！");
      break;
    case 2:
      System.out.println("以下提供位於附近的髮廊資訊：");
      System.out.println("");
      for (Salon salons : salonslist.salons) {
        System.out.println(salons.name);
        System.out.print(salons.level);

        System.out.print(" ");
        for (int i = 0; i < (int) salons.level; i++) {
          System.out.print("★");
        }
        for (int i = 0; i < 5 - (int) salons.level; i++) {
          System.out.print("☆");
        }
        System.out.print(" ");

        System.out.print(salons.distance + "公尺");
        System.out.print(" ");
        System.out.print(salons.address);
        System.out.print("\n");

        System.out.println(salons.phone);
        System.out.println(salons.businessHours);
        System.out.println();

      }
      choose1();
      break;
    default:
      System.out.println("---請輸入1~5之正整數---");
      choose1();
      break;
    }
  }

}
