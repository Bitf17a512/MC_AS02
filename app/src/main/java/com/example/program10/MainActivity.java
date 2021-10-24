package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendMessage(View view) {
        EditText medittext = (EditText) findViewById(R.id.editText1);
        String strusername = medittext.getText().toString();
        Character char1 = strusername.charAt(0);
        //  System.out.println("abcd");
        int compareOneTwo = Character.compare(char1, 'a');
        if (compareOneTwo == 0)
        {
            TextView text = (TextView) findViewById(R.id.textView2);
            text.setText("Given character is a grass Character");

        }

        else
        {
            int comparec = Character.compare(char1, 'c');
            if (comparec == 0)
            {
                TextView text = (TextView) findViewById(R.id.textView2);
                text.setText("Given character is a grass Character");

            }
            else
            {
                int comparee = Character.compare(char1, 'e');
                if (comparee == 0)
                {
                    TextView text = (TextView) findViewById(R.id.textView2);
                    text.setText("Given character is a grass Character");

                }
                else
                {
                    int comparei = Character.compare(char1, 'i');
                    if (comparei == 0)
                    {
                        TextView text = (TextView) findViewById(R.id.textView2);
                        text.setText("Given character is a grass Character");

                    }
                    else
                    {
                        int comparem = Character.compare(char1, 'm');
                        if (comparem == 0)
                        {
                            TextView text = (TextView) findViewById(R.id.textView2);
                            text.setText("Given character is a grass Character");

                        }
                        else
                        {
                            int comparen = Character.compare(char1, 'n');
                            if (comparen == 0)
                            {
                                TextView text = (TextView) findViewById(R.id.textView2);
                                text.setText("Given character is a grass Character");

                            }
                            else
                            {
                                int compareo = Character.compare(char1, 'o');
                                if (compareo == 0)
                                {
                                    TextView text = (TextView) findViewById(R.id.textView2);
                                    text.setText("Given character is a grass Character");

                                }
                                else
                                {
                                    int comparer = Character.compare(char1, 'r');
                                    if (comparer == 0)
                                    {
                                        TextView text = (TextView) findViewById(R.id.textView2);
                                        text.setText("Given character is a grass Character");

                                    }
                                    else
                                    {
                                        int compares = Character.compare(char1, 's');
                                        if (compares == 0)
                                        {
                                            TextView text = (TextView) findViewById(R.id.textView2);
                                            text.setText("Given character is a root Character");

                                        }
                                        else
                                        {
                                            int compareu = Character.compare(char1, 'u');
                                            if (compareu == 0)
                                            {
                                                TextView text = (TextView) findViewById(R.id.textView2);
                                                text.setText("Given character is a grass Character");

                                            }
                                            else
                                            {
                                                int comparev = Character.compare(char1, 'v');
                                                if (comparev == 0)
                                                {
                                                    TextView text = (TextView) findViewById(R.id.textView2);
                                                    text.setText("Given character is a grass Character");

                                                }
                                                else
                                                {
                                                    int comparew = Character.compare(char1, 'w');
                                                    if (comparew == 0)
                                                    {
                                                        TextView text = (TextView) findViewById(R.id.textView2);
                                                        text.setText("Given character is a grass Character");

                                                    }
                                                    else
                                                    {
                                                        int comparex = Character.compare(char1, 'x');
                                                        if (comparex == 0)
                                                        {
                                                            TextView text = (TextView) findViewById(R.id.textView2);
                                                            text.setText("Given character is a grass Character");

                                                        }
                                                        else
                                                        {
                                                            int comparez = Character.compare(char1, 'z');
                                                            if (comparez == 0)
                                                            {
                                                                TextView text = (TextView) findViewById(R.id.textView2);
                                                                text.setText("Given character is a grass Character");

                                                            }
                                                            else
                                                            {
                                                                int compareb = Character.compare(char1, 'b');
                                                                if (compareb == 0)
                                                                {
                                                                    TextView text = (TextView) findViewById(R.id.textView2);
                                                                    text.setText("Given character is a sky Character");

                                                                }
                                                                else
                                                                {
                                                                    int compared = Character.compare(char1, 'd');
                                                                    if (compared == 0)
                                                                    {
                                                                        TextView text = (TextView) findViewById(R.id.textView2);
                                                                        text.setText("Given character is a sky Character");

                                                                    }
                                                                    else
                                                                    {
                                                                        int comparef = Character.compare(char1, 'f');
                                                                        if (comparef == 0)
                                                                        {
                                                                            TextView text = (TextView) findViewById(R.id.textView2);
                                                                            text.setText("Given character is a sky Character");

                                                                        }
                                                                        else
                                                                        {
                                                                            int compareh = Character.compare(char1, 'h');
                                                                            if (compareh == 0)
                                                                            {
                                                                                TextView text = (TextView) findViewById(R.id.textView2);
                                                                                text.setText("Given character is a sky Character");

                                                                            }
                                                                            else
                                                                            {
                                                                                int comparek = Character.compare(char1, 'k');
                                                                                if (comparek == 0)
                                                                                {
                                                                                    TextView text = (TextView) findViewById(R.id.textView2);
                                                                                    text.setText("Given character is a sky Character");

                                                                                }
                                                                                else
                                                                                {
                                                                                    int comparel = Character.compare(char1, 'l');
                                                                                    if (comparel == 0)
                                                                                    {
                                                                                        TextView text = (TextView) findViewById(R.id.textView2);
                                                                                        text.setText("Given character is a sky Character");

                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        int comparet = Character.compare(char1, 't');
                                                                                        if (comparet == 0)
                                                                                        {
                                                                                            TextView text = (TextView) findViewById(R.id.textView2);
                                                                                            text.setText("Given character is a sky Character");

                                                                                        }
                                                                                        else
                                                                                        {
                                                                                            int compareg = Character.compare(char1, 'g');
                                                                                            if (compareg == 0)
                                                                                            {
                                                                                                TextView text = (TextView) findViewById(R.id.textView2);
                                                                                                text.setText("Given character is a root Character");

                                                                                            }
                                                                                            else
                                                                                            {
                                                                                                int comparej = Character.compare(char1, 'j');
                                                                                                if (comparej == 0)
                                                                                                {
                                                                                                    TextView text = (TextView) findViewById(R.id.textView2);
                                                                                                    text.setText("Given character is a root Character");

                                                                                                }
                                                                                                else
                                                                                                {
                                                                                                    int comparep = Character.compare(char1, 'p');
                                                                                                    if (comparep == 0)
                                                                                                    {
                                                                                                        TextView text = (TextView) findViewById(R.id.textView2);
                                                                                                        text.setText("Given character is a root Character");

                                                                                                    }
                                                                                                    else
                                                                                                    {
                                                                                                        int compareq = Character.compare(char1, 'q');
                                                                                                        if (compareq == 0)
                                                                                                        {
                                                                                                            TextView text = (TextView) findViewById(R.id.textView2);
                                                                                                            text.setText("Given character is a root Character");

                                                                                                        }
                                                                                                        else
                                                                                                        {
                                                                                                            int comparey = Character.compare(char1, 'y');
                                                                                                            if (comparey == 0)
                                                                                                            {
                                                                                                                TextView text = (TextView) findViewById(R.id.textView2);
                                                                                                                text.setText("Given character is a root Character");

                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}