/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abc.poo.unidad03_01;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author Sebastián Jara
 */
public class JFrameFL extends JFrame {

    private List<JPanel> jPanelList;

    public JFrameFL() throws HeadlessException {

        this.setTitle("FlowLayout");
        this.setSize(643, 80);
        this.setLocation(463, 272);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.setContentPane(this.jPanelList.get(5));
        this.setVisible(true);
    }

    public void iniciarPaneles() {
        
        this.jPanelList = new ArrayList<>();
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.lightGray);
        this.jPanelList.get(0).setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        this.jPanelList.get(0).add(new JLabel("Button 1"));
        this.jPanelList.get(0).setBounds(new Rectangle(3, 3, 105, 35));

        this.jPanelList.get(1).setBackground(Color.lightGray);
        this.jPanelList.get(1).setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        this.jPanelList.get(1).add(new JLabel("2"));
        this.jPanelList.get(1).setBounds(new Rectangle(110, 3, 70, 35));

        this.jPanelList.get(2).setBackground(Color.lightGray);
        this.jPanelList.get(2).add(new JLabel("Button 3"));
        this.jPanelList.get(2).setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        this.jPanelList.get(2).setBounds(new Rectangle(183, 3, 105, 35));

        this.jPanelList.get(3).setBackground(Color.lightGray);
        this.jPanelList.get(3).add(new JLabel("Long-named button 4"));
        this.jPanelList.get(3).setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        this.jPanelList.get(3).setBounds(new Rectangle(289, 3, 230, 35));

        this.jPanelList.get(4).setBackground(Color.lightGray);
        this.jPanelList.get(4).add(new JLabel("Button 5"));
        this.jPanelList.get(4).setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        this.jPanelList.get(4).setBounds(new Rectangle(519, 3, 105, 35));

        this.jPanelList.get(5).setLayout(null);
        
        this.jPanelList.get(5).add(this.jPanelList.get(0));
        this.jPanelList.get(5).add(this.jPanelList.get(1));
        this.jPanelList.get(5).add(this.jPanelList.get(2));
        this.jPanelList.get(5).add(this.jPanelList.get(3));
        this.jPanelList.get(5).add(this.jPanelList.get(4));

    }
}
