package Engine;

import javax.swing.JFrame;
import javax.swing.JPanel;

//���� ����� ����� ��������� ����
public class Gui_Factory {
	
	public static JFrame Kappa = new JFrame("Kappa");//������� ������ ������ JFrame
	
	public static void createWindow() {
		
		Kappa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�������, ��� ��������� ����������� ��� �������� ����
		
		Kappa.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		Kappa.setVisible(true);//��� � ��� ����(Okno delayetsya visibilnim)
		
	}
	
	public static void createPanel() {
		
		JPanel Panel = new JPanel();
		
		Panel.setSize(Kappa.getSize().width, Kappa.getSize().height);
		
		Kappa.add(Panel);
		
	}
	
	public static JPanel createPanel(int x, int y) {
		
		JPanel Panel = new JPanel();
		
		Panel.setSize(Coord.getSizeBig(x), Coord.getSizeBig(y));
		
		Kappa.add(Panel);
		
		return Panel;
		
	}

}
