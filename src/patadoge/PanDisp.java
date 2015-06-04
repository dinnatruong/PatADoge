package patadoge;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

public class PanDisp extends JPanel implements KeyListener {

    ImageIcon newdoge;
    BtnDoge btn;
    BtnDoge btn2;
    BtnDoge arBtnDoge[] = new BtnDoge[9];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    Timer timer;
    int nTimer;
    PanTimer panTimer;
    int rDoge;
    Random r = new Random();

    public PanDisp(PanTimer _panTimer) {
        //System.out.println("panDisp Created");
        panTimer = _panTimer;
        timer = new Timer(1000, updateTask);
        nTimer = 0;
        timer.start();

        setFocusable(true);
        requestFocus();
        map.put(7, 0);
        map.put(8, 1);
        map.put(9, 2);
        map.put(4, 3);
        map.put(5, 4);
        map.put(6, 5);
        map.put(1, 6);
        map.put(2, 7);
        map.put(3, 8);
        this.setLayout(new GridLayout(3, 3));
        //int i = r.nextInt(9);
        //arBtnDoge[i] = new BtnDoge(i);
        //add(arBtnDoge[i]);
        for (int i = 0; i < arBtnDoge.length; i++) {
            arBtnDoge[i] = new BtnDoge(i);
            add(arBtnDoge[i]);
            //     randomize();
            //System.out.println("Button" + i +" created");
        }
        randomize();
        addKeyListener(this);
    }

    //randomize doge
    public void randomize() {
        while(nTimer % 2 == 0) {
            rDoge = r.nextInt(9);
            if (rDoge > 1){
                break;
            }
                //System.out.println("Yah");
                try {
                    arBtnDoge[rDoge].flip();
                } catch (Exception error) {               
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        Integer index = 9;
//        map.put(index, value + 1);
        int nKey = e.getKeyCode();
        int nNewKey = nKey - 96;
        Integer value = map.get(nNewKey);
        //System.out.println(nNewKey);
        //     randomize();
        try {
            arBtnDoge[value].flip();
        } catch (Exception error) {
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    ActionListener updateTask = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            nTimer++;
            panTimer.UpdateLabel(nTimer);
            //System.out.println(nTimer);
        }
    };
}
