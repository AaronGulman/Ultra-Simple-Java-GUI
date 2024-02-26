import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI{
	private int clickCount = 0;
	private JLabel clickLabel;

	public GUI(){
		JFrame frame = new JFrame();

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));

		JButton button = new JButton("Click me!");

		button.setPreferredSize(new Dimension(100,50));

		clickLabel = new JLabel("Click Count: 0");

		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				clickCount++;
				updateClickLabel();
			}
		});

		panel.add(button);
		panel.add(clickLabel);

		frame.add(panel,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GUI");
		frame.pack();
		frame.setVisible(true);
		
		


		
	}
	
}