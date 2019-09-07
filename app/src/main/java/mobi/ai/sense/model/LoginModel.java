package mobi.ai.sense.model;

import mobi.ai.sense.conf.Dbhelper;
import mobi.ai.sense.conf.SenseApplication;


public class LoginModel {

    /* Instanciação do banco de dados Sqlite */
     Dbhelper dbhelper = new Dbhelper(SenseApplication.context);


    public boolean consultUser(String email, String password){

      /* Método de inserção de dados */
      this.dbhelper.getWritableDatabase();



       return true;
    }


   /* public TbUser returnUser(){



        return TbUser;
    } */












}
