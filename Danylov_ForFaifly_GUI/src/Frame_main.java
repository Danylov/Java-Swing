//=========================================================================================================//
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.SwingConstants;
import javax.swing.plaf.ColorUIResource;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Panel;
import java.awt.FlowLayout;
//=========================================================================================================//
public class Frame_main 
{
private JFrame      frmDanylovTestTask;
private JTextField  TF_Color;
private JButton     btn_Orange;
private JButton     btn_Green;
private JButton     B_Left;
private JButton     B_Right;
private JButton     B_Up;
private JButton     B_Down;
private JButton     C_Button = null; // Link to button, which color need to restore from red
private int         P_CH_Color = 0;  // Mark of the need to change the color after leaving the travel restriction
//---------------------------------------------------------------------------------------------------------//
/**
 * Launch the application.
 */
public static void main(String[] args) 
{
EventQueue.invokeLater(new Runnable() 
{
public void run() 
{
try 
{
Frame_main  window = new Frame_main();
            window.frmDanylovTestTask.setVisible(true);
} 
catch (Exception e) 
{
e.printStackTrace();
}
}
});
} // public static void main(String[] args)
//---------------------------------------------------------------------------------------------------------//
/**
 * Create the application.
 */
public Frame_main() 
{
initialize();
} // public Frame_main()
//---------------------------------------------------------------------------------------------------------//
/**
 * Initialize the contents of the frame.
 */
private void initialize() 
{
frmDanylovTestTask = new JFrame();
frmDanylovTestTask.setTitle(" Danylov test task from Faifly");
frmDanylovTestTask.setBounds(100, 100, 530, 300);
frmDanylovTestTask.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frmDanylovTestTask.getContentPane().setLayout(null);

Panel T_Panel = new Panel();
T_Panel.setBackground(new Color(250, 240, 230));
T_Panel.setForeground(new Color(245, 245, 220));
frmDanylovTestTask.getContentPane().add(T_Panel);
T_Panel.setBounds(200, 75, 100, 50);
T_Panel.setLayout(null);
TF_Color = new JTextField();
TF_Color.setHorizontalAlignment(SwingConstants.CENTER);
T_Panel.add(TF_Color);
TF_Color.setColumns(0);
TF_Color.setSize(50, 25);
TF_Color.setOpaque(true);
TF_Color.setLocation((T_Panel.getWidth() - TF_Color.getWidth()) / 2, (T_Panel.getHeight() - TF_Color.getHeight()) / 2);
JButton btn_Blue = new JButton("");
btn_Blue.setBackground(Color.CYAN);
btn_Blue.setBounds(10, 202, 53, 35);
frmDanylovTestTask.getContentPane().add(btn_Blue);
btn_Blue.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent arg0) 
{
TF_Color.setBackground(btn_Blue.getBackground());
C_Button = btn_Blue; 
}
});
btn_Orange = new JButton("");
btn_Orange.setBackground(Color.ORANGE);
btn_Orange.setBounds(69, 202, 53, 35);
frmDanylovTestTask.getContentPane().add(btn_Orange);
btn_Orange.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent arg0) 
{
TF_Color.setBackground(btn_Orange.getBackground());
C_Button = btn_Orange;
}
});
btn_Green = new JButton("");
btn_Green.setBackground(Color.GREEN);
btn_Green.setBounds(132, 202, 53, 35);
frmDanylovTestTask.getContentPane().add(btn_Green);
btn_Green.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent e) 
{
TF_Color.setBackground(btn_Green.getBackground());	
C_Button = btn_Green;
}
});
B_Left = new JButton("Left");
B_Left.setBackground(Color.WHITE);
B_Left.setBounds(222, 202, 65, 35);
frmDanylovTestTask.getContentPane().add(B_Left);
B_Left.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent e) 
{
if (0 < (TF_Color.getX()-1))  
{	
TF_Color.setLocation(TF_Color.getX()-1, TF_Color.getY());
if (P_CH_Color == 1)  
{
if (C_Button == null)  TF_Color.setBackground(Color.WHITE); 
else                   TF_Color.setBackground(C_Button.getBackground());
P_CH_Color = 0;
}
}	
else
{
TF_Color.setBackground(Color.RED);
P_CH_Color = 1;
}
}
});
B_Right = new JButton("Right");
B_Right.setBackground(Color.WHITE);
B_Right.setBounds(291, 202, 65, 35);
frmDanylovTestTask.getContentPane().add(B_Right);
B_Right.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent arg0) 
{
if ((TF_Color.getX()+TF_Color.getWidth()+1) < T_Panel.getWidth())  
{
TF_Color.setLocation(TF_Color.getX()+1, TF_Color.getY());
if (P_CH_Color == 1)  
{
if (C_Button == null)  TF_Color.setBackground(Color.WHITE); 
else                   TF_Color.setBackground(C_Button.getBackground());
P_CH_Color = 0;
}
}
else
{
TF_Color.setBackground(Color.RED);
P_CH_Color = 1;
}
}
});
B_Up = new JButton("Up");
B_Up.setBackground(Color.WHITE);
B_Up.setBounds(358, 202, 53, 35);
frmDanylovTestTask.getContentPane().add(B_Up);
B_Up.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent e) 
{
if (0 < (TF_Color.getY()-1))  
{
TF_Color.setLocation(TF_Color.getX(), TF_Color.getY()-1);
if (P_CH_Color == 1)  
{
if (C_Button == null)  TF_Color.setBackground(Color.WHITE); 
else                   TF_Color.setBackground(C_Button.getBackground());
P_CH_Color = 0;
}
}
else
{
TF_Color.setBackground(Color.RED);
P_CH_Color = 1;
}
}
});
B_Down = new JButton("Down");
B_Down.setBackground(Color.WHITE);
B_Down.setBounds(413, 202, 72, 35);
frmDanylovTestTask.getContentPane().add(B_Down);
B_Down.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent e) 
{
if ((TF_Color.getY()+TF_Color.getHeight()+1) < T_Panel.getHeight())  
{
TF_Color.setLocation(TF_Color.getX(), TF_Color.getY()+1);
if (P_CH_Color == 1)  
{
if (C_Button == null)  TF_Color.setBackground(Color.WHITE); 
else                   TF_Color.setBackground(C_Button.getBackground());
P_CH_Color = 0;
}
}
else
{
TF_Color.setBackground(Color.RED);
P_CH_Color = 1;
}
}
});
} // private void initialize()
} // public class Frame_main 
//=========================================================================================================//