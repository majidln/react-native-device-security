package com.device.security;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.provider.Settings;

public class DeviceSecurityModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public DeviceSecurityModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "DeviceSecurity";
    }

    @ReactMethod
    public void sampleMethod(String stringArgument, int numberArgument, Callback callback) {
        // TODO: Implement some actually useful functionality
        callback.invoke("Received numberArgument: " + numberArgument + " stringArgument: " + stringArgument);
    }

    @ReactMethod
    public void isAdbEnabled(Promise promise) {
        int adb = 0;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR1) {
            adb = Settings.Global.getInt(getCurrentActivity().getContentResolver(),
                    Settings.Global.ADB_ENABLED, 0);
        }
        promise.resolve(adb == 1);
    }
}
