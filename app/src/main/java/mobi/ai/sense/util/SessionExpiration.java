package mobi.ai.sense.util;

import android.app.Application;
import android.os.CountDownTimer;

public class SessionExpiration extends Application {

    Contador count;


    @Override
    public void onCreate() {
        super.onCreate();
    }


    public void init(){

        if(this.count == null){
           count = new Contador(30000,1000);
           count.start();
        }

    }

   public class Contador extends CountDownTimer {

        private long time;
        private boolean isRunning = false;


       public Contador(long millisInFuture, long countDownInterval) {
           super(millisInFuture, countDownInterval);
       }

       @Override
       public void onTick(long l) {
          this.time = l;
          this.isRunning = true;
          //sendBroadcast();
       }

       @Override
       public void onFinish() {

       }
   }



}
