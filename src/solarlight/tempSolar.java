/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarlight;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author John
 */
public class tempSolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating a frame 
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("LRC Solar Panels");
        frame.setLayout(new GridLayout(2,2));
        
        frame.add(new JLabel("b1"));
        frame.add(new JLabel("b2"));
        frame.add(new JLabel("b3"));
        frame.add(new JLabel("b4"));
        //Setting the frame to be the maximized size
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        
    }
}
