package tw.com.flag.pl1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BookSearchResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_search_result);
    }
    public void bookSearchResultDetails(View view)
    {
        Intent it=new Intent(this,BookSearchResultDatils.class);
        startActivity(it);
    }

}
