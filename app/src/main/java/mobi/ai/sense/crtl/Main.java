package mobi.ai.sense.crtl;

import android.content.Intent;
import android.widget.EditText;
import mobi.ai.sense.persistence.LoginRepository;
import mobi.ai.sense.ui.MainActivity;
import mobi.ai.sense.ui.MenuActivity;

public class Main {

    public static final String EXTRA_MESSAGE = "mobi.ai.sense";
    LoginRepository loginRepository;

    public Intent efetuarLogin(EditText editText4, EditText editText5, MainActivity mainActivity){

        Intent intent = new Intent(mainActivity, MenuActivity.class);
        intent.putExtra(EXTRA_MESSAGE, editText4.getText().toString());
        intent.putExtra(EXTRA_MESSAGE, editText5.getText().toString());
        String email = editText4.getText().toString();
        String password = editText5.getText().toString();
        boolean result = this.loginRepository.consultUser(email,password);
        return intent;
    }
}
