package mobi.ai.sense.crtl;


import android.content.Intent;
import android.widget.EditText;
import mobi.ai.sense.persistence.LoginRepository;
import mobi.ai.sense.ui.LoginActivity;
import mobi.ai.sense.ui.MenuActivity;


public class Login {

    public static final String EXTRA_MESSAGE = "mobi.ai.sense";
    LoginRepository loginRepository = new LoginRepository();

    public Intent efetuarLogin(EditText editText4, EditText editText5, LoginActivity loginActivity){

        Intent intent = new Intent(loginActivity,MenuActivity.class);
        intent.putExtra(EXTRA_MESSAGE, editText4.getText().toString());
        intent.putExtra(EXTRA_MESSAGE, editText5.getText().toString());
        String email = editText4.getText().toString();
        String password = editText5.getText().toString();
        this.loginRepository.consultUser(email,password);
        return intent;
    }
}
