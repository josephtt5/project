/*
 * Created by JFormDesigner on Thu Nov 15 16:24:04 EET 2018
 */

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.text.DecimalFormat;
import java.util.Vector;


/**
 * @author joseph tsoutsouki
 */
public class Form extends JFrame {
    private static DecimalFormat df = new DecimalFormat(".##");
    public Form() {initComponents();}
    int counter=0;
    double sum=0;
    double price=0;
    int order=0;
    Vector <String> v = new Vector();

    int del;


    private void milskhakeActionPerformed(ActionEvent e) {
        dvmilkshake.setVisible(true);
        price = 2.50;
        sum=sum+price;
       summ.setText(String.valueOf(df.format(sum)));
        String name="Milkshake Vanilla";
        v.add(name);
        informations.append("Milkshake Vanilla\n");
           }

    private void cmilkshakeActionPerformed(ActionEvent e) {
        dcmilkshake.setVisible(true);
        price = 2.50;
        sum=sum+price;
        summ.setText(String.valueOf(df.format(sum)));;
        String name="Milkshake Chocolate";
        v.add(name);
        informations.append("Milkshake Chocolate\n");
    }
    private void appleActionPerformed(ActionEvent e) {
        dapple.setVisible(true);
        price = 1.80;
        sum=sum+price;
        summ.setText(String.valueOf(df.format(sum)));;
        String name="Apple Juice";
        v.add(name);
        informations.append("Apple Juice\n");
    }
    private void mixedActionPerformed(ActionEvent e) {
        dmixed.setVisible(true);
        price = 2.00;
        sum=sum+price;
        summ.setText(String.valueOf(df.format(sum)));;
        String name="Mixed Juice";
        v.add(name);
        informations.append("Mixed Juice\n");
    }

    private void teaActionPerformed(ActionEvent e) {
        dtea.setVisible(true);
        price = 1.80;
        sum=sum+price;
        summ.setText(String.valueOf(df.format(sum)));;
        String name="Tea";
        v.add(name);
        informations.append("Tea\n");
    }

    private void HamericanoActionPerformed(ActionEvent e) {
        dhamericano.setVisible(true);
        price = 1.80;
        sum=sum+price;
        summ.setText(String.valueOf(df.format(sum)));;
        String name="Hot Americano";
        v.add(name);
        informations.append("Hot Americano\n");
    }

    private void frappeActionPerformed(ActionEvent e) {
        dfrappe.setVisible(true);
        price = 1.80;
        sum=sum+price;
        summ.setText(String.valueOf(df.format(sum)));;
        String name="Frappe";
        v.add(name);
        informations.append("Frappe\n");
    }


    private void frsActionPerformed(ActionEvent e) {

        delete.setVisible(true);
        price = 1.80;
        sum=sum+price;
        summ.setText(String.valueOf(df.format(sum)));;
        String name="Freddo Esspreso";
        v.add(name);
        informations.append("Freddo Esspreso\n");
    }
    private void latteActionPerformed(ActionEvent e) {
        dlatte.setVisible(true);
        price = 3.50;
        sum=sum+price;
        summ.setText(String.valueOf(df.format(sum)));;
        String name="Latte";
        v.add(name);
        informations.append("Latte\n");
    }


    private void AmericanoActionPerformed(ActionEvent e) {
        damericano.setVisible(true);
        price = 1.50;
        sum=sum+price;
        summ.setText(String.valueOf(df.format(sum)));;
        String name="Iced Americano";
        v.add(name);
        informations.append("Iced Americano\n");
    }

    private void CapuccinoActionPerformed(ActionEvent e) {
        dcappuccino.setVisible(true);
        price = 2.50;
        sum=sum+price;
        summ.setText(String.valueOf(df.format(sum)));;
        String name="Cappuccino";
        v.add(name);
        informations.append("Cappuccino\n");

    }
    private void FcappuccinoActionPerformed(ActionEvent e) {
        dfcappuccino.setVisible(true);
        price = 3.00;
        sum=sum+price;
        summ.setText(String.valueOf(df.format(sum)));;
        String name="Freddo Cappuccino";
        v.add(name);
        informations.append("Freddo Cappuccino\n");
    }
    private void macchiatoActionPerformed(ActionEvent e) {
        dmacchiato.setVisible(true);
        price = 3.50;
        sum=sum+price;
        summ.setText(String.valueOf(df.format(sum)));;
        String name="Macchiato";
        v.add(name);
        informations.append("Macchiato\n");
    }

    private void orangeActionPerformed(ActionEvent e) {
        dorange.setVisible(true);
        price  = 3.00;
        sum=sum+price;
        summ.setText(String.valueOf(df.format(sum)));;
        String name="Orange Juice";
        v.add(name);
        informations.append("Orange Juice\n");
    }

       private void DeliveryItemStateChanged(ItemEvent e) {

        price  = 2.00;
             if(counter%2==0) sum=sum+price;
            else sum=sum-price;

        summ.setText(String.valueOf(df.format(sum)));;
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
        summ.setText(String.valueOf(df.format(sum)));;
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
        summ.setText(String.valueOf(df.format(sum)));;
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
        summ.setText(String.valueOf(df.format(sum)));;
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
        summ.setText(String.valueOf(df.format(sum)));;
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
        summ.setText(String.valueOf(df.format(sum)));;
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
        summ.setText(String.valueOf(df.format(sum)));;
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
        summ.setText(String.valueOf(df.format(sum)));;
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
        summ.setText(String.valueOf(df.format(sum)));;
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
        summ.setText(String.valueOf(df.format(sum)));;
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
        summ.setText(String.valueOf(df.format(sum)));;
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
        summ.setText(String.valueOf(df.format(sum)));;
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
        summ.setText(String.valueOf(df.format(sum)));;
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
        summ.setText(String.valueOf(df.format(sum)));;
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
        summ.setText(String.valueOf(df.format(sum)));;
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

    private void CheckoutActionPerformed(ActionEvent e) {
        int result;

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


           result= JOptionPane.showConfirmDialog(null, message, "Informations", JOptionPane.OK_CANCEL_OPTION);


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
           result= JOptionPane.showConfirmDialog(null, message, "Informations", JOptionPane.OK_CANCEL_OPTION);

            String name1 = name.getText();
            String Sname1 = surname.getText();
            String eml = email.getText();
            int phn = Integer.parseInt(phone.getText());
        }
        if( result == JOptionPane.OK_OPTION)
        {
                informations.setText("");
                order=1;
                summ.setText("");
        }



    }













        //String[] options = {"abc", "def", "ghi", "jkl"};
       // JOptionPane.showOptionDialog(null, "Returns the position of your choice on the array",
               // "Click a button",
                //JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);}






















    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - joseph tsoutsouki
        Panel = new JPanel();
        frs = new JButton();
        Americano = new JButton();
        Capuccino = new JButton();
        orange = new JButton();
        apple = new JButton();
        frappe = new JButton();
        Hamericano = new JButton();
        summ = new JTextField();
        Delivery = new JCheckBox();
        Checkout = new JButton();
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
        textArea12 = new JTextArea();
        textArea13 = new JTextArea();
        textArea14 = new JTextArea();
        dapple = new JButton();
        textArea15 = new JTextArea();
        mixed = new JButton();
        dmixed = new JButton();
        dvmilkshake = new JButton();
        dcmilkshake = new JButton();
        dtea = new JButton();
        Takeaway = new JCheckBox();
        textArea20 = new JTextArea();
        iced = new JButton();
        diced = new JButton();
        textArea22 = new JTextArea();
        esspresso = new JButton();
        desspresso = new JButton();
        textArea24 = new JTextArea();
        textArea11 = new JTextArea();
        dorange = new JButton();
        textArea21 = new JTextArea();
        peponi = new JButton();
        dpeponi = new JButton();
        textArea23 = new JTextArea();
        textArea25 = new JTextArea();
        textArea26 = new JTextArea();
        textArea27 = new JTextArea();
        textArea29 = new JTextArea();
        green = new JButton();
        dgreen = new JButton();
        rodakino = new JButton();
        drodakino = new JButton();
        lemoni = new JButton();
        dlemoni = new JButton();
        mavro = new JButton();
        dmavro = new JButton();
        textArea28 = new JTextArea();
        textArea30 = new JTextArea();
        textArea31 = new JTextArea();
        textArea16 = new JTextArea();
        scrollPane1 = new JScrollPane();
        informations = new JTextArea();

        //======== this ========
        setName("this");
        Container contentPane = getContentPane();

        //======== Panel ========
        {
            Panel.setBackground(new Color(51, 51, 51));
            Panel.setAutoscrolls(true);
            Panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            Panel.setName("Panel");

            // JFormDesigner evaluation mark
            Panel.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), Panel.getBorder())); Panel.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- frs ----
            frs.setText("Order");
            frs.setBackground(Color.white);
            frs.setName("frs");
            frs.addActionListener(e -> frsActionPerformed(e));

            //---- Americano ----
            Americano.setText("Order");
            Americano.setBackground(Color.white);
            Americano.setName("Americano");
            Americano.addActionListener(e -> AmericanoActionPerformed(e));

            //---- Capuccino ----
            Capuccino.setText("Order");
            Capuccino.setBackground(Color.white);
            Capuccino.setName("Capuccino");
            Capuccino.addActionListener(e -> CapuccinoActionPerformed(e));

            //---- orange ----
            orange.setText("Order");
            orange.setBackground(Color.white);
            orange.setName("orange");
            orange.addActionListener(e -> orangeActionPerformed(e));

            //---- apple ----
            apple.setText("Order");
            apple.setBackground(Color.white);
            apple.setName("apple");
            apple.addActionListener(e -> appleActionPerformed(e));

            //---- frappe ----
            frappe.setText("Order");
            frappe.setBackground(Color.white);
            frappe.setName("frappe");
            frappe.addActionListener(e -> frappeActionPerformed(e));

            //---- Hamericano ----
            Hamericano.setText("Order");
            Hamericano.setBackground(Color.white);
            Hamericano.setName("Hamericano");
            Hamericano.addActionListener(e -> HamericanoActionPerformed(e));

            //---- summ ----
            summ.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));
            summ.setBackground(new Color(51, 51, 51));
            summ.setFont(new Font("Segoe UI", Font.BOLD, 16));
            summ.setForeground(Color.white);
            summ.setCaretColor(Color.white);
            summ.setName("summ");

            //---- Delivery ----
            Delivery.setText("Delivery");
            Delivery.setBackground(new Color(176, 82, 82));
            Delivery.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));
            Delivery.setFont(new Font("Segoe UI", Font.BOLD, 20));
            Delivery.setName("Delivery");
            Delivery.addItemListener(e -> DeliveryItemStateChanged(e));

            //---- Checkout ----
            Checkout.setText("Checkout");
            Checkout.setBackground(new Color(176, 82, 82));
            Checkout.setFont(new Font("Segoe UI", Font.BOLD, 20));
            Checkout.setName("Checkout");
            Checkout.addActionListener(e -> CheckoutActionPerformed(e));

            //---- delete ----
            delete.setText("Remove");
            delete.setBackground(Color.white);
            delete.setName("delete");
            delete.addActionListener(e -> deleteActionPerformed(e));

            //---- textArea1 ----
            textArea1.setText("Freddo Espresso(\u20ac1.80)");
            textArea1.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea1.setForeground(Color.white);
            textArea1.setBackground(new Color(176, 82, 82));
            textArea1.setName("textArea1");

            //---- textArea2 ----
            textArea2.setText("       MY ORDER:");
            textArea2.setFont(new Font("Monospaced", Font.BOLD, 20));
            textArea2.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));
            textArea2.setBackground(new Color(176, 82, 82));
            textArea2.setName("textArea2");

            //---- textArea3 ----
            textArea3.setText("Iced Americano(\u20ac1.50)");
            textArea3.setBackground(new Color(176, 82, 82));
            textArea3.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea3.setForeground(Color.white);
            textArea3.setName("textArea3");

            //---- damericano ----
            damericano.setText("Remove");
            damericano.setBackground(Color.white);
            damericano.setName("damericano");
            damericano.addActionListener(e -> damericanoActionPerformed(e));

            //---- textArea4 ----
            textArea4.setText("       C O F F E E S                ");
            textArea4.setForeground(Color.darkGray);
            textArea4.setLineWrap(true);
            textArea4.setFont(new Font("Monospaced", Font.BOLD, 27));
            textArea4.setBackground(new Color(176, 82, 82));
            textArea4.setName("textArea4");

            //---- textArea5 ----
            textArea5.setText("Hot Americano(\u20ac1.80)");
            textArea5.setBackground(new Color(176, 82, 82));
            textArea5.setForeground(Color.white);
            textArea5.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea5.setName("textArea5");

            //---- dhamericano ----
            dhamericano.setText("Remove");
            dhamericano.setBackground(Color.white);
            dhamericano.setName("dhamericano");
            dhamericano.addActionListener(e -> {
			hamericanoActionPerformed(e);
			dhamericanoActionPerformed(e);
		});

            //---- textArea6 ----
            textArea6.setText("Cappuccino(\u20ac2.50)");
            textArea6.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea6.setForeground(Color.white);
            textArea6.setBackground(new Color(176, 82, 82));
            textArea6.setName("textArea6");

            //---- dcappuccino ----
            dcappuccino.setText("Remove");
            dcappuccino.setBackground(Color.white);
            dcappuccino.setName("dcappuccino");
            dcappuccino.addActionListener(e -> dcappuccinoActionPerformed(e));

            //---- textArea7 ----
            textArea7.setText("Freddo Cappuccino(\u20ac3.00)");
            textArea7.setBackground(new Color(176, 82, 82));
            textArea7.setForeground(Color.white);
            textArea7.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea7.setName("textArea7");

            //---- Fcappuccino ----
            Fcappuccino.setText("Order");
            Fcappuccino.setBackground(Color.white);
            Fcappuccino.setName("Fcappuccino");
            Fcappuccino.addActionListener(e -> FcappuccinoActionPerformed(e));

            //---- dfcappuccino ----
            dfcappuccino.setText("Remove");
            dfcappuccino.setBackground(Color.white);
            dfcappuccino.setName("dfcappuccino");
            dfcappuccino.addActionListener(e -> dfcappuccinoActionPerformed(e));

            //---- textArea8 ----
            textArea8.setText("Frappe(\u20ac1.80)");
            textArea8.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea8.setForeground(Color.white);
            textArea8.setBackground(new Color(176, 82, 82));
            textArea8.setName("textArea8");

            //---- dfrappe ----
            dfrappe.setText("Remove");
            dfrappe.setBackground(Color.white);
            dfrappe.setName("dfrappe");
            dfrappe.addActionListener(e -> dfrappeActionPerformed(e));

            //---- textArea9 ----
            textArea9.setText("Latte(\u20ac3.50)");
            textArea9.setBackground(new Color(176, 82, 82));
            textArea9.setForeground(Color.white);
            textArea9.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea9.setName("textArea9");

            //---- latte ----
            latte.setText("Order");
            latte.setBackground(Color.white);
            latte.setName("latte");
            latte.addActionListener(e -> latteActionPerformed(e));

            //---- dlatte ----
            dlatte.setText("Remove");
            dlatte.setBackground(Color.white);
            dlatte.setName("dlatte");
            dlatte.addActionListener(e -> dlatteActionPerformed(e));

            //---- textArea10 ----
            textArea10.setText("Carrot Juice(\u20ac3.50)");
            textArea10.setBackground(new Color(176, 82, 82));
            textArea10.setForeground(Color.white);
            textArea10.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea10.setName("textArea10");

            //---- macchiato ----
            macchiato.setText("Order");
            macchiato.setBackground(Color.white);
            macchiato.setName("macchiato");
            macchiato.addActionListener(e -> macchiatoActionPerformed(e));

            //---- dmacchiato ----
            dmacchiato.setText("Remove");
            dmacchiato.setBackground(Color.white);
            dmacchiato.setName("dmacchiato");
            dmacchiato.addActionListener(e -> dmacchiatoActionPerformed(e));

            //---- textArea12 ----
            textArea12.setText("Orange juice(\u20ac3.00)");
            textArea12.setBackground(new Color(176, 82, 82));
            textArea12.setForeground(Color.white);
            textArea12.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea12.setName("textArea12");

            //---- textArea13 ----
            textArea13.setText("         Total:");
            textArea13.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));
            textArea13.setFont(new Font("Monospaced", Font.BOLD, 20));
            textArea13.setBackground(new Color(176, 82, 82));
            textArea13.setName("textArea13");

            //---- textArea14 ----
            textArea14.setText("Apple juice(\u20ac1.80)");
            textArea14.setBackground(new Color(176, 82, 82));
            textArea14.setForeground(Color.white);
            textArea14.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea14.setName("textArea14");

            //---- dapple ----
            dapple.setText("Remove");
            dapple.setBackground(Color.white);
            dapple.setName("dapple");
            dapple.addActionListener(e -> dappleActionPerformed(e));

            //---- textArea15 ----
            textArea15.setText("Mixed juice(\u20ac2.00)");
            textArea15.setBackground(new Color(176, 82, 82));
            textArea15.setForeground(Color.white);
            textArea15.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea15.setName("textArea15");

            //---- mixed ----
            mixed.setText("Order");
            mixed.setBackground(Color.white);
            mixed.setName("mixed");
            mixed.addActionListener(e -> mixedActionPerformed(e));

            //---- dmixed ----
            dmixed.setText("Remove");
            dmixed.setBackground(Color.white);
            dmixed.setName("dmixed");
            dmixed.addActionListener(e -> dmixedActionPerformed(e));

            //---- dvmilkshake ----
            dvmilkshake.setText("Remove");
            dvmilkshake.setBackground(Color.white);
            dvmilkshake.setVisible(false);
            dvmilkshake.setName("dvmilkshake");
            dvmilkshake.addActionListener(e -> dvmilkshakeActionPerformed(e));

            //---- dcmilkshake ----
            dcmilkshake.setText("Remove");
            dcmilkshake.setBackground(Color.white);
            dcmilkshake.setVisible(false);
            dcmilkshake.setName("dcmilkshake");
            dcmilkshake.addActionListener(e -> dcmilkshakeActionPerformed(e));

            //---- dtea ----
            dtea.setText("Remove");
            dtea.setBackground(Color.white);
            dtea.setVisible(false);
            dtea.setName("dtea");
            dtea.addActionListener(e -> dteaActionPerformed(e));

            //---- Takeaway ----
            Takeaway.setText("Takeaway");
            Takeaway.setBackground(new Color(176, 82, 82));
            Takeaway.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));
            Takeaway.setFont(new Font("Segoe UI", Font.BOLD, 20));
            Takeaway.setName("Takeaway");

            //---- textArea20 ----
            textArea20.setText("Iced Latte(\u20ac1.50)");
            textArea20.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea20.setForeground(Color.white);
            textArea20.setBackground(new Color(176, 82, 82));
            textArea20.setName("textArea20");

            //---- iced ----
            iced.setText("Order");
            iced.setBackground(Color.white);
            iced.setName("iced");
            iced.addActionListener(e -> AmericanoActionPerformed(e));

            //---- diced ----
            diced.setText("Remove");
            diced.setBackground(Color.white);
            diced.setName("diced");
            diced.addActionListener(e -> damericanoActionPerformed(e));

            //---- textArea22 ----
            textArea22.setText("Esspresso(\u20ac1.50)");
            textArea22.setBackground(new Color(176, 82, 82));
            textArea22.setForeground(Color.white);
            textArea22.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea22.setName("textArea22");

            //---- esspresso ----
            esspresso.setText("Order");
            esspresso.setBackground(Color.white);
            esspresso.setName("esspresso");
            esspresso.addActionListener(e -> AmericanoActionPerformed(e));

            //---- desspresso ----
            desspresso.setText("Remove");
            desspresso.setBackground(Color.white);
            desspresso.setName("desspresso");
            desspresso.addActionListener(e -> damericanoActionPerformed(e));

            //---- textArea24 ----
            textArea24.setText("                          H O T");
            textArea24.setLineWrap(true);
            textArea24.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
            textArea24.setForeground(Color.white);
            textArea24.setBackground(new Color(51, 51, 51));
            textArea24.setName("textArea24");

            //---- textArea11 ----
            textArea11.setText("      J U I C E S");
            textArea11.setForeground(Color.darkGray);
            textArea11.setLineWrap(true);
            textArea11.setFont(new Font("Monospaced", Font.BOLD, 27));
            textArea11.setBackground(new Color(176, 82, 82));
            textArea11.setName("textArea11");

            //---- dorange ----
            dorange.setText("Remove");
            dorange.setBackground(Color.white);
            dorange.setName("dorange");
            dorange.addActionListener(e -> dorangeActionPerformed(e));

            //---- textArea21 ----
            textArea21.setText("Peponi(\u20ac2.00)");
            textArea21.setBackground(new Color(176, 82, 82));
            textArea21.setForeground(Color.white);
            textArea21.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea21.setName("textArea21");

            //---- peponi ----
            peponi.setText("Order");
            peponi.setBackground(Color.white);
            peponi.setName("peponi");
            peponi.addActionListener(e -> mixedActionPerformed(e));

            //---- dpeponi ----
            dpeponi.setText("Remove");
            dpeponi.setBackground(Color.white);
            dpeponi.setName("dpeponi");
            dpeponi.addActionListener(e -> dmixedActionPerformed(e));

            //---- textArea23 ----
            textArea23.setText("         T E A");
            textArea23.setForeground(Color.darkGray);
            textArea23.setLineWrap(true);
            textArea23.setFont(new Font("Monospaced", Font.BOLD, 27));
            textArea23.setBackground(new Color(176, 82, 82));
            textArea23.setName("textArea23");

            //---- textArea25 ----
            textArea25.setText("Green Tea(\u20ac1.50)");
            textArea25.setBackground(new Color(176, 82, 82));
            textArea25.setForeground(Color.white);
            textArea25.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea25.setName("textArea25");

            //---- textArea26 ----
            textArea26.setText("Peach Tea(\u20ac2.50)");
            textArea26.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea26.setForeground(Color.white);
            textArea26.setBackground(new Color(176, 82, 82));
            textArea26.setName("textArea26");

            //---- textArea27 ----
            textArea27.setText("Lemon Tea(\u20ac1.80)");
            textArea27.setBackground(new Color(176, 82, 82));
            textArea27.setForeground(Color.white);
            textArea27.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea27.setName("textArea27");

            //---- textArea29 ----
            textArea29.setText("Black Tea(\u20ac1.80)");
            textArea29.setBackground(new Color(176, 82, 82));
            textArea29.setForeground(Color.white);
            textArea29.setFont(new Font("Monospaced", Font.BOLD, 15));
            textArea29.setName("textArea29");

            //---- green ----
            green.setText("Order");
            green.setBackground(Color.white);
            green.setName("green");
            green.addActionListener(e -> AmericanoActionPerformed(e));

            //---- dgreen ----
            dgreen.setText("Remove");
            dgreen.setBackground(Color.white);
            dgreen.setName("dgreen");
            dgreen.addActionListener(e -> damericanoActionPerformed(e));

            //---- rodakino ----
            rodakino.setText("Order");
            rodakino.setBackground(Color.white);
            rodakino.setName("rodakino");
            rodakino.addActionListener(e -> AmericanoActionPerformed(e));

            //---- drodakino ----
            drodakino.setText("Remove");
            drodakino.setBackground(Color.white);
            drodakino.setName("drodakino");
            drodakino.addActionListener(e -> damericanoActionPerformed(e));

            //---- lemoni ----
            lemoni.setText("Order");
            lemoni.setBackground(Color.white);
            lemoni.setName("lemoni");
            lemoni.addActionListener(e -> AmericanoActionPerformed(e));

            //---- dlemoni ----
            dlemoni.setText("Remove");
            dlemoni.setBackground(Color.white);
            dlemoni.setName("dlemoni");
            dlemoni.addActionListener(e -> damericanoActionPerformed(e));

            //---- mavro ----
            mavro.setText("Order");
            mavro.setBackground(Color.white);
            mavro.setName("mavro");
            mavro.addActionListener(e -> AmericanoActionPerformed(e));

            //---- dmavro ----
            dmavro.setText("Remove");
            dmavro.setBackground(Color.white);
            dmavro.setName("dmavro");
            dmavro.addActionListener(e -> damericanoActionPerformed(e));

            //---- textArea28 ----
            textArea28.setText("                          COLD");
            textArea28.setLineWrap(true);
            textArea28.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
            textArea28.setForeground(Color.white);
            textArea28.setBackground(new Color(51, 51, 51));
            textArea28.setName("textArea28");

            //---- textArea30 ----
            textArea30.setText("               H O T / C O L D");
            textArea30.setLineWrap(true);
            textArea30.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
            textArea30.setForeground(Color.white);
            textArea30.setBackground(new Color(51, 51, 51));
            textArea30.setName("textArea30");

            //---- textArea31 ----
            textArea31.setText("                F R E S H");
            textArea31.setLineWrap(true);
            textArea31.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 23));
            textArea31.setForeground(Color.white);
            textArea31.setBackground(new Color(51, 51, 51));
            textArea31.setName("textArea31");

            //---- textArea16 ----
            textArea16.setName("textArea16");

            //======== scrollPane1 ========
            {
                scrollPane1.setName("scrollPane1");

                //---- informations ----
                informations.setName("informations");
                scrollPane1.setViewportView(informations);
            }

            GroupLayout PanelLayout = new GroupLayout(Panel);
            PanelLayout.setHonorsVisibility(false);
            Panel.setLayout(PanelLayout);
            PanelLayout.setHorizontalGroup(
                PanelLayout.createParallelGroup()
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(PanelLayout.createParallelGroup()
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup()
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(textArea6, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Capuccino, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dcappuccino, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(textArea5, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Hamericano, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dhamericano, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(textArea9, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(latte, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dlatte, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textArea29, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mavro, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dmavro, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(textArea22, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(esspresso, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(desspresso, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelLayout.createParallelGroup()
                                    .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(textArea25, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textArea26, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textArea27, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup()
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(rodakino, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(drodakino, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(green, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dgreen, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(lemoni, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dlemoni, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))))
                        .addGap(391, 872, Short.MAX_VALUE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLayout.createParallelGroup()
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup()
                                    .addComponent(textArea28, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textArea4, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelLayout.createParallelGroup()
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addGroup(PanelLayout.createParallelGroup()
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(textArea11, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(textArea31, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PanelLayout.createParallelGroup()
                                                    .addComponent(Takeaway, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Delivery, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(summ, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(PanelLayout.createSequentialGroup()
                                                        .addComponent(textArea16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(textArea2, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textArea13, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 535, Short.MAX_VALUE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(PanelLayout.createParallelGroup()
                                            .addComponent(dvmilkshake, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dtea, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dcmilkshake, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup()
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addGroup(PanelLayout.createParallelGroup()
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addComponent(textArea3, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Americano, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(damericano, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(textArea15, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mixed, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addGroup(PanelLayout.createParallelGroup()
                                                    .addGroup(PanelLayout.createSequentialGroup()
                                                        .addComponent(textArea7, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(Fcappuccino, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(dfcappuccino, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(textArea10, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(PanelLayout.createSequentialGroup()
                                                        .addComponent(textArea8, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(frappe, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(dfrappe, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(textArea14, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(apple, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                                    .addComponent(macchiato, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelLayout.createParallelGroup()
                                            .addComponent(dmixed, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dmacchiato, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dapple, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(textArea1, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(frs, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(delete, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textArea12, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(orange, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dorange, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addGroup(PanelLayout.createParallelGroup()
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addComponent(textArea20, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(iced, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(diced, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(textArea24, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(PanelLayout.createParallelGroup()
                                            .addComponent(textArea23, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addComponent(textArea21, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(peponi, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dpeponi, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addComponent(textArea30, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Checkout, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 585, Short.MAX_VALUE))))
            );
            PanelLayout.setVerticalGroup(
                PanelLayout.createParallelGroup()
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup()
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textArea11, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textArea4, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textArea28, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textArea31, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(Takeaway, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PanelLayout.createParallelGroup()
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(frs)
                                    .addComponent(textArea1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delete)
                                    .addComponent(textArea12, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orange)
                                    .addComponent(dorange)))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(Delivery, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(PanelLayout.createParallelGroup()
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup()
                                    .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(dfcappuccino)
                                        .addComponent(Fcappuccino)
                                        .addComponent(textArea10, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(macchiato)
                                        .addComponent(dmacchiato, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textArea7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(frappe)
                                        .addComponent(dfrappe))
                                    .addComponent(textArea8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textArea3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Americano)
                                    .addComponent(damericano)
                                    .addComponent(textArea15, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mixed)
                                    .addComponent(dmixed))
                                .addGap(21, 21, 21)
                                .addGroup(PanelLayout.createParallelGroup()
                                    .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(iced)
                                        .addComponent(diced))
                                    .addComponent(textArea20, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(dpeponi)
                                        .addComponent(peponi)
                                        .addComponent(textArea21, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(textArea23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textArea30, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textArea24, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textArea25, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(green)
                                    .addComponent(dgreen)
                                    .addComponent(desspresso)
                                    .addComponent(esspresso)
                                    .addComponent(textArea22, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup()
                                    .addComponent(textArea16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(textArea2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textArea14, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(apple)
                                        .addComponent(dapple))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)))
                                .addComponent(textArea13, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(summ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Checkout, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(PanelLayout.createParallelGroup()
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textArea6, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Capuccino)
                                    .addComponent(dcappuccino))
                                .addGap(9, 9, 9)
                                .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textArea5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Hamericano)
                                    .addComponent(dhamericano))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textArea9, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(latte)
                                    .addComponent(dlatte)
                                    .addComponent(mavro)
                                    .addComponent(dmavro))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dvmilkshake)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dcmilkshake)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dtea)
                                .addGap(42, 42, 42))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(rodakino)
                                    .addComponent(drodakino)
                                    .addComponent(textArea26, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(PanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(lemoni)
                                    .addComponent(dlemoni)
                                    .addComponent(textArea27, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textArea29, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 718, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 785, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - joseph tsoutsouki
    private JPanel Panel;
    private JButton frs;
    private JButton Americano;
    private JButton Capuccino;
    private JButton orange;
    private JButton apple;
    private JButton frappe;
    private JButton Hamericano;
    private JTextField summ;
    private JCheckBox Delivery;
    private JButton Checkout;
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
    private JTextArea textArea12;
    private JTextArea textArea13;
    private JTextArea textArea14;
    private JButton dapple;
    private JTextArea textArea15;
    private JButton mixed;
    private JButton dmixed;
    private JButton dvmilkshake;
    private JButton dcmilkshake;
    private JButton dtea;
    private JCheckBox Takeaway;
    private JTextArea textArea20;
    private JButton iced;
    private JButton diced;
    private JTextArea textArea22;
    private JButton esspresso;
    private JButton desspresso;
    private JTextArea textArea24;
    private JTextArea textArea11;
    private JButton dorange;
    private JTextArea textArea21;
    private JButton peponi;
    private JButton dpeponi;
    private JTextArea textArea23;
    private JTextArea textArea25;
    private JTextArea textArea26;
    private JTextArea textArea27;
    private JTextArea textArea29;
    private JButton green;
    private JButton dgreen;
    private JButton rodakino;
    private JButton drodakino;
    private JButton lemoni;
    private JButton dlemoni;
    private JButton mavro;
    private JButton dmavro;
    private JTextArea textArea28;
    private JTextArea textArea30;
    private JTextArea textArea31;
    private JTextArea textArea16;
    private JScrollPane scrollPane1;
    private JTextArea informations;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
