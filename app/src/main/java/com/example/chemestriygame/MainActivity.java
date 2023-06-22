package com.example.chemestriygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
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

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences preferences = getSharedPreferences("QuestionData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("Q1", "What is the state of the element hydrogen ?");
        editor.putString("Q2", "Which is the symbol of Iron ?");
        editor.putString("Q3", "What is the chemical formula for water ?");
        editor.putString("Q4", "What is the normal state of water ?");
        editor.putString("Q5", "What is the symbol of Chlorine ?");
        editor.apply();
        ArrayList<String> info = new ArrayList<String>();
        info.add("Hydrogen is the lightest and most abundant element in the universe, constituting about 75% of its elemental mass. It is a chemical element with the symbol H and atomic number 1. In its pure form, hydrogen exists as diatomic molecules (H2), meaning two hydrogen atoms bonded together.");
        info.add("Iron is a chemical element with the symbol Fe and atomic number 26. Here are some key ");
        info.add("The chemical formula for water is H2O. It represents the composition of water molecules, indicating that each water molecule consists of two hydrogen atoms (H) covalently bonded to one oxygen atom (O)");
        info.add("The chemical formula for water is H2O. It represents the composition of water molecules, indicating that each water molecule consists of two hydrogen atoms (H) covalently bonded to one oxygen atom (O)");
        info.add("Water exists as a liquid at normal conditions, which are defined as a temperature of 25 degrees Celsius (77 degrees Fahrenheit) and a pressure of 1 atmosphere (atm) or 101.325 kilopascals (kPa). At this state, water molecules have enough thermal energy to overcome intermolecular forces and maintain a fluid, liquid state.");
        opp1 = findViewById(R.id.oop1);
        opp2 = findViewById(R.id.opp2);
        opp3 = findViewById(R.id.opp3);
        Button ready = findViewById(R.id.ready);
        resuilt = findViewById(R.id.resuilt);
        question = findViewById(R.id.question1);

        ready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question.setVisibility(View.VISIBLE);
                question.setText(preferences.getString("Q1",""));
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
                resuilt.setVisibility(View.VISIBLE);
                Score++;
                resuilt.setText("Your score is  " + Score + " !");
                question.setText(preferences.getString("Q2",""));

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
                        question.setText(preferences.getString("Q3",""));
                        opp1.setImageResource(R.drawable.kcl);
                        opp2.setImageResource(R.drawable.ch4);
                        opp3.setImageResource(R.drawable.water);
                        opp3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Score++;
                                resuilt.setText("Your score is  " + Score + " !");
                                question.setText(preferences.getString("Q4",""));
                                opp1.setImageResource(R.drawable.g);
                                opp2.setImageResource(R.drawable.s);
                                opp3.setImageResource(R.drawable.l);
                                opp3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Score++;
                                        resuilt.setText("Your score is  " + Score + " !");
                                        question.setText(preferences.getString("Q5",""));
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