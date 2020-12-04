import javax.swing.*;
import java.awt.*;

public class GameManager extends JFrame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public GameManager() {
        setTitle("Pandemic simulator");
        setSize(1024,720);
        setLayout(new GridBagLayout());
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI gui = new GUI();
        this.add(gui);
    }

    public static void main(String[] args){
        GameManager frame = new GameManager();
        frame.setVisible(true);

    }

}