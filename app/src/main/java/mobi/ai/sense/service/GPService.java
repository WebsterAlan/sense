package mobi.ai.sense.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class GPService extends Service {
    public GPService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
