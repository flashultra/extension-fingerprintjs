package org.haxe.extension;


import android.app.Activity;
import android.content.res.AssetManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.fingerprintjs.android.fingerprint.Fingerprinter;
import com.fingerprintjs.android.fingerprint.FingerprinterFactory;

public class Fingerprintjs extends Extension {
	
	private static String fingerprint;
	private static String deviceId;
	private static String gsfId;
	private static String mediaDrmId;
	private static String androidId;
	
	public static String getFingerPrintJS() {
		return fingerprint;
	}
	
	public static String getDeviceId() {
		return deviceId;
	}
	
	public static String getGsfId() {
		return gsfId;
	}
	
	public static String getMediaDrmId() {
		return mediaDrmId;
	}
	
	public static String getAndroidId() {
		return androidId;
	}
	
	
	/**
	 * Called when an activity you launched exits, giving you the requestCode 
	 * you started it with, the resultCode it returned, and any additional data 
	 * from it.
	 */
	public boolean onActivityResult (int requestCode, int resultCode, Intent data) {
		
		return true;
		
	}

	/**
	 * Called when the activity receives th results for permission requests.
	 */
	public boolean onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {

		return true;

	}
	
	
	
	
	/**
	 * Called when the activity is starting.
	 */
	public void onCreate (Bundle savedInstanceState) {
		
		Fingerprinter fingerprinter = FingerprinterFactory.create(mainContext); //.getApplicationContext()
        fingerprinter.getFingerprint(Fingerprinter.Version.V_5, myfingerprint-> {
            fingerprint = myfingerprint;
            return null;
        });

        fingerprinter.getDeviceId(Fingerprinter.Version.V_5, deviceIdResult-> {
            deviceId = deviceIdResult.getDeviceId();
            gsfId = deviceIdResult.getGsfId();
            mediaDrmId = deviceIdResult.getMediaDrmId();
            androidId = deviceIdResult.getAndroidId();
            return null;
        });
		
	}
	
	
	/**
	 * Perform any final cleanup before an activity is destroyed.
	 */
	public void onDestroy () {
		
		
		
	}
	
	
	/**
	 * Called as part of the activity lifecycle when an activity is going into
	 * the background, but has not (yet) been killed.
	 */
	public void onPause () {
		
		
		
	}
	
	
	/**
	 * Called after {@link #onStop} when the current activity is being 
	 * re-displayed to the user (the user has navigated back to it).
	 */
	public void onRestart () {
		
		
		
	}
	
	
	/**
	 * Called after {@link #onRestart}, or {@link #onPause}, for your activity 
	 * to start interacting with the user.
	 */
	public void onResume () {
		
		
		
	}
	
	
	/**
	 * Called after {@link #onCreate} &mdash; or after {@link #onRestart} when  
	 * the activity had been stopped, but is now again being displayed to the 
	 * user.
	 */
	public void onStart () {
		
		
		
	}
	
	
	/**
	 * Called when the activity is no longer visible to the user, because 
	 * another activity has been resumed and is covering this one. 
	 */
	public void onStop () {
		
		
		
	}
	
	
}