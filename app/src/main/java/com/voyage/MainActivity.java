package com.voyage;

import client.MainClient;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String args[]) {

        //instantiate the MainClient and start the services, this just for demo- can be changed
        MainClient client = new MainClient();
        client.initializeKontextService();
        client.initializeAttrInfoService();
        client.initializePubTransService();
        client.initializeRecommendationService();
    }
}
