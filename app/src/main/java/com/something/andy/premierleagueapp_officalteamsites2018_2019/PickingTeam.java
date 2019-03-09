package com.something.andy.premierleagueapp_officalteamsites2018_2019;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PickingTeam extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.premierleagueteams);


        //ARSENAL
        ImageView arsenal = (ImageView) findViewById(R.id.arsenal);
        arsenal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.ARSENAL");
                startActivity(intent);
            }
        });

        //BOURNEMOUTH
        ImageView bournemouth = (ImageView) findViewById(R.id.bournemouth);
        bournemouth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bournemouth = new Intent("android.intent.action.BOURNEMOUTH");
                startActivity(bournemouth);
            }
        });

        //BRIGHTON
        ImageView brighton = (ImageView) findViewById(R.id.brighton);
        brighton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.BRIGHTON");
                startActivity(intent);
            }
        });

        //BURNLEY
        ImageView burnley = (ImageView) findViewById(R.id.burnley);
        burnley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.BURNLEY");
                startActivity(intent);
            }
        });


        //CARDIFF CITY
        ImageView cardiffcity = (ImageView) findViewById(R.id.cardiff);
        cardiffcity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.CARDIFFCITY");
                startActivity(intent);

            }
        });


        //CHELSEA
        ImageView chelsea = (ImageView) findViewById(R.id.chelsea);
        chelsea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.CHELSEA");
                startActivity(intent);
            }
        });

        //CRYSTAL PALACE
        ImageView crystalpalace = (ImageView) findViewById(R.id.crystalpalace);
        crystalpalace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.CRYSTALPALACE");
                startActivity(intent);
            }
        });

        //EVERTON
        ImageView everton = (ImageView) findViewById(R.id.everton);
        everton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.EVERTON");
                startActivity(intent);
            }
        });

        //FULHAM
        ImageView fulham = (ImageView) findViewById(R.id.fulham);
        fulham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.FULHAM");
                startActivity(intent);
            }
        });

        //HUDDERSFIELD
        ImageView huddersfield = (ImageView) findViewById(R.id.huddersfield);
        huddersfield.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.HUDDERSFIELD");
                startActivity(intent);
            }
        });

        //LEICESTER CITY
        ImageView leicesterCity = (ImageView) findViewById(R.id.leicestercity);
        leicesterCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.LEICESTERCITY");
                startActivity(intent);
            }
        });
        //LIVERPOOL
        ImageView liverpool = (ImageView) findViewById(R.id.liverpool);
        liverpool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.LIVERPOOL");
                startActivity(intent);
            }
        });

        //MANCHESTER CITY
        ImageView manchestercity = (ImageView) findViewById(R.id.manchestercity);
        manchestercity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.MANCHESTERCITY");
                startActivity(intent);

            }

        });

        //MANCHESTER UNITED
        ImageView manchesterunited = (ImageView) findViewById(R.id.manchesterunited);
        manchesterunited.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.MANCHESTERUNITED");
                startActivity(intent);

            }

        });

        //NEWCASTLE
        ImageView newcastle = (ImageView) findViewById(R.id.newcastle);
        newcastle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.NEWCASTLE");
                startActivity(intent);

            }

        });

        //SOUTHAMPTON
        ImageView southampton = (ImageView) findViewById(R.id.southampton);
        southampton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.SOUTHAMPTON");
                startActivity(intent);

            }

        });
        //TOTTENHAM
        ImageView tottenham = (ImageView) findViewById(R.id.tottenham);
        southampton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.TOTTENHAM");
                startActivity(intent);

            }

        });
        //WATFORD
        ImageView watford = (ImageView) findViewById(R.id.watford);
        watford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.WATFORD");
                startActivity(intent);

            }

        });
        //WEST HAM
        ImageView westham = (ImageView) findViewById(R.id.westham);
        westham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.WESTHAM");
                startActivity(intent);

            }

        });
        //WOLVERHAMPTON
        ImageView wolves = (ImageView) findViewById(R.id.wolves);
        wolves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent("android.intent.action.WOLVERHAMPTON");
                startActivity(intent);

            }

        });
    }
}