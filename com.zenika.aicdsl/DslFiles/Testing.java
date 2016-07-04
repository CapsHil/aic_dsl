	
package com.zenika.aic.demo.sensor;
	
import android.hardware.Sensor;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.InstrumentationTestCase;
import android.util.Log;

import com.zenika.aic.core.libs.sensor.Device;
import com.zenika.aic.core.libs.sensor.SensorsPacket;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;

@RunWith(AndroidJUnit4.class)
public class Testing extends InstrumentationTestCase {

	private Device device;
	private String appName = "Sensor";


    @Before
    public void init() {
        device = new Device(appName, InstrumentationRegistry.getInstrumentation());
	}

	@Test
    public void test1() {
		device.setValuesForSensor(new float[]{42f},Sensor.TYPE_LIGHT);
	}

	@Test
    public void test2() {
		device.getBatteryInstance().setLevel(1, 100);
	}

}
