package com.ibraheem.android.habittrackerproject;

import android.provider.BaseColumns;


public class HabitContract {

    public HabitContract() {
    }

    public class HabitEntry implements BaseColumns {
        public final static String TABLE_NAME = "tracking_diary";
        public final static String _ID = BaseColumns._ID;
        public final static String DATE = "date";
        public final static String HABIT = "habit";
        public final static String NOTE = "note";
        public final static int HABIT_1 = 0;
        public final static int HABIT_2 = 1;
        public final static int HABIT_3 = 2;
        public final static int HABIT_4 = 3;
    }

}
