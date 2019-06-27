import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator extends JFrame implements ActionListener
{
    String ar[];
    int i=0;
    JTextField t1=new JTextField(20);
    JTextField t2=new JTextField(3);
    JButton bma=new JButton(" M ");
    JButton bcb=new JButton(" cub ");
    JButton bc=new JButton(" C ");
    JButton bce=new JButton("Backspace");
    JButton bd=new JButton("  /  ");
    JButton bno=new JButton(" +/- ");
    JButton b7=new JButton(" 7 ");
    JButton b8=new JButton(" 8 ");
    JButton b9=new JButton(" 9 ");
    JButton bm=new JButton(" x  ");
    JButton bsq=new JButton("sqrt");
    JButton b4=new JButton(" 4 ");
    JButton b5=new JButton(" 5 ");
    JButton b6=new JButton(" 6 ");
    JButton bs=new JButton(" -- ");
    JButton bmod=new JButton("  %  ");
    JButton b1=new JButton(" 1 ");
    JButton b2=new JButton(" 2 ");
    JButton b3=new JButton(" 3 ");
    JButton ba=new JButton(" + ");
    JButton bre=new JButton(" 1/x ");
    JButton b0=new JButton("  0  ");
    JButton bdo=new JButton(" . ");
    JButton be=new JButton(" = ");
    JButton bmc=new JButton("  MC  ");
    JButton bmr=new JButton("  MR  ");
    JButton bms=new JButton("  MS  ");
    JButton bmsu=new JButton("  M-  ");
    JLabel l3=new JLabel("           Author   :   ADITYA PANDEY");
    public Calculator()
    {
        setLayout(new FlowLayout());
        setSize(359,400);
        setVisible(true);
        setResizable(false);
        t1.setEditable(false);
        t2.setEditable(false);
        setTitle("CALCULATOR");
        //add(st);
        //add(sc);
        add(t1);
        add(t2);
        t2.setEditable(false);
        add(bma);
        add(bcb);
        add(bc);
        add(bce);
        add(bd);
        add(bno);
        add(b7);
        add(b8);
        add(b9);
        add(bm);
        add(bsq);
        add(b4);
        add(b5);
        add(b6);
        add(bs);
        add(bmod);
        add(b1);
        add(b2);
        add(b3);
        add(ba);
        add(bre);
        add(b0);
        add(bdo);
        add(be);
        add(bmc);
        add(bmr);
        add(bms);
        add(bmsu);
        bmc.addActionListener(this);
        //st.addActionListener(this);
        //sc.addActionListener(this);
        bmr.addActionListener(this);
        bms.addActionListener(this);
        bsq.addActionListener(this);
        bcb.addActionListener(this);
        bma.addActionListener(this);
        bmsu.addActionListener(this);
        bre.addActionListener(this);
        bce.addActionListener(this);
        bdo.addActionListener(this);
        bmod.addActionListener(this);
        bc.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        ba.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        be.addActionListener(this);
        t1.setText ("0.0");
        ar=new String[10];
        i=0;
        add(l3);
    }

    public void actionPerformed(ActionEvent e)
    {
        double a=0.0;

        if(e.getSource()==b1)
        {
            a=(Double.parseDouble(t1.getText())*10)+1.0;
            t1.setText(String.valueOf(a));
        }

        if(e.getSource()==b2)
        {

            a=(Double.parseDouble(t1.getText())*10)+2.0;
            t1.setText(String.valueOf(a));
        }
        if(e.getSource()==b3)
        {

            a=(Double.parseDouble(t1.getText())*10)+3.0;
            t1.setText(String.valueOf(a));
        }
        if(e.getSource()==b4)
        {

            a=(Double.parseDouble(t1.getText())*10)+4.0;
            t1.setText(String.valueOf(a));
        }
        if(e.getSource()==b5)
        {

            a=(Double.parseDouble(t1.getText())*10)+5.0;
            t1.setText(String.valueOf(a));
        }
        if(e.getSource()==b6)
        {

            a=(Double.parseDouble(t1.getText())*10)+6.0;
            t1.setText(String.valueOf(a));
        }
        if(e.getSource()==b7)
        {

            a=(Double.parseDouble(t1.getText())*10)+7.0;
            t1.setText(String.valueOf(a));
        }
        if(e.getSource()==b8)
        {

            a=(Double.parseDouble(t1.getText())*10)+8.0;
            t1.setText(String.valueOf(a));
        }
        if(e.getSource()==b9)
        {

            a=(Double.parseDouble(t1.getText())*10)+9.0;
            t1.setText(String.valueOf(a));
        }
        if(e.getSource()==b0)
        {

            a=(Double.parseDouble(t1.getText())*10)+0.0;
            t1.setText(String.valueOf(a));
        }
        if(e.getSource()==ba)
        {
            ar[i]=t1.getText();
            i++;
            t2.setText("+");
            t1.setText("0.0");
            //ar[i]="+";
        }
        if(e.getSource()==bs)
        {

            ar[i]=t1.getText();
            i++;
            t2.setText("-");
            t1.setText("0.0");
        }
        if(e.getSource()==bm)
        {

            ar[i]=t1.getText();

            t2.setText("X");
            t1.setText("0.0");
        }
        if(e.getSource()==bdo)
        {

            String sdf=t1.getText();
            sdf=sdf.substring(-1,(sdf.length()-2));
            t1.setText(sdf+".");
        }
        if(e.getSource()==bd)
        {

            ar[i]=t1.getText();

            t2.setText("/");
            t1.setText("0.0");
        }
        
        if(e.getSource()==bsq)
        {
            t1.setText(String.valueOf(Math.sqrt(Double.parseDouble(t1.getText()))));
        }
        
        if(e.getSource()==bce)
        {
            String s11="";
            int l=t1.getText().length();
            for(int x=0;x<=l-1;x++)
            {
                char ch=t1.getText().charAt(x);
                if(x!=l-3)
                    s11=s11+ch;
            }t1.setText(s11);
        }
        
        if(e.getSource()==bcb)
        {
            t1.setText(String.valueOf(Math.cbrt(Double.parseDouble(t1.getText()))));
        }
        
        if(e.getSource()==bre)
        {
            t1.setText(String.valueOf(1/Double.parseDouble(t1.getText())));
        }
        
        if(e.getSource()==bmod)
        {
            ar[i]=t1.getText();
            t2.setText("%");
            t1.setText("0.0");
        }
        
        if(e.getSource()==be)
        {
            if(t2.getText().equals("+"))
            {
                t1.setText(String.valueOf(Double.parseDouble(ar[0])+Double.parseDouble(t1.getText())));
            }
            if(t2.getText().equals("-"))
            {
                t1.setText(String.valueOf(Double.parseDouble(ar[0])-Double.parseDouble(t1.getText())));
            }
            if(t2.getText().equals("X"))
            {
                t1.setText(String.valueOf(Double.parseDouble(ar[0])*Double.parseDouble(t1.getText())));
            }
            if(t2.getText().equals("/"))
            {
                t1.setText(String.valueOf(Double.parseDouble(ar[0])/Double.parseDouble(t1.getText())));
            }
            if(t2.getText().equals("%"))
            {
                t1.setText(String.valueOf(Double.parseDouble(ar[0])%Double.parseDouble(t1.getText())));
            }
        }
        if(e.getSource()==bc)
        {
            t1.setText("0.0");
            i=0;
            t2.setText("");
        }

    }
    public static void main(String args[])
    {
        Calculator ob=new Calculator();
    }
}
