import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Button extends JButton implements ActionListener{
	private int default_x, default_y = 20;
		
	
	
	public Button(){
		this.setPreferredSize(new Dimension(default_x, default_y));
		this.setActionListener();
	}
	public Button(int a, int b){
		this.setPreferredSize(new Dimension(a,b));
	}
	public Button(String s){
		this.setText(s);
	}
	public Button(String s, int a, int b){
		this.setText(s);
		this.setPreferredSize(new Dimension(a,b));
	}

	
	public void setColor(Color foreground, Color background){
		this.setBackground(background);
		this.setForeground(foreground);
	}

	
	
	private void setActionListener(){
		this.addActionListener(this);
	}
	
	
	@Override
	public void  actionPerformed(ActionEvent e){
		
	}
}


