package com.pushlet.server;

import java.io.Serializable;

import nl.justobjects.pushlet.core.Event;
import nl.justobjects.pushlet.core.EventPullSource;

public class HelloWorldPlushlet implements Serializable {
	 static public class HwPlushlet extends EventPullSource {

		protected long getSleepTime() {
			// TODO Auto-generated method stub
			 return 1000;   
		}

		protected Event pullEvent() {
			Event event =Event.createDataEvent("/zhaoyang/hi"); 
			event.setField("hw","hello,world"); 
			return event;  
		} 
	 }
	 
	 static public class MYPushLet extends EventPullSource{
		protected long getSleepTime() {
			// TODO Auto-generated method stub
			return 1000;
		}

		protected Event pullEvent() {
			// TODO Auto-generated method stub
			Event event=Event.createDataEvent("/max");
			event.setField("min", "you are who?");
			return event;
		}
		 
	 }
}
