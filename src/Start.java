import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JFrame{
    private JPanel contentPane;
    private JButton templeButton;
    private JButton shoppButton;
    private JButton oldresaButton;
    private JButton hsButton;
    private JButton miyamiButton;
    private JButton oldresbButton;
    private JButton oldDtButton;
    private JButton westresButton;
    private JButton riversideButton;
    private JButton oldOustkirtsButton;
    private JButton newOutskirtsAButton;
    private JButton newDowntownButton;
    private JButton harboutButton;
    private JButton hinterlandsButton;
    private JButton newOutskirtsBButton;
    private JButton newOutskirtsCButton;
    private JButton churchButton;
    private JButton shintoButton;
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

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
