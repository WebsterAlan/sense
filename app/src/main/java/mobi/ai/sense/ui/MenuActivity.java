package mobi.ai.sense.ui;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.google.android.material.card.MaterialCardView;
import mobi.ai.sense.R;
import mobi.ai.sense.crtl.Menu;

/* Menu responsável por ações no aplicativo, durante transições de atividades */
public class MenuActivity extends AppCompatActivity {


    private static final int MY_PERMISSIONS_REQUEST_CALL_PHONE = 1 ;
    MaterialCardView cardView;
    Menu menu;

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

                //Acionamento de Chamada
                String number = "333";
                Uri uri = Uri.parse("tel:" + number);
                Intent intentCall = new Intent(Intent.ACTION_CALL, uri);

                //Envio de Mensagem de Texto
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.putExtra("sms_body", "default content");
                sendIntent.setType("vnd.android-dir/mms-sms");

                //Checando permissão para chamadas,localização e Envio de SMS
                if (ContextCompat.checkSelfPermission(MenuActivity.this,
                        Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED) {

                    ActivityCompat.requestPermissions(MenuActivity.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            MY_PERMISSIONS_REQUEST_CALL_PHONE);

                    LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
                    LocationListener locationListener = new LocationListener() {

                        @Override
                        public void onLocationChanged(Location location) {

                        }

                        @Override
                        public void onStatusChanged(String provider, int status, Bundle extras) {

                        }

                        @Override
                        public void onProviderEnabled(String provider) {

                        }

                        @Override
                        public void onProviderDisabled(String provider) {

                        }
                    };

                    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,locationListener);
                } else {
                    //You already have permission
                    try {
                        startActivity(intentCall);
                        startActivity(sendIntent);
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

    public void requestPermission(){

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED){
               ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1);
        }
    }

}
