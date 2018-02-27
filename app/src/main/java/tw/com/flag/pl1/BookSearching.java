package tw.com.flag.pl1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class BookSearching extends AppCompatActivity {

    private AutoCompleteTextView autotext;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_searching);

        autotext=(AutoCompleteTextView)findViewById(R.id.autotext);
        String[] arr={"线性代数 第二版","工科数学分析 上册","工科数学分析 下册"};
        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        autotext.setAdapter(arrayAdapter);
    }
    public void bookResult(View view)
    {
        Intent it=new Intent(this,BookSearchResult.class);
        startActivity(it);
    }
}
