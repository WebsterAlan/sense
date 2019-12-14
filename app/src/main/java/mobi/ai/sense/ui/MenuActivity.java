package mobi.ai.sense.ui;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.card.MaterialCardView;
import mobi.ai.sense.R;

/* Menu responsável por ações no aplicativo, durante transições de atividades */
public class MenuActivity extends AppCompatActivity {


    MaterialCardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    public void initEmergency(View view){
        cardView = findViewById(R.id.card01);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        boolean result = cardView.performClick();
        System.out.print(result);
    }


}
