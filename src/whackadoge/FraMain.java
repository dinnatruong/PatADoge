/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whackadoge;

import javax.swing.JFrame;

public class FraMain extends JFrame {

    FraMain() {
        PanMain panMain = new PanMain();
        setSize(400, 400);
        setTitle("Pat A Doge");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panMain);
        setVisible(true);

    }
}