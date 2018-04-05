package com.example.sauravkalia.todo_app;

import android.provider.BaseColumns;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

class TodoContract {
    public static class TodoEntry implements BaseColumns {
        public static final String TABLE_NAME = "Todos";
        public static final String COLUMN_TODO_ID = "id";
        public static final String COLUMN_TODO_TITLE = "title";
        public static final String COLUMN_TODO_SAMPLE_TEXT = "sampletext";
    }
}
