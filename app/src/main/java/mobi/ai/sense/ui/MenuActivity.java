package mobi.ai.sense.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import mobi.ai.sense.R;

/* Menu responsável por ações no aplicativo, durante transições de atividades */
public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
}
