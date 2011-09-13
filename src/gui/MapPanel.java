package gui;
import java.awt.Image;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MapPanel extends JPanel {
    private String fromAddress, toAddress;
    
	public MapPanel(String fromAddress, String toAddress){
		this.fromAddress = fromAddress;	
		this.toAddress = toAddress;	
		JLabel l = new JLabel(new ImageIcon(loadImage()));
		add(l);
	}

	// see http://code.google.com/apis/maps/documentation/staticmaps
    private Image loadImage(){
        Image image = null;
	    try {
	        URI uri = new URI("http", "maps.googleapis.com", "/maps/api/staticmap", 
	        		"markers=color:blue|label:A|" + fromAddress + 
	        		"&markers=color:red|label:B|" + toAddress + 
	        		"&size=400x400&sensor=false", null);
	        URL url = uri.toURL();
	        System.out.println(url);
	        image = ImageIO.read(url);
	    } catch (IOException e) {
			e.printStackTrace();
	    } catch (URISyntaxException e) {
			e.printStackTrace();
		}
	    return image;
    }
}
