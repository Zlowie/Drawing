import javax.swing.*;


public class DrawingTester {
	
	public static void main(String[] args) {
		int w = 640;
		int h = 480;
		JFrame f = new JFrame();
		DrawingCanvas dc = new DrawingCanvas(w,h);
		
		f.setSize(w,h);
		f.setTitle("Drawing");
		f.add(dc);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
