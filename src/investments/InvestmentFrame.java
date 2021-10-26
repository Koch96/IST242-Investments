package investments;

import javax.swing.*;

/** @author sak5680 */
public class InvestmentFrame extends JFrame{
    private JButton button;
    private JLabel label;
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
}
