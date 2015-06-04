package patadoge;

import java.awt.Color;
import javax.swing.ImageIcon;
//import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanOut extends JPanel {

    ImageIcon imgHeader;
//    JButton btnHeader;
    JLabel lblHeader;

    public PanOut() {
          lblHeader = new JLabel();

        imgHeader = new ImageIcon("dogeheader.jpg");
        lblHeader.setIcon(imgHeader);
        add(lblHeader);
        this.setBackground(new Color(248, 190, 169));
        
//        btnHeader = new JButton();
//        imgHeader.getImage();
        //btnHeader.setIcon(imgHeader);
       // add(btnHeader);


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