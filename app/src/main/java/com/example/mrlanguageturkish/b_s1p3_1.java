package com.example.mrlanguageturkish;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import ir.aghayezaban.mrlanguageturkish.R;

public class b_s1p3_1 extends AppCompatActivity {

    PDFView pdfView;
    static MediaPlayer mPlayer;
    Button buttonPlay;
    Button buttonStop;
    String url = "https://www.aghayezaban.ir/downloads/1_dialouge/lesson3/lesson3_dialouge.mp3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_s1p3_1);

        pdfView =(PDFView)findViewById(R.id.pdfView);

        new b_s1p3_1.RetrivePdfStream().execute("https://www.aghayezaban.ir/downloads/1_dialouge/lesson3/lesson3_dialouge.pdf");


        this.buttonPlay = (Button)this.findViewById(R.id.play);
        this.buttonPlay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                b_s1p3_1.mPlayer = new MediaPlayer();
                b_s1p3_1.mPlayer.setAudioStreamType(3);

                try {
                    b_s1p3_1.mPlayer.setDataSource(b_s1p3_1.this.url);
                } catch (IllegalArgumentException var5) {
                    Toast.makeText(b_s1p3_1.this.getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
                } catch (SecurityException var6) {
                    Toast.makeText(b_s1p3_1.this.getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
                } catch (IllegalStateException var7) {
                    Toast.makeText(b_s1p3_1.this.getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
                } catch (IOException var8) {
                    var8.printStackTrace();
                }

                try {
                    b_s1p3_1.mPlayer.prepare();
                } catch (IllegalStateException var3) {
                    Toast.makeText(b_s1p3_1.this.getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
                } catch (IOException var4) {
                    Toast.makeText(b_s1p3_1.this.getApplicationContext(), "You might not set the URI correctly!", Toast.LENGTH_LONG).show();
                }

                b_s1p3_1.mPlayer.start();
            }
        });


        this.buttonStop = (Button)this.findViewById(R.id.stop);
        this.buttonStop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (b_s1p3_1.mPlayer != null && b_s1p3_1.mPlayer.isPlaying()) {
                    b_s1p3_1.mPlayer.stop();
                }

            }
        });

    }

    class RetrivePdfStream extends AsyncTask<String,Void, InputStream>
    {

        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream = null;
            try{
                URL url = new URL(strings[0]);
                HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection();
                if(urlConnection.getResponseCode()==200)
                {
                    inputStream=new BufferedInputStream(urlConnection.getInputStream());

                }
            }

            catch (IOException e)
            {
                return null;
            }

            return inputStream;

        }

        @Override
        protected void onPostExecute(InputStream inputStream) {
            pdfView.fromStream(inputStream).load();

        }
    }

    protected void onDestroy() {
        super.onDestroy();
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }

    }
}