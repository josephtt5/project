/*
 * Created by JFormDesigner on Thu Nov 15 16:24:04 EET 2018
 */

package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.util.Vector;

/**
 * @author joseph tsoutsouki
 */
public class Form extends JFrame {
    public Form() {initComponents();}
    int counter=0;
    double sum=0;
    double price=0;

    Vector <String> v = new Vector();

    int del;



    private void milskhakeActionPerformed(ActionEvent e) {
        dvmilkshake.setVisible(true);
        price = 2.50;
        sum=sum+price;
       summ.setText(String.valueOf(sum));
        String name="Milkshake Vanilla";
        v.add(name);
        informations.append("Milkshake Vanilla\n");
           }

    private void cmilkshakeActionPerformed(ActionEvent e) {
        dcmilkshake.setVisible(true);
        price = 2.50;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Milkshake Chocolate";
        v.add(name);
        informations.append("Milkshake Chocolate\n");
    }
    private void appleActionPerformed(ActionEvent e) {
        dapple.setVisible(true);
        price = 1.80;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Apple Juice";
        v.add(name);
        informations.append("Apple Juice\n");
    }
    private void mixedActionPerformed(ActionEvent e) {
        dmixed.setVisible(true);
        price = 2.00;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Mixed Juice";
        v.add(name);
        informations.append("Mixed Juice\n");
    }

    private void teaActionPerformed(ActionEvent e) {
        dtea.setVisible(true);
        price = 1.80;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Tea";
        v.add(name);
        informations.append("Tea\n");
    }

    private void HamericanoActionPerformed(ActionEvent e) {
        dhamericano.setVisible(true);
        price = 1.80;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Hot Americano";
        v.add(name);
        informations.append("Hot Americano\n");
    }

    private void frappeActionPerformed(ActionEvent e) {
        dfrappe.setVisible(true);
        price = 1.80;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        informations.append("Frappe\n");
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
    private void latteActionPerformed(ActionEvent e) {
        dlatte.setVisible(true);
        price = 3.50;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Latte";
        v.add(name);
        informations.append("Latte\n");
    }


    private void AmericanoActionPerformed(ActionEvent e) {
        damericano.setVisible(true);
        price = 1.50;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Iced Americano";
        v.add(name);
        informations.append("Iced Americano\n");
    }

    private void CapuccinoActionPerformed(ActionEvent e) {
        dcappuccino.setVisible(true);
        price = 2.50;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Cappuccino";
        v.add(name);
        informations.append("Cappuccino\n");

    }
    private void FcappuccinoActionPerformed(ActionEvent e) {
        dfcappuccino.setVisible(true);
        price = 3.00;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Freddo Cappuccino";
        v.add(name);
        informations.append("Freddo Cappuccino\n");
    }
    private void macchiatoActionPerformed(ActionEvent e) {
        dmacchiato.setVisible(true);
        price = 3.50;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Macchiato";
        v.add(name);
        informations.append("Macchiato\n");
    }

    private void orangeActionPerformed(ActionEvent e) {
        dorange.setVisible(true);
        price  = 3.00;
        sum=sum+price;
        summ.setText(String.valueOf(sum));
        String name="Orange Juice";
        v.add(name);
        informations.append("Orange Juice\n");
    }

       private void DeliveryItemStateChanged(ItemEvent e) {

        price  = 2.00;
             if(counter%2==0) sum=sum+price;
            else sum=sum-price;

        summ.setText(String.valueOf(sum));
        counter++;
        del=1;


    }

    private void CheckoutAction(ActionEvent e) {
        if (del == 1) {
            JTextField address = new JTextField();
            JTextField name = new JTextField();
            JTextField surname = new JTextField();
            JTextField email = new JTextField();
            JTextField phone = new JTextField();
            Object[] message = {
                    "Name:", name,
                    "Surname:", surname,
                    "Address", address,
                    "E-mail:", email,
                    "Phone:", phone
            };


        JOptionPane.showConfirmDialog(null, message, "Informations", JOptionPane.OK_CANCEL_OPTION);


        String name1 = name.getText();
        String Sname1 = surname.getText();
        String adrs = address.getText();
        String eml = email.getText();
        int phn = Integer.parseInt(phone.getText());
    }
        else {
        JTextField name = new JTextField();
        JTextField surname = new JTextField();
        JTextField email = new JTextField();
        JTextField phone = new JTextField();
        Object[] message = {
                "Name:", name,
                "Surname:", surname,
                "E-mail:", email,
                "Phone:", phone
        };
        JOptionPane.showConfirmDialog(null, message, "Informations", JOptionPane.OK_CANCEL_OPTION);


        String name1 = name.getText();
        String Sname1 = surname.getText();
        String eml = email.getText();
        int phn = Integer.parseInt(phone.getText());
    }

}


    private void deleteActionPerformed(ActionEvent e) {

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
        int count=0;
        name="Freddo Esspreso";
        for (int k = 0; k < v.size(); k++) {
            value=v.get(k);
            if (value==name)
                count++;
        }
        if (count==0)
            delete.setVisible(false);



    }



    private void damericanoActionPerformed(ActionEvent e) {
        // TODO add your code here
        String name = "Iced Americano";
        price = 1.50;
        sum = sum - price;
        summ.setText(String.valueOf(sum));
        int j = 0;
        informations.setText("");
        String value = v.get(j);
        while (value != name) {
            j++;
            value = v.get(j);
        }
        v.set(j, "delete");
        name = v.get(j);
        for (int i = 0; i < v.size(); i++) {
            value = v.get(i);
            if (value != name) {
                informations.append(value + "\n");
            }
        }
        int count = 0;
        name = "Iced Americano";
        for (int k = 0; k < v.size(); k++) {
            value = v.get(k);
            if (value == name)
                count++;
        }
        if (count == 0)
            damericano.setVisible(false);

    }



    private void dhamericanoActionPerformed(ActionEvent e) {
        // TODO add your code here
        String name = "Hot Americano";
        price = 1.80;
        sum = sum - price;
        summ.setText(String.valueOf(sum));
        int j = 0;
        informations.setText("");
        String value = v.get(j);
        while (value != name) {
            j++;
            value = v.get(j);
        }
        v.set(j, "delete");
        name = v.get(j);
        for (int i = 0; i < v.size(); i++) {
            value = v.get(i);
            if (value != name) {
                informations.append(value + "\n");
            }
        }
        int count = 0;
        name = "Hot Americano";
        for (int k = 0; k < v.size(); k++) {
            value = v.get(k);
            if (value == name)
                count++;
        }
        if (count == 0)
            dhamericano.setVisible(false);
    }



    private void dcappuccinoActionPerformed(ActionEvent e) {

        String name = "Cappuccino";
        price = 2.50;
        sum = sum - price;
        summ.setText(String.valueOf(sum));
        int j = 0;
        informations.setText("");
        String value = v.get(j);
        while (value != name) {
            j++;
            value = v.get(j);
        }
        v.set(j, "delete");
        name = v.get(j);
        for (int i = 0; i < v.size(); i++) {
            value = v.get(i);
            if (value != name) {
                informations.append(value + "\n");
            }
        }
        int count = 0;
        name = "Cappuccino";
        for (int k = 0; k < v.size(); k++) {
            value = v.get(k);
            if (value == name)
                count++;
        }
        if (count == 0)
            dcappuccino.setVisible(false);
    }



    private void dfcappuccinoActionPerformed(ActionEvent e) {
        String name = "Freddo Cappuccino";
        price = 3.00;
        sum = sum - price;
        summ.setText(String.valueOf(sum));
        int j = 0;
        informations.setText("");
        String value = v.get(j);
        while (value != name) {
            j++;
            value = v.get(j);
        }
        v.set(j, "delete");
        name = v.get(j);
        for (int i = 0; i < v.size(); i++) {
            value = v.get(i);
            if (value != name) {
                informations.append(value + "\n");
            }
        }
        int count = 0;
        name = "Freddo Cappuccino";
        for (int k = 0; k < v.size(); k++) {
            value = v.get(k);
            if (value == name)
                count++;
        }
        if (count == 0)
            dfcappuccino.setVisible(false);
    }



    private void dfrappeActionPerformed(ActionEvent e) {
        String name = "Frappe";
        price = 1.80;
        sum = sum - price;
        summ.setText(String.valueOf(sum));
        int j = 0;
        informations.setText("");
        String value = v.get(j);
        while (value != name) {
            j++;
            value = v.get(j);
        }
        v.set(j, "delete");
        name = v.get(j);
        for (int i = 0; i < v.size(); i++) {
            value = v.get(i);
            if (value != name) {
                informations.append(value + "\n");
            }
        }
        int count = 0;
        name = "Frappe";
        for (int k = 0; k < v.size(); k++) {
            value = v.get(k);
            if (value == name)
                count++;
        }
        if (count == 0)
            dfrappe.setVisible(false);
    }



    private void dlatteActionPerformed(ActionEvent e) {
        String name = "Latte";
        price = 3.50;
        sum = sum - price;
        summ.setText(String.valueOf(sum));
        int j = 0;
        informations.setText("");
        String value = v.get(j);
        while (value != name) {
            j++;
            value = v.get(j);
        }
        v.set(j, "delete");
        name = v.get(j);
        for (int i = 0; i < v.size(); i++) {
            value = v.get(i);
            if (value != name) {
                informations.append(value + "\n");
            }
        }
        int count = 0;
        name = "Latte";
        for (int k = 0; k < v.size(); k++) {
            value = v.get(k);
            if (value == name)
                count++;
        }
        if (count == 0)
            dlatte.setVisible(false);
    }


    private void dmacchiatoActionPerformed(ActionEvent e) {
        String name = "Macchiato";
        price = 3.50;
        sum = sum - price;
        summ.setText(String.valueOf(sum));
        int j = 0;
        informations.setText("");
        String value = v.get(j);
        while (value != name) {
            j++;
            value = v.get(j);
        }
        v.set(j, "delete");
        name = v.get(j);
        for (int i = 0; i < v.size(); i++) {
            value = v.get(i);
            if (value != name) {
                informations.append(value + "\n");
            }
        }
        int count = 0;
        name = "Macchiato";
        for (int k = 0; k < v.size(); k++) {
            value = v.get(k);
            if (value == name)
                count++;
        }
        if (count == 0)
            dmacchiato.setVisible(false);
    }



    private void dorangeActionPerformed(ActionEvent e) {
        String name = "Orange Juice";
        price = 3.00;
        sum = sum - price;
        summ.setText(String.valueOf(sum));
        int j = 0;
        informations.setText("");
        String value = v.get(j);
        while (value != name) {
            j++;
            value = v.get(j);
        }
        v.set(j, "delete");
        name = v.get(j);
        for (int i = 0; i < v.size(); i++) {
            value = v.get(i);
            if (value != name) {
                informations.append(value + "\n");
            }
        }
        int count = 0;
        name = "Orange Juice";
        for (int k = 0; k < v.size(); k++) {
            value = v.get(k);
            if (value == name)
                count++;
        }
        if (count == 0)
            dorange.setVisible(false);
    }



    private void dappleActionPerformed(ActionEvent e) {
        String name = "Apple Juice";
        price = 1.80;
        sum = sum - price;
        summ.setText(String.valueOf(sum));
        int j = 0;
        informations.setText("");
        String value = v.get(j);
        while (value != name) {
            j++;
            value = v.get(j);
        }
        v.set(j, "delete");
        name = v.get(j);
        for (int i = 0; i < v.size(); i++) {
            value = v.get(i);
            if (value != name) {
                informations.append(value + "\n");
            }
        }
        int count = 0;
        name = "Apple Juice";
        for (int k = 0; k < v.size(); k++) {
            value = v.get(k);
            if (value == name)
                count++;
        }
        if (count == 0)
            dapple.setVisible(false);
    }



    private void dmixedActionPerformed(ActionEvent e) {
        String name = "Mixed Juice";
        price = 2.00;
        sum = sum - price;
        summ.setText(String.valueOf(sum));
        int j = 0;
        informations.setText("");
        String value = v.get(j);
        while (value != name) {
            j++;
            value = v.get(j);
        }
        v.set(j, "delete");
        name = v.get(j);
        for (int i = 0; i < v.size(); i++) {
            value = v.get(i);
            if (value != name) {
                informations.append(value + "\n");
            }
        }
        int count = 0;
        name = "Mixed Juice";
        for (int k = 0; k < v.size(); k++) {
            value = v.get(k);
            if (value == name)
                count++;
        }
        if (count == 0)
            dmixed.setVisible(false);
    }



    private void dvmilkshakeActionPerformed(ActionEvent e) {
        String name = "Milkshake Vanilla";
        price = 2.50;
        sum = sum - price;
        summ.setText(String.valueOf(sum));
        int j = 0;
        informations.setText("");
        String value = v.get(j);
        while (value != name) {
            j++;
            value = v.get(j);
        }
        v.set(j, "delete");
        name = v.get(j);
        for (int i = 0; i < v.size(); i++) {
            value = v.get(i);
            if (value != name) {
                informations.append(value + "\n");
            }
        }
        int count = 0;
        name = "Milkshake Vanilla";
        for (int k = 0; k < v.size(); k++) {
            value = v.get(k);
            if (value == name)
                count++;
        }
        if (count == 0)
            dvmilkshake.setVisible(false);
    }



    private void dcmilkshakeActionPerformed(ActionEvent e) {
        String name = "Milkshake Chocolate";
        price = 2.50;
        sum = sum - price;
        summ.setText(String.valueOf(sum));
        int j = 0;
        informations.setText("");
        String value = v.get(j);
        while (value != name) {
            j++;
            value = v.get(j);
        }
        v.set(j, "delete");
        name = v.get(j);
        for (int i = 0; i < v.size(); i++) {
            value = v.get(i);
            if (value != name) {
                informations.append(value + "\n");
            }
        }
        int count = 0;
        name = "Milkshake Chocolate";
        for (int k = 0; k < v.size(); k++) {
            value = v.get(k);
            if (value == name)
                count++;
        }
        if (count == 0)
            dcmilkshake.setVisible(false);
    }


    private void dteaActionPerformed(ActionEvent e) {
        String name = "Tea";
        price = 1.80;
        sum = sum - price;
        summ.setText(String.valueOf(sum));
        int j = 0;
        informations.setText("");
        String value = v.get(j);
        while (value != name) {
            j++;
            value = v.get(j);
        }
        v.set(j, "delete");
        name = v.get(j);
        for (int i = 0; i < v.size(); i++) {
            value = v.get(i);
            if (value != name) {
                informations.append(value + "\n");
            }
        }
        int count = 0;
        name = "Tea";
        for (int k = 0; k < v.size(); k++) {
            value = v.get(k);
            if (value == name)
                count++;
        }
        if (count == 0)
            dtea.setVisible(false);
    }

    private void hamericanoActionPerformed(ActionEvent e) {
        // TODO add your code here
    }













        //String[] options = {"abc", "def", "ghi", "jkl"};
       // JOptionPane.showOptionDialog(null, "Returns the position of your choice on the array",
               // "Click a button",
                //JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);}






















    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - andreas
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
        Hamericano = new JButton();
        summ = new JTextField();
        scrollPane1 = new JScrollPane();
        informations = new JTextArea();
        Delivery = new JCheckBox();
        button1 = new JButton();
        delete = new JButton();
        textArea1 = new JTextArea();
        textArea2 = new JTextArea();
        textArea3 = new JTextArea();
        damericano = new JButton();
        textArea4 = new JTextArea();
        textArea5 = new JTextArea();
        dhamericano = new JButton();
        textArea6 = new JTextArea();
        dcappuccino = new JButton();
        textArea7 = new JTextArea();
        Fcappuccino = new JButton();
        dfcappuccino = new JButton();
        textArea8 = new JTextArea();
        dfrappe = new JButton();
        textArea9 = new JTextArea();
        latte = new JButton();
        dlatte = new JButton();
        textArea10 = new JTextArea();
        macchiato = new JButton();
        dmacchiato = new JButton();
        textArea11 = new JTextArea();
        textArea12 = new JTextArea();
        dorange = new JButton();
        textArea13 = new JTextArea();
        textArea14 = new JTextArea();
        dapple = new JButton();
        textArea15 = new JTextArea();
        mixed = new JButton();
        dmixed = new JButton();
        textArea17 = new JTextArea();
        dvmilkshake = new JButton();
        textArea18 = new JTextArea();
        cmilkshake = new JButton();
        dcmilkshake = new JButton();
        textArea19 = new JTextArea();
        dtea = new JButton();
        Takeaway = new JCheckBox();
        buttonBar = new JPanel();
        okButton = new JButton();

        //======== this ========
        setAlwaysOnTop(true);
        setForeground(Color.red);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBackground(Color.red);

            // JFormDesigner evaluation mark
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), dialogPane.getBorder())); dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            dialogPane.setLayout(new BorderLayout());

            //======== Panel ========
            {
                Panel.setBackground(new Color(255, 51, 0));

                //---- frs ----
                frs.setText("Order");
                frs.setBackground(Color.white);
                frs.addActionListener(e -> frsActionPerformed(e));

                //---- Americano ----
                Americano.setText("Order");
                Americano.setBackground(Color.white);
                Americano.addActionListener(e -> AmericanoActionPerformed(e));

                //---- Capuccino ----
                Capuccino.setText("Order");
                Capuccino.setBackground(Color.white);
                Capuccino.addActionListener(e -> CapuccinoActionPerformed(e));

                //---- orange ----
                orange.setText("Order");
                orange.setBackground(Color.white);
                orange.addActionListener(e -> orangeActionPerformed(e));

                //---- apple ----
                apple.setText("Order");
                apple.setBackground(Color.white);
                apple.addActionListener(e -> appleActionPerformed(e));

                //---- frappe ----
                frappe.setText("Order");
                frappe.setBackground(Color.white);
                frappe.addActionListener(e -> frappeActionPerformed(e));

                //---- milskhake ----
                milskhake.setText("Order");
                milskhake.setBackground(Color.white);
                milskhake.addActionListener(e -> milskhakeActionPerformed(e));

                //---- tea ----
                tea.setText("Order");
                tea.setBackground(Color.white);
                tea.addActionListener(e -> teaActionPerformed(e));

                //---- Hamericano ----
                Hamericano.setText("Order");
                Hamericano.setBackground(Color.white);
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
                delete.setText("Remove");
                delete.setBackground(Color.white);
                delete.addActionListener(e -> deleteActionPerformed(e));

                //---- textArea1 ----
                textArea1.setText("Freddo Espresso(\u20ac1.80)");

                //---- textArea2 ----
                textArea2.setText("MY ORDER:");

                //---- textArea3 ----
                textArea3.setText("Iced Americano(\u20ac1.50)");

                //---- damericano ----
                damericano.setText("Remove");
                damericano.setBackground(Color.white);
                damericano.addActionListener(e -> damericanoActionPerformed(e));

                //---- textArea4 ----
                textArea4.setText("COFFEES/SHAKES/TEAS");

                //---- textArea5 ----
                textArea5.setText("Hot Americano(\u20ac1.80)");

                //---- dhamericano ----
                dhamericano.setText("Remove");
                dhamericano.setBackground(Color.white);
                dhamericano.addActionListener(e -> {
			hamericanoActionPerformed(e);
			dhamericanoActionPerformed(e);
		});

                //---- textArea6 ----
                textArea6.setText("Cappuccino(\u20ac2.50)");

                //---- dcappuccino ----
                dcappuccino.setText("Remove");
                dcappuccino.setBackground(Color.white);
                dcappuccino.addActionListener(e -> dcappuccinoActionPerformed(e));

                //---- textArea7 ----
                textArea7.setText("Freddo Cappuccino(\u20ac3.00)");

                //---- Fcappuccino ----
                Fcappuccino.setText("Order");
                Fcappuccino.setBackground(Color.white);
                Fcappuccino.addActionListener(e -> FcappuccinoActionPerformed(e));

                //---- dfcappuccino ----
                dfcappuccino.setText("Remove");
                dfcappuccino.setBackground(Color.white);
                dfcappuccino.addActionListener(e -> dfcappuccinoActionPerformed(e));

                //---- textArea8 ----
                textArea8.setText("Frappe(\u20ac1.80)");

                //---- dfrappe ----
                dfrappe.setText("Remove");
                dfrappe.setBackground(Color.white);
                dfrappe.addActionListener(e -> dfrappeActionPerformed(e));

                //---- textArea9 ----
                textArea9.setText("Latte(\u20ac3.50)");

                //---- latte ----
                latte.setText("Order");
                latte.setBackground(Color.white);
                latte.addActionListener(e -> latteActionPerformed(e));

                //---- dlatte ----
                dlatte.setText("Remove");
                dlatte.setBackground(Color.white);
                dlatte.addActionListener(e -> dlatteActionPerformed(e));

                //---- textArea10 ----
                textArea10.setText("Macchiato(\u20ac3.50)");

                //---- macchiato ----
                macchiato.setText("Order");
                macchiato.setBackground(Color.white);
                macchiato.addActionListener(e -> macchiatoActionPerformed(e));

                //---- dmacchiato ----
                dmacchiato.setText("Remove");
                dmacchiato.setBackground(Color.white);
                dmacchiato.addActionListener(e -> dmacchiatoActionPerformed(e));

                //---- textArea11 ----
                textArea11.setText("JUICES");
                textArea11.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

                //---- textArea12 ----
                textArea12.setText("Orange juice(\u20ac3.00)");

                //---- dorange ----
                dorange.setText("Remove");
                dorange.setBackground(Color.white);
                dorange.addActionListener(e -> dorangeActionPerformed(e));

                //---- textArea13 ----
                textArea13.setText("Total:");

                //---- textArea14 ----
                textArea14.setText("Apple juice(\u20ac1.80)");

                //---- dapple ----
                dapple.setText("Remove");
                dapple.setBackground(Color.white);
                dapple.addActionListener(e -> dappleActionPerformed(e));

                //---- textArea15 ----
                textArea15.setText("Mixed juice(\u20ac2.00)");

                //---- mixed ----
                mixed.setText("Order");
                mixed.setBackground(Color.white);
                mixed.addActionListener(e -> mixedActionPerformed(e));

                //---- dmixed ----
                dmixed.setText("Remove");
                dmixed.setBackground(Color.white);
                dmixed.addActionListener(e -> dmixedActionPerformed(e));

                //---- textArea17 ----
                textArea17.setText("Milkshake Vanilla(\u20ac2.50)");

                //---- dvmilkshake ----
                dvmilkshake.setText("Remove");
                dvmilkshake.setBackground(Color.white);
                dvmilkshake.addActionListener(e -> dvmilkshakeActionPerformed(e));

                //---- textArea18 ----
                textArea18.setText("Milkshake Chocolate(\u20ac2.50)");

                //---- cmilkshake ----
                cmilkshake.setText("Order");
                cmilkshake.setBackground(Color.white);
                cmilkshake.addActionListener(e -> cmilkshakeActionPerformed(e));

                //---- dcmilkshake ----
                dcmilkshake.setText("Remove");
                dcmilkshake.setBackground(Color.white);
                dcmilkshake.addActionListener(e -> dcmilkshakeActionPerformed(e));

                //---- textArea19 ----
                textArea19.setText("Tea(\u20ac1.80)");

                //---- dtea ----
                dtea.setText("Remove");
                dtea.setBackground(Color.white);
                dtea.addActionListener(e -> dteaActionPerformed(e));

                //---- Takeaway ----
                Takeaway.setText("Takeaway");

                GroupLayout PanelLayout = new GroupLayout(Panel);
                Panel.setLayout(PanelLayout);
                PanelLayout.setHorizontalGroup(
                    PanelLayout.createParallelGroup()
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addGroup(PanelLayout.createParallelGroup()
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(summ, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addGroup(PanelLayout.createParallelGroup()
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(textArea15, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(mixed)
                                    .addGap(18, 18, 18)
                                    .addComponent(dmixed, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addComponent(textArea13, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                    .addGap(123, 123, 123)
                                    .addGroup(PanelLayout.createParallelGroup()
                                        .addComponent(Delivery, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Takeaway, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGap(49, 49, 49)
                            .addGroup(PanelLayout.createParallelGroup()
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(textArea8, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textArea3, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textArea1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textArea5, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textArea6, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textArea7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textArea9, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textArea10, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textArea17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelLayout.createParallelGroup()
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addGap(0, 84, Short.MAX_VALUE)
                                            .addComponent(Fcappuccino)
                                            .addGap(18, 18, 18)
                                            .addComponent(dfcappuccino, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                            .addGap(19, 19, 19))
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addGroup(PanelLayout.createParallelGroup()
                                                .addGroup(PanelLayout.createSequentialGroup()
                                                    .addGap(78, 78, 78)
                                                    .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(frs)
                                                        .addComponent(Americano)
                                                        .addComponent(Hamericano)
                                                        .addComponent(Capuccino))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(PanelLayout.createParallelGroup()
                                                        .addComponent(delete, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(damericano, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dhamericano, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dcappuccino, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(PanelLayout.createSequentialGroup()
                                                    .addGap(76, 76, 76)
                                                    .addComponent(frappe)
                                                    .addGap(18, 18, 18)
                                                    .addGroup(PanelLayout.createParallelGroup()
                                                        .addComponent(dlatte, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dfrappe, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))))
                                            .addGap(0, 25, Short.MAX_VALUE))))
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGroup(PanelLayout.createParallelGroup()
                                        .addComponent(textArea19, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textArea18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(PanelLayout.createParallelGroup()
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addComponent(textArea2, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textArea4, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                    .addGap(167, 167, 167))
                                .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                    .addGroup(PanelLayout.createParallelGroup()
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addComponent(textArea14, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(apple)
                                            .addGap(18, 18, 18)
                                            .addComponent(dapple, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(textArea11, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textArea12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(orange)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(dorange, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                                    .addGroup(PanelLayout.createParallelGroup()
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addComponent(cmilkshake)
                                            .addGap(18, 18, 18)
                                            .addComponent(dcmilkshake, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addComponent(milskhake)
                                            .addGap(18, 18, 18)
                                            .addComponent(dvmilkshake, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addComponent(macchiato)
                                            .addGap(18, 18, 18)
                                            .addComponent(dmacchiato, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(latte)
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addComponent(tea)
                                            .addGap(18, 18, 18)
                                            .addComponent(dtea, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(21, 21, 21))))
                );
                PanelLayout.setVerticalGroup(
                    PanelLayout.createParallelGroup()
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(textArea2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textArea4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(PanelLayout.createParallelGroup()
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGroup(PanelLayout.createParallelGroup()
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addComponent(Delivery, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)
                                            .addComponent(Takeaway)))
                                    .addGap(18, 18, 18)
                                    .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textArea13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button1))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(summ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26))
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGroup(PanelLayout.createParallelGroup()
                                        .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(frs)
                                            .addComponent(delete))
                                        .addComponent(textArea1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(PanelLayout.createParallelGroup()
                                        .addComponent(textArea3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(Americano)
                                            .addComponent(damericano)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                    .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textArea5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Hamericano)
                                        .addComponent(dhamericano))
                                    .addGap(25, 25, 25)
                                    .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textArea6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Capuccino)
                                        .addComponent(dcappuccino))
                                    .addGap(28, 28, 28)
                                    .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textArea7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Fcappuccino)
                                        .addComponent(dfcappuccino))
                                    .addGap(23, 23, 23)
                                    .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textArea8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(frappe)
                                        .addComponent(dfrappe)
                                        .addComponent(textArea11, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)))
                            .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(dlatte)
                                .addComponent(latte, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textArea9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textArea12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(orange)
                                .addComponent(dorange))
                            .addGap(18, 18, 18)
                            .addGroup(PanelLayout.createParallelGroup()
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textArea10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(macchiato)
                                        .addComponent(dmacchiato, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(PanelLayout.createParallelGroup()
                                        .addGroup(PanelLayout.createSequentialGroup()
                                            .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(textArea17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(milskhake)
                                                .addComponent(dvmilkshake))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                            .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(textArea15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(mixed)
                                                .addComponent(dmixed))
                                            .addGap(4, 4, 4)))
                                    .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textArea18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmilkshake)
                                        .addComponent(dcmilkshake))
                                    .addGap(18, 18, 18)
                                    .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textArea19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tea)
                                        .addComponent(dtea)))
                                .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textArea14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apple)
                                    .addComponent(dapple)))
                            .addGap(12, 12, 12))
                );
            }
            dialogPane.add(Panel, BorderLayout.EAST);

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
    // Generated using JFormDesigner Evaluation license - andreas
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
    private JButton Hamericano;
    private JTextField summ;
    private JScrollPane scrollPane1;
    private JTextArea informations;
    private JCheckBox Delivery;
    private JButton button1;
    private JButton delete;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JButton damericano;
    private JTextArea textArea4;
    private JTextArea textArea5;
    private JButton dhamericano;
    private JTextArea textArea6;
    private JButton dcappuccino;
    private JTextArea textArea7;
    private JButton Fcappuccino;
    private JButton dfcappuccino;
    private JTextArea textArea8;
    private JButton dfrappe;
    private JTextArea textArea9;
    private JButton latte;
    private JButton dlatte;
    private JTextArea textArea10;
    private JButton macchiato;
    private JButton dmacchiato;
    private JTextArea textArea11;
    private JTextArea textArea12;
    private JButton dorange;
    private JTextArea textArea13;
    private JTextArea textArea14;
    private JButton dapple;
    private JTextArea textArea15;
    private JButton mixed;
    private JButton dmixed;
    private JTextArea textArea17;
    private JButton dvmilkshake;
    private JTextArea textArea18;
    private JButton cmilkshake;
    private JButton dcmilkshake;
    private JTextArea textArea19;
    private JButton dtea;
    private JCheckBox Takeaway;
    private JPanel buttonBar;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
