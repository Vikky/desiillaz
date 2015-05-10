package com.learningv.desiilaaz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.learningv.desiilaaz.utils.Ailments;

import java.util.ArrayList;
import java.util.List;


public class DisplayAilmentsActivity extends ListActivity {

    public final static String EXTRA_MESSAGE = "com.learning.DesiIlaaz.MESSAGE";
    Intent displayRemedyIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        displayRemedyIntent = new Intent(this, DisplayRemedyActivity.class);
        //setContentView(R.layout.activity_display_ailments);

        List<String> ailmentsList = getAilmentNames();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, ailmentsList);
        setListAdapter(adapter);

        ListView listView = getListView();
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String item = ((TextView) view).getText().toString();
                putAilmentName(item);
            }
        });
    }

    /**
     * Puts ailment name in Intent, to be used to show remedy.
     *
     * @param ailmentName
     */
    public void putAilmentName(String ailmentName) {

        displayRemedyIntent.putExtra(EXTRA_MESSAGE, ailmentName);
        startActivity(displayRemedyIntent);
    }

    /**
     * @return
     */
    public List<String> getAilmentNames() {

        Ailments[] ailmentArray = Ailments.values();
        List<String> ailmentsList = new ArrayList<String>();
        for (Ailments ailment : ailmentArray) {
            ailmentsList.add(ailment.getDescription());
        }

        return ailmentsList;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_ailments, menu);
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

    /*
    public void showInfoOnClick(View view) {

        switch (view.getId()) {
            case R.id.acidity:
                displayRemedyIntent.putExtra(EXTRA_MESSAGE, Constants.StringConstants.ACIDITY);
                break;
            case R.id.acne:
                displayRemedyIntent.putExtra(EXTRA_MESSAGE, Constants.StringConstants.ACNE);
                break;
            case R.id.blackheads:
                displayRemedyIntent.putExtra(EXTRA_MESSAGE, Constants.StringConstants.BLACKHEADS);
                break;
            case R.id.cold:
                displayRemedyIntent.putExtra(EXTRA_MESSAGE, Constants.StringConstants.COMMON_COLD);
                break;
            case R.id.constipation:
                displayRemedyIntent.putExtra(EXTRA_MESSAGE, Constants.StringConstants.CONSTIPATION);
                break;
            case R.id.cough:
                displayRemedyIntent.putExtra(EXTRA_MESSAGE, Constants.StringConstants.COUGH);
                break;
            case R.id.dandruff:
                displayRemedyIntent.putExtra(EXTRA_MESSAGE, Constants.StringConstants.DANDRUFF);
                break;
            case R.id.diarrhoea:
                displayRemedyIntent.putExtra(EXTRA_MESSAGE, Constants.StringConstants.DIARRHOEA);
                break;
            case R.id.dehydration:
                displayRemedyIntent.putExtra(EXTRA_MESSAGE, Constants.StringConstants.DEHYDRATION);
                break;
            case R.id.fever:
                displayRemedyIntent.putExtra(EXTRA_MESSAGE, Constants.StringConstants.FEVER);
                break;
            case R.id.flu:
                displayRemedyIntent.putExtra(EXTRA_MESSAGE, Constants.StringConstants.FLU);
                break;
            case R.id.hair_loss:
                displayRemedyIntent.putExtra(EXTRA_MESSAGE, Constants.StringConstants.HAIR_LOSS);
                break;
            case R.id.migraine:
                displayRemedyIntent.putExtra(EXTRA_MESSAGE, Constants.StringConstants.MIGRAINE);
                break;

            case R.id.nausea:
                displayRemedyIntent.putExtra(EXTRA_MESSAGE, Constants.StringConstants.NAUSEA);
                break;
            case R.id.tired_eyes:
                displayRemedyIntent.putExtra(EXTRA_MESSAGE, Constants.StringConstants.TIRED_EYES);
                break;
            case R.id.vomiting:
                displayRemedyIntent.putExtra(EXTRA_MESSAGE, Constants.StringConstants.VOMITING);
                break;

        }
        startActivity(displayRemedyIntent);
    }
     */

}
