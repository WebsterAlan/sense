package mobi.ai.sense.presenter;

import android.content.Intent;
import android.widget.EditText;
import mobi.ai.sense.R;
import mobi.ai.sense.model.LoginModel;
import mobi.ai.sense.view.DisplayMessageActivity;
import mobi.ai.sense.view.MainActivity;

public class MainPresenter {

    public static final String EXTRA_MESSAGE = "mobi.ai.sense";
    LoginModel loginModel;

    public Intent efetuarLogin(EditText editText4, EditText editText5, MainActivity mainActivity){

        Intent intent = new Intent(mainActivity, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, editText4.getText().toString());
        intent.putExtra(EXTRA_MESSAGE, editText5.getText().toString());
        String email = editText4.getText().toString();
        String password = editText5.getText().toString();
        //this.loginModel.consultUser();
        this.iniciarSessao(email, password);
        return intent;
    }

     public void iniciarSessao(String email, String password){


    }


}
