package mobi.ai.sense.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import mobi.ai.sense.R;
import mobi.ai.sense.util.SessionExpiration;
import mobi.ai.sense.view.DisplayMessageActivity;

import java.text.SimpleDateFormat;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "mobi.ai.sense";

    SimpleDateFormat datePresent = new SimpleDateFormat("mm:ss", Locale.US);

    private BroadcastReceiver receiver = new BroadcastReceiver() {


        @Override
        public void onReceive(Context context, Intent intent) {




        }
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

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText4 = (EditText) findViewById(R.id.editText4);
        EditText editText5 = (EditText) findViewById(R.id.editText5);
        String message4 = editText4.getText().toString();
        String message5 = editText5.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message4);
        intent.putExtra(EXTRA_MESSAGE, message5);

        this.iniciarSessao(message4,message5);

        /* Usado para enviar dados sem retorno */
        startActivity(intent);

        /* Usado para retornar algum resultado */
        //startActivityForResult();
    }

    public void iniciarSessao(String email, String password){


    }

    public void saveDataApp(){

        //SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences();

        /* Limpar sessão */

        /*SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.clear(); */
    }
}
