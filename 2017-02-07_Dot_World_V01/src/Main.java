import javax.swing.*;

public class Main {
	public static void main(String[] args){
		
		JFrame frame = new JFrame("Dis dah dotwrld");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GamePanel gPanel = new GamePanel();
		
		frame.getContentPane().add(gPanel);
		frame.pack();
		frame.setVisible(true);
	}
}

		/*
		Scanner in = new Scanner(System.in);
		double secondNumber;
		int firstNumber, addedTogether;
		
		System.out.print("Input your first number to add: ");
		firstNumber = in.nextInt();
		
		System.out.print("Input your second number to add: ");
		secondNumber = (double) in.nextDouble();
		System.out.println();
		
		//adds the numbers together and outputs the result
		addedTogether = firstNumber + (int) secondNumber;
		System.out.println(firstNumber + " + " + secondNumber + " = " + addedTogether);
	}

}*/
