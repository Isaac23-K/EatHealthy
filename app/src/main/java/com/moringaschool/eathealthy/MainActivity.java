package com.moringaschool.eathealthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.appNameTextView) TextView mAppNameTextView;
    @BindView(R.id.findRecipesButton) Button mFindsRecipesButton ;
    @BindView(R.id.RecipeEditText) EditText mRecipeEditText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mFindsRecipesButton.setOnClickListener(this);
        }

            @Override
            public void onClick(View v) {
                if (v == mFindsRecipesButton) {
                    String recipes = mRecipeEditText.getText().toString();
                    Intent intent = new Intent(MainActivity.this, Recipe.class);
                    intent.putExtra("recipes", recipes);
                    startActivity(intent);
                }
            }
}