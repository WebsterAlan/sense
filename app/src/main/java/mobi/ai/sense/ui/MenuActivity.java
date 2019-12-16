package mobi.ai.sense.ui;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.google.android.material.card.MaterialCardView;
import mobi.ai.sense.R;

/* Menu responsável por ações no aplicativo, durante transições de atividades */
public class MenuActivity extends AppCompatActivity {


    private static final int MY_PERMISSIONS_REQUEST_CALL_PHONE = 1 ;
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
                String number = "333";
                Uri uri = Uri.parse("tel:" + number);
                Intent intent = new Intent(Intent.ACTION_CALL, uri);
                if (ContextCompat.checkSelfPermission(MenuActivity.this,
                        Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED) {

                    ActivityCompat.requestPermissions(MenuActivity.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            MY_PERMISSIONS_REQUEST_CALL_PHONE);

                    // MY_PERMISSIONS_REQUEST_CALL_PHONE is an
                    // app-defined int constant. The callback method gets the
                    // result of the request.
                } else {
                    //You already have permission
                    try {
                        startActivity(intent);
                    } catch (SecurityException e) {
                        e.printStackTrace();
                    }


                }

                boolean result = cardView.performClick();
                System.out.print(result);
            }
        });
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






    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_CALL_PHONE: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay! Do the phone call

                } else {

                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request
        }
    }

}
