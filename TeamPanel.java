package com.example.jframe;

import java.awt.*;
import javax.swing.*;

public class TeamPanel extends JPanel {
    JLabel teamnamelab = new JLabel();
    Font teamfont = new Font("Ravie", Font.BOLD, 32);
    FlowLayout flow = new FlowLayout();

    public TeamPanel(Color bg, Color fg, String teamname)
    {
        setBackground(bg);
        setLayout(flow);
        teamnamelab.setForeground(fg);
        teamnamelab.setFont(teamfont);
        teamnamelab.setText(teamname);
        add(teamnamelab);
    }
}
