package se;

import java.util.Scanner;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class restroomQ {
  public static void rest()  {
    String choose = null;
    Scanner scanner = new Scanner(System.in);
    
    Timer timer= new Timer(); //建立一個Timer物件
    TimerTask showtime= new TimerTask(){//也可以用匿名類別的方式，
      
    @Override
    public void run() {
      // TODO Auto-generated method stub
        System.out.println(new Date()); //輸出時間
    } 
  };
  System.out.println("歡迎使用");
  System.out.println("膀胱問題解決機");
  
  do{
    System.out.println("請問需要開始計時了嗎?(yes/no)");
    choose = scanner.next();
  }while(choose=="yes"); 
  System.out.println("開始計時");
  
  
  
  timer.schedule(showtime, 1000, 5000);//一秒後開始，之後每過五秒再執行
  //timer.schedule(xxx, Date);第二個參數是可以指定時間，什麼時候開始執行。
  scanner.close();
}

}
 

