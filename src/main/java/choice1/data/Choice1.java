package choice1.data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Choice1 {

  static int days = 0;

  public Choice1() {
    // TODO Auto-generated constructor stub

  }

  public static void choose1() {

    Date date = new Date();
    SimpleDateFormat now = new SimpleDateFormat("HH:mm");
    String time = now.format(date);

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
      days = 0;
      System.out.println("有洗頭！很棒！請繼續保持");
      System.out.println("");
      choose1();
      break;
    case 2:
      if (days >= 1) {
        System.out.println("您已經" + days + "天沒洗頭囉！");
      }
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

        if (salons.phone != null) {
          System.out.println(salons.phone);
        }

        if (salons.businessHoursStart != null && salons.businessHoursEnd != null) {
          if (time.compareTo(salons.businessHoursStart) > 0 && time.compareTo(salons.businessHoursEnd) < 0) {
            System.out.print("營業中 ");
          } else {
            System.out.print("非營業時間 ");
          }
          System.out.print(salons.businessHoursStart + "-" + salons.businessHoursEnd + "\n");
        }

        System.out.println("");

      }
      days++;

      choose1();
      break;
    default:
      System.out.println("---請輸入1~5之正整數---");
      choose1();
      break;
    }
  }

}
