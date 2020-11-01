import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class SortedNames {

public static void main(String[] args) {
      String name1;
      String name2;
      String name3;

      name1 = JOptionPane.showInputDialog ("Enter a name: ");

      name2 = JOptionPane.showInputDialog ("Enter another name: ");

      name3 = JOptionPane.showInputDialog ("Enter a third name: ");

      List<String> names = new ArrayList<String>();
      names.add(name1);
      names.add(name2);
      names.add(name3);

      Collections.sort(names, String.CASE_INSENSITIVE_ORDER);

      String allNames = "";
      for(String name : names) {
         allNames += name + "\n";
      }

      JOptionPane.showMessageDialog(null, allNames);
      
      System.exit(0);
   }
}