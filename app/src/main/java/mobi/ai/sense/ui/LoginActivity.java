package mobi.ai.sense.ui;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import mobi.ai.sense.R;
import mobi.ai.sense.crtl.Login;

/* Atividade responsável pelo login do usuário */
public class LoginActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "mobi.ai.sense";

    Login main = new Login();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {

        EditText editText4 = (EditText) findViewById(R.id.editText4);
        EditText editText5 = (EditText) findViewById(R.id.editText5);
        Intent intent = this.main.efetuarLogin(editText4,editText5, this);
        startActivity(intent);

    }
}
