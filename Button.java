import java.awt.*;
import java.beans.*;
import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.PreferenceChangeListener;
import java.awt.event.*;
import javax.swing.*;

import com.sun.corba.se.impl.naming.namingutil.CorbalocURL;

public class Button extends JButton implements ActionListener, PropertyChangeListener {
	 private PropertyChangeSupport changes = new PropertyChangeSupport(this); 
	private int default_x, default_y = 20;
		
	
	
	public Button(){
		this.setPreferredSize(new Dimension(default_x, default_y));
		this.setActionListener();
		this.setPropertyChange();
	}

	private void setPropertyChange() {
		this.addPropertyChangeListener(this);
		
	}

	public Button(int a, int b){
		this.setPreferredSize(new Dimension(a,b));
		this.setActionListener();
		this.setPropertyChange();
	}
	public Button(String s){
		this.setText(s);
		this.setActionListener();
		this.setPropertyChange();
	}
	public Button(String s, int a, int b){
		this.setText(s);
		this.setPreferredSize(new Dimension(a,b));
		this.setActionListener();
		this.setPropertyChange();
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
		System.out.println("bang");
		if (this.getBackground().equals(Color.GREEN))
			super.setBackground(Color.BLACK);
		else super.setBackground(Color.GREEN);
	}

	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		if (this.getBackground().equals(Color.GREEN))
		System.out.println("bangbang");
		else if (this.getBackground().equals(Color.BLACK))
			System.out.println("BLACK");
	}
}



