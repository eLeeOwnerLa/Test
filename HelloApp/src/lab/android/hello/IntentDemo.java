package lab.android.hello;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentDemo extends Activity{
	Button call, send;
	EditText name, phone;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		
		
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intentdemo);
		call = (Button)findViewById(R.id.call);
		send = (Button)findViewById(R.id.send);
		name = (EditText)findViewById(R.id.name);
		phone = (EditText)findViewById(R.id.phone);
		
		call.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				String pno = "tel:"+(String) phone.getText().toString();
				Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(pno));
				startActivity(intent);
			}
		});
		
		send.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String nm = (String)name.getText().toString();
				Intent intent = new Intent(IntentDemo.this, ResultAc.class);
				intent.putExtra("name", nm);
				startActivity(intent);
			}
		});
	}

}
