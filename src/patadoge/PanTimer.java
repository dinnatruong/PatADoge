package patadoge;

import java.awt.Color;
import javax.swing.*;

public class PanTimer extends JPanel // timer
{

    int nTimer;
    String sTimer;
    private JLabel lblCount;

    public PanTimer() {
        lblCount = new JLabel("0");
        add(lblCount);
        this.setBackground(new Color(248, 190, 169));
    }

    void UpdateLabel(int _nTimer) {
        nTimer = _nTimer;
        sTimer = Integer.toString(nTimer);
        lblCount.setText(sTimer);
    }
}