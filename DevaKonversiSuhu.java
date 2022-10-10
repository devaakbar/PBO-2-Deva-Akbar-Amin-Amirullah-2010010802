/*
    Latihan 1
    Pemrograman Berbasis Objek 2

    Aplikasi Konversi Suhu (Celcius ke Fahrenheit)

    Nama            : Deva Akbar Amin Amirullah
    NPM             : 2010010802
    Kelas           : 5A Non Reguler Banjarmasin
    Prodi           : S-1 Teknik Informatika
    Dosen Pengampu  : Bapak Muhammad Edya Rosadi, M.Kom

 */

import java.awt.Color;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.text.DecimalFormat;

public class DevaKonversiSuhu extends JFrame implements MouseListener{
    
    JLabel label1;
    JLabel label2;
    JTextField textField1;
    JButton button1;

    public DevaKonversiSuhu() {

        label1 = new JLabel("Celcius");
        label1.setBounds(175,50,100,30);

        label2 = new JLabel("Fahrenheit");
        label2.setBounds(175, 100, 130,30);

        textField1 = new JTextField();
        textField1.setBounds(50,50,100,30);

        button1 = new JButton("Convert");
        button1.setFocusable(false);
        button1.setBounds(50,100,100,30);
        button1.addMouseListener(this);

        this.add(label1);
        this.add(label2);
        this.add(textField1);
        this.add(button1);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(350,250);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent a){
        double celcius  = Double.parseDouble(textField1.getText());

        double fahrenheit = 1.8 * celcius + 32;

        DecimalFormat df = new DecimalFormat("0.00");

        label2.setText(df.format(fahrenheit) + " Fahrenheit");
        label2.setBackground(Color.green);
        label2.setOpaque(true);
    }

    @Override
    public void mousePressed(MouseEvent b){
    }

    @Override
    public void mouseReleased(MouseEvent c){
    }

    @Override
    public void mouseEntered(MouseEvent d){
    }

    @Override
    public void mouseExited(MouseEvent e){
    }

    public static void main(String[] args) {
        new DevaKonversiSuhu();
    }

}
