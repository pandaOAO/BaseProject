package com.github.pandaOAO;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {
  private String jobname; // 可以根據傳入的字串決定做什麼工作

  public MyTask(String jobname) {
    this.jobname = jobname;
  }

  @Override
  public void run() {
    // TODO Auto-generated method stub
    // if(jobname.equals("xxx")){
    // dosomething();
    // }

    if (jobname.equals("copy")) {

    }
  }
}