package com.learningv.desiilaaz;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.learningv.desiilaaz.utils.Constants.StringConstants;


public class MainActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "com.learning.DesiIlaaz.MESSAGE";

    Intent displayInfoIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayInfoIntent = new Intent(this, DisplayRemedyActivity.class);
    }


    /**
     * @param view
     */
    public void showInfoOnClick(View view) {

        switch (view.getId()) {
            case R.id.acidity:
                displayInfoIntent.putExtra(EXTRA_MESSAGE, StringConstants.ACIDITY);
                break;
            case R.id.acne:
                displayInfoIntent.putExtra(EXTRA_MESSAGE, StringConstants.ACNE);
                break;
            case R.id.blackheads:
                displayInfoIntent.putExtra(EXTRA_MESSAGE, StringConstants.BLACKHEADS);
                break;
            case R.id.cold:
                displayInfoIntent.putExtra(EXTRA_MESSAGE, StringConstants.COMMON_COLD);
                break;
            case R.id.constipation:
                displayInfoIntent.putExtra(EXTRA_MESSAGE, StringConstants.CONSTIPATION);
                break;
            case R.id.cough:
                displayInfoIntent.putExtra(EXTRA_MESSAGE, StringConstants.COUGH);
                break;
            case R.id.dandruff:
                displayInfoIntent.putExtra(EXTRA_MESSAGE, StringConstants.DANDRUFF);
                break;
            case R.id.diarrhoea:
                displayInfoIntent.putExtra(EXTRA_MESSAGE, StringConstants.DIARRHOEA);
                break;
            case R.id.dehydration:
                displayInfoIntent.putExtra(EXTRA_MESSAGE, StringConstants.DEHYDRATION);
                break;
            case R.id.fever:
                displayInfoIntent.putExtra(EXTRA_MESSAGE, StringConstants.FEVER);
                break;
            case R.id.flu:
                displayInfoIntent.putExtra(EXTRA_MESSAGE, StringConstants.FLU);
                break;
            case R.id.hair_loss:
                displayInfoIntent.putExtra(EXTRA_MESSAGE, StringConstants.HAIR_LOSS);
                break;
            case R.id.migraine:
                displayInfoIntent.putExtra(EXTRA_MESSAGE, StringConstants.MIGRAINE);
                break;

            case R.id.nausea:
                displayInfoIntent.putExtra(EXTRA_MESSAGE, StringConstants.NAUSEA);
                break;
            case R.id.tired_eyes:
                displayInfoIntent.putExtra(EXTRA_MESSAGE, StringConstants.TIRED_EYES);
                break;
            case R.id.vomiting:
                displayInfoIntent.putExtra(EXTRA_MESSAGE, StringConstants.VOMITING);
                break;

        }
        startActivity(displayInfoIntent);
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
