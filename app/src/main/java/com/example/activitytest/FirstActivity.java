package com.example.activitytest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class FirstActivity extends AppCompatActivity {

//    重写onCreateOptionsMenu方法
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

//    重写onOptionsItemSelected方法
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        return super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You clicked Add", Toast.LENGTH_LONG).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You clicked Remove", Toast.LENGTH_LONG).show();
                break;
            default:
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        // 在活动中，可以通过findViewById()方法获取到布局文件中定义的元素，
        // 这里我们传入R.id.button_1来得到按钮的实例。
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(FirstActivity.this, "You clicked Button 1", Toast.LENGTH_LONG).show();
//                Activity类提供了一个finish()方法，可以销毁当前活动
//                finish();
//                显式Intent
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                Intent intent = new Intent("com.example.activitytest.ACTION_START");
                intent.addCategory("com.example.activitytest.MY_CATEGORY");
                startActivity(intent);
            }
        });
    }
}
