package com.example.edittext;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity3 extends AppCompatActivity {

    ViewPager2 myViewPager,myViewPager2;
    String[] names={"java1","java2","java3","java4","java5","java6","java7","java8","java9"};
    int[] imageResource={R.drawable.image_hello,R.drawable.image_hello,R.drawable.image_hello,R.drawable.image_hello,R.drawable.image_hello,};

    MyAdapter myAdapter;
    MySecondAdapter myAdapter2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        myViewPager=findViewById(R.id.my_viewpager);
        myViewPager2=findViewById(R.id.my_viewpager2);

        myAdapter=new MyAdapter(names);
        myAdapter2= new MySecondAdapter(imageResource);

        myViewPager.setAdapter(myAdapter);
        myViewPager2.setAdapter(myAdapter2);

    }
}
