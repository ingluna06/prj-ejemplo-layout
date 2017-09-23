package com.orlandoluna.layout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class UsersAdapter extends ArrayAdapter<User> {
    public UsersAdapter (Context context, List<User> users){
        super(context, 0, users);
    }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        User user = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater
                    .from(getContext())
                    .inflate(R.layout.user_item, parent, false);
        }
        TextView Name = (TextView) convertView.findViewById(R.id.UserName);
        TextView Adress = (TextView) convertView.findViewById(R.id.UserAdress);
        Name.setText(user.name);
        Adress.setText(user.adress);
        return convertView;
    }
}
