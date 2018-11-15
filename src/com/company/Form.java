/*
 * Created by JFormDesigner on Thu Nov 15 16:24:04 EET 2018
 */

package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author joseph tsoutsouki
 */
public class Form extends JFrame {
    public Form() {
        initComponents();
    }
    double sum=0;
    double price=0;



    private void milskhakeActionPerformed(ActionEvent e) {
        price = 1.80;
        sum=sum+price;
    }

    private void appleActionPerformed(ActionEvent e) {
        price = 1.80;
        sum=sum+price;
    }

    private void teaActionPerformed(ActionEvent e) {
        price = 1.80;
        sum=sum+price;
    }

    private void HamericanoActionPerformed(ActionEvent e) {
        price = 1.80;
        sum=sum+price;
    }

    private void frappeActionPerformed(ActionEvent e) {
        price = 1.80;
        sum=sum+price;
    }

    private void FcapActionPerformed(ActionEvent e) {
        price = 1.80;
        sum=sum+price;
    }
    private void frsActionPerformed(ActionEvent e) {
        // TODO add your code here
        price = 1.80;
        sum=sum+price;

    }

    private void AmericanioActionPerformed(ActionEvent e) {
        price = 1.50;
        sum=sum+price;
    }

    private void CapuccinoActionPerformed(ActionEvent e) {
        // TODO add your code here
        price = 2.50;
        sum=sum+price;
    }

    private void orangeActionPerformed(ActionEvent e) {
        // TODO add your code here
        price  = 3.00;
        sum=sum+price;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - totis96
        dialogPane = new JPanel();
        Panel = new JPanel();
        frs = new JButton();
        Americanio = new JButton();
        Capuccino = new JButton();
        orange = new JButton();
        apple = new JButton();
        frappe = new JButton();
        milskhake = new JButton();
        tea = new JButton();
        Fcap = new JButton();
        Hamericano = new JButton();
        buttonBar = new JPanel();
        okButton = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));

            // JFormDesigner evaluation mark
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), dialogPane.getBorder())); dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            dialogPane.setLayout(new BorderLayout());

            //======== Panel ========
            {

                //---- frs ----
                frs.setText("1.80");
                frs.addActionListener(e -> frsActionPerformed(e));

                //---- Americanio ----
                Americanio.setText("text");

                //---- Capuccino ----
                Capuccino.setText("text");

                //---- orange ----
                orange.setText("text");

                //---- apple ----
                apple.setText("text");
                apple.addActionListener(e -> appleActionPerformed(e));

                //---- frappe ----
                frappe.setText("text");
                frappe.addActionListener(e -> frappeActionPerformed(e));

                //---- milskhake ----
                milskhake.setText("text");
                milskhake.addActionListener(e -> milskhakeActionPerformed(e));

                //---- tea ----
                tea.setText("text");
                tea.addActionListener(e -> teaActionPerformed(e));

                //---- Fcap ----
                Fcap.setText("text");
                Fcap.addActionListener(e -> FcapActionPerformed(e));

                //---- Hamericano ----
                Hamericano.setText("text");
                Hamericano.addActionListener(e -> HamericanoActionPerformed(e));

                GroupLayout PanelLayout = new GroupLayout(Panel);
                Panel.setLayout(PanelLayout);
                PanelLayout.setHorizontalGroup(
                    PanelLayout.createParallelGroup()
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addGroup(PanelLayout.createParallelGroup()
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGap(119, 119, 119)
                                    .addComponent(frs)
                                    .addGap(190, 190, 190)
                                    .addComponent(milskhake))
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGap(138, 138, 138)
                                    .addComponent(Americanio))
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGap(163, 163, 163)
                                    .addComponent(Capuccino))
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGap(183, 183, 183)
                                    .addComponent(orange)))
                            .addContainerGap(214, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                            .addGap(0, 299, Short.MAX_VALUE)
                            .addGroup(PanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                    .addComponent(apple)
                                    .addGap(302, 302, 302))
                                .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                    .addComponent(frappe)
                                    .addGap(223, 223, 223))
                                .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                    .addComponent(tea)
                                    .addGap(169, 169, 169))
                                .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                    .addComponent(Fcap)
                                    .addGap(184, 184, 184))
                                .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                    .addComponent(Hamericano)
                                    .addGap(206, 206, 206))))
                );
                PanelLayout.setVerticalGroup(
                    PanelLayout.createParallelGroup()
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addGroup(PanelLayout.createParallelGroup()
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(frs))
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(milskhake)))
                            .addGap(35, 35, 35)
                            .addComponent(Americanio)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(apple)
                            .addGap(7, 7, 7)
                            .addComponent(tea)
                            .addGap(23, 23, 23)
                            .addComponent(Capuccino)
                            .addGap(24, 24, 24)
                            .addComponent(Fcap)
                            .addGap(18, 18, 18)
                            .addComponent(frappe)
                            .addGap(3, 3, 3)
                            .addComponent(orange)
                            .addGap(35, 35, 35)
                            .addComponent(Hamericano)
                            .addContainerGap(124, Short.MAX_VALUE))
                );
            }
            dialogPane.add(Panel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0};

                //---- okButton ----
                okButton.setText("OK");
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - totis96
    private JPanel dialogPane;
    private JPanel Panel;
    private JButton frs;
    private JButton Americanio;
    private JButton Capuccino;
    private JButton orange;
    private JButton apple;
    private JButton frappe;
    private JButton milskhake;
    private JButton tea;
    private JButton Fcap;
    private JButton Hamericano;
    private JPanel buttonBar;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
