package com.wiyun.engine.skeleton;

import android.graphics.Typeface;

import com.wiyun.engine.nodes.Director;
import com.wiyun.engine.nodes.Label;
import com.wiyun.engine.nodes.Scene;
import com.wiyun.engine.types.WYSize;

public class FirstScene extends Scene {
	public FirstScene() {
		System.out.println("do particle");
		WYSize s = Director.getInstance().getWindowSize();
	    Label label = Label.make("Welcome to WiEngine", 20, "DroidSans", Typeface.BOLD, 0);
	    label.setPosition(s.width / 2, s.height / 2);
	    addChild(label);
	    
	    autoRelease(true);
    }
}
