/*******************************************************************************
 * Copyright (c) 2012 Evelina Vrabie
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.codeandmagic.android.gauge.demo;

import java.util.Random;

import org.codeandmagic.android.gauge.GaugeView;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;

public class MainActivity extends Activity {

	private GaugeView mGaugeView1;
	private GaugeView mGaugeView2;
	private final Random RAND = new Random();

	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mGaugeView1 = (GaugeView) findViewById(R.id.gauge_view1);
		mGaugeView2 = (GaugeView) findViewById(R.id.gauge_view2);
		mTimer.start();
	}

	private final CountDownTimer mTimer = new CountDownTimer(30000, 1000) {

		@Override
		public void onTick(final long millisUntilFinished) {
			mGaugeView1.setTargetValue(RAND.nextInt(101));
			mGaugeView2.setTargetValue(RAND.nextInt(101));
		}

		@Override
		public void onFinish() {}
	};
}
