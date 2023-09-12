package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener {
    JButton button_0,
            button_1,
            button_2,
            button_3,
            button_4,
            button_5,
            button_6,
            button_7,
            button_8,
            button_9,
            button_cong,
            button_tru,
            button_nhan,
            button_chia,
            button_cham,
            button_bang,
            button_xoa,
            button_xoaTatCa;
    JTextField jTextField;
    double num1 = 0;
    double num2=0;
    double result =0;
    String operator,answer;

    public calculator() {
        this.setTitle("Máy tính");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jTextField = new JTextField(100);
        JPanel jPanel_top = new JPanel();
        jPanel_top.setLayout(new BorderLayout());
        jPanel_top.add(jTextField, BorderLayout.CENTER);

        button_7 = new JButton("7");
        button_8 = new JButton("8");
        button_9 = new JButton("9");
        JPanel jPanel_bottom = new JPanel();
        button_cong = new JButton("+");
        button_4 = new JButton("4");
        button_5 = new JButton("5");
        button_6 = new JButton("6");
        button_tru = new JButton("-");
        button_1 = new JButton("1");
        button_2 = new JButton("2");
        button_3 = new JButton("3");
        button_nhan = new JButton("*");
        button_0 = new JButton("0");
        button_cham = new JButton(".");
        button_chia = new JButton("/");
        button_bang = new JButton("=");
        button_xoa = new JButton("Del");
        button_xoaTatCa = new JButton("Clear");
        GridLayout gridLayout = new GridLayout(5, 4);
        jPanel_bottom.setLayout(gridLayout);
        jPanel_bottom.add(button_7);
        jPanel_bottom.add(button_8);
        jPanel_bottom.add(button_9);
        jPanel_bottom.add(button_cong);
        jPanel_bottom.add(button_4);
        jPanel_bottom.add(button_5);
        jPanel_bottom.add(button_6);
        jPanel_bottom.add(button_tru);
        jPanel_bottom.add(button_1);
        jPanel_bottom.add(button_2);
        jPanel_bottom.add(button_3);
        jPanel_bottom.add(button_nhan);
        jPanel_bottom.add(button_0);
        jPanel_bottom.add(button_cham);
        jPanel_bottom.add(button_chia);
        jPanel_bottom.add(button_bang);
        jPanel_bottom.add(button_bang);
        jPanel_bottom.add(button_xoa);
        jPanel_bottom.add(button_xoaTatCa);
//        jPanel_bottom.setSize(600,500);

        button_7.addActionListener(this);
        button_8.addActionListener(this);
        button_9.addActionListener(this);
        button_cong.addActionListener(this);
        button_4.addActionListener(this);
        button_5.addActionListener(this);
        button_6.addActionListener(this);
        button_tru.addActionListener(this);
        button_1.addActionListener(this);
        button_2.addActionListener(this);
        button_3.addActionListener(this);
        button_nhan.addActionListener(this);
        button_0.addActionListener(this);
        button_cham.addActionListener(this);
        button_chia.addActionListener(this);
        button_bang.addActionListener(this);
        button_xoa.addActionListener(this);
        button_xoaTatCa.addActionListener(this);



        this.setLayout(new BorderLayout());
        this.add(jPanel_top, BorderLayout.NORTH);
        this.add(jPanel_bottom, BorderLayout.CENTER);
        this.setVisible(true);


    }

    public static void main(String[] args) {

        new calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        JButton current = (JButton)  e.getSource();
//        System.out.println(current.getText());
//        String value = jTextField.getText();
//        value+=current.getText();
//        jTextField.setText(value);
        if (e.getSource() == button_0) {
            jTextField.setText (jTextField.getText().concat(String.valueOf(0)));        }
        if (e.getSource() == button_1) {
            jTextField.setText (jTextField.getText().concat(String.valueOf(1)));        }
        if (e.getSource() == button_2) {
            jTextField.setText (jTextField.getText().concat(String.valueOf(2)));        }
        if (e.getSource() == button_3) {
            jTextField.setText (jTextField.getText().concat(String.valueOf(3)));        }
        if (e.getSource() == button_4) {
            jTextField.setText (jTextField.getText().concat(String.valueOf(4)));        }
        if (e.getSource() == button_5) {
            jTextField.setText (jTextField.getText().concat(String.valueOf(5)));        }
        if (e.getSource() == button_6) {
            jTextField.setText (jTextField.getText().concat(String.valueOf(6)));        }
        if (e.getSource() == button_7) {
            jTextField.setText (jTextField.getText().concat(String.valueOf(7)));        }
        if (e.getSource() == button_8) {
            jTextField.setText (jTextField.getText().concat(String.valueOf(8)));        }
        if (e.getSource() == button_9) {
            jTextField.setText (jTextField.getText().concat(String.valueOf(9)));        }
        if (e.getSource() == button_cham) {
            jTextField.setText (jTextField.getText().concat("."));        }
        if (e.getSource() == button_cong){
            num1 = Double.parseDouble(jTextField.getText());
            operator = "+";
            jTextField.setText("");
        }
        if (e.getSource() == button_tru){
            num1 = Double.parseDouble(jTextField.getText());
            operator = "-";
            jTextField.setText("");
        }
        if (e.getSource() == button_nhan){
            num1 = Double.parseDouble(jTextField.getText());
            operator = "*";
            jTextField.setText("");
        }
        if (e.getSource() == button_chia){
            num1 = Double.parseDouble(jTextField.getText());
            operator = "/";
            jTextField.setText("");
        }
        if (e.getSource() == button_bang){
            num2 = Double.parseDouble(jTextField.getText());
            switch (operator) {
                case"+":
                    result = num1 + num2;
                    break;
                case"-":
                    result = num1 - num2;
                    break;
                case"*":
                    result = num1 * num2;
                    break;
                case"/":
                    result = num1 / num2;
                    break;
            }
            if (Double.toString(result).endsWith(".0")){

            jTextField.setText(Double.toString(result).replace(".0",""));
            }else {
                jTextField.setText(Double.toString(result));
            }
//            jTextField.setText(String.valueOf(result));
            num1 = result;
//            if (operator == "+"){
//                result = num1 + num2;
//                answer = String.format("%.0f",result);
//                jTextField.setText(answer);
//
//            }
        }
        if (e.getSource() == button_xoa){
            String string = jTextField.getText();
            jTextField.setText("");
            for (int i = 0; i < string.length()-1; i++) {
                jTextField.setText(jTextField.getText() + string.charAt(i));
            }
        }
        if (e.getSource() == button_xoaTatCa){
            jTextField.setText("");
        }


    }
}
