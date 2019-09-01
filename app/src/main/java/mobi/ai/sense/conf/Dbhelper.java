package mobi.ai.sense.conf;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import mobi.ai.sense.contract.PostContract;

public class Dbhelper extends SQLiteOpenHelper {

    private static final String Text_Type = "TXT";
    private static final String Comma_Sep = ",";
    private static final String Sql_Post = "CREATE TABLE" + PostContract.PostEntry.TABLE_NAME + "{" +
            PostContract.PostEntry._ID + "INTEGER PRIMARY KEY" + PostContract.PostEntry.COLUMN_NAME_TITLE +
            Text_Type + Comma_Sep + PostContract.PostEntry.COLUMN_NAME_SUBTITLE + Text_Type + "}";



    public Dbhelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public Dbhelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    public Dbhelper(Context context, String name, int version, SQLiteDatabase.OpenParams openParams) {
        super(context, name, version, openParams);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
