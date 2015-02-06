package com.example.conversor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void conversio(View view) {
    	//switch (view.getId()) {
    	//case R.id.boto:
    		EditText text = (EditText) findViewById(R.id.valor);
    		RadioButton botoKm = (RadioButton) findViewById(R.id.opcio1);
    		RadioButton botoMilles = (RadioButton) findViewById(R.id.opcio2);
    		
    		if (text.getText().toString().length() == 0) {
    			Toast.makeText(getApplicationContext(), "No has introduit cap valor", Toast.LENGTH_SHORT).show();
    		}
    		else {
    			float inputValue = Float.parseFloat(text.getText().toString());
	    		if (botoKm.isChecked()) {
	    			text.setText(String.valueOf(inputValue / 1.609344));
	    			botoKm.setChecked(false);
	    			botoMilles.setChecked(true);
	    		}
	    		else {
	    			text.setText(String.valueOf(inputValue * 1.609344));
	    			botoKm.setChecked(true);
	    			botoMilles.setChecked(false);
	    		}
    		}
    		
    	//	break;
    	//}
    }
    public void reset(View view) {
    	EditText text = (EditText) findViewById(R.id.valor);
    	RadioButton botoKm = (RadioButton) findViewById(R.id.opcio1);
		RadioButton botoMilles = (RadioButton) findViewById(R.id.opcio2);
		
    	text.setText(null);
    	botoKm.setChecked(true);
		botoMilles.setChecked(false);
    }
}

