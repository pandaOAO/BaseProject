package se;

import java.util.Scanner;
import java.util.Random;
import java.io.*;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class clock {
  public static void clockk() {
    System.out.print("�{�b�ɶ�: " + GetCurrentTime("hh:mm:ss") + "\r");
    System.out.println("");
    // String nowTime = GetCurrentTime("hh:mm:ss");
    // �]�w�x�a�ɶ�
    String alarmTime = SetAlarmTime();
    // ����x�a�{��
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
      System.out.print(" �{�b�ɶ�: " + nowTime + "\r");
      // �ˬd�O�_�ɶ���
      if (nowTime.equals(alarmTime)) {
        Alarm_UP(5); // ����x���a�T
        break;
      }
    }
  }

  public static String SetAlarmTime() {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("�п�J�x�a�ɶ�(hh:mm:ss):");
    String line = null;
    try {
      line = br.readLine();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return line;
  } // �����{��

  public static String GetCurrentTime(String dateFormat) {
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
    return sdf.format(cal.getTime());
  } // �x�a�{�� num �O�x�a�T������

  public static void Alarm_UP(int num) {
    char BEE = (char) 7; // �͹��n
    for (int i = 0; i < num; i++) {
      Random random = new Random();
      Scanner keyboard = new Scanner(System.in);
      System.out.println("�i�� �_��!!! �ɶ����o!! " + BEE);
      badword();
      /*
       * //////////////////////////////////////////////////////////////////////// File
       * audioFile = new File("123"); AudioPlayer player =
       * AudioPlayer.createPlayer(audioFile); player.play();
       */
      //////////////////////////////////////////////////////////// �ƾ��D��
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

  ///////////////////////////////////////////////////////////////////////// �|�H
  public static void badword() {
    int a;
    Random random = new Random();
    a = random.nextInt(10);

    switch (a) {
    case 1:
      System.out.println("�A�����ܳ��~�����I");
      break;
    case 2:
      System.out.println("�A���o�u�O�D�Ԭ��ǧr�I");
      break;
    case 3:
      System.out.println("�A�����o�˧A�������D�ܡH");
      break;
    case 4:
      System.out.println("�A���o�u��������");
      break;
    case 5:
      System.out.println("�A���o�u���зN�A���o�u���i��I");
      break;
    case 6:
      System.out.println("�A�����v�L�Ҽ��B����L�����I");
      break;
    case 7:
      System.out.println("�A��o�ܦM�I�A�����o�ܦw���C");
      break;
    case 8:
      System.out.println("�A�h�ӷ���l�A�O�ү��A�~���C");
      break;
    case 9:
      System.out.println("���U�A�@�y�A�A�٬O���s��L����n�C");
      break;
    case 10:
      System.out.println("�u��A�A�y���F�A�o��ϥ��ݤ��M�F�I");
      break;

    }

  }

}