package Calculator;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calci extends JFrame implements ActionListener {
    public JFrame frame;
    public JButton Reset,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,minus,prod,equal,divide;
    public JTextField f1;
    static private int num = 0,answer = 0;
    public JLabel text;
    private String operation;

    public Calci() {

        frame = new JFrame("BASIC CALCULATOR");
        frame.setSize(650,800);

        operation = new String();

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
        add = new JButton("+");
        minus = new JButton("-");
        prod = new JButton("*");
        divide = new JButton("/");
        equal = new JButton("=");
        Reset = new JButton("C");
        text = new JLabel();
        f1 = new JTextField();

        b0.setBounds(100,600,100,100);
        b1.setBounds(100,500,100,100);
        b2.setBounds(200,500,100,100);
        b3.setBounds(300,500,100,100);
        b4.setBounds(100,400,100,100);
        b5.setBounds(200,400,100,100);
        b6.setBounds(300,400,100,100);
        b7.setBounds(100,300,100,100);
        b8.setBounds(200,300,100,100);
        b9.setBounds(300,300,100,100);
        add.setBounds(400,300,100,100);
        minus.setBounds(400,400,100,100);
        prod.setBounds(400,500,100,100);
        divide.setBounds(400,600,100,100);
        equal.setBounds(300,600,100,100);
        Reset.setBounds(200,600,100,100);
        f1.setBounds(100,200,400,100);
        text.setBounds(100,100,100,100);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        add.addActionListener(this);
        minus.addActionListener(this);
        prod.addActionListener(this);
        divide.addActionListener(this);
        equal.addActionListener(this);
        Reset.addActionListener(this);
        text.setText("");
        f1.setText("");

        frame.add(b0);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(add);
        frame.add(minus);
        frame.add(prod);
        frame.add(divide);
        frame.add(equal);
        frame.add(Reset);
        frame.add(f1);
        frame.add(text);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == b0){
            num = num * 10 + 0;
        }
        else if(e.getSource() == b1){
            num = num * 10 + 1;
        }
        else if(e.getSource() == b2){
            num = num * 10 + 2;
        }
        else if(e.getSource() == b3){
            num = num * 10 + 3;
        }
        else if(e.getSource() == b4){
            num = num * 10 + 4;
        }
        else if(e.getSource() == b5){
            num = num * 10 + 5;
        }
        else if(e.getSource() == b6){
            num = num * 10 + 6;
        }
        else if(e.getSource() == b7){
            num = num * 10 + 7;
        }
        else if(e.getSource() == b8){
            num = num * 10 + 8;
        }
        else if(e.getSource() == b9) {
            num = num * 10 + 9;
        }

        String number = String.valueOf(num);
        f1.setText(number);

        if(e.getSource() == add){
            text.setText(number+" + ");
            if(answer == 0){
                answer = num;
            }
            num = 0;
            operation = "add";
        }

        else if(e.getSource() == minus){
            text.setText(number+" - ");
            if(answer == 0){
                answer = num;
            }
            num = 0;
            operation = "minus";
        }

        else if(e.getSource() == prod){
            if(answer == 0) {
                answer = num;
            }
            text.setText(number+" * ");
            num = 0;
            operation = "prod";
        }

        else if(e.getSource() == divide) {
            text.setText(" / ");
            if (answer == 0) {
                answer = num;
            }
            text.setText(number + " / ");
            num = 0;
            operation = "divide";
        }

        if(e.getSource() == equal){
            if(operation == "add"){
                answer += num;
            }
            else if(operation == "minus"){
                answer -= num;
            }
            else if(operation == "prod"){
                answer *= num;
            }
            else if(operation == "divide") {
                answer = answer / num;
            }
            f1.setText(String.valueOf(answer));
            text.setText("");
            num = answer;
        }

        if(e.getSource() == Reset){
            num = 0;
            answer = 0;
            f1.setText("");
            text.setText("");
        }
    }
}
