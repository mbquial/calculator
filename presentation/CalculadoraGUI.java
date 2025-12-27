//import domain.src.Calculadora;
import javax.swing.*;
import java.awt.*;

public class CalculadoraGUI extends JFrame{
    private int width, height;
    
    private JButton oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton, nineButton, zeroButton, dotButton, equalButton, addButton, minusButton, multButton, divButton;
    private JPanel panel;
    private GridLayout gridLayout;
    

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

        panel = new JPanel();

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
        multButton = new JButton("*"); // O podría cambiarla por X
        divButton = new JButton("/"); // O podría cambiarla por el signo que tiene las dos bolitas
        equalButton = new JButton("=");
    }
    public static void main(String[] args){
        CalculadoraGUI gui = new CalculadoraGUI();
        gui.setVisible(true);
    }
}
