package com.learningv.desiilaaz;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }

    public void continueToDisplay(View view) {
        Intent intent = new Intent(this, DisplayAilmentsActivity.class);
        //Button continueButton = (Button) findViewById(R.id.btnContinue);
        //String message = continueButton.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
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


    //Not recommended way but Listener also could be used
   /* View.OnClickListener singleHandler = new View.OnClickListener() {
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.dehydration:
                    intent.putExtra(EXTRA_MESSAGE, "dehydration");
                    break;
                case R.id.flu:
                    intent.putExtra(EXTRA_MESSAGE, "flu");
                    break;
            }
            startActivity(intent);
        }
    };
    */
}
