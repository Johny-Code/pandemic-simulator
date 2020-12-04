import javax.swing.*;
// import java.awt.*;
// import java.awt.image.BufferedImage;
// import java.io.*;
// import javax.imageio.ImageIO;
//import java.io.*;

public class PolandMap extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public PolandMap(){
        JLabel map = new JLabel();
        map.setIcon(new ImageIcon("poland.png"));
        this.add(map);
    }
    
    
}
