package com.example.henrydef.U3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.henrydef.MainActivity;
import com.example.henrydef.R;

import java.io.IOException;

public class U3C2 extends AppCompatActivity {

    private MediaRecorder grabacion, grabacion2, grabacion3, grabacion4, grabacion5, grabacion6, grabacion7, grabacion8;

    MediaPlayer mp1, mp2, mp3, mp4, mp5, mp6, mp7, mp8;

    Button b1, b2, b3, b4, b5, b6, b7, b8,next,back,home;

    private String archivoSalida = null, archivoSalida2 = null, archivoSalida3 = null, archivoSalida4 = null, archivoSalida5 = null, archivoSalida6 = null, archivoSalida7 = null, archivoSalida8 = null;

    private Button btn_recorder, btn_recorder2, btn_recorder3, btn_recorder4, btn_recorder5, btn_recorder6, btn_recorder7, btn_recorder8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u3_c2);

        b1 = (Button) findViewById(R.id.btn_repoUC21);
        b2 = (Button) findViewById(R.id.btn_repoUC22);
        b3 = (Button) findViewById(R.id.btn_repoUC23);
        b4 = (Button) findViewById(R.id.btn_repoUC24);
        b5 = (Button) findViewById(R.id.btn_repoUC25);
        b6 = (Button) findViewById(R.id.btn_repoUC26);
        next = (Button) findViewById(R.id.nextconver1);

        mp1 = MediaPlayer.create(this, R.raw.u3c21);
        mp2 = MediaPlayer.create(this, R.raw.u3c22);
        mp3 = MediaPlayer.create(this, R.raw.u3c23);
        mp4 = MediaPlayer.create(this, R.raw.u3c24);
        mp5 = MediaPlayer.create(this, R.raw.u3c25);
        mp6 = MediaPlayer.create(this, R.raw.u3c26);
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
                startActivity(new Intent(getApplicationContext(), U3C1.class));
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(U3C2.this, U3C3.class);
                startActivity(intent);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp4.start();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp5.start();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp6.start();
            }
        });


        btn_recorder =(Button) findViewById(R.id.btn_recUC21);

        btn_recorder2 =(Button) findViewById(R.id.btn_recUC22);

        btn_recorder3 =(Button) findViewById(R.id.btn_recUC23);

        btn_recorder4 =(Button) findViewById(R.id.btn_recUC24);

        btn_recorder5 =(Button) findViewById(R.id.btn_recUC25);

        btn_recorder6 =(Button) findViewById(R.id.btn_recUC26);




        if(ContextCompat.checkSelfPermission(

                getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(

                getApplicationContext(),Manifest.permission.RECORD_AUDIO)!=PackageManager.PERMISSION_GRANTED)

        {
            ActivityCompat.requestPermissions(U3C2.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.RECORD_AUDIO}, 1000);
        }
    }

    public void RecorderUC21 (View view){
        if (grabacion == null) {
            archivoSalida = getExternalFilesDir(null).getAbsolutePath() + "/GrabacionUC21.mp3";
            grabacion = new MediaRecorder();
            grabacion.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion.setOutputFile(archivoSalida);

            try {
                grabacion.prepare();
                grabacion.start();
            } catch (IOException e) {
            }

            btn_recorder.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if (grabacion != null) {
            grabacion.stop();
            grabacion.release();
            grabacion = null;
            btn_recorder.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }
    public void reproducirUC21 (View view){

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

    public void RecorderUC22 (View view){
        if (grabacion2 == null) {
            archivoSalida2 = getExternalFilesDir(null).getAbsolutePath() + "/GrabacionUC22.mp3";
            grabacion2 = new MediaRecorder();
            grabacion2.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion2.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion2.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion2.setOutputFile(archivoSalida2);

            try {
                grabacion2.prepare();
                grabacion2.start();
            } catch (IOException e) {
            }

            btn_recorder2.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if (grabacion2 != null) {
            grabacion2.stop();
            grabacion2.release();
            grabacion2 = null;
            btn_recorder2.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }
    public void reproducirUC22 (View view){

        MediaPlayer mediaPlayer2 = new MediaPlayer();
        try {
            mediaPlayer2.setDataSource(archivoSalida2);
            mediaPlayer2.prepare();
            mediaPlayer2.start();
        Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();

    } catch (Exception e) {
        Toast.makeText(this, "error, no se ha grabado el audio aun :(", Toast.LENGTH_SHORT).show();

    }
    }

    public void RecorderUC23 (View view){
        if (grabacion3 == null) {
            archivoSalida3 = getExternalFilesDir(null).getAbsolutePath() + "/GrabacionUC23.mp3";
            grabacion3 = new MediaRecorder();
            grabacion3.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion3.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion3.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion3.setOutputFile(archivoSalida3);

            try {
                grabacion3.prepare();
                grabacion3.start();
            } catch (IOException e) {
            }

            btn_recorder3.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if (grabacion3 != null) {
            grabacion3.stop();
            grabacion3.release();
            grabacion3 = null;
            btn_recorder3.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }
    public void reproducirUC23 (View view){

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

    public void RecorderUC24 (View view){
        if (grabacion4 == null) {
            archivoSalida4 = getExternalFilesDir(null).getAbsolutePath() + "/GrabacionUC24.mp3";
            grabacion4 = new MediaRecorder();
            grabacion4.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion4.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion4.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion4.setOutputFile(archivoSalida4);

            try {
                grabacion4.prepare();
                grabacion4.start();
            } catch (IOException e) {
            }

            btn_recorder4.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if (grabacion4 != null) {
            grabacion4.stop();
            grabacion4.release();
            grabacion4 = null;
            btn_recorder4.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }
    public void reproducirUC24 (View view){

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

    public void RecorderUC25 (View view){
        if (grabacion5 == null) {
            archivoSalida5 = getExternalFilesDir(null).getAbsolutePath() + "/GrabacionUC25.mp3";
            grabacion5 = new MediaRecorder();
            grabacion5.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion5.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion5.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion5.setOutputFile(archivoSalida5);

            try {
                grabacion5.prepare();
                grabacion5.start();
            } catch (IOException e) {
            }

            btn_recorder5.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if (grabacion5 != null) {
            grabacion5.stop();
            grabacion5.release();
            grabacion5 = null;
            btn_recorder5.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }
    public void reproducirUC25 (View view){

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

    public void RecorderUC26 (View view){
        if (grabacion6 == null) {
            archivoSalida6 = getExternalFilesDir(null).getAbsolutePath() + "/GrabacionUC26.mp3";
            grabacion6 = new MediaRecorder();
            grabacion6.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion6.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion6.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion6.setOutputFile(archivoSalida6);

            try {
                grabacion6.prepare();
                grabacion6.start();
            } catch (IOException e) {
            }

            btn_recorder6.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if (grabacion6 != null) {
            grabacion6.stop();
            grabacion6.release();
            grabacion6 = null;
            btn_recorder6.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }
    public void reproducirUC26 (View view){

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


}


