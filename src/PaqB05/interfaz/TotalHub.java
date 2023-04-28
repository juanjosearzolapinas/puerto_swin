package PaqB05.interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TotalHub extends JFrame{

    private JTable Hub1;
    private JTable Hub2;
    private JTable Hub3;
    private JTable Hub4;
    private JTable Hub5;
    private JPanel PanelHub;
    private JButton atrasButton;
    private VentanaPrincipal principal;

    public TotalHub(VentanaPrincipal ventanaPrincipal){

        setContentPane(PanelHub);

        setTitle("PESO TOTAL DEL HUB");

        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

        pack();

        setVisible(false);

        this.principal= ventanaPrincipal;

        atrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                principal.setContentPane(principal.miPanel);
                repaint();
            }
        });


    }

}
