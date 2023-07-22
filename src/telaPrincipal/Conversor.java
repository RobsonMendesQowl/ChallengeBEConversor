package telaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Conversor extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;

    public Conversor() {
        // Configurações da janela
        setSize(300, 150);
        setLayout(new FlowLayout());

        // Componentes
        JLabel label = new JLabel("Valor em Reais (R$):");
        inputField = new JTextField(10);

        JButton convertButton = new JButton("Converter");
        resultLabel = new JLabel("Valor em Dólares ($):");

        // Ação do botão "Converter"
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double reais = Double.parseDouble(inputField.getText());
                    double dolares = reais * 0.19; // Taxa de conversão fictícia (1 Real = 0.19 Dólares)
                    resultLabel.setText("Valor em Dólares ($): " + dolares);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Digite um valor válido em Reais.");
                }
            }
        });

        // Adicionando componentes à janela
        add(label);
        add(inputField);
        add(convertButton);
        add(resultLabel);
    }
}
