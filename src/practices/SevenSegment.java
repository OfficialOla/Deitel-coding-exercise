package practices;


    import java.awt.*;
    import java.security.KeyStore;
    import javax.swing.*;

    public class SevenSegment extends JPanel {
        // Constants for the dimensions of the display
        private static final int WIDTH = 60;
        private static final int HEIGHT = 100;

        // Constants for the positions of the segments
        private static final int X1 = 10;
        private static final int X2 = 50;
        private static final int Y1 = 10;
        private static final int Y2 = 40;
        private static final int Y3 = 70;
        private static final int Y4 = 90;

        // Flags for whether each segment is on or off
        private boolean a, b, c, d, e, f, g;

        public SevenSegment() {
            // Set the size of the panel
            setPreferredSize(new Dimension(WIDTH, HEIGHT));
        }

        public void setSegments(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
            // Set the flags for the segments
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            repaint();  // Repaint the panel with the new segment settings
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Draw the segments
            if (this.a) {
                g.drawLine(X1, Y1, X2, Y1);
            }
            if (this.b) {
                g.drawLine(X2, Y1, X2, Y2);
            }
            if (this.c) {
                g.drawLine(X2, Y2, X2, Y3);
            }
            if (this.d) {
                g.drawLine(X2, Y3, X2, Y4);
            }
            if (this.e) {
                g.drawLine(X2, Y4, X1, Y4);
            }
            if (this.f) {
                g.drawLine(X1, Y4, X1, Y3);
            }
            if (this.g) {
                g.drawLine(X1, Y3, X1, Y2);
            }
        }

        public static void main(String[] args) {
            SevenSegment display = new SevenSegment();
            JPanel panel = new JPanel();
            display.setSegments(true, true, false, true, false, true, false);

        }
    }

