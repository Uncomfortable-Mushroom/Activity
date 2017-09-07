package com.example.lenovo.activity;

import android.app.Activity;
import android.content.Intent;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button= (Button) findViewById(R.id.button);
        //editText= (EditText) findViewById(R.id.edit);
        button.setOnClickListener(this);
}

    @Override
    public void onClick(View view) {
        EditText editText= (EditText) findViewById(R.id.edit);
        String ed=editText.getText().toString();
        switch (view.getId()) {
            case R.id.button:
                Intent intent= new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("editText",ed);
                startActivityForResult(intent,1);
                break;
            default:
                break;
        }
    }


}
