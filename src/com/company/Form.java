/*
 * Created by JFormDesigner on Thu Nov 15 16:24:04 EET 2018
 */

package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

/**
 * @author joseph tsoutsouki
 */
public class Form extends JFrame {
    public Form() {
        initComponents();
    }
    double sum=0;
    double price=0;
    int counter=0;
    Vector <String> v = new Vector();
    //delete.setVisible(false);
    private void milskhakeActionPerformed(ActionEvent e) {
        price = 1.80;
        sum=sum+price;
       summ.setText(String.valueOf(sum));
        String name="Milkshake";
        v.add(name);
        informations.append("Milkshake\n");
           }

    private void appleActionPerformed(ActionEvent e) {
        price = 1.80;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Apple Juice";
        v.add(name);
        informations.append("Apple Juice\n");
    }

    private void teaActionPerformed(ActionEvent e) {
        price = 1.80;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Tea";
        v.add(name);
        informations.append("Tea\n");
    }

    private void HamericanoActionPerformed(ActionEvent e) {
        price = 1.80;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Hot Americano";
        v.add(name);
        informations.append("Hot Americano\n");
    }

    private void frappeActionPerformed(ActionEvent e) {
        price = 1.80;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Frappe";
        v.add(name);
        informations.append("Frappe\n");
    }

    private void FcapActionPerformed(ActionEvent e) {
        price = 1.80;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        informations.append("Freddo Capuccino\n");
    }
    private void frsActionPerformed(ActionEvent e) {
        delete.setVisible(true);
        price = 1.80;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Freddo Esspreso";
        v.add(name);
        informations.append("Freddo Esspreso\n");
    }

    private void AmericanoActionPerformed(ActionEvent e) {
        price = 1.50;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Americano";
        v.add(name);
        informations.append("Americano\n");
    }

    private void CapuccinoActionPerformed(ActionEvent e) {
        price = 2.50;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Cappuccino";
        v.add(name);
        informations.append("Cappuccino\n");

    }

    private void orangeActionPerformed(ActionEvent e) {

        price  = 3.00;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Orange Juice";
        v.add(name);
        informations.append("Orange Juice\n");
    }

       private void DeliveryItemStateChanged(ItemEvent e) {

        price  = 2.00;
        if(counter%2==0)
            sum=sum+price;
        else
            sum=sum-price;
        summ.setText(String.valueOf(sum));
        counter++;

    }

    private void CheckoutAction(ActionEvent e) {
        String address= JOptionPane.showInputDialog(null, "What is your address?", null);
        System.out.println(address);}

        private void deleteActionPerformed(ActionEvent e) {
            // TODO add your code here
            String name="Freddo Esspreso";
            price=1.80;
            sum=sum-price;
            summ.setText(String.valueOf(sum));
            int j=0;
            informations.setText("");
            String value = v.get(j);
            while(value!=name) {
                j++;
                value=v.get(j);
            }
            v.set(j,"delete");
           name=v.get(j);
            for (int i = 0; i < v.size(); i++) {
                value = v.get(i);
               if(value!=name) {
                   informations.append(value+"\n");
               }
            }


        }

        //String[] options = {"abc", "def", "ghi", "jkl"};
       // JOptionPane.showOptionDialog(null, "Returns the position of your choice on the array",
               // "Click a button",
                //JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);}

























    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - totis96
        dialogPane = new JPanel();
        Panel = new JPanel();
        frs = new JButton();
        Americano = new JButton();
        Capuccino = new JButton();
        orange = new JButton();
        apple = new JButton();
        frappe = new JButton();
        milskhake = new JButton();
        tea = new JButton();
        Fcap = new JButton();
        Hamericano = new JButton();
        summ = new JTextField();
        scrollPane1 = new JScrollPane();
        informations = new JTextArea();
        Delivery = new JCheckBox();
        button1 = new JButton();
        delete = new JButton();
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

                //---- Americano ----
                Americano.setText("text");
                Americano.addActionListener(e -> AmericanoActionPerformed(e));

                //---- Capuccino ----
                Capuccino.setText("text");
                Capuccino.addActionListener(e -> CapuccinoActionPerformed(e));

                //---- orange ----
                orange.setText("text");
                orange.addActionListener(e -> orangeActionPerformed(e));

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

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(informations);
                }

                //---- Delivery ----
                Delivery.setText("Delivery");
                Delivery.addItemListener(e -> DeliveryItemStateChanged(e));

                //---- button1 ----
                button1.setText("Checkout");
                button1.addActionListener(e -> CheckoutAction(e));

                //---- delete ----
                delete.setText("delete");
                delete.setVisible(false);
                delete.addActionListener(e -> deleteActionPerformed(e));

                GroupLayout PanelLayout = new GroupLayout(Panel);
                Panel.setLayout(PanelLayout);
                PanelLayout.setHorizontalGroup(
                    PanelLayout.createParallelGroup()
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addGroup(PanelLayout.createParallelGroup()
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGroup(PanelLayout.createParallelGroup()
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addComponent(summ, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addGap(100, 100, 100)
                                            .addComponent(Americano)))
                                    .addGap(327, 327, 327)
                                    .addComponent(milskhake))
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGap(163, 163, 163)
                                    .addComponent(Capuccino))
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGap(183, 183, 183)
                                    .addComponent(orange))
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGap(119, 119, 119)
                                    .addComponent(frs)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(delete)))
                            .addContainerGap(107, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                            .addGap(0, 385, Short.MAX_VALUE)
                            .addGroup(PanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                    .addComponent(frappe)
                                    .addGap(223, 223, 223))
                                .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                    .addComponent(Fcap)
                                    .addGap(184, 184, 184))
                                .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                    .addComponent(Hamericano)
                                    .addGap(206, 206, 206))))
                        .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addGroup(PanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelLayout.createParallelGroup()
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                            .addComponent(apple)
                                            .addGap(302, 302, 302))
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addGap(97, 97, 97)
                                            .addComponent(Delivery, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                            .addGap(79, 79, 79)
                                            .addComponent(button1)
                                            .addContainerGap(112, Short.MAX_VALUE))))
                                .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                    .addComponent(tea)
                                    .addGap(169, 169, 169))))
                );
                PanelLayout.setVerticalGroup(
                    PanelLayout.createParallelGroup()
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addGroup(PanelLayout.createParallelGroup()
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGroup(PanelLayout.createParallelGroup()
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addGap(172, 172, 172)
                                            .addComponent(Delivery, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                            .addComponent(button1)
                                            .addGap(88, 88, 88)))
                                    .addComponent(milskhake))
                                .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                    .addGap(161, 161, 161)
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(frs)
                                        .addComponent(delete))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(summ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(Americano)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(apple)
                            .addGap(7, 7, 7)
                            .addComponent(tea)
                            .addGap(57, 57, 57)
                            .addComponent(Capuccino)
                            .addGap(24, 24, 24)
                            .addComponent(Fcap)
                            .addGap(18, 18, 18)
                            .addComponent(frappe)
                            .addGap(3, 3, 3)
                            .addComponent(orange)
                            .addGap(35, 35, 35)
                            .addComponent(Hamericano)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }
            dialogPane.add(Panel, BorderLayout.WEST);

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
    private JButton Americano;
    private JButton Capuccino;
    private JButton orange;
    private JButton apple;
    private JButton frappe;
    private JButton milskhake;
    private JButton tea;
    private JButton Fcap;
    private JButton Hamericano;
    private JTextField summ;
    private JScrollPane scrollPane1;
    private JTextArea informations;
    private JCheckBox Delivery;
    private JButton button1;
    private JButton delete;
    private JPanel buttonBar;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
