package com.learningjava;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class HelloJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jframe = new JFrame("Hello World");
		jframe.add(new HelloComponent2("Please Dont Drag"));
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(300, 600);
		jframe.setVisible(true);

	}
}

class HelloComponent2 extends JComponent implements MouseMotionListener {

	String theMessage;
	int messageX = 125, messageY = 95;// Cooridnates of the message

	public HelloComponent2(String message) {
		theMessage = message;
		addMouseMotionListener(this);
	}

	public void paintComponent(Graphics g) {
		g.drawString(theMessage, messageX, messageY);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
		messageX = e.getX();
		messageY = e.getY();
	    repaint();

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
