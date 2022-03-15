import javax.swing.*;
import java.awt.event.ActionListener;

public class ViewClass extends JFrame {
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bPlus, bMinus, bMul, bPow, bAdd, bSub, bDerivative, bIntegrate, bSet1, bSet2, bx;
    private JTextField text1, text2, text3, text4;
    private JLabel labelR, labelP2, labelP1;

    public ViewClass() {
        JPanel view = new JPanel();
        view.setLayout(null);
        setSize(750, 430);

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bx = new JButton("x");
        bPlus = new JButton("+");
        bMinus = new JButton("-");
        bMul = new JButton("*");
        bPow = new JButton("^");
        bSet1 = new JButton("Set polynomial 1");
        bSet2 = new JButton("Set polynomial 2");
        text1 = new JTextField(5);
        text2 = new JTextField(5);
        text3 = new JTextField(5);
        text4 = new JTextField(5);
        labelR = new JLabel("Result");
        labelP2 = new JLabel("Polynomial 2");
        labelP1 = new JLabel("Polynomial 1");
        bAdd = new JButton("ADD");
        bSub = new JButton("SUB");
        bDerivative = new JButton("DERIVATIVE");
        bIntegrate = new JButton("INTEGRATE");

        b0.setBounds(85, 135, 40, 25);
        b1.setBounds(30, 15, 40, 25);
        b2.setBounds(85, 15, 40, 25);
        b3.setBounds(140, 15, 40, 25);
        b4.setBounds(30, 55, 40, 25);
        b5.setBounds(85, 55, 40, 25);
        b6.setBounds(140, 55, 40, 25);
        b7.setBounds(30, 95, 40, 25);
        b8.setBounds(85, 95, 40, 25);
        b9.setBounds(140, 95, 40, 25);
        bx.setBounds(140, 135, 40, 25);
        bPlus.setBounds(80, 200, 50, 25);
        bMinus.setBounds(80, 235, 50, 25);
        bMul.setBounds(80, 270, 50, 25);
        bPow.setBounds(80, 305, 50, 25);
        bSet1.setBounds(500, 85, 200, 25);
        bSet2.setBounds(500, 120, 200, 25);
        text1.setBounds(345, 245, 300, 30);
        text2.setBounds(345, 290, 300, 30);
        text3.setBounds(345, 335, 300, 30);
        text4.setBounds(345, 200, 300, 30);
        labelR.setBounds(300, 335, 40, 25);
        labelP2.setBounds(265, 290, 75, 25);
        labelP1.setBounds(265, 245, 75, 25);
        bAdd.setBounds(315, 15, 70, 25);
        bSub.setBounds(315, 50, 70, 25);
        bDerivative.setBounds(315, 85, 130, 25);
        bIntegrate.setBounds(315, 120, 130, 25);

        text1.setEditable(false);
        text2.setEditable(false);
        text3.setEditable(false);

        view.add(b0);
        view.add(b1);
        view.add(b2);
        view.add(b3);
        view.add(b4);
        view.add(b5);
        view.add(b6);
        view.add(b7);
        view.add(b8);
        view.add(b9);
        view.add(bx);
        view.add(bPlus);
        view.add(bMinus);
        view.add(bMul);
        view.add(bPow);
        view.add(bSet1);
        view.add(bSet2);
        view.add(text1);
        view.add(text2);
        view.add(text3);
        view.add(text4);
        view.add(labelR);
        view.add(labelP1);
        view.add(labelP2);
        view.add(bAdd);
        view.add(bSub);
        view.add(bDerivative);
        view.add(bIntegrate);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(view);
        setVisible(true);
    }

    public void setText1(String text) {
        text1.setText(text);
    }

    public void setText2(String text) {
        text2.setText(text);
    }

    public void setText3(String text) {
        text3.setText(text);
    }

    public void setText4(String text) {
        text4.setText(text);
    }

    public String getText1() {
        return text1.getText();
    }

    public String getText2() {
        return text2.getText();
    }

    public String getText4() {
        return text4.getText();
    }

    public void b0listener(ActionListener action) {
        b0.addActionListener(action);
    }

    public void b1listener(ActionListener action) {
        b1.addActionListener(action);
    }

    public void b2listener(ActionListener action) {
        b2.addActionListener(action);
    }

    public void b3listener(ActionListener action) {
        b3.addActionListener(action);
    }

    public void b4listener(ActionListener action) {
        b4.addActionListener(action);
    }

    public void b5listener(ActionListener action) {
        b5.addActionListener(action);
    }

    public void b6listener(ActionListener action) {
        b6.addActionListener(action);
    }

    public void b7listener(ActionListener action) {
        b7.addActionListener(action);
    }

    public void b8listener(ActionListener action) {
        b8.addActionListener(action);
    }

    public void b9listener(ActionListener action) {
        b9.addActionListener(action);
    }

    public void bxlistener(ActionListener action) {
        bx.addActionListener(action);
    }

    public void bPluslistener(ActionListener action) {
        bPlus.addActionListener(action);
    }

    public void bMinuslistener(ActionListener action) {
        bMinus.addActionListener(action);
    }

    public void bMullistener(ActionListener action) {
        bMul.addActionListener(action);
    }

    public void bPowlistener(ActionListener action) {
        bPow.addActionListener(action);
    }

    public void bAddlistener(ActionListener action) {
        bAdd.addActionListener(action);
    }

    public void bSublistener(ActionListener action) {
        bSub.addActionListener(action);
    }

    public void bDerivativelistener(ActionListener action) {
        bDerivative.addActionListener(action);
    }

    public void bIntegratelistener(ActionListener action) {
        bIntegrate.addActionListener(action);
    }

    public void bSet1(ActionListener action) {
        bSet1.addActionListener(action);
    }

    public void bSet2(ActionListener action) {
        bSet2.addActionListener(action);
    }

}
