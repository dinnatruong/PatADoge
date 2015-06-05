package patadoge;

import java.awt.Color;
import javax.swing.*;

public class PanScore extends JPanel // scoreboard
{

    private JLabel lblScore;
    int nScore;
    PanDisp panDisp;
    String sScore;

    public PanScore(PanDisp _panDisp) {
        panDisp = _panDisp;
        lblScore = new JLabel("Score");
        add(lblScore);
        this.setBackground(new Color(248, 190, 169));
    }
    
    void UpdateLabel(int _nScore) {
        nScore = _nScore;
        sScore = Integer.toString(nScore);
        lblScore.setText(sScore);
    }
}