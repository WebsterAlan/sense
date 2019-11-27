package mobi.ai.sense.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import mobi.ai.sense.R;
import mobi.ai.sense.crtl.Main;

import java.text.SimpleDateFormat;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "mobi.ai.sense";

    SimpleDateFormat datePresent = new SimpleDateFormat("mm:ss", Locale.US);

    Main main = new Main();

    private BroadcastReceiver receiver = new BroadcastReceiver() {


        @Override
        public void onReceive(Context context, Intent intent) {}
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
       // registerReceiver();
    }

    public void sendMessage(View view) {


        EditText editText4 = (EditText) findViewById(R.id.editText4);
        EditText editText5 = (EditText) findViewById(R.id.editText5);
        Intent intent = this.main.efetuarLogin(editText4,editText5, this.getApplicationContext()) ;

        /* Usado para enviar dados sem retorno */
        startActivity(intent);

        /* Usado para retornar algum resultado */
        //startActivityForResult();
    }



    public void saveDataApp(){

        //SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences();

        /* Limpar sessão */

        /*SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.clear(); */
    }
}
