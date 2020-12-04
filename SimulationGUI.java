import java.awt.Color;

import javax.swing.*;
//import java.awt.*;

public class SimulationGUI extends JPanel{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JLabel title = new JLabel("\"Pandemic simulator\"");
    String activeCases = "Active cases: ";
    String deaths = "Deaths: ";
    String recovered = "Recovered: ";


    public SimulationGUI(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(title);
        JLabel labelActive = new JLabel(activeCases + "100");
        JLabel labelDeaths = new JLabel(deaths + "712345678");
        JLabel labelRecovered = new JLabel(recovered + "3"); //Marcin Małas tyle podał    
        this.add(labelActive);
        this.add(labelDeaths);
        this.add(labelRecovered);
        this.setBackground(Color.PINK);
        //this.setBorder();
    }

    
}
