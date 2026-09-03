package view;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Toolkit;

public class MenuFrame extends JFrame {
    private Dimension tamanhoTela;

    public MenuFrame() {
        setTitle("Snake Game - Java");
        setTamanhoTela();
        if ((tamanhoTela.width / 1.25) <= 1350 || (tamanhoTela.height / 1.25 - 40) <= 680)
            setExtendedState(JFrame.MAXIMIZED_BOTH);
        else {
            int larguraTela = (int) Math.min(1500, (tamanhoTela.width / 1.25));
            int alturaTela = (int) Math.min(1000, (tamanhoTela.height / 1.25) - 40);
            setSize(larguraTela, alturaTela);
        }
        setMinimumSize(new Dimension(1350, 680));
        setLayout(new BorderLayout());
        setVisible(true);
    }

    private void inicializarComponentes() {
    }

    private void criaSideBar() {
    }

    private void inicializarEventos() {
    }

    public ImageIcon carregaIcon(String filePath, int largura, int altura) {
        return null; // Necessário para não dar erro de compilação
    }

    public final void setTamanhoTela() {
        tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
    }
}