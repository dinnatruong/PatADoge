package patadoge;

import javax.swing.*;

public class PanScore extends JPanel // panel definition
{

    private JLabel lblScore;

    public PanScore() {
        lblScore = new JLabel("Score");
        add(lblScore);
    }
}