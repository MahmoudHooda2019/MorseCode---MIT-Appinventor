package com.aemo.morsecode;

import android.content.Context;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;


public class MorseCode extends AndroidNonvisibleComponent {

  private Context context;
  private MorseCoder coder;

  public MorseCode(ComponentContainer container) {
    super(container.$form());
    context = container.$context();
    coder = new MorseCoder();
  }


  @SimpleFunction
  public String encode(String text){
    return coder.encode(text);
  }
  @SimpleFunction
  public String decode(String text){
    return coder.decode(text);
  }

}
