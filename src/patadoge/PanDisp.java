package patadoge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EtchedBorder;

public class PanDisp extends JPanel /*panel definition*/ {

    PanOut panOut;
    private JLabel lblName;
    private int nCount;
    Timer timer;
    ImageIcon newdoge;
    //ImageIcon doge = new ImageIcon("doge1.png");

    public PanDisp(PanOut _panOut) {
        ImageIcon arnX[] = new ImageIcon [3];
        ImageIcon arnY[] = new ImageIcon [3];
        panOut = _panOut;
        timer = new Timer(1000, updateTask);
        // this Panel will contain all of the output, therefore called PanDisp for display
        // It will be in the CENTRE of PanMain
        //lblName = new JLabel("Pat A Doge");
        //add(lblName); //add it to the Frame
        nCount = 0;
        timer.start();
        setBackground(new Color(248,190,169));
        //doge.getImage();
        
        this.setLayout(new GridLayout(3,3));
        this.setBorder(new EtchedBorder(EtchedBorder.RAISED));
        /*for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.println("Hello");
                newdoge = new ImageIcon("doge1.png");
                newdoge.getImage();
                arnX[x] = newdoge;
                arnY[y] = newdoge;
            }
        }*/
        
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                BtnDoge btn = new BtnDoge("doge1.png");
                add(btn);

            }
        }
        
        //repaint();
    }
    ActionListener updateTask = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            nCount++;
            panOut.UpdateLabel(nCount);
            System.out.println(nCount);
        }
    };
    /*Allocate a Timer to run updateTask's actionPerformed() after every delay msec*/

   /* @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(newdoge.getImage(), 5, 2, null);
        System.out.println("sdfkujhgid");
    }*/
}