package com.orlandoluna.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ListView listView = (ListView) findViewById(R.id.listViewComponent);
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 100; i++){
           users.add(new User("Nombre "+ i, "Direccion "+ i));
        }
        UsersAdapter adapter = new UsersAdapter(this, users);
        listView.setAdapter(adapter);
    }
}
