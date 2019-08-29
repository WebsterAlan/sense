package mobi.ai.sense.util;

import android.app.Application;
import android.os.CountDownTimer;

public class SessionExpiration extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }


   public class Contador extends CountDownTimer {


       public Contador(long millisInFuture, long countDownInterval) {
           super(millisInFuture, countDownInterval);
       }

       @Override
       public void onTick(long l) {

       }

       @Override
       public void onFinish() {

       }
   }



}
