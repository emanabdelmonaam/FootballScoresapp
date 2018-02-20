package com.example.android.footballscoresapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static final String score_Team_One = "scoreTeamOne";
    static final String score_Team_Two = "scoreTeamTwo";
    static final String scfaul_Team_One = "scfaulTeamOne";
    static final String scfaul_Team_Two = "scfaulTeamTwo";
    static final String sc_Yellwo_One = "scYellwoOne";
    static final String sc_Yellwo_Two = "scYellwoTwo";
    static final String sc_Red_One = "scRedOne";
    static final String sc_Red_Two = "scRedTwo";

    int scoreTeamOne = 0;
    int scoreTeamTwo = 0;
    int scfaulTeamOne= 0;
    int scfaulTeamTwo=0;
    int scYellwoOne =0;
    int scYellwoTwo =0;
    int scRedOne=0;
    int scRedTwo=0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamOne(0);
        displayForFaulTeamOne(0);}

    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);

        scoreTeamOne = savedInstanceState.getInt(score_Team_One);
        scoreTeamTwo = savedInstanceState.getInt(score_Team_Two);
        scfaulTeamOne = savedInstanceState.getInt(scfaul_Team_One);
        scfaulTeamTwo = savedInstanceState.getInt(scfaul_Team_Two);
        scYellwoOne = savedInstanceState.getInt(sc_Yellwo_One);
        scYellwoTwo = savedInstanceState.getInt(sc_Yellwo_Two);
        scRedOne = savedInstanceState.getInt(sc_Red_One);
        scRedTwo = savedInstanceState.getInt(sc_Red_Two);

        displayForTeamOne(scoreTeamOne);
        displayForTeamTwo(scoreTeamTwo);
        displayForFaulTeamOne(scfaulTeamOne);
        displayForFaulTeamTwo(scfaulTeamTwo);
        displayForYellwoTeamOne(scYellwoOne);
        displayForYellwoTeamTwo(scYellwoTwo);
        displayForRedTeamOne(scRedOne);
        displayForRedTeamTwo(scRedTwo);}

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt(score_Team_One , scoreTeamOne);
        savedInstanceState.putInt(score_Team_Two , scoreTeamTwo);
        savedInstanceState.putInt(scfaul_Team_One , scfaulTeamOne);
        savedInstanceState.putInt(scfaul_Team_Two , scfaulTeamTwo);
        savedInstanceState.putInt(sc_Yellwo_One , scYellwoOne);
        savedInstanceState.putInt(sc_Yellwo_Two , scYellwoTwo);
        savedInstanceState.putInt(sc_Red_One , scRedOne);
        savedInstanceState.putInt(sc_Red_Two , scRedTwo);
        super.onSaveInstanceState(savedInstanceState);}

    public void displayForTeamOne(int score){
        TextView scoreView = (TextView) findViewById(R.id.addOneTeamOne);
        scoreView.setText(String.valueOf(score));}

         public void teamOne(View view){
          scoreTeamOne= scoreTeamOne + 1;
           displayForTeamOne(scoreTeamOne);}

    public void displayForTeamTwo(int score){
        TextView scoreView = (TextView) findViewById(R.id.addOneTeamTwo);
        scoreView.setText(String.valueOf(score));}

         public void teamTwo(View view){
             scoreTeamTwo = scoreTeamTwo + 1;
             displayForTeamTwo(scoreTeamTwo);}

     public void displayForFaulTeamOne(int score){
        TextView scoreView = (TextView) findViewById(R.id.addFaulOne);
        scoreView.setText(String.valueOf(score));}

           public void faul_Team_One(View view){
               scfaulTeamOne = scfaulTeamOne + 1;
               displayForFaulTeamOne(scfaulTeamOne);}

     public void displayForFaulTeamTwo(int score) {
           TextView scoreView = (TextView) findViewById(R.id.addFaulTwo);
           scoreView.setText(String.valueOf(score));}

           public void faul_Team_Two(View view){
               scfaulTeamTwo = scfaulTeamTwo + 1;
               displayForFaulTeamTwo(scfaulTeamTwo);}

    public void displayForYellwoTeamOne(int score){
        TextView scoreView = (TextView) findViewById(R.id.yallowTeamOne);
        scoreView.setText(String.valueOf(score));}

           public void yallow_Team_One(View view){
                scYellwoOne = scYellwoOne + 1;
                displayForYellwoTeamOne(scYellwoOne);}

    public void displayForYellwoTeamTwo(int score){
        TextView scoreView = (TextView) findViewById(R.id.yallowTeamTwot);
        scoreView.setText(String.valueOf(score));}

           public void yallow_Team_Two(View view){
                scYellwoTwo = scYellwoTwo + 1;
                displayForYellwoTeamTwo(scYellwoTwo);}

    public void displayForRedTeamOne(int score){
        TextView scoreView = (TextView) findViewById(R.id.addredTeamOne);
        scoreView.setText(String.valueOf(score));}

            public void red_Team_One(View view){
                scRedOne = scRedOne + 1;
                displayForRedTeamOne(scRedOne);}

    public void displayForRedTeamTwo(int score){
        TextView scoreView = (TextView) findViewById(R.id.addredTeamTwo);
        scoreView.setText(String.valueOf(score));}

             public void red_Team_Two(View view){
                  scRedTwo = scRedTwo + 1;
                  displayForRedTeamTwo(scRedTwo);}

    public void resetZeroForeGame(View view){
        displayForTeamOne(0);
        displayForTeamTwo(0);
        displayForFaulTeamOne(0);
        displayForFaulTeamTwo(0);
        displayForYellwoTeamOne(0);
        displayForYellwoTeamTwo(0);
        displayForRedTeamOne(0);
        displayForRedTeamTwo(0);

        scoreTeamOne = 0;
        scoreTeamTwo = 0;
        scfaulTeamOne =0;
        scfaulTeamTwo =0;
        scYellwoOne =0;
        scYellwoTwo =0;
        scRedOne=0;
        scRedTwo=0;
    }}