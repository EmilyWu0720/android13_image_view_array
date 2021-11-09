package com.example.image_view_array;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    ImageView imageView;
    int[] img = {R.drawable.dog01,R.drawable.dog02,R.drawable.dog03,
            R.drawable.dog04,R.drawable.dog05,R.drawable.dog06,
            R.drawable.dog07,R.drawable.dog08,R.drawable.dog09,
            R.drawable.dog10
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextTextPersonName);
        imageView = findViewById(R.id.imageView);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                sh();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    public void sh(){
        try {
            int num = Integer.parseInt(editText.getText().toString());
            imageView.setImageResource(img[num-1]);
        }
        catch (Exception e){
            Toast.makeText(this, "請輸入1~10其中一個數字", Toast.LENGTH_LONG).show();
        }
    }
}