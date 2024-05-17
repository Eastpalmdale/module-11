import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;


public class lab11 {


    public static void main(String[] args) {
        // perpetually needed
        String line = "";
        Scanner in;
        File selectedFile;
        JFileChooser chooser = new JFileChooser();
        // perpetually needed
        try{
            // always create this file
            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);
            // file needs to be examined, make sure to select file
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                // set file in need of examination
                selectedFile = chooser.getSelectedFile();
                // drop into scanner
                in = new Scanner(selectedFile);
                // checking file line per line
                boolean found = false;
                int wordCount = 0;
                int characterCount = 0;
                String[] words = new String[0];
                String[] characters = new String[0];
                while (in.hasNextLine()) {
                    line = in.nextLine();
                    words = line.split(" ");
                    characters = line.split("aAbBcCdDeEfFgGhHiIjJ1234567890");
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].equalsIgnoreCase("talawanda")) {
                            found = true;
                        }
                    }
                }
                if (found = true) {
                    JOptionPane.showMessageDialog(null, "Talawanda was found");
                } else {
                    JOptionPane.showMessageDialog(null, "Talawanda was not found");
                }
                for (int i = 0; i < words.length; i++){
                    wordCount++;
                }
                for (int i = 0; i < characters.length; i++){
                    characterCount++;
                }
                JOptionPane.showMessageDialog(null, wordCount);
                JOptionPane.showMessageDialog(null, characterCount);
            }

        }
        // perpetually needed for try to catch what the try doesn't get
        catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "File not found.");
            System.exit(0);
        }

    }
}
