package com.example.josit.bianca;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface biafuente = Typeface.createFromAsset(getAssets(),"Awesome Season Personal Use.ttf");
        TextView titulo = findViewById(R.id.nombre);
        titulo.setTypeface(biafuente);

        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.animacion);
        titulo.startAnimation(animacion);

        Animation slideUp = AnimationUtils.loadAnimation(this,R.anim.slideup);
        TextView texto1 = (TextView)findViewById(R.id.descripcion);

        texto1.startAnimation(slideUp);

        MediaPlayer musica = MediaPlayer.create(this,R.raw.eros);
        musica.start();
}
}