package graphic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class Smile extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {		
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(20, 20, 150, 150);
		
		g.setColor(Color.black);
		g.drawArc(50, 50, 40, 40, 0, 180);
		g.drawArc(100, 50, 40, 40, 0, 180);
		g.drawArc(60, 100, 70, 40, 180, 180);
	}
}


public class SmileFace extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SmileFace frame = new SmileFace();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SmileFace() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 220, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		add(new Smile());
	}

}
