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
        cardView = findViewById(R.id.cardRed);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        boolean result = cardView.performClick();
        System.out.print(result);
    }


    public void initVeryEmergency(View view){
        cardView = findViewById(R.id.cardOrange);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        boolean result = cardView.performClick();
        System.out.print(result);
    }


    public void initUrgency(View view){
        cardView = findViewById(R.id.cardYellow);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        boolean result = cardView.performClick();
        System.out.print(result);
    }



    public void initLittleUrgency(View view){
        cardView = findViewById(R.id.cardGreen);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        boolean result = cardView.performClick();
        System.out.print(result);
    }

    public void initNoUrgency(View view){
        cardView = findViewById(R.id.cardBlue);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {}
        });
        boolean result = cardView.performClick();
        System.out.print(result);
    }


}
