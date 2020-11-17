package notes;

import java.awt.FlowLayout;
import java.text.ParseException;

import javax.swing.BoxLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class MainClass {
  public static void main(String args[]) throws Exception {
    JFrame frame = new JFrame("Mask Input");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label;
    JFormattedTextField input;
    JPanel panel;
    MaskFormatter formatter;

    try {
      label = new JLabel("US Phone");
      formatter = new MaskFormatter("'(###')' ###'-####");
      formatter.setPlaceholderCharacter('*');
      input = new JFormattedTextField(formatter);
      input.setColumns(20);
      panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      panel.add(label);
      panel.add(input);
      frame.add(panel);
    } catch (ParseException e) {
      System.err.println("Unable to add Phone");
    }

    frame.pack();
    frame.setVisible(true);
  }

}
