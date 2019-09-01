package mobi.ai.sense.contract;

import android.provider.BaseColumns;

public final class PostContract {


    private PostContract() {}


   public static class PostEntry implements BaseColumns {

      public static final String TABLE_NAME = "post";
      public static final String COLUMN_NAME_TITLE = "titulo";
      public static final String COLUMN_NAME_SUBTITLE = "subtitle";

   }


}
