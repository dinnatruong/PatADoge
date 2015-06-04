package patadoge;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BtnDoge extends JButton {

    ImageIcon newdoge;
    ImageIcon newerdoge;
    int iFlip;
    int nNum;

    BtnDoge(int _nNum) {
        nNum = _nNum;
        iFlip = 1;
        newdoge = new ImageIcon("doge1.png");
        //setActionCommmand(sNum);
        newdoge.getImage();
        newerdoge = new ImageIcon("doge2.png");
        newerdoge.getImage();
        this.setIcon(newdoge);
        this.setBackground(new Color(252, 154, 134));
    }

    void flip() {

        if (iFlip == 1) {
            setIcon(newerdoge);
        } else {
            setIcon(newdoge);
        }
        iFlip *= -1;
    }
}