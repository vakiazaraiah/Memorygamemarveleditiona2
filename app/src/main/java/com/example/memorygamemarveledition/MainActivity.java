package com.example.memorygamemarveledition;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import static com.example.memorygamemarveledition.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    TextView txt_p1, txt_p2;

    ImageView iv_11, iv_12, iv_13, iv_14, iv_15, iv_16, iv_17, iv_18,
            iv_19, iv_20, iv_21, iv_22;

    //array for pictures

    Integer[] cardsArray = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};

    //Images from drawable
    int picture11, picture12, picture13, picture14, picture15, picture16, picture17,
            picture18, picture19, picture20, picture21, picture22;

    int firstCard, secondCard;
    int clickedFirst, clickSecond;
    int cardNumber = 1;
    int cards;


    int turn = 1;
    int playerPoints = 0, cpuPoint = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Access the text view from xml.
        txt_p1 = (TextView) findViewById(R.id.txt_p1);
        txt_p2 = (TextView) findViewById(R.id.txt_p2);

        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);
        iv_15 = (ImageView) findViewById(R.id.iv_15);
        iv_16 = (ImageView) findViewById(R.id.iv_16);
        iv_17 = (ImageView) findViewById(R.id.iv_17);
        iv_18 = (ImageView) findViewById(R.id.iv_18);
        iv_19 = (ImageView) findViewById(R.id.iv_19);
        iv_20 = (ImageView) findViewById(R.id.iv_20);
        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_15.setTag("4");
        iv_16.setTag("5");
        iv_17.setTag("6");
        iv_18.setTag("7");
        iv_19.setTag("8");
        iv_20.setTag("9");
        iv_21.setTag("10");
        iv_22.setTag("11");

        //Load the card images

        frontOfCardsResources();


        //Shuffle the pictures
        Collections.shuffle(Arrays.asList(cardsArray));

        //Changes the color of the player if Inactive
        txt_p2.setTextColor(Color.GRAY);


        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_11, theCard);

            }
        });


        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_12, theCard);

            }
        });


        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_13, theCard);

            }
        });


        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_14, theCard);

            }
        });


        iv_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_15, theCard);

            }
        });

        iv_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_16, theCard);

            }
        });

        iv_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_17, theCard);

            }
        });

        iv_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_18, theCard);

            }
        });


        iv_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_19, theCard);

            }
        });

        iv_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_20, theCard);

            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_21, theCard);

            }
        });

        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_22, theCard);

            }
        });
    }

    private void frontOfCardsResources() {
        picture11 = R.drawable.image102;
        picture12 = R.drawable.image103;
        picture13 = R.drawable.image104;
        picture14 = R.drawable.image105;
        picture15 = R.drawable.image106;
        picture16 = R.drawable.image107;
        picture17 = R.drawable.image202;
        picture18 = R.drawable.image203;
        picture19 = R.drawable.image204;
        picture20 = R.drawable.image205;
        picture21 = R.drawable.image206;
        picture22 = R.drawable.image207;
    }

    private void doStuff(ImageView iv, int card) {
        // Set the picture to the image viewer
        if (cardsArray[card] == 11) {
            iv.setImageResource(picture11);
        } else if (cardsArray[card] == 12) {
            iv.setImageResource(picture12);
        } else if (cardsArray[card] == 13) {
            iv.setImageResource(picture13);
        } else if (cardsArray[card] == 14) {
            iv.setImageResource(picture14);
        } else if (cardsArray[card] == 15) {
            iv.setImageResource(picture15);
        } else if (cardsArray[card] == 16) {
            iv.setImageResource(picture16);
        } else if (cardsArray[card] == 17) {
            iv.setImageResource(picture17);
        } else if (cardsArray[card] == 18) {
            iv.setImageResource(picture18);
        } else if (cardsArray[card] == 19) {
            iv.setImageResource(picture19);
        } else if (cardsArray[card] == 20) {
            iv.setImageResource(picture20);
        } else if (cardsArray[card] == 21) {
            iv.setImageResource(picture21);
        } else if (cardsArray[card] == 22) {
            iv.setImageResource(picture22);
        }

        if (cardNumber == 1) {
            firstCard = cardsArray[cards];
            if (firstCard > 17) {
                firstCard = firstCard - 11;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);

        } else if (cardNumber == 2) {
            secondCard = cardsArray[card];
            if (firstCard > 17) {
                firstCard = firstCard - 11;
            }
            cardNumber = 1;
            clickSecond = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_15.setEnabled(false);
            iv_16.setEnabled(false);
            iv_17.setEnabled(false);
            iv_18.setEnabled(false);
            iv_19.setEnabled(false);
            iv_20.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 1000);

        }

    }

    private void calculate() {
        if (firstCard == secondCard) {
            if (clickedFirst == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 4) {
                iv_15.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 5) {
                iv_16.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 8) {
                iv_17.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 9) {
                iv_18.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 10) {
                iv_19.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 11) {
                iv_20.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 12) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 13) {
                iv_22.setVisibility(View.INVISIBLE);

                if (clickSecond == 0) {
                    iv_11.setVisibility(View.INVISIBLE);
                } else if (clickSecond == 1) {
                    iv_12.setVisibility(View.INVISIBLE);
                } else if (clickSecond == 2) {
                    iv_13.setVisibility(View.INVISIBLE);
                } else if (clickSecond == 3) {
                    iv_14.setVisibility(View.INVISIBLE);
                } else if (clickSecond == 4) {
                    iv_15.setVisibility(View.INVISIBLE);
                } else if (clickSecond == 5) {
                    iv_16.setVisibility(View.INVISIBLE);
                } else if (clickSecond == 8) {
                    iv_17.setVisibility(View.INVISIBLE);
                } else if (clickSecond == 9) {
                    iv_18.setVisibility(View.INVISIBLE);
                } else if (clickSecond == 10) {
                    iv_19.setVisibility(View.INVISIBLE);
                } else if (clickSecond == 11) {
                    iv_20.setVisibility(View.INVISIBLE);
                } else if (clickSecond == 12) {
                    iv_21.setVisibility(View.INVISIBLE);
                } else if (clickSecond == 13) {
                    iv_22.setVisibility(View.INVISIBLE);
                }

                //add points system
                if (turn == 1) {
                    playerPoints++;
                    txt_p1.setText("Player1:" + playerPoints);
                } else if (turn == 2) {
                    cpuPoint++;
                    txt_p2.setText("Player2:" + cpuPoint);

                }
            } else {
                iv_11.setImageResource(R.drawable.question);
                iv_12.setImageResource(R.drawable.question);
                iv_13.setImageResource(R.drawable.question);
                iv_14.setImageResource(R.drawable.question);
                iv_15.setImageResource(R.drawable.question);
                iv_16.setImageResource(R.drawable.question);
                iv_17.setImageResource(R.drawable.question);
                iv_18.setImageResource(R.drawable.question);
                iv_19.setImageResource(R.drawable.question);
                iv_20.setImageResource(R.drawable.question);
                iv_21.setImageResource(R.drawable.question);
                iv_22.setImageResource(R.drawable.question);

                if (turn == 1) {
                    txt_p1.setTextColor(Color.RED);
                    txt_p2.setTextColor(Color.BLACK);
                } else if (turn == 2) {
                    turn = 1;
                    txt_p1.setTextColor(Color.RED);
                    txt_p2.setTextColor(Color.BLACK);

                }
            }

            iv_11.setEnabled(true);
            iv_12.setEnabled(true);
            iv_13.setEnabled(true);
            iv_14.setEnabled(true);
            iv_15.setEnabled(true);
            iv_16.setEnabled(true);
            iv_17.setEnabled(true);
            iv_18.setEnabled(true);
            iv_19.setEnabled(true);
            iv_20.setEnabled(true);
            iv_21.setEnabled(true);
            iv_22.setEnabled(true);

            //Check if game is over
            checkGame();

        }

        }

    private void checkGame() {
        if (iv_11.getVisibility() == View.INVISIBLE &&
                    iv_12.getVisibility() == View.INVISIBLE &&
                    iv_13.getVisibility() == View.INVISIBLE &&
                    iv_14.getVisibility() == View.INVISIBLE &&
                    iv_15.getVisibility() == View.INVISIBLE &&
                    iv_16.getVisibility() == View.INVISIBLE &&
                    iv_17.getVisibility() == View.INVISIBLE &&
                    iv_18.getVisibility() == View.INVISIBLE &&
                    iv_19.getVisibility() == View.INVISIBLE &&
                    iv_20.getVisibility() == View.INVISIBLE &&
                    iv_21.getVisibility() == View.INVISIBLE &&
                    iv_22.getVisibility() == View.INVISIBLE) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                alertDialogBuilder
                        .setMessage("Game Over!!\nPlayer 1 " + playerPoints + "\nPlayer 2" + cpuPoint)
                        .setCancelable(false)
                        .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                                finish();

                            }
                        })
                        .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
                    }

                }

    }