package aplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane; // Importando a classe JScrollPane
import entities.Champion;

public class CombatGUI extends JFrame {
    private JTextField hero1NameField;
    private JTextField hero1LifeField;
    private JTextField hero1AttackField;
    private JTextField hero1ArmorField;

    private JTextField hero2NameField;
    private JTextField hero2LifeField;
    private JTextField hero2AttackField;
    private JTextField hero2ArmorField;

    private JTextField turnField; // Campo para definir o número de turnos
    private JTextArea resultArea;

    public CombatGUI() {
        setTitle("Jogo de Combate");
        setSize(400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Campeão 1
        JLabel hero1Label = new JLabel("Campeão 1:");
        hero1Label.setBounds(20, 20, 100, 30);
        add(hero1Label);

        JLabel hero1NameLabel = new JLabel("Nome:");
        hero1NameLabel.setBounds(20, 60, 100, 30);
        add(hero1NameLabel);
        hero1NameField = new JTextField();
        hero1NameField.setBounds(120, 60, 150, 30);
        add(hero1NameField);

        JLabel hero1LifeLabel = new JLabel("Vida Inicial:");
        hero1LifeLabel.setBounds(20, 100, 100, 30);
        add(hero1LifeLabel);
        hero1LifeField = new JTextField();
        hero1LifeField.setBounds(120, 100, 150, 30);
        add(hero1LifeField);

        JLabel hero1AttackLabel = new JLabel("Ataque:");
        hero1AttackLabel.setBounds(20, 140, 100, 30);
        add(hero1AttackLabel);
        hero1AttackField = new JTextField();
        hero1AttackField.setBounds(120, 140, 150, 30);
        add(hero1AttackField);

        JLabel hero1ArmorLabel = new JLabel("Armadura:");
        hero1ArmorLabel.setBounds(20, 180, 100, 30);
        add(hero1ArmorLabel);
        hero1ArmorField = new JTextField();
        hero1ArmorField.setBounds(120, 180, 150, 30);
        add(hero1ArmorField);

        // Campeão 2
        JLabel hero2Label = new JLabel("Campeão 2:");
        hero2Label.setBounds(20, 220, 100, 30);
        add(hero2Label);

        JLabel hero2NameLabel = new JLabel("Nome:");
        hero2NameLabel.setBounds(20, 260, 100, 30);
        add(hero2NameLabel);
        hero2NameField = new JTextField();
        hero2NameField.setBounds(120, 260, 150, 30);
        add(hero2NameField);

        JLabel hero2LifeLabel = new JLabel("Vida Inicial:");
        hero2LifeLabel.setBounds(20, 300, 100, 30);
        add(hero2LifeLabel);
        hero2LifeField = new JTextField();
        hero2LifeField.setBounds(120, 300, 150, 30);
        add(hero2LifeField);

        JLabel hero2AttackLabel = new JLabel("Ataque:");
        hero2AttackLabel.setBounds(20, 340, 100, 30);
        add(hero2AttackLabel);
        hero2AttackField = new JTextField();
        hero2AttackField.setBounds(120, 340, 150, 30);
        add(hero2AttackField);

        JLabel hero2ArmorLabel = new JLabel("Armadura:");
        hero2ArmorLabel.setBounds(20, 380, 100, 30);
        add(hero2ArmorLabel);
        hero2ArmorField = new JTextField();
        hero2ArmorField.setBounds(120, 380, 150, 30);
        add(hero2ArmorField);

        // Campo para definir o número de turnos
        JLabel turnLabel = new JLabel("Número de Turnos:");
        turnLabel.setBounds(20, 420, 150, 30);
        add(turnLabel);
        turnField = new JTextField();
        turnField.setBounds(150, 420, 120, 30);
        add(turnField);

        // Botão de combate
        JButton fightButton = new JButton("Iniciar Combate");
        fightButton.setBounds(120, 460, 150, 30);
        add(fightButton);

        // Área de resultado com rolagem
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        
        // Adicionando JScrollPane para permitir rolagem
        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setBounds(20, 500, 350, 80);
        add(scrollPane);

        fightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarCombate();
            }
        });
    }

    private void iniciarCombate() {
        // Pegando dados dos campos de texto
        String hero1Name = hero1NameField.getText();
        int hero1Life = Integer.parseInt(hero1LifeField.getText());
        int hero1Attack = Integer.parseInt(hero1AttackField.getText());
        int hero1Armor = Integer.parseInt(hero1ArmorField.getText());

        String hero2Name = hero2NameField.getText();
        int hero2Life = Integer.parseInt(hero2LifeField.getText());
        int hero2Attack = Integer.parseInt(hero2AttackField.getText());
        int hero2Armor = Integer.parseInt(hero2ArmorField.getText());

        int totalTurns = Integer.parseInt(turnField.getText()); // Número de turnos

        // Criando campeões
        Champion hero1 = new Champion(hero1Name, hero1Life, hero1Attack, hero1Armor);
        Champion hero2 = new Champion(hero2Name, hero2Life, hero2Attack, hero2Armor);

        // Exibir status inicial dos campeões
        resultArea.setText("Estado Inicial:\n" + hero1.toString() + "\n" + hero2.toString() + "\n");

        // Lógica de combate
        for (int i = 0; i < totalTurns; i++) {
            if (hero1.getLife() > 0 && hero2.getLife() > 0) {
                hero1.takeDamage(hero2);
                hero2.takeDamage(hero1);
                resultArea.append("Resultado do Turno " + (i + 1) + ":\n" + hero1.toString() + "\n" + hero2.toString() + "\n");
            } else {
                break; // Sai do loop se um dos campeões estiver morto
            }
        }

        resultArea.append("FIM DO COMBATE\n");
    }

    public static void main(String[] args) {
        CombatGUI frame = new CombatGUI();
        frame.setVisible(true);
    }
}
