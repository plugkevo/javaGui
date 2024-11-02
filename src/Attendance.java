import javax.swing.*;


public class Attendance extends JFrame {


    private JPanel panel1;
    private JLabel attendanceManagementSystemTextArea;
    private JLabel AdminPanelbtn;
    private JButton dashboardButton;
    private JButton teacherButton;
    private JButton studentButton;
    private JButton batchButton;
    private JButton reportButton;
    private JButton exitButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JTextField textField1;
    private JTextField textField2;
    private JButton batchattendance;
    private JButton batchandstudentatt;
    private JButton allbatches;
    private JButton batchattwdate;


    public static void main(String[] args) {



        JFrame frame = new JFrame("ATTENDANCE FORM");
        frame.setContentPane(new Attendance().panel1);
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);




    }


}
