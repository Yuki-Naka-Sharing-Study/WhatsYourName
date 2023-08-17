package com.example.whatsyourname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //1. 使うブロックを決めて名前を付ける
    TextView textView; //TextViewというブロックにtextViewという名前をつける
    EditText editText; //EditTextというブロックにeditTextという名前をつける
    Button button; //Buttonというブロックにbuttonという名前をつける
    ImageView imageView; //ImageViewというブロックにimageViewという名前をつける

    // onCreateメソッド → アプリが開いた時にやることを書く場所
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // この２行はおまじない
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // レイアウトとjavaファイルのビューの結び付け
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextText);
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);

        // ブロックに何をさせるのかを決める
        // ボタンにクリックリスナーを付ける
        button.setOnClickListener(this);
    }

    // onClickメソッド → ボタンが押された時に書く場所
    @Override
    public void onClick(View view) {
        // ボタンを押したら画面に画像を出す
        imageView.setImageResource(R.drawable.hello);

        // ボタンを押したら画面に文字を出す
        textView.setText(String.valueOf(editText.getText()) + "さん、こんにちは");

        // 1. EditTextから入力した文字を取ってくる
        // 2. 1で取ってきた文字を「文字列」に変身させる

    }
}