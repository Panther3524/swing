import javax.swing.*;
import java.awt.*;

public class Main
{
    private Dimension dimension=null;
    private JFrame my_frame=null;
    private JPanel jPanel1=null;

    private JLabel lbl_name;
    private JTextField txt_name;

    public void initView()
    {
        dimension=Toolkit.getDefaultToolkit().getScreenSize();
        int ws= (int) dimension.getWidth();
        int hs= (int) dimension.getHeight();

        my_frame=new JFrame("Login Form");
        my_frame.setBounds(0,0,ws,hs);
        my_frame.setLayout(null);
        my_frame.setResizable(true);
        my_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        jPanel1=new JPanel();
        jPanel1.setLayout(null);
        jPanel1.setBounds(0,0,ws/2,hs);
        jPanel1.setBackground(Color.PINK);


        lbl_name=new JLabel("Name :",JLabel.CENTER);
        lbl_name.setBounds(10,10,50,30);

        txt_name=new JTextField();
        txt_name.setBounds(70,10,200,30);

        my_frame.add(jPanel1);
        jPanel1.add(lbl_name);
        jPanel1.add(txt_name);


        my_frame.setVisible(true);
        jPanel1.setVisible(true);
        lbl_name.setVisible(true);
        txt_name.setVisible(true);
    }


    public static void main(String[] args) {
        Main m1=new Main();
        m1.initView();
    }
}
