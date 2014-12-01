package cz.cvut.neuralnet;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Tomas Barton
 */
public class ALSlider implements ChangeListener {

    private ComputeGNG compute;

    public ALSlider(ComputeGNG compute) {
        this.compute = compute;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        // TODO Auto-generated method stub
        JSlider source = (JSlider) e.getSource();
        if (true/*!source.getValueIsAdjusting()*/) {
            compute.delay = (50 - (int) source.getValue()) * 10;
        }
    }
}
