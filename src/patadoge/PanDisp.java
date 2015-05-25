/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patadoge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanDisp extends JPanel /*panel definition*/ {

    PanOut panOut;
    private JLabel lblName;
    private int nCount;
    Timer timer;

    public PanDisp(PanOut _panOut) {
        panOut = _panOut;
        timer = new Timer(1000, updateTask);
        // this Panel will contain all of the output, therefore called PanDisp for display
        // It will be in the CENTRE of PanMain
        lblName = new JLabel("Pat A Doge");
        add(lblName); //add it to the Frame
        nCount = 0;
        timer.start();
    }
    ActionListener updateTask = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            nCount++;
            panOut.UpdateLabel(nCount);
            System.out.println(nCount);
        }
    }; /*Allocate a Timer to run updateTask's actionPerformed() after every delay msec*/
}