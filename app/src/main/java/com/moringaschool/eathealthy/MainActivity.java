package com.moringaschool.eathealthy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity{

    @BindView(R.id.appNameTextView) TextView mAppNameTextView;
    @BindView(R.id.findRecipeButton) Button mFindsRecipesButton ;
    @BindView(R.id.RecipeEditText) EditText mRecipeEditText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
}