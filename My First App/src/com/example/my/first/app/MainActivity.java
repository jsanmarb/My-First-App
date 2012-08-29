package com.example.my.first.app;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity
{

	public final static String	EXTRA_MESSAGE	= "com.example.my.first.app.MESSAGE";



	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}



	/**
	 * Llamado cuando el usuario cliquea el botón Send
	 * WOLOLO UN CAMBIO
	 * 
	 * @param view
	 */
	public void sendMessage(View view)
	{
		Intent intent= new Intent(this, DisplayMessageActivity.class);
		EditText editText= (EditText) findViewById(R.id.edit_message);
		String message= editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		this.startActivity(intent);
	}

}
