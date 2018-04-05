package com.example.sauravkalia.todo_app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TodoAdaptor extends ArrayAdapter<TodoItem> {
    private Context context;
    private ArrayList<TodoItem> itemArrayList;



    public TodoAdaptor(@NonNull Context context, ArrayList<TodoItem> itemArrayList) {
        super(context,R.layout.activity_main,itemArrayList);
        this.itemArrayList = itemArrayList;
        this.context=context;
    }




    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.activity_list_item, parent, false);


        TodoItem currentTodoItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);

        titleTextView.setText(currentTodoItem.getTitle());
        // Find the TextView in the list_item.xml layout with the ID sample_text.

        TextView sampleTextView = (TextView)listItemView.findViewById(R.id.sample_text);
        // Get the default translation from the currentTodoItem object and set this text on the default TextView.

        sampleTextView.setText(currentTodoItem.getDescription());

        return listItemView;
    }
}

