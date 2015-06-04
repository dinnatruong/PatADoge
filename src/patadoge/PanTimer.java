package patadoge;

import javax.swing.*;

public class PanTimer extends JPanel // panel definition
{
    int nTimer;
    String sTimer;
    private JLabel lblCount;

    public PanTimer() {
        lblCount = new JLabel("0");
        add(lblCount);
        
    }
    void UpdateLabel(int _nTimer) {
        nTimer = _nTimer;
        sTimer = Integer.toString(nTimer);
        lblCount.setText(sTimer);
    }
}