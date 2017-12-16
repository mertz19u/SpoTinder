package com.example.ghislainmertz.spotinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import retrofit2.http.GET;

public class Identification extends AppCompatActivity {

    Button button;
    WebView spotitoken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);

        button = findViewById(R.id.button);
        spotitoken = findViewById(R.id.spotitoken);
    spotitoken.loadUrl(GET https://accounts.spotify.com/authorize/?client_id=5fe01282e44241328a84e7c5cc169165&response_type=code&redirect_uri=https%3A%2F%2Fexample.com%2Fcallback&scope=user-read-private%20user-read-email&state=34fFs29kd09);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //GET https://accounts.spotify.com/authorize;
            }
        });



    }
}
