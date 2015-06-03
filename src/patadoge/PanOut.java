package patadoge;

import javax.swing.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PanOut extends JPanel // panel definition
{
    ImageIcon newHdr;
    int nCount;
    String sCount;
    private JLabel lblHdr;

    public PanOut() {
        newHdr = new ImageIcon("doge1.png");
        //add(lblHdr);
        newHdr.getImage();
        this.setIcon(newHdr);

    }
}