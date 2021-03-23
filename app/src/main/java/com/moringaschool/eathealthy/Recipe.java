package com.moringaschool.eathealthy;

import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;

public class Recipe extends AppCompatActivity {
    @BindView(R.id.listView) ListView mListView ;

    private String [] recipes = new String[] {"Cooking rice" , "Cooking chicken ", "Making eggs" , "Cooking beef"};

}
