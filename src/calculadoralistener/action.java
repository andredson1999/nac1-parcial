
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculadoraListener implements ActionListener, MouseListener {

	private JTextField txtNumero1;
	private JTextField txtNumero2;

	public CalculadoraListener(JTextField txtNumero1, JTextField txtNumero2) {
		this.txtNumero1 = txtNumero1;
		this.txtNumero2 = txtNumero2;
		//TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int numero1 = Integer.valueOf( txtNumero1.getText() );
		int numero2 = Integer.valueOf( txtNumero2.getText2);
		int soma = numero1 + numero2;

		JOptionPane.showMessageDialog(null, "Soma vale " + soma);
		System.out.println(numero1);
	}

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}