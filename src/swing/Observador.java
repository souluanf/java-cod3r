package swing;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600,200);
        janela.setLayout(new FlowLayout());

        //Centralizar janela
        janela.setLocationRelativeTo(null); //Na tela do computador

        JButton botao = new JButton("Clicar!");
        janela.add(botao);

        // new ActionListener{}
        botao.addActionListener(e -> System.out.println("Evento ocorreu!"));

        janela.setVisible(true);
    }
}
