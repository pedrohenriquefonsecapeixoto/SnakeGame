package view;

import javax.swing.*;
import java.awt.*;
import jogo.Config;
import jogo.Dificuldade;
import jogo.Tamanho;
import jogo.Config;

public class MenuFrame extends JFrame {
    private Dimension tamanhoTela;
    private JButton iniciarJogoButton;
    private JButton configuracoesButton;
    private JButton sairButton;
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1350, 680));
        setLayout(new BorderLayout());
        inicializarComponentes();
        inicializarEventos();
        setVisible(true);
    }

    private void inicializarComponentes() {
        JogoFrame jogoFrame = new JogoFrame();
        ConfigFrame configFrame = new ConfigFrame();
        iniciarJogoButton=new JButton("Jogar");
        configuracoesButton=new JButton("Configurações");
        sairButton = new JButton("Sair");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,1,0,20));
        panel.setPreferredSize(new Dimension(300,250));
        panel.add(iniciarJogoButton);
        panel.add(configuracoesButton);
        panel.add(sairButton);
        JPanel painelCenter = new JPanel(new GridBagLayout());
        painelCenter.setBorder(BorderFactory.createEmptyBorder(300,0,0,0));

        painelCenter.add(panel);
        add(painelCenter, BorderLayout.CENTER);
    }

    private void inicializarEventos() {
        iniciarJogoButton.addActionListener(e -> {
            Object[] dificuldade = {"Fácil", "Médio", "Difícil","Foco"};
            int escolha = JOptionPane.showOptionDialog(this, "Escolha a dificuldade do jogo:", "Dificuldade", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, dificuldade, dificuldade[1]);
            if (escolha==0){
                System.out.println("Dificuldade escolhida: Fácil");
            }
            else if (escolha==1){
                System.out.println("Dificuldade escolhida: Médio");
            }
            else if (escolha==2){
                System.out.println("Dificuldade escolhida: Difícil");
            }
            else if (escolha==3){
                System.out.println("Dificuldade escolhida: Foco");
            }
        });        
    }

    public final void setTamanhoTela() {
        tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
    }
}