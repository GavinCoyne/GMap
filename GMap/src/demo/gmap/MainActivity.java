package demo.gmap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;


public class MainActivity extends Activity {

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
    
    final int RQS_GooglePlayServices = 1;
    @Override
    protected void onResume() {
     // TODO Auto-generated method stub
     super.onResume();
     int resultCode =
    GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());

     if (resultCode == ConnectionResult.SUCCESS){
     Toast.makeText(getApplicationContext(), "Google Play services is available.",
     Toast.LENGTH_LONG).show();
     }else{
     GooglePlayServicesUtil.getErrorDialog(resultCode, this, RQS_GooglePlayServices).show();
     }

    }
    
}
