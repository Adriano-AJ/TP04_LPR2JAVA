package tp04;

import javax.swing.*;
import java.awt.*;

public class TrabalhoPratico04 extends JFrame {

    private JLabel labelNomeBusca;
    private JTextField campoNomeBusca;
    private JButton botaoPesquisar;

    private JLabel labelNomeResultado;
    private JTextField campoNomeResultado;
    private JLabel labelSalarioResultado;
    private JTextField campoSalarioResultado;
    private JLabel labelCargoResultado;
    private JTextField campoCargoResultado;

    private JButton botaoAnterior;
    private JButton botaoProximo;

    public TrabalhoPratico04() {
        setTitle("TRABALHO PRATICO 04");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); 

        inicializarComponentes();

        configurarLayout();

       
        pack();
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    private void inicializarComponentes() {
  
        labelNomeBusca = new JLabel("Nome:");
        campoNomeBusca = new JTextField(15);
       
        botaoPesquisar = new JButton("Pesquisar");

        labelNomeResultado = new JLabel("Nome:");
        campoNomeResultado = new JTextField("", 15);
        campoNomeResultado.setEditable(false); // Campos de resultado são geralmente não-editáveis
        
        labelSalarioResultado = new JLabel("Salário:");
        campoSalarioResultado = new JTextField("", 15);
        campoSalarioResultado.setEditable(false);

        labelCargoResultado = new JLabel("Cargo:");
        campoCargoResultado = new JTextField("", 15);
        campoCargoResultado.setEditable(false);

        botaoAnterior = new JButton("Anterior");
        botaoProximo = new JButton("Próximo");
    }

    private void configurarLayout() {
        setLayout(new BorderLayout(10, 10));
        
        JPanel painelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        painelSuperior.add(labelNomeBusca);
        painelSuperior.add(campoNomeBusca);
        
        add(painelSuperior, BorderLayout.NORTH);
        
        JPanel painelBotaoPesquisa = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        painelBotaoPesquisa.add(botaoPesquisar);
        
        JPanel painelResultado = new JPanel(new GridLayout(3, 2, 5, 5)); 
        painelResultado.add(labelNomeResultado);
        painelResultado.add(campoNomeResultado);
        painelResultado.add(labelSalarioResultado);
        painelResultado.add(campoSalarioResultado);
        painelResultado.add(labelCargoResultado);
        painelResultado.add(campoCargoResultado);

        JPanel painelMiolo = new JPanel();
        painelMiolo.setLayout(new BoxLayout(painelMiolo, BoxLayout.Y_AXIS));
        painelMiolo.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        
        painelBotaoPesquisa.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        painelMiolo.add(painelBotaoPesquisa);
  
        painelMiolo.add(Box.createRigidArea(new Dimension(0, 10)));
        painelMiolo.add(painelResultado);
        
        add(painelMiolo, BorderLayout.CENTER);

        JPanel painelNavegacao = new JPanel(new GridLayout(1, 2, 5, 0)); 
        painelNavegacao.add(botaoAnterior);
        painelNavegacao.add(botaoProximo);

        add(painelNavegacao, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TrabalhoPratico04());
    }
}
