package com.hdlife.headfirstjava;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.TextArea;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

public class SkypeActiveStatusRobot {

	
	 
  public static void main(String[] args) {
	 
    try {
	 
	  Frame frame = new Frame("Example Frame");
	  Component textArea = new TextArea();
	  frame.add(textArea, BorderLayout.CENTER);
	  int width = 1000;
	  int height = 1000;
	  frame.setSize(width, height);
	  frame.setVisible(true);
	  
	  Robot robot = new Robot();
	 
	  int count = 1000;
	  
	  while(count>0) {
		  
		  robot.mouseMove(200, 200);
		  robot.mousePress(InputEvent.BUTTON1_MASK);
		  robot.mouseRelease(InputEvent.BUTTON1_MASK);
		  
		  TimeUnit.SECONDS.sleep(20);
		  
		  robot.mouseMove(400, 400);
		  robot.mousePress(InputEvent.BUTTON1_MASK);
		  robot.mouseRelease(InputEvent.BUTTON1_MASK);
		  
		  TimeUnit.SECONDS.sleep(20);
		  
		  robot.mouseMove(600, 600);
		  robot.mousePress(InputEvent.BUTTON1_MASK);
		  robot.mouseRelease(InputEvent.BUTTON1_MASK);
		  
		  TimeUnit.SECONDS.sleep(20);
		  
		  count--;
	  }
	  
	 
//	  robot.keyPress(KeyEvent.VK_H);
//	  robot.keyRelease(KeyEvent.VK_H);
//	  
//	  robot.keyPress(KeyEvent.VK_E);
//	  robot.keyRelease(KeyEvent.VK_E);
//	 
//	  robot.keyPress(KeyEvent.VK_L);
//	  robot.keyRelease(KeyEvent.VK_L);
//	 
//	  robot.keyPress(KeyEvent.VK_L);
//	  robot.keyRelease(KeyEvent.VK_L);
//	 
//	  robot.keyPress(KeyEvent.VK_O);
//	  robot.keyRelease(KeyEvent.VK_O);
	 
	  } catch (AWTException e) {
		  System.out.println("Low level input control is not allowed " + e.getMessage());
	  } catch (InterruptedException e) {
		  e.printStackTrace();
	}
	 
  }
	 
}