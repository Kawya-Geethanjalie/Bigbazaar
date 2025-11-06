package my_pos_system;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage; // අලුතින් අවශ්‍යයි
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.io.File; // අලුතින් අවශ්‍යයි
import java.io.IOException; // අලුතින් අවශ්‍යයි
import java.util.ArrayList;
import javax.imageio.ImageIO; // අලුතින් අවශ්‍යයි
import javax.swing.JOptionPane; // Error messages පෙන්වීමට අවශ්‍ය විය හැක
// import javax.swing.ImageIcon; // තවදුරටත් අවශ්‍ය නොවේ

/**
 *
 * @author Ravindra
 */
public class BillPrinter implements Printable {
    private BufferedImage logo; // Image වෙනුවට BufferedImage භාවිතා කරයි
    private ArrayList<String> billDetails;
    private static final int LOGO_WIDTH = 280;  // ලාංඡනයට අවශ්‍ය කුඩා පළල
    private static final int LOGO_HEIGHT = 65; // ලාංඡනයට අවශ්‍ය කුඩා උස

    public BillPrinter(String logoPath, ArrayList<String> billDetails) {
        this.billDetails = billDetails;
        loadAndResizeLogo(logoPath); // Image load කිරීම සහ resize කිරීම
    }

    
    private void loadAndResizeLogo(String logoPath) {
        try {
            // 1. මුල් Image එක BufferedImage ලෙස load කිරීම
            BufferedImage originalImage = ImageIO.read(new File(logoPath));

            if (originalImage != null) {
                // 2. Image එක කුඩා කිරීමට getScaledInstance() භාවිතා කිරීම
                Image scaledImage = originalImage.getScaledInstance(LOGO_WIDTH, LOGO_HEIGHT, Image.SCALE_SMOOTH);

                // 3. කුඩා කළ Image එක BufferedImage එකකට convert කිරීම
                logo = new BufferedImage(LOGO_WIDTH, LOGO_HEIGHT, BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2d = logo.createGraphics();
                g2d.drawImage(scaledImage, 6, 6, null);
                g2d.dispose();
            }
        } catch (IOException e) {
            // Image load කිරීමේදී හෝ resize කිරීමේදී දෝෂයක් ඇති වුවහොත්
            // System.out.println("Error loading/resizing logo: " + e.getMessage());
            // ඔබට අවශ්‍ය නම් මෙහි JOptionPane එකක් දැමිය හැක
            logo = null; 
        }
    }


    @Override
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
        if (page > 0) { // We only print one page
            return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        // Draw the logo
        g.drawImage(logo, 5, 5,null);
        

        // Draw the bill details
        g.setFont(new Font("Serif", Font.PLAIN, 10));
        int y = 90; // Starting Y position for text
        int tabSpacing = 100; // X position for tabbed text
        for (String line : billDetails) {
            String[] parts = line.split("\t");
            int x = 50;
            for (String part : parts) {
                g.drawString(part, x, y);
                x += tabSpacing; // Move to the next tab position
            }
            
            y += 17; // Line spacing
        }

        return PAGE_EXISTS;
    }
}