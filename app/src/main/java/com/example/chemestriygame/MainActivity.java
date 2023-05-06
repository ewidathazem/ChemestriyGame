package com.example.chemestriygame;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int Score = 0;
    ImageButton opp1;
    ImageButton opp2;
    ImageButton opp3;
    TextView resuilt;
    TextView question;
    DAQuestion DAquestion = new DAQuestion();
    ArrayList<Question> questions = DAquestion.getQuestions();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opp1 = findViewById(R.id.oop1);
        opp2 = findViewById(R.id.opp2);
        opp3 = findViewById(R.id.opp3);
        Button ready = findViewById(R.id.ready);
        resuilt = findViewById(R.id.resuilt);
        question = findViewById(R.id.question1);

        ready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView qi = findViewById(R.id.question1);
                qi.setVisibility(View.VISIBLE);
                qi.setText(questions.get(0).getQuestion());
                opp1.setVisibility(View.VISIBLE);
                opp2.setVisibility(View.VISIBLE);
                opp3.setVisibility(View.VISIBLE);
                ready.setVisibility(View.INVISIBLE);
                TextView welcome = findViewById(R.id.welcome);
                welcome.setVisibility(View.INVISIBLE);
                resuilt.setVisibility(View.VISIBLE);

            }
        });
        opp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageButton opp2 = findViewById(R.id.opp2);
                ImageButton opp3 = findViewById(R.id.opp3);
                TextView q1 = findViewById(R.id.question1);
                resuilt.setVisibility(View.VISIBLE);
                Score++;
                resuilt.setText("Your score is  " + Score + " !");
                question.setText(questions.get(1).getQuestion());
                opp1.setImageResource(R.drawable.h);
                opp2.setImageResource(R.drawable.fe);
                opp3.setImageResource(R.drawable.ar);
                opp1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        opp1.setImageResource(R.drawable.red);

                    }
                });
                opp2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Score++;
                        resuilt.setText("Your score is  " + Score + " !");
                        question.setText(questions.get(2).getQuestion());
                        opp1.setImageResource(R.drawable.kcl);
                        opp2.setImageResource(R.drawable.ch4);
                        opp3.setImageResource(R.drawable.water);
                        opp3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Score++;
                                resuilt.setText("Your score is  " + Score + " !");
                                question.setText(questions.get(3).getQuestion());
                                opp1.setImageResource(R.drawable.g);
                                opp2.setImageResource(R.drawable.s);
                                opp3.setImageResource(R.drawable.l);
                                opp3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Score++;
                                        resuilt.setText("Your score is  " + Score + " !");
                                        question.setText(questions.get(4).getQuestion());
                                        opp1.setImageResource(R.drawable.cl);
                                        opp2.setImageResource(R.drawable.fe);
                                        opp3.setImageResource(R.drawable.ar);
                                        opp1.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                opp1.setImageResource(R.drawable.confetti);
                                                opp2.setVisibility(View.INVISIBLE);
                                                opp3.setVisibility(View.INVISIBLE);
                                                question.setVisibility(View.INVISIBLE);
                                                Score++;
                                                resuilt.setText("Your score is  " + Score + " !");
                                                MediaPlayer clapping = MediaPlayer.create(MainActivity.this, R.raw.clap);
                                                clapping.start();
                                            }
                                        });
                                        opp2.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                opp2.setImageResource(R.drawable.red);

                                            }
                                        });
                                        opp3.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                opp3.setImageResource(R.drawable.red);
                                            }
                                        });


                                    }
                                });
                                opp1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        opp1.setImageResource(R.drawable.red);

                                    }
                                });
                                opp2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        opp2.setImageResource(R.drawable.red);
                                    }
                                });
                            }
                        });
                        opp1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                opp1.setImageResource(R.drawable.red);

                            }
                        });
                        opp2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                opp2.setImageResource(R.drawable.red);
                            }
                        });

                    }
                });
                opp3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        opp3.setImageResource(R.drawable.red);
                    }
                });

            }
        });
        opp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opp2.setImageResource(R.drawable.red);
            }
        });
        opp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opp3.setImageResource(R.drawable.red);
            }
        });

    }


}