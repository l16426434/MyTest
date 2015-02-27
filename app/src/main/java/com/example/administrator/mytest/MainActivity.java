package com.example.administrator.mytest;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.afollestad.materialdialogs.AlertDialogWrapper;
import com.afollestad.materialdialogs.MaterialDialog;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toast.makeText(this,"adb",Toast.LENGTH_LONG).show();
        //lv
        int i=0;
        int k=0;
        int j=1;
        System.out.print(i);
        System.out.print(k);
        System.out.print(j);
		//ljs
		String str = "abc";
//		new MaterialDialog.Builder(this)
//				.title("title")
//				.content("content")
//				.positiveText("positive")
//				.negativeText("negative")
//				.show();

		AlertDialogWrapper.Builder dialogBuilder = new AlertDialogWrapper.Builder(this);
		dialogBuilder.setMessage("message");
		dialogBuilder.setTitle("title");
		dialogBuilder.setNegativeButton("ok", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		dialogBuilder.create().show();
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
}
