package com.simple.bmi;

import javax.swing.*;
import java.awt.*;

public class BMICalculator extends JFrame {
    private JTextField tfHeight;
    private JTextField tfWeight;
    private JTextArea taResult;

    private void calculateBMI() {
        int height = 0, weight = 0;
        try {
            height = Integer.parseInt(tfHeight.getText());
            weight = Integer.parseInt(tfWeight.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "숫자를 정확히 입력하세요");
            return;
        }

        double heightM = (double) height / 100;
        double bmi = weight / (heightM * heightM);

        String bmiResult;
        if (bmi > 25) {
            bmiResult = "과체중";
        } else if (bmi > 22) {
            bmiResult = "정상";
        } else {
            bmiResult = "저체중";
        }

        taResult.append(height + "cm " + weight + "kg BMI 지수 : " + bmi + "\n");
        taResult.append("평가표 : " + bmiResult + "\n");
    }

    public BMICalculator() {
        setTitle("BMI: 비만도 측정");
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(2, 2));

        JLabel lbl1 = new JLabel(" 키 : ");
        tfHeight = new JTextField(5);

        JLabel lbl2 = new JLabel(" 몸무게 : ");
        tfWeight = new JTextField(5);

        taResult = new JTextArea(5, 10);
        JButton button = new JButton("BMI 계산");

        inputPanel.add(lbl1);
        inputPanel.add(tfHeight);
        inputPanel.add(lbl2);
        inputPanel.add(tfWeight);

        add(inputPanel, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);
        add(new JScrollPane(taResult), BorderLayout.CENTER);

        button.addActionListener(e -> calculateBMI());

        setVisible(true);
    }

    public static void main(String[] args) {
        new BMICalculator();
    }
}