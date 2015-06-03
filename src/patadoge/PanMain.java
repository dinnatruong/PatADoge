package patadoge;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel // panel definition
{
    PanOut panOut = new PanOut();
    PanDisp panDisp = new PanDisp(panOut);
    PanScore panScore = new PanScore();
    PanTimer panTimer = new PanTimer();
    PanRules panRules = new PanRules();
    //private PanOut PanOut;
    //private PanScore PanScore;

    public PanMain() {
        // this next line tells PanMain that it has a border layout.
        setLayout(new BorderLayout());
        add (panOut, BorderLayout.NORTH);
        add(panDisp, BorderLayout.CENTER);
        add(panScore, BorderLayout.EAST);
        add (panTimer, BorderLayout.WEST);
        add (panRules, BorderLayout.SOUTH);            
    }
}