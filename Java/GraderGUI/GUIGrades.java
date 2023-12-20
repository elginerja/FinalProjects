/* The driver class below uses
   the Grade class to convert
   grades entered by the user
   into other forms of the same
   grade. The results are shown
   in a GUI, as is the input.
*/

import javax.swing.JOptionPane;

public class GUIGrades //steeuuupid file name has to be same for java
{
	public static void main(String[] args)
	{
		String origLetter = JOptionPane.showInputDialog("Please enter Letter Grade (capital letter):");
    
		//include string for origNumeric

		String origNumeric = JOptionPane.showInputDialog("Please enter Numeric Grade (on a 4.0 scale):");

		//constructor of new Grade object from Grade.java file
		Grades userGrades = new Grades(origLetter, Double.parseDouble(origNumeric));
    
    //displays the final result
		
		JOptionPane.showMessageDialog(null,
				"Numeric Grade Equivalent = " + userGrades.getNewNumeric() +
						"\n\nLetter Grade Equivalent = " + userGrades.getNewLetter(),
				"Grades",
				JOptionPane.INFORMATION_MESSAGE);
	}
}