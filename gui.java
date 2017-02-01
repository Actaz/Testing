import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui extends JFrame implements ActionListener{
	
	private JButton b1;
	
	
	public gui(){
		createView();
	
		setTitle("Click me");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setResizable(true);
		
		
	}
	public void createView(){
		int size = 5;
		JPanel panel = new JPanel(new GridBagLayout());
		getContentPane().add(panel);
		GridBagConstraints c = new GridBagConstraints();
		
		
			//Adding panels onto the main panel
			JPanel east = new JPanel(new GridBagLayout());
			GridBagConstraints d = new GridBagConstraints();
				d.gridx = 0;
				d.gridy = 0;
				d.ipady = 0;
				east.add(new JButton("hello1"),d);
				d.gridy = 1;
				d.gridx = 0;
				east.add(new Button("BANG",100,100),d);
				d.gridy = 2;
				d.gridx = 0;
				east.add(new JButton("hello3"),d);
			c.gridx = 0;
			c.gridy = 0;
			panel.add(east, c);
			
			
			JPanel contents = new JPanel(new GridBagLayout());
			GridBagConstraints cs = new GridBagConstraints();
				cs.gridx = 0;
				cs.gridy = 0;
				for (int i = 0; i < size; i++) {
					cs.gridy = 0;
					for (int n = 0; n < size; n++){
						b1 = new JButton();
						b1.setPreferredSize(new Dimension(40,40));
						b1.addActionListener(this);
						contents.add(b1, cs);
						cs.gridy += 1;
					}
					cs.gridx += 1;
				}
			c.gridx = 1;
			c.gridy = 0;
			panel.add(contents, c);
			
			JPanel syd = new JPanel(new GridBagLayout());
			GridBagConstraints s = new GridBagConstraints();
				s.gridx = 0;
				s.gridy = 0;
				s.ipady = 40;
				syd.add(new JButton("hello1"),s);
				s.gridy = 0;
				s.gridx = 1;
				syd.add(new JButton("hello2"),s);
				s.gridy = 0;
				s.gridx = 2;
				syd.add(new JButton("hello3"),s);
			c.gridwidth = 2;
			c.gridx = 0;
			c.gridy = 1;
			panel.add(syd, c);
	}


	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				new gui().setVisible(true);;
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("wow");
		
	}
}
