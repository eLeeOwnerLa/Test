package lab.android.hello;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class LifeCycleDemo extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.table);
		Log.i("LifeCycleTest", "onCreate() callde");{
			Toast.makeText(this, "onCreate() called", Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("LifeCycleTest", "onDestroy() callde");{
			Toast.makeText(this, "onDestroy() called", Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("LifeCycleTest", "onPause() callde");{
			Toast.makeText(this, "onPause() called", Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i("LifeCycleTest", "onRestart() callde");{
			Toast.makeText(this, "onRestart() called", Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("LifeCycleTest", "onResume() callde");{
			Toast.makeText(this, "onResume() called", Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("LifeCycleTest", "onStart() callde");{
			Toast.makeText(this, "onStart() called", Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("LifeCycleTest", "onStop() callde");{
			Toast.makeText(this, "onStop() called", Toast.LENGTH_SHORT).show();
		}
	}
	

}
