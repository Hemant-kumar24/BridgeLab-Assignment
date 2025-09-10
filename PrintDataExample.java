import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class PrintDataExample implements Printable {

    public static void main(String[] args) {
        try {
            // Create a printer job
            PrinterJob job = PrinterJob.getPrinterJob();
            // Set the class that will handle printing
            job.setPrintable(new PrintDataExample());

            // Show print dialog
            if (job.printDialog()) {
                job.print(); // Send data to printer
            }
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException {
        if (pageIndex > 0) { // Only one page
            return NO_SUCH_PAGE;
        }

        // Shift origin to printable area
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        // Print text
        g.drawString("Hello, this is a print test!", 100, 100);
        g.drawString("Name: Hemant Kumar", 100, 120);
        g.drawString("Age: 21", 100, 140);

        return PAGE_EXISTS;
    }
}
