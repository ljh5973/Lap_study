package edu.java.sproject.util;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MyCanvas extends Canvas{

	public int x=50;
	public int y=-50;
	
	// 글자 굵기
	public int width=5; 
	public int height=5;
	
	public Color color=Color.black;
	
	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, width, height);// x, y 지점에 70, 70크기의 원 그리기
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	
	
}
