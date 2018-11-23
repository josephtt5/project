package com.company;
public class Main {


    public static void main(String[] args) {

      Form form1 = new Form();
              form1.setVisible(true);


      Form2 form2=new Form2(form1.v);
      form2.setVisible(true);
    }
}
