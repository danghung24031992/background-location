
package com.dh.backgroundlocation;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNBackgroundLocationModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNBackgroundLocationModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNBackgroundLocation";
  }
}