/* This class accepts a letter grade A-F
   and a numeric grade 0 - 4 and converts
   the letter grade to a numeric grade and
   the numeric grade to a letter grade.
*/// On my honor, this is my code and it was not provided to me.-Jack Elginer
public class Grades
{
	// Instance fields
	private String origLetter;
	private double newNumeric;
	
	private double origNumeric;
	private String newLetter;
	
	// Default constructor
	public Grades()
	{
		origLetter = "";
		origNumeric = 0;
		newLetter = "";
		newNumeric = 0;
	}
	
	// Parametric constructor
	public Grades(String oldLetter, double oldNumeric)
	{
		origLetter = oldLetter;
		origNumeric = oldNumeric;
		
		setNewNumeric();
		setNewLetter();
	}
	
	// Mutator method for new numeric grade
	private void setNewNumeric()
	{
		if (origLetter.substring(0, 1).equals("A"))
		{
			newNumeric = 4;
		}
		else if (origLetter.substring(0, 1).equals("B"))
		{
			newNumeric = 3;
		}
      	else if (origLetter.substring(0, 1).equals("C"))
		{
			newNumeric = 2;
		}
		else if (origLetter.substring(0, 1).equals("D"))
		{
			newNumeric = 1;
		}
		else
		{
			newNumeric = 0;
		}
	}	
	
	// Mutator method for new letter grade
	private void setNewLetter()
	{
		if (origNumeric == 4)
		{
			newLetter = "A+";
		}
		else if (origNumeric <= 3.99 && origNumeric >= 3.85)
		{
			newLetter = "A";
		}
		else if (origNumeric <= 3.84 && origNumeric >= 3.69)
		{
			newLetter = "A-";
		}
		else if (origNumeric <= 3.68 && origNumeric >= 3.34)
		{
			newLetter = "B+";
		}
		else if (origNumeric <= 3.34 && origNumeric >= 3.0)
		{
			newLetter = "B";
		}
		else if (origNumeric <= 2.99 && origNumeric >= 2.70)
		{
			newLetter = "B-";
		}
		else if (origNumeric <= 2.69 && origNumeric >= 2.3)
		{
			newLetter = "C+";
		}
		else if (origNumeric <= 2.29 && origNumeric >= 2.0)
		{
			newLetter = "C";
		}
		else if (origNumeric <= 1.99 && origNumeric >= 1.7)
		{
			newLetter = "C-";
		}
		else if (origNumeric <= 1.69 && origNumeric >= 1.3)
		{
			newLetter = "D+";
		}
		else if (origNumeric <= 1.29 && origNumeric >= 1.0)
		{
			newLetter = "D";
		}
		else if (origNumeric <= .99 && origNumeric >= .01)
		{
			newLetter = "D-";
		}
		else if (origNumeric == 0)
		{
			newLetter = "F";
		}
		else
		{
			newLetter = "Invalid Letter Grade";
		}
	}
	// Accessor method for new numeric grade
	public double getNewNumeric()
	{
		return newNumeric;
	}
	
	// Accessor method for new letter grade
	public String getNewLetter()
	{
		return newLetter;
	}
	
}
