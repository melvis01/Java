import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;


public class BubblePanel extends JPanel {
	
	private ArrayList<Bubble>bubblelist;
	private int size = 30;
	private Timer timer;
	private final int DELAY = 33; // ms delay for 30frames per second
	
	
	public BubblePanel(){
		
		bubblelist = new ArrayList<Bubble>();
		
		
		addMouseListener(new BubbleListener());
		addMouseMotionListener(new BubbleListener());
		addMouseWheelListener(new BubbleListener());
		
		
		timer = new Timer(DELAY, new BubbleListener());
		
		
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(600,400));
		
		timer.start();
		
	}
	
	public void paintComponent(Graphics page){
		
		super.paintComponent(page);
		
		// draw all the bubble from bubbleList
		
		for (Bubble bubble:bubblelist){			
			page.setColor(bubble.color);
			page.fillOval(bubble.x - bubble.size/2,
					bubble.y - bubble.size/2,
					bubble.size, bubble.size );
			
		}
		
		// bubble counter
		
		page.setColor(Color.green);
		page.drawString("Count: " + bubblelist.size(), 5, 15);
		
				
	}
	
	
	private class BubbleListener implements MouseListener, 
	                                        MouseMotionListener,
	                                        MouseWheelListener,
	                                        ActionListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
			timer.stop(); // stop animation
			// add to the bubble list my mouse location			
			bubblelist.add(new Bubble(e.getX(), e.getY(),
					size));
			repaint();
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// start animation
			timer.start();
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// add to the bubble list my mouse location
			
			bubblelist.add(new Bubble(e.getX(), e.getY(),
					size));
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			// Change the bubble size when the mouse wheel has been moved
			
			size -= e.getWheelRotation();
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// update the location of each bubble for the animation
			
			for (Bubble bubble:bubblelist)
				bubble.update();			
			// Repaint the screen			
			repaint();
			
			
		}
		
		
		
	}
	
		
	private class Bubble {
		/** Bubble needs an x.y location and a size */		
		
		public int x;
		public int y;
		public int size;
		public Color color;
		public int  xspeed;
		public int  yspeed;
		private final int MAX_SPEED = 5;
		
		
		
		public Bubble(int newX, int newY, int newSize){
			
			x = newX;
			y = newY;
			size = newSize;
			color = new Color((float)Math.random(),
					(float)Math.random(),
					(float)Math.random());
			xspeed = (int)(Math.random() * MAX_SPEED * 2 - MAX_SPEED);
			yspeed = (int)(Math.random() * MAX_SPEED * 2 - MAX_SPEED);
            
			if (xspeed == 0 && yspeed == 0)
			
			{				
				xspeed = 1;
				yspeed = 1;
			}
		}
		
		public void update(){
			
			x -= xspeed; // 5 pixels per frame update
			y -= yspeed;
			
			// collision detection 
			
			if (x < 0 || x > getWidth() )
				xspeed = -1 * xspeed;
			
			if (y < 0 || y > getHeight() )
				yspeed = -yspeed;
		}
	}
}
