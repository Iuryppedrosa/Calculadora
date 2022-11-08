package Calculadora.Visao;

import Calculadora.Modelo.Memoria;
import Calculadora.Modelo.MemoriaObservador;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements MemoriaObservador
{
    private final JLabel label;
    public Display()
    {
        Memoria.getInstancia().adicionarObversavodr(this);

        setBackground(new Color(46, 49, 50));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT,10, 25));

        add(label);
    }

    @Override
    public void valorAlterado(String novoValor)
    {
        label.setText(novoValor);
    }
}
