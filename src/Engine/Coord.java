/**
 * 
 */
package Engine;

import java.awt.*;

import javax.swing.JPanel;

import Engine.Gui_Factory;

/**
 * @author ����
 *��� ����� ����������� ������� �����
 */
public class Coord {

		public static void Draw_Grid(int x, int y ,int z) {
			
			JPanel Panel = new JPanel();//������� ������� ��� ���������
			Panel.setBackground(Color.getHSBColor(x, y, z));//������ ���� ����
			Panel.setLayout(new FlowLayout());//����� ����
			
			Gui_Factory.Kappa.add(Panel);//��������� � ������� ���� ��������� ������ �������

		}

}
