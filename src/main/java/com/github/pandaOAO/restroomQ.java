package se;

import java.util.Scanner;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class restroomQ {
  public static void rest()  {
    String choose = null;
    Scanner scanner = new Scanner(System.in);
    
    Timer timer= new Timer(); //�إߤ@��Timer����
    TimerTask showtime= new TimerTask(){//�]�i�H�ΰΦW���O���覡�A
      
    @Override
    public void run() {
      // TODO Auto-generated method stub
        System.out.println(new Date()); //��X�ɶ�
    } 
  };
  System.out.println("�w��ϥ�");
  System.out.println("�H�ְ��D�ѨM��");
  
  do{
    System.out.println("�аݻݭn�}�l�p�ɤF��?(yes/no)");
    choose = scanner.next();
  }while(choose=="yes"); 
  System.out.println("�}�l�p��");
  
  
  
  timer.schedule(showtime, 1000, 5000);//�@���}�l�A����C�L����A����
  //timer.schedule(xxx, Date);�ĤG�ӰѼƬO�i�H���w�ɶ��A����ɭԶ}�l����C
  scanner.close();
}

}
 

