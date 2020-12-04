import java.awt.Color;

import javax.swing.*;
// import java.awt.*;

public class Menu extends JPanel{
    


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JButton menuButton = new JButton(new ImageIcon("button_menu.png"));
    JButton rulesButton = new JButton("RULES");
    JButton tipButton = new JButton("TIPS");
    JButton pauseButton = new JButton("PAUSE");
    JButton restartButton = new JButton("RESTART");

    public Menu(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.GREEN);
        this.add(menuButton);
        this.add(tipButton);
        this.add(rulesButton);
        this.add(pauseButton);
        this.add(restartButton);
    }
}
