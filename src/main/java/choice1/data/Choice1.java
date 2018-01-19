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
    int choose;
    choose = scanner.nextInt();
    System.out.println("");
    switch (choose) {
    case 1:
      IsWashed = true;
      break;
    case 2:
      for (Salon salons : salonslist.salons) {
        System.out.println(salons.name);
        System.out.println(salons.level);

        System.out.print(salons.distance);
        System.out.print(" ");
        System.out.print(salons.address);
        System.out.print("\n");

        System.out.println(salons.phone);
        System.out.println(salons.businessHours);
        System.out.println();
      }
      break;

    }
  }

}
