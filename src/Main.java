import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private JButton OKButton;
    private JTextField tfName;
    private JPanel panel1;
    private String name;

    public Main(){
        setContentPane(panel1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(150, 10, 1000, 700);
        setTitle("Merry Christmas");

        if (tfName.getText().isBlank()) name = "aaa";
        else name = tfName.getText();

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Christmas xmas = new Christmas(name);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.setVisible(true);
    }
}