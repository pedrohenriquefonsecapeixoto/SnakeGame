import javax.swing.*;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

public class Main{
    public static void main(String[] args){
       try {
           System.setProperty("flatlaf.useWindowDecorations", "true");
           UIManager.setLookAndFeel(new FlatMacDarkLaf());
       } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Flatlaf Error: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
       }
        SwingUtilities.invokeLater(view.MenuFrame::new);
    }
}