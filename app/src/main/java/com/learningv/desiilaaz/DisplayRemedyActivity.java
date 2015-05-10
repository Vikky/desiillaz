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
        String ailment = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        List<String> remedyInfo = getRemedyInfo(ailment);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, remedyInfo);
        setListAdapter(adapter);
    }


    private List<String> getRemedyInfo(String ailment) {

        List<String> infoArray = new ArrayList<String>();

        switch (ailment) {
            case StringConstants.ACIDITY :
                infoArray.addAll(Ailments.ACIDITY.getRemedies());
                break;
            case StringConstants.ACNE :
                infoArray.addAll(Ailments.ACNE.getRemedies());
                break;
            case StringConstants.BLACKHEADS :
                infoArray.addAll(Ailments.BLACKHEADS.getRemedies());
                break;
            case StringConstants.COMMON_COLD :
                infoArray.addAll(Ailments.COMMON_COLD.getRemedies());
                break;
            case StringConstants.CONSTIPATION :
                infoArray.addAll(Ailments.CONSTIPATION.getRemedies());
                break;
            case StringConstants.COUGH :
                infoArray.addAll(Ailments.COUGH.getRemedies());
                break;
            case StringConstants.DANDRUFF :
                infoArray.addAll(Ailments.DANDRUFF.getRemedies());
                break;
            case StringConstants.DIARRHOEA :
                infoArray.addAll(Ailments.DIARRHOEA.getRemedies());
                break;
            case StringConstants.DEHYDRATION:
                infoArray.addAll(Ailments.DEHYDRATION.getRemedies());
                break;
            case StringConstants.FEVER :
                infoArray.addAll(Ailments.FEVER.getRemedies());
                break;
            case StringConstants.FLU :
                infoArray.addAll(Ailments.FLU.getRemedies());
                break;
            case StringConstants.HAIR_LOSS:
                infoArray.addAll(Ailments.HAIR_LOSS.getRemedies());
                break;
            case StringConstants.MIGRAINE:
                infoArray.addAll(Ailments.MIGRAINE.getRemedies());
                break;
            case StringConstants.NAUSEA:
                infoArray.addAll(Ailments.NAUSEA.getRemedies());
                break;
            case StringConstants.TIRED_EYES:
                infoArray.addAll(Ailments.TIRED_EYES.getRemedies());
                break;
            case StringConstants.VOMITING:
                infoArray.addAll(Ailments.VOMITING.getRemedies());
                break;
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