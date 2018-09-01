package hr.fer.oop.swing.example1;

import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FirstWindow extends JFrame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {

				@Override
				public void run() {
					FirstWindow window = new FirstWindow();
					window.setLocation(20, 20);
					window.setVisible(true);
				}
			});
		} catch (InvocationTargetException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
