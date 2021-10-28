package investments;

import java.awt.event.*;
import javax.swing.*;

/** @author sak5680 */
public class InvestmentFrame extends JFrame{
    private JButton button;
    private JLabel resultLabel;
    private JLabel rateLabel;
    private JTextField rateField;
    private JTextArea textArea;
    private JPanel panel;
    private JScrollPane scrollPane;
    private double balance;
    
    private static final double INTEREST_RATE = 5;
    private static final double INITIAL_BALANCE = 1000;
    
    public InvestmentFrame(){
        balance = INITIAL_BALANCE;
        
        createComponents();
        setSize(300, 100);
        setLocation(200, 200);
    }
    
    private void createComponents(){
        button = new JButton("Add Interest");
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
        
        resultLabel = new JLabel(String.format("Balance: " + "$ %.2f", balance));
        
        rateLabel = new JLabel("Int rate: ");
        rateField = new JTextField("" + INTEREST_RATE, 5);
        textArea = new JTextArea(10, 30);
        textArea.setText(String.format("Balance: $ %.2f%n", balance));
        textArea.setEditable(false);
        scrollPane = new JScrollPane(textArea);
        
        panel = new JPanel();
        panel.add(button);
        panel.add(rateLabel);
        panel.add(rateField);
        panel.add(scrollPane);
        add(panel);
    }
    
    class AddInterestListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double rate = Double.parseDouble(rateField.getText());
            double interest = balance * rate / 100;
            balance += interest;
            textArea.append(String.format("$ %.2f %n", balance));
        }
    }
}
