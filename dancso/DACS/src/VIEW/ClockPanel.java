package VIEW;

import java.awt.BorderLayout;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockPanel extends JPanel {
    private JLabel timeLabel;

    public ClockPanel() {
       
        timeLabel = new JLabel();
        timeLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); 
        timeLabel.setForeground(new Color(51,204,255));
        this.add(timeLabel, BorderLayout.CENTER);
        this.setVisible(true);
        this.setSize(175, 50);
        this.setBackground(new Color(255,255,255));
     

        new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                timeLabel.setText(formatter.format(new Date()));
            }
        }).start();
    }
   
}