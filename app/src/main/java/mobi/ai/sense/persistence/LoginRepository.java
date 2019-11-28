package mobi.ai.sense.persistence;

import android.database.sqlite.SQLiteDatabase;
import mobi.ai.sense.conf.Dbhelper;
import mobi.ai.sense.conf.SenseApplication;


public class LoginRepository{
     Dbhelper dbhelper = new Dbhelper(SenseApplication.context);


    public void consultUser(String email, String password){

      /* Método que permite inserção de dados
        SQLiteDatabase db = this.dbhelper.getWritableDatabase();
        db.execSQL("create table tb_user ( id integer primary key autoincrement, " + "name text not null);");
       */
    }

    public void  createUser(){
        SQLiteDatabase db = this.dbhelper.getWritableDatabase();
        db.execSQL("create table tb_user ( id integer primary key autoincrement, name text not null, password text not null);");
    }

}
