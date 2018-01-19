package se;

import java.util.Scanner;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class restroomQ {
  private static int diaper;
  
  public int getdiaper() {
    return diaper;
  }
  
  public static void adddiaper() {
    diaper++;
  }
  
  public static void subdiaper() {
    diaper--;
  }
  
  public static void rest() {
    String choose = null;
    Scanner scanner = new Scanner(System.in);
    int test = 0;
    
    
    String s = "yes";
    Timer timer = new Timer(); // 建立一個Timer物件
    TimerTask showtime = new TimerTask() {// 也可以用匿名類別的方式，
      @Override
      public void run() {
        // TODO Auto-generated method stub
        System.out.println(new Date()); // 輸出時間
      }
    };
    TimerTask gogo = new TimerTask() {
      @Override
      public void run() {
        // TODO Auto-generated method stub
        if (diaper > 0) {
          System.out.println("膀胱 Bang!需要包尿布囉 包起來");
          System.out.println("尿布數量:"+diaper);
          subdiaper();
        } else {
          System.out.println("膀胱 Bang!但你該用尿壺了");
          System.out.println("尿布數量:"+diaper);
          System.out.println("該買尿布囉，系統已自動購買3片尿布");
          adddiaper();
          adddiaper();
          adddiaper();
          System.out.println("尿布剩下:"+diaper);
        }

      }
    };

    System.out.println("歡迎使用");
    System.out.println("膀胱問題解決機，開機就送尿布*1");
    adddiaper();
    while (test == 0) {
      System.out.println("請問需要開始計時了嗎?(yes/no)");
      choose = scanner.next();
      if (choose.equals(s)) {
        test++;
      }
    }
    System.out.println("多久想尿尿?");
    int timeee;
    timeee = scanner.nextInt();
    System.out.println("開始計時");
    timer.schedule(gogo, timeee, timeee);// 5秒後開始，之後每過5秒再執行

    // timer.schedule(xxx, Date);第二個參數是可以指定時間，什麼時候開始執行。
    scanner.close();
  }

}
