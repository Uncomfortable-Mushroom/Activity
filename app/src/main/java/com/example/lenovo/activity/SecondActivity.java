package com.example.lenovo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    String te,s;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Intent intent=getIntent();
        te= intent.getStringExtra("editText");
        editText.setText("接收到的数据为"+te);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
         editText= (EditText) findViewById(R.id.edit);
         s=editText.getText().toString();
        switch(view.getId()){
            case R.id.button:
                Intent intent=new Intent();
                intent.putExtra("return_data",s);
                setResult(RESULT_OK,intent);
                finish();
                break;
            default:
                break;
        }
    }
}
