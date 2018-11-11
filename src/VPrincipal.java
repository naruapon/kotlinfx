import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by naruapon on 1/6/2560.
 */
public class VPrincipal {
    private JTextField textField1;
    private JButton button1;
    private JPanel panel;

    public VPrincipal() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textData = textField1.getText();
                TestguiKt.getData(textData);
            }
        });
    }

//    public static void main(String[] args){
//        JFrame frame = new JFrame("VPrinciple Java");
//        frame.setContentPane(new VPrincipal().panel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//    }

    public JPanel getPanel() {
        return panel;
    }
}
