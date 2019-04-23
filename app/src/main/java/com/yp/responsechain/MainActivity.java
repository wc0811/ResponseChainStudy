package com.yp.responsechain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private BaseHandle handlerOne;
    private BaseHandle handlerTwo;
    private BaseHandle handlerThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BaseHandle handlerOne = new HandlerOne();
        BaseHandle handlerTwo = new HandlerTwo();
        BaseHandle handlerThree = new HandlerThree();
        Request request = new RequestOne();
        handlerOne.handleMsg(request);
    }
}
