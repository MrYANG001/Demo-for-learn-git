package demo;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NameDrop extends Applet implements Runnable,ActionListener
{ //(3)
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x = 0;
	private int y = 0;private Thread t; // (4)
	private boolean b = false;
	private Button button;
	private TextField textFieldName;
	private TextField textFieldID;
	private String name;
	private String ID;
	private Label LabelName;
	private Label LabelID;

	public void init() {
		this.setSize(300, 300);
		button = new Button(" 提交 ");
		textFieldName = new TextField(10);
		textFieldID = new TextField(10);
		button.addActionListener(this); // (5)
		LabelName = new Label(" 姓名 ");
		LabelID = new Label(" 学号 ");
		this.add(button);
		this.add(LabelName);
		this.add(textFieldName);
		this.add(LabelID);
		this.add(textFieldID);
	}
	public void init1(){ //(6)
		if ( t == null ){
		t = new Thread( this ); //(7)
		t .start( );
		}
}

	public void stop() {
		if (t != null) {
			t.interrupt();
			t = null;
		}
	}

	public void paint( Graphics g){ //(8)
		if ( b ){
			x = x +1;
			y = y +1;
			g.drawString( name , x ,80);
			g.drawString( ID ,50, y );
		}
	}

	public void run( ) {
		while ( t != null ){
			start( ); //(9)
			try {
			Thread.sleep (20); //(10)
			} catch (InterruptedException e){
				break ; //(11)
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button ){ //(12)
		b = true ;
		name = textFieldName.getText(); //(13)
		ID = textFieldID.getText();
		}
	}
}
