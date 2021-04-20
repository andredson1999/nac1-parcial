import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;


public class App {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		JFrame janela = new JFrame("fiap movies");
		janela.setLayout(new FlowLayout());

		JPanel panel = new JPanel(new FlowLayout());
		
		JLabel label = new MeuLabel("Bem vindo");
		panel.add(label);
		
		JTextField text = new JTextField();
		text.setPreferredSize(new Dimension(200, 30));
		text.setBorder(BorderFactory.criar());
		panel.add(text);
		
		JTextArea descricao = new JTextArea();
		descricao.setColumns(30);
		descricao.setRows(10);
		descricao.setBorder(BorderFactory.criar());
		panel.add(descricao);
		
		JCheckBox checkBox = new JCheckBox("Aceito os termos");
		panel.add(checkBox);
		
		janela.add(panel, BorderLayout.CENTER);
		janela.add(new JButton("Salvar"), BorderLayout.SOUTH);

		

		RadioGroup radioGroup = new RadioGroup(List.of("netfix", "prime video", "pirate bay"));
		janela.add(radioGroup);


		janela.add(new RadioGroup(List.of("Residencial", "Comercial", "Celular")));

		janela.add(buttonnetfix);
		janela.add(buttonprime video);
		janela.add(buttonpirate bay);
		

		janela.add(new StarRater(5, 2));


		janela.setSize(600, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
}