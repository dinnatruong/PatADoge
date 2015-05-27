/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patadoge;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author tomkc2421
 */
public class BtnDoge extends JButton{
    ImageIcon newdoge;
    
    BtnDoge(String file){
        newdoge = new ImageIcon(file);
        newdoge.getImage();
        this.setIcon(newdoge);
        this.setBackground(new Color(248,190,169));
    }
    
}
