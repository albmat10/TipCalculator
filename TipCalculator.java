import java.text.NumberFormat;
import javax.swing.JOptionPane; 
public class TipCalculator {
    public static void main(String[] args) 
    {
      String input = JOptionPane.showInputDialog (null,
              "Enter the total bill");
      double bill = Double.parseDouble (input);
      input = JOptionPane.showInputDialog (null,
              "Entre the tip percentage as a decimal" 
                      + " (Example : 10% would be 0.1)");
      double percentage = Double.parseDouble (input);
      double tipAmount = bill * percentage;
      NumberFormat dollars = NumberFormat.getCurrencyInstance ();
      JOptionPane.showMessageDialog (null, "Bill amount: "
      + dollars.format(bill)
      + "\nTIp Percentage: " + percentage 
      + "\nTip: " + dollars.format(tipAmount));
    }
    
}