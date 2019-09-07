package mobi.ai.sense.model;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import mobi.ai.sense.conf.Dbhelper;
import mobi.ai.sense.conf.SenseApplication;


public class LoginModel {

    /* Instanciação do banco de dados Sqlite */
     Dbhelper dbhelper = new Dbhelper(SenseApplication.context);


    public boolean consultUser(String email, String password){

      /* Método que permite inserção de dados */
        SQLiteDatabase db = this.dbhelper.getWritableDatabase();
        db.execSQL("");


       return true;
    }


   /* public TbUser returnUser(){



        return TbUser;
    } */












}
