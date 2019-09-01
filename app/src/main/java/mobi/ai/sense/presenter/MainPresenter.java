package mobi.ai.sense.presenter;

import android.content.Intent;
import android.widget.EditText;
import mobi.ai.sense.R;
import mobi.ai.sense.view.DisplayMessageActivity;
import mobi.ai.sense.view.MainActivity;

public class MainPresenter {

    public static final String EXTRA_MESSAGE = "mobi.ai.sense";

    public Intent efetuarLogin(EditText editText4, EditText editText5, MainActivity mainActivity){

        Intent intent = new Intent(mainActivity, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, editText4.getText().toString());
        intent.putExtra(EXTRA_MESSAGE, editText5.getText().toString());
        this.iniciarSessao(editText4.getText().toString(), editText5.getText().toString());
        return intent;
    }

     public void iniciarSessao(String email, String password){


    }


}
