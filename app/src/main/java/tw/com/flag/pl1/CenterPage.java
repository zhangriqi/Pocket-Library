package tw.com.flag.pl1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class CenterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center_page);
    }
    public void toBookSearching(View view)
    {
        Intent it=new Intent(this,BookSearching.class);
        startActivity(it);
    }

    public void reminder(View view)
    {
        Intent it=new Intent(this,Reminder.class);
        startActivity(it);
    }

    public void myBook(View view)
    {
        Intent it=new Intent(this,MyBook.class);
        startActivity(it);
    }

    public void activities(View view)
    {
        Intent it=new Intent(this,Activities.class);
        startActivity(it);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Intent it;
        switch (item.getItemId())
        {
            case R.id.my_account:
                it=new Intent(this,MyAccount.class);
                startActivity(it);
                break;
            case R.id.message:
                it=new Intent(this,Message.class);
                startActivity(it);
                break;
            case R.id.about_us:
                it=new Intent(this,AboutUs.class);
                startActivity(it);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
