package com.example.test3;

//输入文字
//点击确定
//点击强调字体，可以改变字体大小和颜色
//最后选择是否满意

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton rb1;
    private RadioButton rb2;
    private Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r_button();

    }



    int size=33;
    public int c=-1;

    private  void r_button(){
        rb1=(RadioButton)findViewById(R.id.radio1);
        rb2=(RadioButton)findViewById(R.id.radio2);
        ok=(Button)findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb1.isChecked()){
                    Toast.makeText(MainActivity.this,"满意",Toast.LENGTH_SHORT).show();
                    Log.d("MainActivity","满意");
                }
                if (rb2.isChecked()){
                    Toast.makeText(MainActivity.this,"不满意",Toast.LENGTH_SHORT).show();
                    Log.d("MainActivity","不满意");
                }


            } });


    }


    public void bigger(View V){
        TextView txv;
        txv=(TextView)findViewById(R.id.txv);
        //txv.setTextSize(++size);
        size=size+2;
        txv.setTextSize(size);

            txv.setTextColor(Color.RED);
        Log.d("MainActivity","强调字体");
    }

    public void display(View v){
        EditText name=(EditText)findViewById(R.id.name);
        TextView text2=(TextView)findViewById(R.id.txv);
        text2.setText(name.getText().toString());
        Log.d("MainActivity","输入文字");
    }

//    Button b=findViewById(R.id.button);
//    b.setOnClickListener(new View.OnClickListener(){
//
//    })

}
