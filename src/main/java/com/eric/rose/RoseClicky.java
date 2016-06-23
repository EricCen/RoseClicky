package com.eric.rose;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by Administrator on 2016/6/23.
 */
public class RoseClicky extends JFrame {
    private Container container;
    private JButton overWall;
    private JButton audioEditor;
    private JButton word;

    public RoseClicky() {
       super("Rose Clicky");
       this.container = getContentPane();
       this.overWall = new JButton("∑≠«Ω");
       this.audioEditor = new JButton("ºÙ«–“Ù∆µ");
       this.word = new JButton("WordŒƒµµ");
       init();
    }

    private void init(){
        setSize(400, 400);
        container.setLayout(new GridLayout(2,4));
        overWall.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Runtime.getRuntime().exec("F:\\SoftWare\\∑≠«Ω\\Shadowsocks.exe");
                } catch (IOException e1) {

                }
            }
        });
        audioEditor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Runtime.getRuntime().exec("F:\\SoftWare\\SMMVSplitter_3.6.1309.3_PortableSoft\\SMMVSplitterPortable\\SMMVSplitter.exe");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        word.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft Office\\Office12\\WINWORD.EXE");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        container.add(overWall);
        container.add(audioEditor);
        container.add(word);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        RoseClicky roseClicky = new RoseClicky();
    }
}
