package th.ac.tu.siit.its333.basiccounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set onClick method of this object to be executed when the Increase button is clicked.
        Button btInc = (Button)findViewById(R.id.btInc);
        btInc.setOnClickListener(this);

        // Set onClick method of this object to be executed when the Decrease button is clicked.
        Button btDec = (Button)findViewById(R.id.btDec);
        btDec.setOnClickListener(this);
    }

    int counter = 0;

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btInc:
                counter++;
                break;
            case R.id.btDec:
                counter--;
                break;
        }
        TextView tv = (TextView)findViewById(R.id.tvOutput);
        tv.setText(Integer.toString(counter));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
