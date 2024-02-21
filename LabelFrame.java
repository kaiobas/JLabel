
package EstudandoJLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class LabelFrame extends JFrame{    
    public void openWebPage(String url){
   try {         
     java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://ava.cba.ifmt.edu.br/"));
   }
   catch (java.io.IOException e) {
       System.out.println(e.getMessage());
     }
    }
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JButton site;
    ImageIcon IFMT = new ImageIcon("IFMT.png");
    URI uri;
    public LabelFrame() throws URISyntaxException{
       
        super("Instituto Federal");
        this.uri = new URI("https://ava.cba.ifmt.edu.br/");
        setLayout(new FlowLayout());
        
        label1 = new JLabel("Mato Grosso");
        label1.setToolTipText("Label is label1");
        add(label1); 
        
        Icon bug = new ImageIcon(getClass().getResource("IFMT.png"));
        label2 = new JLabel("Cel. Jorge Octayde", bug, 
                SwingConstants.LEFT);
        label2.setToolTipText("Campus");
        add(label2);
        
        label3 = new JLabel(); 
        label3.setText("Instituto Federal");
        label3.setIcon(IFMT);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("IFMT");
        add(label3);
        
        site = new JButton("Site IFMT");
        JButton site = new JButton("Site IFMT");
        JPanel panel = new JPanel();
        panel.add(site);         
        site.setSize(200, 100);
        add(site);
        
         site.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
                
            try {
                java.awt.Desktop.getDesktop().browse(uri);
                
            } catch (IOException ex) {
                Logger.getLogger(LabelFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        
        });

       
    }
    
}
