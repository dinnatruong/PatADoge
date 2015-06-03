package patadoge;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanOut extends JPanel {

    ImageIcon imgHeader;
    JButton btnHeader;

    public PanOut() {
        btnHeader = new JButton();
        imgHeader = new ImageIcon("dogeheader.jpg");
        imgHeader.getImage();


        btnHeader.setIcon(imgHeader);
        add(btnHeader);


    }
    /*

     private BufferedImage newHdr;

     public PanOut() {
     try {                
     newHdr = ImageIO.read(new File("dogeheader.jpg"));
     } catch (IOException ex) {
     // handle exception...
     }
     }

     @Override
     protected void paintComponent(Graphics g) {
     super.paintComponent(g);
     g.drawImage(newHdr, 0, 0, null);        
     }*/
}