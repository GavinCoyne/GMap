package demo.gmap;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

/*
public class MainActivity extends Activity implements GoogleApiClient.ConnectionCallbacks,
GoogleApiClient.OnConnectionFailedListener,
LocationListener {

	 private final String TAG = "Location101";
	 private TextView mLocationView;
	 private GoogleApiClient mGoogleApiClient;
	 private LocationRequest mLocationRequest;
	 private final static int CONNECTION_FAILURE_RESOLUTION_REQUEST = 9000;
	 int counter = 0;
	
	
	 package demo.gmap;*/

	 import android.app.Activity;
	 import android.os.Bundle;

	 import com.google.android.gms.maps.*;
	 import com.google.android.gms.maps.model.*;
	 import android.app.Activity;
	 import android.os.Bundle;

	 public class MainActivity extends Activity implements OnMapReadyCallback {

	     @Override
	     protected void onCreate(Bundle savedInstanceState) {
	         super.onCreate(savedInstanceState);
	         setContentView(R.layout.activity_main);

	         MapFragment mapFragment = (MapFragment) getFragmentManager()
	                 .findFragmentById(R.id.map);
	         mapFragment.getMapAsync(this);
	     }

	     @Override
	     public void onMapReady(GoogleMap map) {
	         LatLng sydney = new LatLng(50.6761, -120.3408);

	         map.setMyLocationEnabled(true);
	         map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 13));

	         map.addMarker(new MarkerOptions()
	                 .title("Shartpoops")
	                 .snippet("Land of the Roaming Jeffs")
	                 .position(sydney));
	     }
	 }
	/* 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	 mLocationView = new TextView(this);
    	 setContentView(mLocationView);
    	 mGoogleApiClient = new GoogleApiClient.Builder(this)
    	 .addApi(LocationServices.API)
    	 .addConnectionCallbacks(this)
    	 .addOnConnectionFailedListener(this)
    	 .build();

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
    
    /*
     * (non-Javadoc)
     * @see android.app.Activity#onStart()
     * 
     * Life Cycle Management
     */
	 /*
    
    @Override
    protected void onStart() {
	    super.onStart();
	    // Connect the client.
	    mGoogleApiClient.connect();
    }
    @Override
    protected void onStop() {
	    // Disconnecting the client invalidates it.
	    mGoogleApiClient.disconnect();
	    super.onStop();
    }
    
    final int RQS_GooglePlayServices = 1;
    @Override
    protected void onResume() {
	    // TODO Auto-generated method stub
	    super.onResume();
	    int resultCode =
	    GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());
	
	    if (resultCode == ConnectionResult.SUCCESS){
	    	Toast.makeText(getApplicationContext(), "Google Play services is available.", Toast.LENGTH_LONG).show();
	    }else{
	    	GooglePlayServicesUtil.getErrorDialog(resultCode, this, RQS_GooglePlayServices).show();
	    }
	
    }


    @Override
    public void onLocationChanged(Location location) {
    	counter++;
    	mLocationView.setText("Location received: " +
    	location.toString() + "\nSpeed: " + Double.toString(location.getSpeed()));
   
    	String locationtxt = "Counter " + counter + " Latitude = " +
    	Double.toString(location.getLatitude()) + 
   			",Longitude = " + Double.toString(location.getLongitude()) + 
   			", Altitude " + Double.toString(location.getAltitude()) +
   			", Speed " + Double.toString(location.getSpeed());
    	Log.i(TAG, locationtxt);
    }


	@Override
	public void onConnectionFailed(ConnectionResult connectionResult) {
	if (connectionResult.hasResolution()) {
	try {
		// Start an Activity that tries to resolve the error
		connectionResult.startResolutionForResult(this,
		CONNECTION_FAILURE_RESOLUTION_REQUEST);
	} catch (IntentSender.SendIntentException e) {
			// Log the error
			e.printStackTrace();
		}
	} else {
			// 	If no resolution is available, display a dialog to the user
			GooglePlayServicesUtil.getErrorDialog(connectionResult.getErrorCode(), this,
			CONNECTION_FAILURE_RESOLUTION_REQUEST).show();
		}
	}



	@Override
	 public void onConnected(Bundle bundle) {
		 mLocationRequest = LocationRequest.create();
		 mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
		 mLocationRequest.setInterval(500); // Update location every second
		 LocationServices.FusedLocationApi.requestLocationUpdates(
		 mGoogleApiClient, mLocationRequest, this);
	 }


	@Override
	 public void onConnectionSuspended(int i) {
		Log.i(TAG, "GoogleApiClient connection has been suspended");
	 }
	
	@Override
	 protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		 // Decide what to do based on the original request code
		 switch (requestCode) {
			 case CONNECTION_FAILURE_RESOLUTION_REQUEST :
			 /*
			 * If the result code is Activity.RESULT_OK, try
			 * to connect again
			 *//*
			 switch (resultCode) {
			 	case Activity.RESULT_OK :
			 		/*
			 		 * Try the request again
			 		 *//*
			 	break;
			 }
		 }
	}
    
    
    
}
*/