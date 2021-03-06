/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.clever_apps.tinetworkinfo;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;

@Kroll.module(name="Tinetworkinfo", id="com.clever_apps.tinetworkinfo")
public class TinetworkinfoModule extends KrollModule
{

	// Standard Debugging variables
	private static final String TAG = "TinetworkinfoModule";

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;
	
	public TinetworkinfoModule()
	{
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
		Log.d(TAG, "inside onAppCreate");
		// put module init code that needs to run when the application is created
	}

	// Methods
		@Kroll.method
		public String getIMEI()
		{
			TelephonyManager  tel=(TelephonyManager) getActivity().getSystemService(Context.TELEPHONY_SERVICE); 
		    String deviceid=tel.getDeviceId();

		    return deviceid;
		}
		
		@Kroll.method
		public String getMMC()
		{
			TelephonyManager  tel=(TelephonyManager) getActivity().getSystemService(Context.TELEPHONY_SERVICE); 
			String networkOperator = tel.getNetworkOperator();
			
			String mcc = networkOperator.substring(0, 3);
		    return mcc;
		}
		
		
		@Kroll.method
		public String getMNC()
		{
			TelephonyManager  tel=(TelephonyManager) getActivity().getSystemService(Context.TELEPHONY_SERVICE); 
			String networkOperator = tel.getNetworkOperator();
			
			String mnc = networkOperator.substring(3);
		    return mnc;
		}
		@Kroll.method
		public int getCellID()
		{
			TelephonyManager  tel=(TelephonyManager) getActivity().getSystemService(Context.TELEPHONY_SERVICE); 
			GsmCellLocation cellLocation = (GsmCellLocation)tel.getCellLocation();
			
			int cid = cellLocation.getCid();
		    return cid;
		}
		@Kroll.method
		public int getLac()
		{
			TelephonyManager  tel=(TelephonyManager) getActivity().getSystemService(Context.TELEPHONY_SERVICE); 
			GsmCellLocation cellLocation = (GsmCellLocation)tel.getCellLocation();
			
			int lac = cellLocation.getLac();
		    return lac;
		}

}

