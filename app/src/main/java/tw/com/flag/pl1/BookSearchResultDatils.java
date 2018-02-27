package tw.com.flag.pl1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BookSearchResultDatils extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_search_result_datils);
    }

    public void borrower(View view)
    {
        Intent it=new Intent(this,Borrower.class);
        startActivity(it);
    }
}
