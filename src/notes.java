import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
public class notes {
    public static void main(String[] args) {
        Scanner in;
        File selectedFile;

        JFileChooser chooser =  new JFileChooser();

        try{
            File workingDirectory = new File(System.getProperty("user.dir"));  //create the class for the
            // file so we can access methods
            chooser.setCurrentDirectory(workingDirectory);  //sets the current directory as the user
            // directory
            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
                selectedFile = chooser.getSelectedFile();  //sets selectedFile to the one we chose
                in = new Scanner(selectedFile); //lets us manipulate through the console for reading
            }

            }catch(FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found");  //show a pop up
            System.exit(0);  //program ends gracefully
            }


    }
}