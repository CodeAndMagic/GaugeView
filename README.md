GaugeView
=========

An Android library for drawing gauges on Canvas.


![GaugeView](http://goo.gl/Hu7Ou)

### Usage
=====

Import the library into your project.

Configuration takes place via XML: *interaction via code is largely limited to updating the value the gauge will display.*

In your layout XML file add/configure the GaugeView(s) as shown:

```xml
<org.codeandmagic.android.gauge.GaugeView
    android:id="@+id/gauge_view1"
    android:layout_width="match_parent"
    android:layout_height="0dp"
    android:layout_weight="1" />

<org.codeandmagic.android.gauge.GaugeView
    android:id="@+id/gauge_view2"
    android:layout_width="150dp"
    android:layout_height="150dp"
    android:layout_marginTop="10dp"
    gauge:showOuterShadow="true"
    gauge:showOuterRim="false"
    gauge:showNeedle="false"
    gauge:showRanges="false"
    gauge:showText="true"
    gauge:textUnit="%" />
```

Interact with the GaugeView:

```java
private GaugeView mGaugeView1;
private GaugeView mGaugeView2;

// Retrieve the references
mGaugeView1 = (GaugeView) findViewById(R.id.gauge_view1);
mGaugeView2 = (GaugeView) findViewById(R.id.gauge_view2);
		
// Set the values to display
mGaugeView1.setTargetValue(25);
mGaugeView2.setTargetValue(35);
```

### TODO (coming soon)
=====

- [ ] Clean up the code.

- [ ] Document the main features.

- [ ] Add javadoc.
