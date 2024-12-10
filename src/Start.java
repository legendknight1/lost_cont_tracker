import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JFrame{
    private JPanel contentPane;
    private JTextPane textPane1;
    private JComboBox comboBox1;
    private JCheckBox checkBox1;

    /**
     * ref: https://github.com/JetBrains/build-UI-using-Swing-sample-project/blob/main/src/com/example/library/forms/BookEditorExample.java
     */
    public Start(){
        setTitle("lost continuum map");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(contentPane);
        pack();
        setLocationRelativeTo(null);

        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //function on tick
            }
        });
    }
}
