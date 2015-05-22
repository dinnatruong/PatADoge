/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package whackadoge;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel // panel definition
{
    PanOut panOut = new PanOut();
    PanDisp panDisp = new PanDisp(panOut);
    private PanOut PanOut;

    public PanMain() {
        // this next line tells PanMain that it has a border layout.
        setLayout(new BorderLayout());
        add(panDisp, BorderLayout.CENTER);
    }
}