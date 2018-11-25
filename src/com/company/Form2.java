import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Vector;
/*
 * Created by JFormDesigner on Mon Nov 19 18:17:00 EET 2018
 */



/**
 * @author unknown
 */
public class Form2 extends JFrame {

    Vector<String > a ;
    int orderNum;
    public Form2(Vector <String> a,int orderNum) {
        initComponents();
        this.a=a;
        this.orderNum=orderNum;

            TITLE.setText("ORDER NUM:"+orderNum);
            time.setText("Time required for order(approximately): " + a.size()*5 + " Minutes");
            for (int i = 0; i < a.size(); i++) {
            String value= a.get(i);
            informations1.append(value + "\n");
        }
        }






    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - joseph tsoutsouki
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        accept = new JButton();
        reject = new JButton();
        scrollPane1 = new JScrollPane();
        informations1 = new JTextArea();
        scrollPane2 = new JScrollPane();
        textArea2 = new JTextArea();
        TITLE = new JTextField();
        time = new JTextField();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBackground(Color.black);

            // JFormDesigner evaluation mark
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), dialogPane.getBorder())); dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setBackground(Color.black);

                //---- accept ----
                accept.setText("accept");

                //---- reject ----
                reject.setText("reject");

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(informations1);
                }

                //======== scrollPane2 ========
                {
                    scrollPane2.setViewportView(textArea2);
                }

                //---- TITLE ----
                TITLE.setHorizontalAlignment(SwingConstants.CENTER);
                TITLE.setFont(new Font("Arial Black", Font.BOLD, 24));

                //---- time ----
                time.setFont(new Font("Arial Black", Font.BOLD, 14));

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addGap(0, 105, Short.MAX_VALUE)
                            .addComponent(TITLE, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE)
                            .addGap(94, 94, 94))
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(accept, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                .addComponent(reject, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                            .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(time, GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                            .addContainerGap())
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(TITLE, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(contentPanelLayout.createParallelGroup()
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(accept, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(reject, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                            .addGap(57, 57, 57)
                            .addComponent(time, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(162, Short.MAX_VALUE))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.WEST);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - joseph tsoutsouki
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JButton accept;
    private JButton reject;
    private JScrollPane scrollPane1;
    private JTextArea informations1;
    private JScrollPane scrollPane2;
    private JTextArea textArea2;
    private JTextField TITLE;
    private JTextField time;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
