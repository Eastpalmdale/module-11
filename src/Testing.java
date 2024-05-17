import javax.swing.*;
import java.util.*;

public class Testing {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int myInt = safeinput.jOptionRangedInt(in, "1-10", 0, 11);
        JOptionPane.showMessageDialog(null, "wrong type");

    }
}
