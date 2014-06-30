package lab.android.hello;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ButtonEventDemo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.button_event_xml);
		Button btn = (Button) findViewById(R.id.button1);
		btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				AlertDialog.Builder builder = new AlertDialog.Builder(
						ButtonEventDemo.this);
				builder.setIcon(R.drawable.ic_launcher);
				builder.setTitle("Hello");
				builder.setMessage("Good Afternoon^^");
				// Add the buttons
				builder.setPositiveButton("확인",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								Toast.makeText(ButtonEventDemo.this, "OK", 1000)
										.show();

							}
						});// User clicked OK button } });
				builder.setNegativeButton("취소",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								Toast.makeText(ButtonEventDemo.this, "Cancel",
										1000);//

							}
						});
				AlertDialog dialog = builder.create();
				dialog.show();

				// TODO Auto-generated method stub

			}
		});
		Spinner spinner = (Spinner) findViewById(R.id.spinner1); // 
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, 
				R.array.planets_array, android.R.layout.simple_spinner_item); // 
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // 
		spinner.setAdapter(adapter);

	}

}
