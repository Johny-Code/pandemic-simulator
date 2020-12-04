import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public GUI() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();    //położenie danego komponentu
        JPanel simulationGUI = new SimulationGUI();         //tytuł + liczba chorych
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        this.add(simulationGUI, c);
        c.ipady = 0;                                        //reset to default

        JPanel polandMap = new PolandMap();
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        this.add(polandMap, c);
        c.ipady = 0;

        JPanel Menu = new Menu();
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        this.add(Menu, c);
        c.ipady = 0;

    }


}