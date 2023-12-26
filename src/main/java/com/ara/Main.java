package com.ara;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Chbacel");

        frame.setBounds ( 400,200,400,200 );
        frame.setDefaultCloseOperation ( JFrame.DO_NOTHING_ON_CLOSE );
        JPanel panel = new JPanel ();
        JLabel label = new JLabel ("DU LOX ES ?");
        JButton AYO = new JButton ("AYO");
        JButton VOCH = new JButton ("VOCH");
        AYO.addActionListener ( new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "ES TENCE GITEI");
            }
        } );
        panel.add ( label );
        panel.add ( AYO);
        panel.add ( VOCH );
        frame.add ( panel );
        frame.setVisible ( true );
    }
}