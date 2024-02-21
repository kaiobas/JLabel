package EstudandoJLabel;


import java.net.URISyntaxException;
import javax.swing.*; 

public class LabelTest extends JFrame{
     

    public static void main(String[] args) throws URISyntaxException {
        JFrame frame = new JFrame();
        LabelFrame labelFrame = new LabelFrame();
        labelFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        labelFrame.setSize( 580, 680 );
        labelFrame.setVisible( true );
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        
        JButton site = new JButton("Site");
        JButton forums = new JButton("Forums");
         
              
       
        frame.add(panel);
        panel.add(label);
    }
  
}
