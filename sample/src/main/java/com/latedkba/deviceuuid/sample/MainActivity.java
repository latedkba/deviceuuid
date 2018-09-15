package com.latedkba.deviceuuid.sample;

import android.app.Activity;
import android.os.Bundle;

import com.latedkba.deviceuuid.DeviceUUID;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("uuid: " + DeviceUUID.getDeviceUUID(this));
    }
}
