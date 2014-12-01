package cz.cvut.neuralnet;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Event;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import javax.swing.JPanel;

/**
 *
 * @author Tomas Barton
 */
public class GraphGNGPanel extends JPanel {

    private static final long serialVersionUID = 4775675524829440288L;

    CNGPanel parent;
    SelGraphics graph;
    TextField error;

    /**
     * The name of the clear button.
     */
    protected final static String CLEAR = "Clear";
    /**
     * The name of the close button.
     */
    protected final static String CLOSE = "Close";

    public GraphGNGPanel(CNGPanel demo) {
        this.parent = demo;
        graph = new SelGraphics();
        //setTitle("ErrorGraph");

        setLayout(new BorderLayout());
        add("North", new Label("  Error Graph"));
        add("Center", graph);
        Panel pSouth = new Panel();
        pSouth.add(new Button(CLEAR));
        pSouth.add(new Button(CLOSE));
        add("South", pSouth);
        this.revalidate();
    }

    @Override
    public boolean handleEvent(Event evt) {
        if (CLEAR.equals(evt.arg)) {
            graph.clear();
            return true;
        } else if (CLOSE.equals(evt.arg)) {
            parent.graphClose();
            return true;
        }
        return super.handleEvent(evt);
    }

}
