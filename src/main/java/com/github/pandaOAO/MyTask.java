package com.github.pandaOAO;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {
  private String jobname; // �i�H�ھڶǤJ���r��M�w������u�@

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