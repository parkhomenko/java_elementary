package com.java.courses.swing.layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridForm extends JPanel {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    public GridForm() {
        Dimension dimension = new Dimension();
        dimension.width = 100;
        dimension.height = 100;

        button1 = new JButton("Button 1");
        button1.setPreferredSize(dimension);

        button2 = new JButton("Button 2");
        button2.setPreferredSize(dimension);

        button3 = new JButton("Button 3");
        button3.setPreferredSize(dimension);

        button4 = new JButton("Button 4");
        button4.setPreferredSize(dimension);

        button5 = new JButton("Button 5");
        button5.setPreferredSize(dimension);

        button6 = new JButton("Button 6");
        button6.setPreferredSize(dimension);

        button7 = new JButton("Button 7");
        button7.setPreferredSize(dimension);

        button8 = new JButton("Button 8");
        button8.setPreferredSize(dimension);

        button9 = new JButton("Button 9");
        button9.setPreferredSize(dimension);

        LayoutManager layoutManager = new GridBagLayout();
        setLayout(layoutManager);

        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 0;
        add(button1, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        add(button2, gc);

        gc.gridx = 2;
        gc.gridy = 0;
        add(button3, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        add(button4, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        add(button5, gc);

        gc.gridx = 2;
        gc.gridy = 1;
        add(button6, gc);

        gc.gridx = 0;
        gc.gridy = 2;
        add(button7, gc);

        gc.gridx = 1;
        gc.gridy = 2;
        add(button8, gc);

        gc.gridx = 2;
        gc.gridy = 2;
        add(button9, gc);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText("X");
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button5.setText("O");
            }
        });
    }
}
