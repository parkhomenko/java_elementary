package com.java.courses.swing.layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {

    private JTextArea textArea;
    private JButton button;

    public MainForm() {
        super("Basic Layouts");

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize();
        int x = screen.width;
        int y = screen.height;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize((int)Math.round(x * 0.8), (int)Math.round(y * 0.8));
        setLocationRelativeTo(null);
        setVisible(true);

        LayoutManager layoutManager = new BorderLayout(5, 5);
        setLayout(layoutManager);

        textArea = new JTextArea();
        button = new JButton("Click Me");

        Dimension textAreaSize = textArea.getPreferredSize();
        System.out.println(textAreaSize.width + ":" + textAreaSize.height);

        textAreaSize.width = 300;
        textAreaSize.height = 100;
        textArea.setPreferredSize(textAreaSize);

        //add(textArea, BorderLayout.WEST);
        add(new GridForm(), BorderLayout.WEST);
        add(button, BorderLayout.SOUTH);
        add(new Toolbar(), BorderLayout.NORTH);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //textArea.append("Some string\n");
                String str = textArea.getText();
                JOptionPane.showMessageDialog(null, str);
            }
        });
    }
}
