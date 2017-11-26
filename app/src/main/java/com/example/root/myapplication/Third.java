package com.example.root.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by root on 11/26/17.
 */

public class Third extends Second {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l2);
        Button button;
        button=(Button)findViewById(R.id.save);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name1=(EditText)findViewById(R.id.name);
                EditText addr1=(EditText)findViewById(R.id.addr);

                String name="",addr="",degree="";
                name=name1.getText().toString();
                addr=addr1.getText().toString();
                RadioGroup dgr=(RadioGroup)findViewById(R.id.degree);
                switch (dgr.getCheckedRadioButtonId()) {
                    case R.id.be:
                        degree="B.E";
                        break;
                    case R.id.btech:
                        degree="B.Tech";
                        break;
                    case R.id.bca:
                        degree="B.C.A";
                        break;
                }
                Toast.makeText(Third.this,name+addr+degree,Toast.LENGTH_LONG).show();
            }
        });
    }
}
