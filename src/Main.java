import javax.swing.*;
import java.awt.*;

public class Main
{
    private Dimension dimension=null;
    private JFrame my_frame=null;

    private JPanel jPanel1=null;
    private JPanel jPanel2=null;
    private JPanel jPanel3=null;

    private JLabel lbl_name;
    private JTextField txt_name;

    private JButton btn_save;
    private JButton btn_clear;

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

        jPanel2=new JPanel();
        jPanel2.setLayout(null);
        jPanel2.setBounds(ws/2,0,ws/2,hs/2);
        jPanel2.setBackground(Color.BLUE);

        jPanel3=new JPanel();
        jPanel3.setLayout(null);
        jPanel3.setBounds(ws/2,hs/2,ws/2,hs/2);
        jPanel3.setBackground(Color.GREEN);

        lbl_name=new JLabel("Name :",JLabel.CENTER);
        lbl_name.setBounds(10,10,50,30);

        txt_name=new JTextField();
        txt_name.setBounds(70,10,200,30);

        btn_save=new JButton("Save");
        btn_save.setBounds(10,10,100,30);

        btn_clear=new JButton("Clear");
        btn_clear.setBounds((jPanel3.getWidth()/2)-50,(jPanel3.getHeight()/2)-15,100,30);

        my_frame.add(jPanel1);
        my_frame.add(jPanel2);
        my_frame.add(jPanel3);

        jPanel1.add(lbl_name);
        jPanel1.add(txt_name);

        jPanel2.add(btn_save);

        jPanel3.add(btn_clear);

        my_frame.setVisible(true);

        jPanel1.setVisible(true);
        jPanel2.setVisible(true);
        jPanel3.setVisible(true);

        lbl_name.setVisible(true);
        txt_name.setVisible(true);

        btn_save.setVisible(true);
        btn_clear.setVisible(true);
    }


    public static void main(String[] args) {
        Main m1=new Main();
        m1.initView();
    }
}
