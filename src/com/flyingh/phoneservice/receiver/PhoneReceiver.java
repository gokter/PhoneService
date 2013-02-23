package com.flyingh.phoneservice.receiver;

import com.flyingh.service.PhoneService;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class PhoneReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		context.startService(new Intent(context, PhoneService.class));
	}

}
