package com.example.henrydef.U1;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.example.henrydef.MainActivity;
import com.example.henrydef.R;

import java.io.IOException;

public class conver1 extends AppCompatActivity {

    private MediaRecorder grabacion, grabacion2, grabacion3, grabacion4, grabacion5, grabacion6, grabacion7, grabacion8, grabacion9, grabacion10, grabacion11, grabacion12, grabacion13;

    MediaPlayer mp1, mp2, mp3, mp4, mp5, mp6, mp7, mp8, mp9, mp10, mp11, mp12, mp13;

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, next, back, home;

    private String archivoSalida = null, archivoSalida2 = null, archivoSalida3 = null, archivoSalida4 = null, archivoSalida5 = null, archivoSalida6 = null, archivoSalida7 = null, archivoSalida8 = null, archivoSalida9 = null, archivoSalida10 = null, archivoSalida11 = null, archivoSalida12 = null, archivoSalida13 = null;

    private Button btn_recorder, btn_recorder2, btn_recorder3, btn_recorder4, btn_recorder5, btn_recorder6, btn_recorder7, btn_recorder8, btn_recorder9, btn_recorder10, btn_recorder11, btn_recorder12, btn_recorder13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conver1);

        b1 = (Button) findViewById(R.id.btn_repo);
        b2 = (Button) findViewById(R.id.btn_repo2);
        b3 = (Button) findViewById(R.id.btn_repo3);
        b4 = (Button) findViewById(R.id.btn_repo4);
        b5 = (Button) findViewById(R.id.btn_repo5);
        b6 = (Button) findViewById(R.id.btn_repo6);
        b7 = (Button) findViewById(R.id.btn_repo7);
        b8 = (Button) findViewById(R.id.btn_repo8);
        b9 = (Button) findViewById(R.id.btn_repo9);
        b10 = (Button) findViewById(R.id.btn_repo10);
        b11 = (Button) findViewById(R.id.btn_repo11);
        b12 = (Button) findViewById(R.id.btn_repo12);
        b13 = (Button) findViewById(R.id.btn_repo13);
        next = (Button) findViewById(R.id.nextconver1);
        back = findViewById(R.id.back1);
        home = findViewById(R.id.home);


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
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });
        next.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), conver2.class));
            finish();
        });
        mp1 = MediaPlayer.create(this, R.raw.unoc1);
        mp2 = MediaPlayer.create(this, R.raw.dosc1);
        mp3 = MediaPlayer.create(this, R.raw.tresc1);
        mp4 = MediaPlayer.create(this, R.raw.cuatroc1);
        mp5 = MediaPlayer.create(this, R.raw.cincoc1);
        mp6 = MediaPlayer.create(this, R.raw.seisc1);
        mp7 = MediaPlayer.create(this, R.raw.sietec1);
        mp8 = MediaPlayer.create(this, R.raw.ochoc1);
        mp9 = MediaPlayer.create(this, R.raw.nuevec1);
        mp10 = MediaPlayer.create(this, R.raw.diezc1);
        mp11 = MediaPlayer.create(this, R.raw.oncec1);
        mp12 = MediaPlayer.create(this, R.raw.docec1);
        mp13 = MediaPlayer.create(this, R.raw.trecec1);

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
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp7.start();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp8.start();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp9.start();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp10.start();
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp11.start();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp12.start();
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp13.start();
            }
        });

        btn_recorder = (Button) findViewById(R.id.btn_rec1);

        btn_recorder2 = (Button) findViewById(R.id.btn_rec2);

        btn_recorder3 = (Button) findViewById(R.id.btn_rec3);

        btn_recorder4 = (Button) findViewById(R.id.btn_rec4);

        btn_recorder5 = (Button) findViewById(R.id.btn_rec5);

        btn_recorder6 = (Button) findViewById(R.id.btn_rec6);

        btn_recorder7 = (Button) findViewById(R.id.btn_rec7);

        btn_recorder8 = (Button) findViewById(R.id.btn_rec8);

        btn_recorder9 = (Button) findViewById(R.id.btn_rec9);

        btn_recorder10 = (Button) findViewById(R.id.btn_rec10);

        btn_recorder11 = (Button) findViewById(R.id.btn_rec11);
        btn_recorder12 = (Button) findViewById(R.id.btn_rec12);
        btn_recorder13 = (Button) findViewById(R.id.btn_rec13);


        if (ContextCompat.checkSelfPermission(

                getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(

                getApplicationContext(), Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(conver1.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.RECORD_AUDIO}, 1000);
        }
    }

    public void Recorderc1(View view) {
        if (grabacion == null) {
            archivoSalida = getExternalFilesDir(null).getAbsolutePath() + "/Grabacionc1.mp3";
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

    public void reproducirc1(View view) {

        MediaPlayer mediaPlayer = new MediaPlayer();
        Log.d("ola", "reproducirc1: ");
        try {
            mediaPlayer.setDataSource(archivoSalida);
            mediaPlayer.prepare();
            mediaPlayer.start();
            Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Toast.makeText(this, "error, no se ha grabado el audio aun :(", Toast.LENGTH_SHORT).show();

        }


    }

    public void Recorderc2(View view) {
        if (grabacion2 == null) {
            archivoSalida2 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacionc2.mp3";
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

    public void reproducirc2(View view) {

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

    public void Recorderc3(View view) {
        if (grabacion3 == null) {
            archivoSalida3 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacionc3.mp3";
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

    public void reproducirc3(View view) {

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

    public void Recorderc4(View view) {
        if (grabacion4 == null) {
            archivoSalida4 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacionc4.mp3";
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

    public void reproducirc4(View view) {

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

    public void Recorderc5(View view) {
        if (grabacion5 == null) {
            archivoSalida5 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacionc5.mp3";
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

    public void reproducirc5(View view) {

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

    public void Recorderc6(View view) {
        if (grabacion6 == null) {
            archivoSalida6 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacionc6.mp3";
            grabacion6 = new MediaRecorder();
            grabacion6.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion6.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion6.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion6.setOutputFile(archivoSalida6);

            try {
                grabacion6.prepare();
                grabacion6.start();
            } catch (Exception e) {
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

    public void reproducirc6(View view) {

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

    public void Recorderc7(View view) {
        if (grabacion7 == null) {
            archivoSalida7 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacionc7.mp3";
            grabacion7 = new MediaRecorder();
            grabacion7.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion7.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion7.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion7.setOutputFile(archivoSalida7);

            try {
                grabacion7.prepare();
                grabacion7.start();
            } catch (IOException e) {
            }

            btn_recorder7.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if (grabacion7 != null) {
            grabacion7.stop();
            grabacion7.release();
            grabacion7 = null;
            btn_recorder7.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }

    public void reproducirc7(View view) {

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

    public void Recorderc8(View view) {
        if (grabacion8 == null) {
            archivoSalida8 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacionc8.mp3";
            grabacion8 = new MediaRecorder();
            grabacion8.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion8.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion8.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion8.setOutputFile(archivoSalida8);

            try {
                grabacion8.prepare();
                grabacion8.start();
            } catch (IOException e) {
            }

            btn_recorder8.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if (grabacion8 != null) {
            grabacion8.stop();
            grabacion8.release();
            grabacion8 = null;
            btn_recorder8.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }

    public void reproducirc8(View view) {

        MediaPlayer mediaPlayer8 = new MediaPlayer();
        try {
            mediaPlayer8.setDataSource(archivoSalida8);
            mediaPlayer8.prepare();
            mediaPlayer8.start();
            Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Toast.makeText(this, "error, no se ha grabado el audio aun :(", Toast.LENGTH_SHORT).show();

        }
    }

    public void Recorderc9(View view) {
        if (grabacion9 == null) {
            archivoSalida9 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacionc9.mp3";
            grabacion9 = new MediaRecorder();
            grabacion9.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion9.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion9.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion9.setOutputFile(archivoSalida9);

            try {
                grabacion9.prepare();
                grabacion9.start();
            } catch (IOException e) {
            }

            btn_recorder9.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if (grabacion9 != null) {
            grabacion9.stop();
            grabacion9.release();
            grabacion9 = null;
            btn_recorder9.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }

    public void reproducirc9(View view) {

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

    public void Recorderc10(View view) {
        if (grabacion10 == null) {
            archivoSalida10 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacionc10.mp3";
            grabacion10 = new MediaRecorder();
            grabacion10.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion10.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion10.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion10.setOutputFile(archivoSalida10);

            try {
                grabacion10.prepare();
                grabacion10.start();
            } catch (IOException e) {
            }

            btn_recorder10.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if (grabacion10 != null) {
            grabacion10.stop();
            grabacion10.release();
            grabacion10 = null;
            btn_recorder10.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }

    public void reproducirc10(View view) {

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

    public void Recorderc11(View view) {
        if (grabacion11 == null) {
            archivoSalida11 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacionc11.mp3";
            grabacion11 = new MediaRecorder();
            grabacion11.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion11.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion11.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion11.setOutputFile(archivoSalida11);

            try {
                grabacion11.prepare();
                grabacion11.start();
            } catch (IOException e) {
            }

            btn_recorder11.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if (grabacion11 != null) {
            grabacion11.stop();
            grabacion11.release();
            grabacion11 = null;
            btn_recorder11.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }

    public void reproducirc11(View view) {

        MediaPlayer mediaPlayer11 = new MediaPlayer();
        try {
            mediaPlayer11.setDataSource(archivoSalida11);
            mediaPlayer11.prepare();
            mediaPlayer11.start();
            Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Toast.makeText(this, "error, no se ha grabado el audio aun :(", Toast.LENGTH_SHORT).show();

        }
    }

    public void Recorderc12(View view) {
        if (grabacion12 == null) {
            archivoSalida12 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacionc12.mp3";
            grabacion12 = new MediaRecorder();
            grabacion12.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion12.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion12.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion12.setOutputFile(archivoSalida12);

            try {
                grabacion12.prepare();
                grabacion12.start();
            } catch (IOException e) {
            }

            btn_recorder12.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if (grabacion12 != null) {
            grabacion12.stop();
            grabacion12.release();
            grabacion12 = null;
            btn_recorder12.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }

    public void reproducirc12(View view) {

        MediaPlayer mediaPlayer12 = new MediaPlayer();
        try {
            mediaPlayer12.setDataSource(archivoSalida12);
            mediaPlayer12.prepare();
            mediaPlayer12.start();
            Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Toast.makeText(this, "error, no se ha grabado el audio aun :(", Toast.LENGTH_SHORT).show();

        }
    }

    public void Recorderc13(View view) {
        if (grabacion13 == null) {
            archivoSalida13 = getExternalFilesDir(null).getAbsolutePath() + "/Grabacionc13.mp3";
            grabacion13 = new MediaRecorder();
            grabacion13.setAudioSource(MediaRecorder.AudioSource.MIC);
            grabacion13.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            grabacion13.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            grabacion13.setOutputFile(archivoSalida13);

            try {
                grabacion13.prepare();
                grabacion13.start();
            } catch (IOException e) {
            }

            btn_recorder13.setBackgroundResource(R.drawable.rec);
            Toast.makeText(getApplicationContext(), "Grabando...", Toast.LENGTH_SHORT).show();
        } else if (grabacion13 != null) {
            grabacion13.stop();
            grabacion13.release();
            grabacion13 = null;
            btn_recorder13.setBackgroundResource(R.drawable.stop_rec);
            Toast.makeText(getApplicationContext(), "Grabación finalizada", Toast.LENGTH_SHORT).show();
        }
    }

    public void reproducirc13(View view) {

        MediaPlayer mediaPlayer13 = new MediaPlayer();
        try {
            mediaPlayer13.setDataSource(archivoSalida13);
            mediaPlayer13.prepare();
            mediaPlayer13.start();
            Toast.makeText(getApplicationContext(), "Reproduciendo audio", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Toast.makeText(this, "error, no se ha grabado el audio aun :(", Toast.LENGTH_SHORT).show();

        }
    }

}
