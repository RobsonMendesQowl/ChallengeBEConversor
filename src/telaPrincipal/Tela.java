package telaPrincipal;

import javax.swing.JFrame;

public class Tela {
    public static void main(String[] args) {
        JFrame frame = new Conversor();
        frame.setTitle("Conversor de Moedas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}