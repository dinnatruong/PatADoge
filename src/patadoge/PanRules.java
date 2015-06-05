package patadoge;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanRules extends JPanel // displays rules if button is clicked
{
    JButton btnRules;

    public PanRules() {
        
        btnRules = new JButton("Rules");
        btnRules.setFocusable(false);
        add(btnRules);
        AL rules = new AL();
        btnRules.addActionListener(rules);
        this.setBackground(new Color(248, 190, 169));
    }

    class AL implements ActionListener {
        private Component frame;

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "Use your numpad to pat the"
                    + " doges before they disappear. If you collect"
                    + " sufficient points in 15 seconds you'll move onto the"
                    + " next level. \n WARNING: MAKE SURE NUMLOCK IS ON. DO NOT CLICK THE DOGES!!");
        }
    }
}