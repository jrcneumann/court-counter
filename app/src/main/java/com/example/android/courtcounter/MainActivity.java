package com.example.android.courtcounter;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = (TextView) findViewById(R.id.main_activity_text_team_a_score)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button threePointButton = (Button) findViewById(R.id.main_activity_button_score_three_points);
    threePointButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        }
    });

    }
}
