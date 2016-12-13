package com.evolutiondso.www.reversearrayexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    public Button button;
    public TextView tv_arr1, tv_arr2;
    public ArrayList<String> str1, str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_arr1 = (TextView) findViewById(R.id.tv_gievenArray);
        tv_arr2 = (TextView) findViewById(R.id.tv_revArray);

        str1 = new ArrayList<String>();
        str1.add("Val1");
        str1.add("Val2");
        str1.add("Val3");
        str1.add("Val4");
        str1.add("Val5");

        button = (Button) findViewById(R.id.btn_reverse);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_arr1.setText("");
                for(int i=0; i < str1.size(); i++){
                    tv_arr1.append(str1.get(i)+" ,");
                }
                reverse(str1);
                tv_arr2.setText("");
                for(int j=0; j < str1.size(); j++){
                    tv_arr2.append(str2.get(j)+" ,");
                }
            }
        });
    }

    public ArrayList<String> reverse(ArrayList<String> s){
        str2 = new ArrayList<String>(s);
        Collections.reverse(str2);
        return str2;
    }
}
