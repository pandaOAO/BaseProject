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
    Timer timer = new Timer(); // �إߤ@��Timer����
    TimerTask showtime = new TimerTask() {// �]�i�H�ΰΦW���O���覡�A
      @Override
      public void run() {
        // TODO Auto-generated method stub
        System.out.println(new Date()); // ��X�ɶ�
      }
    };
    TimerTask gogo = new TimerTask() {
      @Override
      public void run() {
        // TODO Auto-generated method stub
        if (diaper > 0) {
          System.out.println("�H�� Bang!�ݭn�]�����o �]�_��");
          System.out.println("�����ƶq:"+diaper);
          subdiaper();
        } else {
          System.out.println("�H�� Bang!���A�ӥΧ����F");
          System.out.println("�����ƶq:"+diaper);
          System.out.println("�ӶR�����o�A�t�Τw�۰��ʶR3������");
          adddiaper();
          adddiaper();
          adddiaper();
          System.out.println("�����ѤU:"+diaper);
        }

      }
    };

    System.out.println("�w��ϥ�");
    System.out.println("�H�ְ��D�ѨM���A�}���N�e����*1");
    adddiaper();
    while (test == 0) {
      System.out.println("�аݻݭn�}�l�p�ɤF��?(yes/no)");
      choose = scanner.next();
      if (choose.equals(s)) {
        test++;
      }
    }
    System.out.println("�h�[�Q����?");
    int timeee;
    timeee = scanner.nextInt();
    System.out.println("�}�l�p��");
    timer.schedule(gogo, timeee, timeee);// 5���}�l�A����C�L5��A����

    // timer.schedule(xxx, Date);�ĤG�ӰѼƬO�i�H���w�ɶ��A����ɭԶ}�l����C
    scanner.close();
  }

}
