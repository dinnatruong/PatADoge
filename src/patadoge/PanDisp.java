package patadoge;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.*;

public class PanDisp extends JPanel implements KeyListener {

    BtnDoge btn;
    BtnDoge btn2;
    BtnDoge arBtnDoge[] = new BtnDoge[9];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    Timer timer, timerDoge;
    int nTimer;
    PanTimer panTimer;
    int ranDoge;
    int nScore;
    Random r = new Random();

    public PanDisp(PanTimer _panTimer) {
        panTimer = _panTimer;
        timer = new Timer(1000, updateTask);
        timerDoge = new Timer(1500, updateDoge); //timer to randomize doge pop ups
        nTimer = 0;
        timer.start();
        timerDoge.start();

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
        for (int i = 0; i < arBtnDoge.length; i++) {
            arBtnDoge[i] = new BtnDoge(i);
            add(arBtnDoge[i]);
            //System.out.println("Button" + i +" created");
        }
      //  randomize();
        addKeyListener(this);
    }

    //randomize doge
    public void randomize() {
            ranDoge = r.nextInt(9);
                try {
                    arBtnDoge[ranDoge].flip();
                } catch (Exception error) {               
            }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int nKey = e.getKeyCode();
        int nNewKey = nKey - 96;
        Integer value = map.get(nNewKey);
        nScore++;
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
           // randomize();
            panTimer.UpdateLabel(nTimer);
            //System.out.println(nTimer);
        }
    };
    
        ActionListener updateDoge = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            randomize();
        }
    };
    
}
