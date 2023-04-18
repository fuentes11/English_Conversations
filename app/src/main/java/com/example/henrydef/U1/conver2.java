package com.example.henrydef.U1;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.example.henrydef.MainActivity;
import com.example.henrydef.R;

import java.io.IOException;

public class conver2 extends AppCompatActivity {

    private MediaRecorder grabacion,grabacion2,grabacion3,grabacion4,grabacion5,grabacion6,grabacion7,grabacion8,grabacion9,grabacion10;
    MediaPlayer mp,mm1,mm2,mm3,mm4,mp2,mp3,mp4,mp5,mp6;
    Button b1,bb1,bb2,bb3,bb4,b2,b3,b4,b5,b6,next,back,home;
    private String archivoSalida = null,archivoSalida2 = null,archivoSalida3 = null,archivoSalida4 = null,archivoSalida5 = null,archivoSalida6 = null
            ,archivoSalida7 = null,archivoSalida8 = null,archivoSalida9 = null,archivoSalida10 = null;
    private Button btn_recorder,btn_recorder2,btn_recorder3,btn_recorder4,btn_recorder5,btn_recorder6,btn_recorder7,btn_recorder8,btn_recorder9,btn_recorder10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conver2);

        b1=(Button)findViewById(R.id.btn_repod);
        bb1=(Button)findViewById(R.id.btn_repo);
        bb2=(Button)findViewById(R.id.btn_repo2);
        bb3=(Button)findViewById(R.id.btn_repo3);
        bb4=(Button)findViewById(R.id.btn_repo4);
        b2=(Button)findViewById(R.id.btn_repod2);
        b3=(Button)findViewById(R.id.btn_repod3);
        b4=(Button)findViewById(R.id.btn_repod4);
        b5=(Button)findViewById(R.id.btn_repod5);
        b6=(Button)findViewById(R.id.btn_repod6);
        next=(Button)findViewById(R.id.nextconver1);
        back = findViewById(R.id.back1);
        home=findViewById(R.id.home);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), conver1.class));
                finish();
            }
        });
        next.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(),conver3.class));
            finish();
        });

        mp=MediaPlayer.create(this,R.raw.dos);
        mm1=MediaPlayer.create(this,R.raw.uno);
        mm2=MediaPlayer.create(this,R.raw.tres);
        mm3=MediaPlayer.create(this,R.raw.cinco);
        mm4=MediaPlayer.create(this,R.raw.ocho);
        mp2=MediaPlayer.create(this,R.raw.cuatro);
        mp3=MediaPlayer.create(this,R.raw.seis);
        mp4=MediaPlayer.create(this,R.raw.siete);
        mp5=MediaPlayer.create(this,R.raw.nueve);
        mp6=MediaPlayer.create(this,R.raw.diez);


        bb1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mm1.start();
            }
        });
        bb2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mm2.start();
            }
        });
        bb3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mm3.start();
            }
        });
        bb4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mm4.start();
            }
        });

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mp4.start();
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mp5.start();
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mp6.start();
            }
        });

        btn_recorder = (Button)findViewById(R.id.btn_rec);
        btn_recorder2 = (Button)findViewById(R.id.btn_rec2);
        btn_recorder3 = (Button)findViewById(R.id.btn_rec3);
        btn_recorder4 = (Button)findViewById(R.id.btn_rec4);
        btn_recorder5 = (Button)findViewById(R.id.btn_recr);
        btn_recorder6 = (Button)findViewById(R.id.btn_recr2);
        btn_recorder7 = (Button)findViewById(R.id.btn_recr3);
        btn_recorder8 = (Button)findViewById(R.id.btn_recr4);
        btn_recorder9 = (Button)findViewById(R.id.btn_recr5);
        btn_recorder10 = (Button)findViewById(R.id.btn_recr6);


        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(conver2.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.RECORD_AUDIO}, 1000);
        }
    }

    public void Recorder(View view){
        if(grabacion == null){
            archivoSalida = getExternalFilesDir(null).getAbsolutePath() + "/Grabacion.mp3";
            grabacion = new MediaRecorder();
            grabacion.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion.setOutputFile(archivoSalida);

            try{
                grabacion.prepare();
                grabacion.start() ;
            } catch (Exception e){
            }

            btn_recorder.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if(grabacion != null){
            grabacion.stop();
            grabacion.release();
            grabacion = null;
            btn_recorder.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }
    public void reproducir(View view) {

        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(archivoSalida);
            mediaPlayer.prepare();
            mediaPlayer.start();
            Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Toast.makeText(this, "error, no se ha grabado el audio aun :(", Toast.LENGTH_SHORT).show();

        }
    }

    public void Recorder2(View view){
        if(grabacion2 == null){
            archivoSalida2 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacion2.mp3";
            grabacion2 = new MediaRecorder();
            grabacion2.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion2.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion2.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion2.setOutputFile(archivoSalida2);

            try{
                grabacion2.prepare();
                grabacion2.start();
            } catch (IOException e){
            }

            btn_recorder2.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if(grabacion2 != null){
            grabacion2.stop();
            grabacion2.release();
            grabacion2 = null;
            btn_recorder2.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }
    public void reproducir2(View view) {

        MediaPlayer mediaPlayer2 = new MediaPlayer();
        try {
            mediaPlayer2.setDataSource(archivoSalida2);
            mediaPlayer2.start();
            Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Toast.makeText(this, "error, no se ha grabado el audio aun :(", Toast.LENGTH_SHORT).show();

        }
    }

    public void Recorder3(View view){
        if(grabacion3 == null){
            archivoSalida3 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacion3.mp3";
            grabacion3 = new MediaRecorder();
            grabacion3.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion3.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion3.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion3.setOutputFile(archivoSalida3);

            try{
                grabacion3.prepare();
                grabacion3.start();
            } catch (IOException e){
            }

            btn_recorder3.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if(grabacion3 != null){
            grabacion3.stop();
            grabacion3.release();
            grabacion3 = null;
            btn_recorder3.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }
    public void reproducir3(View view) {

        MediaPlayer mediaPlayer3 = new MediaPlayer();
        try {
            mediaPlayer3.setDataSource(archivoSalida3);
            mediaPlayer3.prepare();
            mediaPlayer3.start();
            Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Toast.makeText(this, "error, no se ha grabado el audio aun :(", Toast.LENGTH_SHORT).show();

        }
    }

    public void Recorder4(View view){
        if(grabacion4 == null){
            archivoSalida4 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacion4.mp3";
            grabacion4 = new MediaRecorder();
            grabacion4.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion4.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion4.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion4.setOutputFile(archivoSalida4);

            try{
                grabacion4.prepare();
                grabacion4.start();
            } catch (Exception e){
            }

            btn_recorder4.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if(grabacion4 != null){
            grabacion4.stop();
            grabacion4.release();
            grabacion4 = null;
            btn_recorder4.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }
    public void reproducir4(View view) {

        MediaPlayer mediaPlayer4 = new MediaPlayer();
        try {
            mediaPlayer4.setDataSource(archivoSalida4);
            mediaPlayer4.prepare();
            mediaPlayer4.start();
            Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Toast.makeText(this, "error, no se ha grabado el audio aun :(", Toast.LENGTH_SHORT).show();

        }
    }

    public void reco1 (View view){
        if(grabacion5 == null){
            archivoSalida5 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacion5.mp3";
            grabacion5 = new MediaRecorder();
            grabacion5.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion5.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion5.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion5.setOutputFile(archivoSalida5);

            try{
                grabacion5.prepare();
                grabacion5.start();
            } catch (Exception e){
            }

            btn_recorder5.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if(grabacion5 != null){
            grabacion5.stop();
            grabacion5.release();
            grabacion5 = null;
            btn_recorder5.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }
    public void repo1(View view) {

        MediaPlayer mediaPlayer5 = new MediaPlayer();
        try {
            mediaPlayer5.setDataSource(archivoSalida5);
            mediaPlayer5.prepare();
            mediaPlayer5.start();
            Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Toast.makeText(this, "error, no se ha grabado el audio aun :(", Toast.LENGTH_SHORT).show();

        }
    }

    public void reco2(View view){
        if(grabacion6 == null){
            archivoSalida6 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacion6.mp3";
            grabacion6 = new MediaRecorder();
            grabacion6.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion6.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion6.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion6.setOutputFile(archivoSalida6);

            try{
                grabacion6.prepare();
                grabacion6.start();
            } catch (Exception e){
            }

            btn_recorder6.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if(grabacion6 != null){
            grabacion6.stop();
            grabacion6.release();
            grabacion6 = null;
            btn_recorder6.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }
    public void repo2(View view) {

        MediaPlayer mediaPlayer6 = new MediaPlayer();
        try {
            mediaPlayer6.setDataSource(archivoSalida6);
            mediaPlayer6.prepare();
            mediaPlayer6.start();
            Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Toast.makeText(this, "error, no se ha grabado el audio aun :(", Toast.LENGTH_SHORT).show();

        }
    }

    public void reco3(View view){
        if(grabacion7 == null){
            archivoSalida7 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacion7.mp3";
            grabacion7 = new MediaRecorder();
            grabacion7.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion7.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion7.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion7.setOutputFile(archivoSalida7);

            try{
                grabacion7.prepare();
                grabacion7.start();
            } catch (Exception e){
            }

            btn_recorder7.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if(grabacion7 != null){
            grabacion7.stop();
            grabacion7.release();
            grabacion7 = null;
            btn_recorder7.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }
    public void repo3(View view) {

        MediaPlayer mediaPlayer7 = new MediaPlayer();
        try {
            mediaPlayer7.setDataSource(archivoSalida7);
            mediaPlayer7.prepare();
            mediaPlayer7.start();
            Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Toast.makeText(this, "error, no se ha grabado el audio aun :(", Toast.LENGTH_SHORT).show();

        }
    }

    public void reco4(View view){
        if(grabacion8 == null){
            archivoSalida8 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacion8.mp3";
            grabacion8 = new MediaRecorder();
            grabacion8.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion8.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion8.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion8.setOutputFile(archivoSalida4);

            try{
                grabacion8.prepare();
                grabacion8.start();
            } catch (Exception e){
            }

            btn_recorder8.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if(grabacion8 != null){
            grabacion8.stop();
            grabacion8.release();
            grabacion8 = null;
            btn_recorder8.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }
    public void repo4(View view) {

        MediaPlayer mediaPlayer8 = new MediaPlayer();
        try {
            mediaPlayer8.setDataSource(archivoSalida4);
            mediaPlayer8.prepare();
            mediaPlayer8.start();
            Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Toast.makeText(this, "error, no se ha grabado el audio aun :(", Toast.LENGTH_SHORT).show();

        }
    }

    public void reco5(View view){
        if(grabacion9 == null){
            archivoSalida9 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacion9.mp3";
            grabacion9 = new MediaRecorder();
            grabacion9.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion9.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion9.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion9.setOutputFile(archivoSalida9);

            try{
                grabacion9.prepare();
                grabacion9.start();
            } catch (Exception e){
            }

            btn_recorder9.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if(grabacion9 != null){
            grabacion9.stop();
            grabacion9.release();
            grabacion9 = null;
            btn_recorder9.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }
    public void repo5(View view) {

        MediaPlayer mediaPlayer9 = new MediaPlayer();
        try {
            mediaPlayer9.setDataSource(archivoSalida9);
            mediaPlayer9.prepare();
            mediaPlayer9.start();
            Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Toast.makeText(this, "error, no se ha grabado el audio aun :(", Toast.LENGTH_SHORT).show();

        }
    }

    public void reco6(View view){
        if(grabacion10 == null){
            archivoSalida10 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacion10.mp3";
            grabacion10 = new MediaRecorder();
            grabacion10.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion10.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion10.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion10.setOutputFile(archivoSalida10);

            try{
                grabacion10.prepare();
                grabacion10.start();
            } catch (Exception e){
            }

            btn_recorder10.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if(grabacion10 != null){
            grabacion10.stop();
            grabacion10.release();
            grabacion10 = null;
            btn_recorder10.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }
    public void repo6(View view) {

        MediaPlayer mediaPlayer10 = new MediaPlayer();
        try {
            mediaPlayer10.setDataSource(archivoSalida10);
            mediaPlayer10.prepare();
            mediaPlayer10.start();
            Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Toast.makeText(this, "error, no se ha grabado el audio aun :(", Toast.LENGTH_SHORT).show();

        }
    }

}
