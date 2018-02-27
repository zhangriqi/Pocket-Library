package tw.com.flag.pl1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThankFeedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_feedback);
    }
    public void returnAboutUs(View view)
    {
        Intent it=new Intent(this,AboutUs.class);
        startActivity(it);
    }
}
