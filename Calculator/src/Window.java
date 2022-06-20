import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Window extends JFrame implements WindowListener, ActionListener {  //1. cоздаем окно и добавляем методы
    private TextField f = new TextField(); // окошко для вывода информации (f)
    private String text = "";
    private JButton b8 = new JButton("8");  // кнопка
    private JButton b9 = new JButton("9");
    private JButton b7 = new JButton("7");
    private JButton b6 = new JButton("6");
    private JButton b5 = new JButton("5");
    private JButton b4 = new JButton("4");
    private JButton b3 = new JButton("3");
    private JButton b2 = new JButton("2");
    private JButton b1 = new JButton("1");
    private JButton del = new JButton("C");
    private JButton back = new JButton("<=");
    private JButton plus = new JButton("+");
    private JButton res = new JButton("=");
    private JButton minus = new JButton("-");
    private JButton b0 = new JButton("0");
    private JButton delenie = new JButton("/");
    private JButton umn = new JButton("*");
    private JButton point = new JButton(".");
    private JButton revers = new JButton("+-");
    private int a = 0;
    private int b = 0;
    private char z;


    public Window () {
        Font ex = new Font("Impact", Font.BOLD, 40);
        Font ex1 = new Font("Impact", Font.BOLD,20);
        setLayout(null);
        setSize(370, 600); //размер
        setVisible(true); //видимость
        setLocation(500,250); //где открывается на экране
        setDefaultCloseOperation(EXIT_ON_CLOSE); // завершение при закрытии окна
        setResizable(false); // не менять размеры окна
        f.setFont(ex);
        f.setBackground(Color.CYAN);
        f.setSize(300,60);
        f.setLocation(25,25);
        f.setVisible(true);
        add(f);

        b9.setFont(ex);
        b9.setSize(60,60);
        b9.setLocation(185, 225);
        b9.setVisible(true);
        add (b9);
        b9.addActionListener(this); //подключаем кнопку

        b8.setFont(ex);
        b8.setSize(60,60);
        b8.setLocation(105, 225);
        b8.setVisible(true);
        add (b8);
        b8.addActionListener(this);

        b7.setFont(ex);
        b7.setSize(60,60);
        b7.setLocation(25, 225);
        b7.setVisible(true);
        add (b7);
        b7.addActionListener(this);

        b6.setFont(ex);
        b6.setSize(60,60);
        b6.setLocation(185, 305);
        b6.setVisible(true);
        add (b6);
        b6.addActionListener(this);

        b5.setFont(ex);
        b5.setSize(60,60);
        b5.setLocation(105, 305);
        b5.setVisible(true);
        add (b5);
        b5.addActionListener(this);

        b4.setFont(ex);
        b4.setSize(60,60);
        b4.setLocation(25, 305);
        b4.setVisible(true);
        add (b4);
        b4.addActionListener(this);

        b3.setFont(ex);
        b3.setSize(60,60);
        b3.setLocation(185, 385);
        b3.setVisible(true);
        add (b3);
        b3.addActionListener(this);

        b2.setFont(ex);
        b2.setSize(60,60);
        b2.setLocation(105, 385);
        b2.setVisible(true);
        add (b2);
        b2.addActionListener(this);

        b1.setFont(ex);
        b1.setSize(60,60);
        b1.setLocation(25, 385);
        b1.setVisible(true);
        add (b1);
        b1.addActionListener(this);

        del.setFont(ex);
        del.setSize(60,60);
        del.setLocation(265, 225);
        del.setVisible(true);
        add (del);
        del.addActionListener(this);


        back.setFont(ex1);
        back.setSize(60,60);
        back.setLocation(265, 305);
        back.setVisible(true);
        add (back);
        back.addActionListener(this);

        plus.setFont(ex);
        plus.setSize(60,60);
        plus.setLocation(25, 145);
        plus.setVisible(true);
        add (plus);
        plus.addActionListener(this);

        res.setFont(ex);
        res.setSize(60,140);
        res.setLocation(265, 385);
        res.setVisible(true);
        add (res);
        res.addActionListener(this);

        minus.setFont(ex);
        minus.setSize(60,60);
        minus.setLocation(105, 145);
        minus.setVisible(true);
        add (minus);
        minus.addActionListener(this);

        b0.setFont(ex);
        b0.setSize(60,60);
        b0.setLocation(105, 465);
        b0.setVisible(true);
        add (b0);
        b0.addActionListener(this);

        revers.setFont(ex1);
        revers.setSize(60,60);
        revers.setLocation(25, 465);
        revers.setVisible(true);
        add (revers);
        revers.addActionListener(this);

        point.setFont(ex);
        point.setSize(60,60);
        point.setLocation(185, 465);
        point.setVisible(true);
        add (point);
        point.addActionListener(this);

        delenie.setFont(ex);
        delenie.setSize(60,60);
        delenie.setLocation(265, 145);
        delenie.setVisible(true);
        add (delenie);
        delenie.addActionListener(this);

        umn.setFont(ex);
        umn.setSize(60,60);
        umn.setLocation(185, 145);
        umn.setVisible(true);
        add (umn);
        umn.addActionListener(this);

    }




    @Override
    public void actionPerformed(ActionEvent e) { //работа кнопок , обработчик событий
        if (e.getSource()==b9){ // если нажата клавиша такая-то
            text = text + b9.getText(); // делаем текст счетчиком, чтобы добавлялись одиниковые цифры
            f.setText(text);
        }
        if (e.getSource()==b8){
            text = text + b8.getText();
            f.setText(text);
        }
        if (e.getSource()==b7){
            text = text + b7.getText();
            f.setText(text);
        }
        if (e.getSource()==b6){
            text = text + b6.getText();
            f.setText(text);
        }
        if (e.getSource()==b5){
            text = text + b5.getText();
            f.setText(text);
        }
        if (e.getSource()==b4){
            text = text + b4.getText();
            f.setText(text);
        }
        if (e.getSource()==b3){
            text = text + b3.getText();
            f.setText(text);
        }
        if (e.getSource()==b2){
            text = text + b2.getText();
            f.setText(text);
        }
        if (e.getSource()==b1){
            text = text + b1.getText();
            f.setText(text);
        }
        if (e.getSource()==b0){
            text = text + b0.getText();
            f.setText(text);
        }
        if (e.getSource()==plus){
            a = Integer.parseInt(text); // запоминаем введенное число
            f.setText(text+plus.getText());
            text = "";
            z = '+';
        }
        if (e.getSource()==minus){
            a = Integer.parseInt(text); // запоминаем введенное число
            f.setText(text+minus.getText());
            text = "";
            z = '-';
        }
        if (e.getSource()==umn){
            a = Integer.parseInt(text); // запоминаем введенное число
            f.setText(text+umn.getText());
            text = "";
            z = '*';
        }
        if (e.getSource()==delenie){
            a = Integer.parseInt(text); // запоминаем введенное число
            f.setText(text+delenie.getText());
            text = "";
            z = '/';
        }
        if (e.getSource()==del){
            text = ""; // работа кнопки Удалить
            f.setText(text);
        }
        if(e.getSource()==back){ // кнопка Удалить последнюю цифру
            int c = Integer.parseInt(f.getText());
            c = c/10;
            f.setText(String.valueOf(c));
            text = String.valueOf(c);
        }
        if (e.getSource()==revers){ // работа кнопки Смена знака
            int c = Integer.parseInt(f.getText());
            c = c*-1;
            f.setText(String.valueOf(c));
            text = String.valueOf(c);
        }
        if (e.getSource()==res){
           if (z == '+'){
               b = Integer.parseInt(text); //переводим число в текст
               f.setText(String.valueOf(a+b)); // переводим обратно в число
           }
        }
        if (e.getSource()==res){
            if (z == '-'){
                b = Integer.parseInt(text); //переводим число в текст
                f.setText(String.valueOf(a-b)); // переводим обратно в число
            }
        }
        if (e.getSource()==res) {
            if (z == '*') {
                b = Integer.parseInt(text); //переводим число в текст
                f.setText(String.valueOf(a * b)); // переводим обратно в число
            }
        }
        if (e.getSource()==res) {
            if (z == '/') {
                b = Integer.parseInt(text); //переводим число в текст
                f.setText(String.valueOf(a / b)); // переводим обратно в число
            }
        }


    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

}
