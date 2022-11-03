package ballsimulation;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TwoDimensionsBallSimulation extends JPanel implements Runnable {

	private static final long serialVersionUID = 1L;
	Ball b = new Ball(200, 200, 10, Color.BLACK);

	public void paint() {

	}

	public void run() {
		JFrame f = new JFrame("2D Ball Simulation");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setMinimumSize(new Dimension(600, 600));
		f.setContentPane(this);
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new TwoDimensionsBallSimulation());
	}

}
