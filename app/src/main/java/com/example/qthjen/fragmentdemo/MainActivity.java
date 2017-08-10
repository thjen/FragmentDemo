package com.example.qthjen.fragmentdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        android.app.FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        FragmentC fragmentC = new FragmentC();
//        FragmentD fragmentD = new FragmentD();
//
//        fragmentTransaction.add(R.id.fmContent, fragmentC);
//        fragmentTransaction.add(R.id.fmContent, fragmentD);
//
//        fragmentTransaction.commit();

    }
    /** Sự kiện onClick vào 2 button sử dụng switch case **/
    public void AddFragment(View view) {    // tên hàm phải giống tên hàm trong activity_main là android:onClick="AddFragment"

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = null;

        switch (view.getId()) {

            case R.id.btAddC: fragment = new FragmentC();
                break;
            case R.id.btAddD: fragment = new FragmentD();
                break;

        }

        fragmentTransaction.replace(R.id.fmContent, fragment);
        fragmentTransaction.commit();

    }


}
