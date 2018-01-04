package com.example.shinji.sdkuse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.mylibrary.DeviceInfo;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		DeviceInfo deviceInfo = new DeviceInfo();
		HashMap map = deviceInfo.collect();

		Log.w( "DEBUG_DATE", "carrier = " + map.get("carrier"));
		Log.w( "DEBUG_DATE", "device = " + map.get("device"));
		Log.w( "DEBUG_DATE", "manufacture = " + map.get("manufacture"));
		Log.w( "DEBUG_DATE", "model = " + map.get("model"));
		Log.w( "DEBUG_DATE", "version = " + map.get("version"));

	}
}
