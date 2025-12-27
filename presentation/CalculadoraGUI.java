package presentation;

//import domain.src.Calculadora;
import javax.swing.*;
import java.awt.*;

public class CalculadoraGUI extends JFrame{
    private JButton oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton, nineButton, zeroButton, dotButton, equalButton, addButton, minusButton, multButton, divButton;
    private int width, height;
    
    public CalculadoraGUI(){
        prepareElements();
        //prepareActions();
    }

    private void prepareElements(){
        setTitle("Calculadora");
        Dimension dimensions = Toolkit.getDefaultToolkit().getScreenSize();
        width = dimensions.width/8;
        height = dimensions.width/4;
        setSize(width, height);
        setLocation((dimensions.width - width)/2, (dimensions.height - height)/2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        CalculadoraGUI gui = new CalculadoraGUI();
        gui.setVisible(true);
    }
}
