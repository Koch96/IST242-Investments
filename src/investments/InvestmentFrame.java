package investments;

import java.awt.event.*;
import javax.swing.*;

/** @author sak5680 */
public class InvestmentFrame extends JFrame{
    private JButton button;
    private JLabel resultLabel;
    private JPanel panel;
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
        
        panel = new JPanel();
        panel.add(button);
        panel.add(resultLabel);
        add(panel);
    }
    
    class AddInterestListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double interest = balance * INTEREST_RATE / 100;
            balance += interest;
            resultLabel.setText(String.format("Balance: " + "$ %.2f", balance));
        }
    }
}
