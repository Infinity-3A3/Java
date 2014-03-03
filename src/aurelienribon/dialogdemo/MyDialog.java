package aurelienribon.dialogdemo;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Aurelien Ribon | http://www.aurelienribon.com/
 */
public class MyDialog extends JDialog {
	public MyDialog(JFrame parent) {
		super(parent, true);

		setUndecorated(true);
		AWTUtilities.setWindowOpaque(this, false);

		

		JLabel label = new JLabel();
		label.setForeground(Color.WHITE);
		label.setFont(new Font(label.getFont().getFontName(), Font.PLAIN, 20));

		JPanel panel = new JPanel(new GridBagLayout());
		panel.setBackground(new Color(0xAA05579));
		panel.setLayout(new GridBagLayout());
		panel.add(label);
		panel.setPreferredSize(new Dimension(400, 300));

		// the following two lines are only needed because there is no
		// focusable component in here, and the "hit espace to close" requires
		// the focus to be in the dialog. If you have a button, a textfield,
		// or any focusable stuff, you don't need these lines.
		panel.setFocusable(true);
		panel.requestFocusInWindow();


		SwingUtils.createDialogBackPanel(this, parent.getContentPane());
		SwingUtils.addEscapeToCloseSupport(this, true);
	}
}
