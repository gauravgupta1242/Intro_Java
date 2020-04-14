// Passing object in Java is not call by reference but passing the value
// As we are passing not object but the hash code 

public class PassingObject {

	public static void main(String[] args) {
		
		// building a Paper object p 
		Paper p = new Paper();
		p.setText("Hello World"); // calling the setText method
		System.out.println("1st " + p.getText());
		
		// Building Printer object hp
		Printer hp = new Printer();
		
		// Passing p object to print method of Printer class 
		hp.print(p); // It will set the text to "Get Lost"
		
		// It will create a second reference to same object in heap memory 
		
		System.out.println("2nd " +p.getText());
		
		// Two object created have the same 
	}

}


class Printer
{
	public void print(Paper p)
	{
		p.setText("Get Lost");
	}
}

class Paper
{
	String text;
	public void setText(String t)
	{
		text = t;
	}
	
	public String getText()
	{
		return text;
	}
}