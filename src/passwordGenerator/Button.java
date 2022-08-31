package passwordGenerator;

import javax.swing.JFrame;

public class Button extends JFrame {
	private boolean selected = false;
	private String mnemonic;
	
	public Button(boolean selected, String mnemonic) {
		super();
		this.selected = selected;
		this.mnemonic = mnemonic;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
