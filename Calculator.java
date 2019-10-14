import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator extends WindowAdapter implements ActionListener 
{
    JFrame f;
    JPanel p;
    GridLayout g;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b_add,b_sub,b_div,b_mul,b_eq,b_mod,b_del,b_cls,b_dot;
    JTextField screen,t2;
    int i=0;
    String ar[];
    Calculator()
    {
        f=new JFrame("Calculator");
        f.setLayout(new FlowLayout());

        //initializing Buttons
        b0=new JButton("0");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b_add=new JButton("+");
        b_sub=new JButton("-");
        b_div=new JButton("/");
        b_mul=new JButton("x");
        b_eq=new JButton("=");
        b_mod=new JButton("%");
        b_del=new JButton("Del");
        b_cls=new JButton("Clear");
        b_dot=new JButton(".");

        screen=new JTextField("0",20);
        t2=new JTextField("",2);
        f.add(screen);
        f.add(t2);
        screen.setEditable(false);
        t2.setEditable(false);
        g=new GridLayout(5,5,1,1);
        p=new JPanel();
        p.setLayout(g);

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b_add);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b_sub);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b_div);
        p.add(b_mod);
        p.add(b0);
        p.add(b_eq);
        p.add(b_mul);
        p.add(new JButton(""));
        p.add(b_del);
        p.add(b_cls);
        p.add(b_dot);

        f.add(p);

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
        b_add.addActionListener(this);
        b_sub.addActionListener(this);
        b_div.addActionListener(this);
        b_mul.addActionListener(this);
        b_del.addActionListener(this);
        b_dot.addActionListener(this);
        b_eq.addActionListener(this);
        b_mod.addActionListener(this);
        b_cls.addActionListener(this);

        f.setSize(270,200);
        f.addWindowListener(this);
        f.setVisible(true);
        f.setResizable(false);
        ar=new String[10];
    }

    public void actionPerformed(ActionEvent e)
    {
        double a=0.0;

        if(e.getSource()==b1)
        {
            a=(Double.parseDouble(screen.getText())*10)+1.0;
            screen.setText(String.valueOf(a));
        }

        if(e.getSource()==b2)
        {

            a=(Double.parseDouble(screen.getText())*10)+2.0;
            screen.setText(String.valueOf(a));
        }
        if(e.getSource()==b3)
        {

            a=(Double.parseDouble(screen.getText())*10)+3.0;
            screen.setText(String.valueOf(a));
        }
        if(e.getSource()==b4)
        {

            a=(Double.parseDouble(screen.getText())*10)+4.0;
            screen.setText(String.valueOf(a));
        }
        if(e.getSource()==b5)
        {

            a=(Double.parseDouble(screen.getText())*10)+5.0;
            screen.setText(String.valueOf(a));
        }
        if(e.getSource()==b6)
        {

            a=(Double.parseDouble(screen.getText())*10)+6.0;
            screen.setText(String.valueOf(a));
        }
        if(e.getSource()==b7)
        {

            a=(Double.parseDouble(screen.getText())*10)+7.0;
            screen.setText(String.valueOf(a));
        }
        if(e.getSource()==b8)
        {

            a=(Double.parseDouble(screen.getText())*10)+8.0;
            screen.setText(String.valueOf(a));
        }
        if(e.getSource()==b9)
        {

            a=(Double.parseDouble(screen.getText())*10)+9.0;
            screen.setText(String.valueOf(a));
        }
        if(e.getSource()==b0)
        {

            a=(Double.parseDouble(screen.getText())*10)+0.0;
            screen.setText(String.valueOf(a));
        }
        if(e.getSource()==b_add)
        {
            ar[i]=screen.getText();
            i++;
            t2.setText("+");
            screen.setText("0");
        }
        if(e.getSource()==b_sub)
        {

            ar[i]=screen.getText();
            i++;
            t2.setText("-");
            screen.setText("0");
        }
        if(e.getSource()==b_mul)
        {

            ar[i]=screen.getText();

            t2.setText("X");
            screen.setText("0");
        }
        /*if(e.getSource()==b_dot)
        {
            
            String sdf=screen.getText();
            sdf=sdf.substring(-1,(sdf.length()-2));
            screen.setText(sdf+".");
        }*/
        if(e.getSource()==b_div)
        {

            ar[i]=screen.getText();

            t2.setText("/");
            screen.setText("0.0");
        }
        if(e.getSource()==b_mod)
        {
            ar[i]=screen.getText();
            t2.setText("%");
            screen.setText("0.0");
        }

        if(e.getSource()==b_eq)
        {
			String store="";
            if(t2.getText().equals("+"))
            {
				store=String.valueOf(Double.parseDouble(ar[0])+Double.parseDouble(screen.getText()));
                screen.setText(store);
            }
            if(t2.getText().equals("-"))
            {
				store=String.valueOf(Double.parseDouble(ar[0])-Double.parseDouble(screen.getText()));
                screen.setText(store);
            }
            if(t2.getText().equals("X"))
            {
                store=String.valueOf(Double.parseDouble(ar[0])-Double.parseDouble(screen.getText()));
                screen.setText(store);
            }
            if(t2.getText().equals("/"))
            {
				double deno=Double.parseDouble(screen.getText());
				if(deno!=0)
				{
					store=String.valueOf(Double.parseDouble(ar[0])/deno);
				}
				else
				{
					store="infinity";
				}
                screen.setText(store);
            }
            if(t2.getText().equals("%"))
            {
                store=String.valueOf(Double.parseDouble(ar[0])%Double.parseDouble(screen.getText()));
                screen.setText(store);
            }
			if(store.equals("infinity"))
			{
				
			}
			else
			{
				ar[i]=store;
			}
			i=0;
			t2.setText("");
        }
        if(e.getSource()==b_cls)
        {
            screen.setText("0");
            i=0;
            t2.setText("");
        }
        if(e.getSource()==b_del)
        {
            String s11="";
            int l=screen.getText().length();
            for(int x=0;x<=l-1;x++)
            {
                char ch=screen.getText().charAt(x);
                if(x!=l-3)
                {
                    s11=s11+ch;
                }
            }
			if(s11.length()==2)
			{
				s11="0";
			}
            screen.setText(s11);
        }
    }

    public void windowClosing(WindowEvent e) {  
        f.dispose();  
    } 

    public static void main(String args[])
    {
        new Calculator();
    }
}
