/*Akie Kasai
*Harden
*5th
*DialogRequest.java
*Asks user's name with message dialog boxes and input boxes.
*/

import javax.swing.JOptionPane;

public class DialogRequest
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Hello!" + name);
		String inputUser = JOptionPane.showInputDialog("What would you like me to do?");
		JOptionPane.showMessageDialog("I'm sorry," + name + ". I'm afraid I can't do that.");
	}
}
