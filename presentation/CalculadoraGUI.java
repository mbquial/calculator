import javax.swing.*;
import java.awt.*;

public class CalculadoraGUI extends JFrame{
    private int width, height;
    private String num1, num2, op;
    private float a, b;
    
    private Calculadora calculadora;
    
    private JButton oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton, nineButton, zeroButton, dotButton, equalButton, addButton, minusButton, multButton, divButton, parenLeftButton, parenRightButton, percentageButton, acButton;
    private JPanel buttonPanel;
    private JTextField numbersField;
    

    public CalculadoraGUI(){
        prepareElements();
        prepareActions();
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

        calculadora = new Calculadora();

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

    private void prepareActions(){
        prepareNumbersActions();
        prepareOperationActions();
        prepareSpecialActions();
    }

    private void prepareNumbersActions(){
        oneButton.addActionListener(e -> {
            String actualNumber = numbersField.getText();
            numbersField.setText(actualNumber + "1");
        });

        twoButton.addActionListener(e -> {
            String actualNumber = numbersField.getText();
            numbersField.setText(actualNumber + "2");
        });

        threeButton.addActionListener(e -> {
            String actualNumber = numbersField.getText();
            numbersField.setText(actualNumber + "3");
        });
        
        fourButton.addActionListener(e -> {
            String actualNumber = numbersField.getText();
            numbersField.setText(actualNumber + "4");
        });

        fiveButton.addActionListener(e -> {
            String actualNumber = numbersField.getText();
            numbersField.setText(actualNumber + "5");
        });

        sixButton.addActionListener(e -> {
            String actualNumber = numbersField.getText();
            numbersField.setText(actualNumber + "6");
        });

        sevenButton.addActionListener(e -> {
            String actualNumber = numbersField.getText();
            numbersField.setText(actualNumber + "7");
        });

        eightButton.addActionListener(e -> {
            String actualNumber = numbersField.getText();
            numbersField.setText(actualNumber + "8");
        });

        nineButton.addActionListener(e -> {
            String actualNumber = numbersField.getText();
            numbersField.setText(actualNumber + "9");
        });

        zeroButton.addActionListener(e -> {
            String actualNumber = numbersField.getText();
            numbersField.setText(actualNumber + "0");
        });

        dotButton.addActionListener(e -> {
            String actualNumber = numbersField.getText();
            if (actualNumber.isEmpty()){
                numbersField.setText("0.");
            } else if (!actualNumber.substring(actualNumber.length() - 1).equals(".") && !actualNumber.contains(".")) {
                numbersField.setText(actualNumber + ".");
            } else {
                return;
            }
        });
    }

    private void prepareSpecialActions(){
        acButton.addActionListener(e -> {
            numbersField.setText("");
            num1 = "";
            num2 = "";
        });

        equalButton.addActionListener(e -> {
            try {
                num2 = numbersField.getText();
                b = Float.parseFloat(num2);
                float partialAns = switch (op) {
                    case "+" -> calculadora.add(a,b);
                    case "-" -> calculadora.minus(a,b);
                    case "*" -> calculadora.times(a,b);
                    case "/" -> calculadora.div(a,b);
                    default -> 0f;
                };
                String answer = Float.toString(partialAns);
                numbersField.setText(answer);
            } catch (ArithmeticException ex) {
                numbersField.setText("Error: " + ex.getMessage());
            }
        });
 
        // Aquí falta tener en cuenta que si se abre paréntesis, se cierre
        //parenLeftButton.addActionListener(e -> {
            //String actualNumber = numbersField.getText();
            //numbersField.setText(actualNumber + "(");
        //});
        
        // Aquí falta tener en cuenta que si se cierra paréntesis, debo tener uno de inicio
        //parenRightButton.addActionListener(e -> {
            //String actualNumber = numbersField.getText();
            //numbersField.setText(actualNumber + ")");
        //});
    }

    private void prepareOperationActions(){
        addButton.addActionListener(e -> {
            num1 = numbersField.getText();
            a = Float.parseFloat(num1);
            op = "+";
            numbersField.setText("");
        });

        minusButton.addActionListener(e -> {
            num1 = numbersField.getText();
            if (num1.isEmpty()){
                numbersField.setText("-");
            } else {
                a = Float.parseFloat(num1);
                op = "-";
                numbersField.setText("");
            }
        });

        multButton.addActionListener(e -> {
            num1 = numbersField.getText();
            a = Float.parseFloat(num1);
            op = "*";
            numbersField.setText("");
        });

        divButton.addActionListener(e -> {
            num1 = numbersField.getText();
            a = Float.parseFloat(num1);
            op = "/";
            numbersField.setText("");
        });

        percentageButton.addActionListener(e -> {
            try {
                num1 = numbersField.getText();
                a = Float.parseFloat(num1);
                float partialAns = calculadora.percentage(a);
                String answer = Float.toString(partialAns);
                numbersField.setText(answer);
            } catch (ArithmeticException ex) {
                numbersField.setText("Error: " + ex.getMessage());
            }
        });
    }

    public static void main(String[] args){
        CalculadoraGUI gui = new CalculadoraGUI();
        gui.setVisible(true);
    }
}
