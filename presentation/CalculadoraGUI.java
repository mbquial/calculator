//import domain.src.Calculadora;
import javax.swing.*;
import java.awt.*;

public class CalculadoraGUI extends JFrame{
    private int width, height;
    
    private JButton oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton, nineButton, zeroButton, dotButton, equalButton, addButton, minusButton, multButton, divButton, parenLeftButton, parenRightButton, percentageButton, acButton;
    private JPanel buttonPanel;
    private JTextField numbersField;
    

    public CalculadoraGUI(){
        prepareElements();
        //prepareActions();
    }

    private void prepareElements(){
        setTitle("Calculadora");
        Dimension dimensions = Toolkit.getDefaultToolkit().getScreenSize();
        width = dimensions.width/5;
        height = dimensions.height/2;
        setSize(width, height);
        setLocation((dimensions.width - width)/6, (dimensions.height - height)/6);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5,4));

        oneButton = new JButton("1");
        twoButton = new JButton("2");
        threeButton = new JButton("3");
        fourButton = new JButton("4");
        fiveButton = new JButton("5");
        sixButton = new JButton("6");
        sevenButton = new JButton("7");
        eightButton = new JButton("8");
        nineButton = new JButton("9");
        zeroButton = new JButton("0");
        dotButton = new JButton(",");
        addButton = new JButton("+");
        minusButton = new JButton("-");
        multButton = new JButton("X");
        divButton = new JButton("/"); 
        equalButton = new JButton("=");
        parenLeftButton = new JButton("(");
        parenRightButton = new JButton(")");
        percentageButton = new JButton("%");
        acButton = new JButton("AC");

        buttonPanel.add(parenLeftButton);
        buttonPanel.add(parenRightButton);
        buttonPanel.add(percentageButton);
        buttonPanel.add(acButton);
        
        buttonPanel.add(sevenButton);
        buttonPanel.add(eightButton);
        buttonPanel.add(nineButton);
        buttonPanel.add(divButton);

        buttonPanel.add(fourButton);
        buttonPanel.add(fiveButton);
        buttonPanel.add(sixButton);
        buttonPanel.add(multButton);

        buttonPanel.add(oneButton);
        buttonPanel.add(twoButton);
        buttonPanel.add(threeButton);
        buttonPanel.add(minusButton);

        buttonPanel.add(zeroButton);
        buttonPanel.add(dotButton);
        buttonPanel.add(equalButton);
        buttonPanel.add(addButton);

        numbersField = new JTextField();
        numbersField.setEditable(false);
        numbersField.setFont(new Font("Arial", Font.BOLD, 24));
        numbersField.setHorizontalAlignment(JTextField.RIGHT);

        setLayout(new BorderLayout());
        add(numbersField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }
    public static void main(String[] args){
        CalculadoraGUI gui = new CalculadoraGUI();
        gui.setVisible(true);
    }
}
