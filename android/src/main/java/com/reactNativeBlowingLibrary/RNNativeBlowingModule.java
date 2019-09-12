
package com.reactNativeBlowingLibrary;

import android.content.Context;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNNativeBlowingModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNNativeBlowingModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNNativeBlowing";
  }

  @ReactMethod
  public void blowing() {
    Context context = getReactApplicationContext();
    Toast.makeText(context, "Blowing", Toast.LENGTH_LONG).show();
  }
}