package mx.tec.example_2itesm_ad2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    TextView myTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button1);
        myTextView = findViewById(R.id.txtview1);


        myTextView.setText("Hello folks!");

        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                     //   myTextView.setText("You clicked me"); /*cuando quiero comentar mas de una*/

                Intent myIntent= new Intent(MainActivity.this,ChildActivity.class);
                startActivity(myIntent);
            }
             });
    }
}