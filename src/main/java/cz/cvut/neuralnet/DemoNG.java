package cz.cvut.neuralnet;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author deric
 */
public class DemoNG extends JFrame {

    private static final long serialVersionUID = -8137741651924993813L;
    private CNGPanel panel;

    public DemoNG() throws Exception {
        super("DemoCNG");
        initComponents();

        Thread t = new Thread(new Runnable() {

            public void run() {
                panel.init();
            }
        });

        t.start();

        setVisible(true);
    }

    private void initComponents() {
        GridBagLayout gbl = new GridBagLayout();
        setLayout(gbl);
        GridBagConstraints c = new GridBagConstraints();

        panel = new CNGPanel();

        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1;
        c.insets = new Insets(5, 5, 5, 5);
        c.anchor = GridBagConstraints.NORTHEAST;
        c.weightx = c.weighty = 8.0; //ratio for filling the frame space
        gbl.setConstraints(panel, c);
        this.add(panel, c);

        setVisible(true);
    }

    // this function will be run from the EDT
    private static void createAndShowGUI() throws Exception {
        DemoNG cng = new DemoNG();
        cng.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cng.setSize(500, 500);
        cng.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    createAndShowGUI();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
