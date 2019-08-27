package mobi.ai.sense;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "mobi.ai.sense";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText4 = (EditText) findViewById(R.id.editText4);
        EditText editText5 = (EditText) findViewById(R.id.editText5);
        String message4 = editText4.getText().toString();
        String message5 = editText5.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message4);
        intent.putExtra(EXTRA_MESSAGE, message5);
        startActivity(intent);
    }



}
