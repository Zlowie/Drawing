import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawingCanvas extends JComponent{
	
	private int width;
	private int height;
	private Cloud c1;
	
	public DrawingCanvas(int w, int h) {
		width = w;
		height = h;
		c1 = new Cloud();
		
	}
	
	protected void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHints(rh);
/*		
		Rectangle2D.Double r = new Rectangle2D.Double(0,0,width,height);
		g2d.setColor(new Color(100,149,237));
		g2d.fill(r);
		
		Ellipse2D.Double e = new Ellipse2D.Double(200,75,100,100);
		g2d.setColor(Color.RED);
		g2d.fill(e);
		
		Line2D.Double line = new Line2D.Double(100,250,300,75);
		g2d.setColor(Color.BLACK);
		g2d.draw(line);
		*/
		Ellipse2D.Double e = new Ellipse2D.Double(200,75,100,100);
		Ellipse2D.Double e2 = new Ellipse2D.Double(280,75,100,100);
		Ellipse2D.Double e3 = new Ellipse2D.Double(220,50,80,80);
		Ellipse2D.Double e4 = new Ellipse2D.Double(280,60,50,50);
		Ellipse2D.Double e5 = new Ellipse2D.Double(235,90,100,100);
		g2d.setColor(Color.BLUE);
		g2d.fill(e);
		g2d.fill(e2);
		g2d.fill(e3);
		g2d.fill(e4);
		g2d.fill(e5);
		
	}

}
