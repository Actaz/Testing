import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Button extends JButton implements ActionListener{
	
	private String buttonText="";
	private Color backC, fronC;
	private int bx,by,bwidth,bheight;
	private int default_x, default_y=20;
	
	
	
	public Button(){
		this.setSize(default_x, default_y);
		this.setActionListener();
	}
	public Button(int a, int b){
		this.bx = a;
		this.by = b;
		this.setPreferredSize(new Dimension(bx,by));
	}
	public Button(String s){
		this.setText(s);
	}
	public Button(String s, int a, int b){
		this.bx = a;
		this.by = b;
		this.setText(s);
		this.setPreferredSize(new Dimension(bx,by));
	}

	
	public void setColor(Color foreground, Color background){
		this.setBackground(background);
		this.setForeground(foreground);
		this.backC = background;
		this.fronC = foreground;
	}

	
	
	private void setActionListener(){
		this.addActionListener(this);
	}
	
	
	@Override
	public void  actionPerformed(ActionEvent e){
		
	}
}


jkk