package my.teeweikitcom.teeweikit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    private EditText nameTxt,status;
    private Button btn;
    private TextView view1;
    private String test4;
    private int position = -1;
    private String[] arraySpinner = new String[]{
            "Normal","Senior", "Children","Haj Pilgrims","Student","Study","Disable"
    };

    Spinner s;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        s  = (Spinner) findViewById(R.id.spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        nameTxt = (EditText) findViewById(R.id.editName);


        btn = findViewById(R.id.save);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position = s.getSelectedItemPosition();
                test4 = arraySpinner[position];

                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                //i.putExtra("name",nameTxt);
                i.putExtra("name",nameTxt.getText().toString());
                i.putExtra("status",test4);
                startActivity(i);

                //startActivity(i);
                //startActivity(MainActivity.this,Main2Activity.class);


            }
        });



    }
}
