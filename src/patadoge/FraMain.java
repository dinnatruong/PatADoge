package patadoge;

import javax.swing.JFrame;

public class FraMain extends JFrame {

    FraMain() {
        PanMain panMain = new PanMain();
        setSize(600, 700);
        setTitle("Pat A Doge");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panMain);
        setVisible(true);

    }
}