//Name      : Richard Dip
//Date      : 2016-11-12
//Project   : Weighted Average Calculator

import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{

   JPanel panel = new JPanel();
   GridBagConstraints gbc = new GridBagConstraints();
   JLabel weight = new JLabel("Weight");
   JLabel average = new JLabel("Grade");
   JButton calcButton = new JButton("Calcuate");
   JLabel finalAverage = new JLabel("Your Average");
   JTextField fAverage = new JTextField(15);

   JTextField weight1 = new JTextField(15);
   JTextField weight2 = new JTextField(15);
   JTextField weight3 = new JTextField(15);
   JTextField weight4 = new JTextField(15);
   JTextField weight5 = new JTextField(15);
   JTextField weight6 = new JTextField(15);
   JTextField weight7 = new JTextField(15);
   JTextField weight8 = new JTextField(15);
   JTextField weight9 = new JTextField(15);
   JTextField weight10 = new JTextField(15);
   JTextField grade1 = new JTextField(15);
   JTextField grade2 = new JTextField(15);
   JTextField grade3 = new JTextField(15);
   JTextField grade4 = new JTextField(15);
   JTextField grade5 = new JTextField(15);
   JTextField grade6 = new JTextField(15);
   JTextField grade7 = new JTextField(15);
   JTextField grade8 = new JTextField(15);
   JTextField grade9 = new JTextField(15);
   JTextField grade10 = new JTextField(15);

   public Calculator(){
      setTitle("Weighted Average Calculator");
      setVisible(true);
      setResizable(true);
      setSize(400,350);
      panel.setLayout(new GridBagLayout());
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLocationRelativeTo(null);  
      
      gbc.gridx=0;
      gbc.gridy=0;
      panel.add(weight,gbc);
      gbc.gridx=0;
      gbc.gridy=1;
      weight1.setHorizontalAlignment(JTextField.CENTER);
      panel.add(weight1,gbc);
      gbc.gridx=0;
      gbc.gridy=2;
      weight2.setHorizontalAlignment(JTextField.CENTER);
      panel.add(weight2,gbc);
      gbc.gridx=0;
      gbc.gridy=3;
      weight3.setHorizontalAlignment(JTextField.CENTER);
      panel.add(weight3,gbc);
      gbc.gridx=0;
      gbc.gridy=4;
      weight4.setHorizontalAlignment(JTextField.CENTER);
      panel.add(weight4,gbc);
      gbc.gridx=0;
      gbc.gridy=5;
      weight5.setHorizontalAlignment(JTextField.CENTER);
      panel.add(weight5,gbc);
      gbc.gridx=0;
      gbc.gridy=6;
      weight6.setHorizontalAlignment(JTextField.CENTER);
      panel.add(weight6,gbc);
      gbc.gridx=0;
      gbc.gridy=7;
      weight7.setHorizontalAlignment(JTextField.CENTER);
      panel.add(weight7,gbc);
      gbc.gridx=0;
      gbc.gridy=8;
      weight8.setHorizontalAlignment(JTextField.CENTER);
      panel.add(weight8,gbc);
      gbc.gridx=0;
      gbc.gridy=9;
      weight9.setHorizontalAlignment(JTextField.CENTER);
      panel.add(weight9,gbc);
      gbc.gridx=0;
      gbc.gridy=10;
      weight10.setHorizontalAlignment(JTextField.CENTER);
      panel.add(weight10,gbc);
      gbc.gridx=0;
      gbc.gridy=12;
      panel.add(finalAverage,gbc);
      gbc.gridx=1;
      gbc.gridy=12;
      panel.add(fAverage,gbc);
      
      
      gbc.gridx=1;
      gbc.gridy=0;
      panel.add(average,gbc);
      gbc.gridx=1;
      gbc.gridy=1;
      grade1.setHorizontalAlignment(JTextField.CENTER);
      panel.add(grade1,gbc);
      gbc.gridx=1;
      gbc.gridy=2;
      grade2.setHorizontalAlignment(JTextField.CENTER);
      panel.add(grade2,gbc);
      gbc.gridx=1;
      gbc.gridy=3;
      grade3.setHorizontalAlignment(JTextField.CENTER);
      panel.add(grade3,gbc);
      gbc.gridx=1;
      gbc.gridy=4;
      grade4.setHorizontalAlignment(JTextField.CENTER);
      panel.add(grade4,gbc);
      gbc.gridx=1;
      gbc.gridy=5;
      grade5.setHorizontalAlignment(JTextField.CENTER);
      panel.add(grade5,gbc);
      gbc.gridx=1;
      gbc.gridy=6;
      grade6.setHorizontalAlignment(JTextField.CENTER);
      panel.add(grade6,gbc);
      gbc.gridx=1;
      gbc.gridy=7;
      grade7.setHorizontalAlignment(JTextField.CENTER);
      panel.add(grade7,gbc);
      gbc.gridx=1;
      gbc.gridy=8;
      grade8.setHorizontalAlignment(JTextField.CENTER);
      panel.add(grade8,gbc);
      gbc.gridx=1;
      gbc.gridy=9;
      grade9.setHorizontalAlignment(JTextField.CENTER);
      panel.add(grade9,gbc);
      gbc.gridx=1;
      gbc.gridy=10;
      grade10.setHorizontalAlignment(JTextField.CENTER);
      panel.add(grade10,gbc);
      
      gbc.gridx=0;
      gbc.gridy=11;
      gbc.gridwidth = 2;
      gbc.fill = GridBagConstraints.HORIZONTAL;
      panel.add(calcButton,gbc);
      calcButton.addActionListener(this);

      add(panel);
 
   }
   
   public void actionPerformed(ActionEvent e){
      double gpa = 0;
      double p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,pTotal;
      double gr1,gr2,gr3,gr4,gr5,gr6,gr7,gr8,gr9,gr10,grTotal=0;
      
      try{
         if(e.getSource() == calcButton){
            p1 = Convert(weight1.getText());
            p2 = Convert(weight2.getText());
            p3 = Convert(weight3.getText());
            p4 = Convert(weight4.getText());
            p5 = Convert(weight5.getText());
            p6 = Convert(weight6.getText());
            p7 = Convert(weight7.getText());
            p8 = Convert(weight8.getText());
            p9 = Convert(weight9.getText());
            p10 = Convert(weight10.getText());
            pTotal = p1+p2+p3+p4+p5+p6+p7+p8+p9+p10;
            
            gr1 = Convert(grade1.getText());
            gr2 = Convert(grade2.getText());
            gr3 = Convert(grade3.getText());
            gr4 = Convert(grade4.getText());
            gr5 = Convert(grade5.getText());
            gr6 = Convert(grade6.getText());
            gr7 = Convert(grade7.getText());
            gr8 = Convert(grade8.getText());
            gr9 = Convert(grade9.getText());
            gr10 = Convert(grade10.getText());
      
            gpa = (p1*gr1 + p2*gr2 + p3*gr3 + p4*gr4 + p5*gr5
                 + p6*gr6 + p7*gr7 + p8*gr8 + p9*gr9 + p10*gr10)/ pTotal;
      
         }   
      }
      catch(NumberFormatException x){
         System.out.print(x);
      }
         String result = String.format("%.2f", gpa) + "%";
         fAverage.setText(result);
      }
      
      public double Convert(String n){
         if(n.trim().isEmpty())
            return 0.0;
         else
            return Double.parseDouble(n);
      }
   
   
   
   public static void main(String[] args){
      Calculator andreia = new Calculator();
   }//main
}//class