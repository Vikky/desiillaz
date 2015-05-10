package com.learningv.desiilaaz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import com.learningv.desiilaaz.utils.Ailments;
import com.learningv.desiilaaz.utils.Constants.StringConstants;

import java.util.ArrayList;
import java.util.List;


public class DisplayRemedyActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String ailment = intent.getStringExtra(DisplayAilmentsActivity.EXTRA_MESSAGE);

        List<String> remedyInfo = getRemedyInfo(ailment);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, remedyInfo);
        setListAdapter(adapter);
    }


    private List<String> getRemedyInfo(String ailmentName) {

        List<String> infoArray = new ArrayList<String>();
        Ailments[] ailmentArray = Ailments.values();
        for (Ailments ailment : ailmentArray) {
            if(ailmentName.equalsIgnoreCase(ailment.getDescription())){
                infoArray.addAll(ailment.getRemedies());
                break;
            }
        }
        return infoArray;
    }




    //***************** Inherited methods from ListActivity class *****************//

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_remedy, menu);
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