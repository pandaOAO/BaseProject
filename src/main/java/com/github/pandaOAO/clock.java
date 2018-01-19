package se;

import java.util.Scanner;
import java.util.Random;
import java.io.*;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class clock {
  public static void clockk() {
    System.out.print("現在時間: " + GetCurrentTime("hh:mm:ss") + "\r");
    System.out.println("");
    // String nowTime = GetCurrentTime("hh:mm:ss");
    // 設定鬧鈴時間
    String alarmTime = SetAlarmTime();
    // 執行鬧鈴程式
    try {
      Check_AlarmTime(alarmTime);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public static void Check_AlarmTime(String alarmTime) throws Exception {
    while (true) {
      String nowTime = GetCurrentTime("hh:mm:ss");
      System.out.print(" 現在時間: " + nowTime + "\r");
      // 檢查是否時間到
      if (nowTime.equals(alarmTime)) {
        Alarm_UP(5); // 執行鬧鐘鈴響
        break;
      }
    }
  }

  public static String SetAlarmTime() {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("請輸入鬧鈴時間(hh:mm:ss):");
    String line = null;
    try {
      line = br.readLine();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return line;
  } // 時鐘程式

  public static String GetCurrentTime(String dateFormat) {
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
    return sdf.format(cal.getTime());
  } // 鬧鈴程式 num 是鬧鈴響的次數

  public static void Alarm_UP(int num) {
    char BEE = (char) 7; // 嗶嗶聲
    for (int i = 0; i < num; i++) {
      Random random = new Random();
      Scanner keyboard = new Scanner(System.in);
      System.out.println("懶豬 起床!!! 時間到囉!! " + BEE);
      badword();
      /*
       * //////////////////////////////////////////////////////////////////////// File
       * audioFile = new File("123"); AudioPlayer player =
       * AudioPlayer.createPlayer(audioFile); player.play();
       */
      //////////////////////////////////////////////////////////// 數學題目
      int aa = random.nextInt(1000);
      int bb = random.nextInt(1000);
      int cc = aa + bb;

      System.out.println(aa + "+" + bb);
      System.out.print("Answer:");
      int dd = keyboard.nextInt();

      while (dd != cc) {
        badword();
        System.out.println(aa + "+" + bb);
        System.out.print("Answer:");
        dd = keyboard.nextInt();

        /////////////////////////////////////////////////////////////
      }

    }

  }

  ///////////////////////////////////////////////////////////////////////// 罵人
  public static void badword() {
    int a;
    Random random = new Random();
    a = random.nextInt(10);

    switch (a) {
    case 1:
      System.out.println("你長的很野獸派嘛！");
      break;
    case 2:
      System.out.println("你長得真是挑戰美學呀！");
      break;
    case 3:
      System.out.println("你長成這樣你媽媽知道嗎？");
      break;
    case 4:
      System.out.println("你長得真的有夠醜");
      break;
    case 5:
      System.out.println("你長得真有創意，活得真有勇氣！");
      break;
    case 6:
      System.out.println("你長的肆無忌憚、有恃無恐的！");
      break;
    case 7:
      System.out.println("你穿得很危險，但長得很安全。");
      break;
    case 8:
      System.out.println("你去照照鏡子，保證能把你嚇死。");
      break;
    case 9:
      System.out.println("我勸你一句，你還是重新投胎比較好。");
      break;
    case 10:
      System.out.println("哎呦，你臉怎麼了，油到反光看不清了！");
      break;

    }

  }

}
