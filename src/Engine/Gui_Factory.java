package Engine;

import javax.swing.JFrame;

//���� ����� ����� ��������� ����
public class Gui_Factory {
	
	public static JFrame Kappa = new JFrame("Kappa");//������� ������ ������ JFrame
	
	public static void createWindow() {
		
		Kappa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�������, ��� ��������� ����������� ��� �������� ����
		Kappa.setLayout(null);
		Kappa.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		Kappa.setVisible(true);//��� � ��� ����(Okno delayetsya visibilnim)
		
	}

}
