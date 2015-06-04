package patadoge;

import java.awt.Color;
import javax.swing.*;

public class PanScore extends JPanel // panel definition
{

    private JLabel lblScore;

    public PanScore() {
        lblScore = new JLabel("Score");
        add(lblScore);
        this.setBackground(new Color(248, 190, 169));
    }
}