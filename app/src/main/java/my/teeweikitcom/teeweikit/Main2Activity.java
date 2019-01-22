package my.teeweikitcom.teeweikit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class Main2Activity extends AppCompatActivity {

    TextView name,total , status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Intent i = new Intent();

        //String name,status;

        name = (TextView) findViewById(R.id.textView1);
        status = (TextView) findViewById(R.id.textView2);
        total = (TextView) findViewById(R.id.total);

        String getName = getIntent().getStringExtra("name");//i.getStringExtra("name");
        String getStatus = getIntent().getStringExtra("status");
        //String getStatus = i.getStringExtra("hello");

        String totalAmount = "Sorry";
        String nor = "Normal";
        String dis = "Disable";
        String sty = "Study";
        String haj = "Haj Pilgrims";
        String sen = "Senior";
        String child = "Children";
        String stu = "Student";

        if (getStatus.equals(sty)){
            totalAmount = "RM100";
        }else if (getStatus.equals(dis)){
            totalAmount = "Free";
        }
            else if(getStatus.equals(haj)){
            totalAmount = "RM100";
        }
        else if(getStatus.equals(sen)){
            totalAmount = "RM100";
        }
        else if(getStatus.equals(child)){
            totalAmount = "RM100";
        }
        else if(getStatus.equals(stu)){
            totalAmount = "RM100";
        }
        else{
            totalAmount = "RM200";}

//        if (getStatus.equals(nor)){
//            totalAmount = "RM200";
//        }else if (getStatus.equals(dis)){
//            totalAmount = "Free";}
//        else{
//            totalAmount = "RM100";}


        name.setText(getName);
        status.setText(getStatus);
        total.setText(totalAmount);


    }
}

