package patadoge;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanRules extends JPanel // panel definition
{
    JButton btnRules;

    public PanRules() {
        
        btnRules = new JButton("Rules");
        add(btnRules);
        AL rules = new AL();
        btnRules.addActionListener(rules);
    }

    class AL implements ActionListener {
        private Component frame;

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "[insert rules here]");
        }
    }
}