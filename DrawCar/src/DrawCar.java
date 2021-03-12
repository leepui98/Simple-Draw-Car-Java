import java.awt.Color;

import ecs100.*;

public class DrawCar {
	// If you need any constants or fields, put them here
	
	public DrawCar() {
		// Set up your buttons here
		UI.initialise();
		UI.addButton("Draw car", this:: drawCars);
	}
	
	
	public void drawCars() {
		
		double x= UI.askInt("Position of the car(left to right)?");
		double y=UI.askInt("Position of the car(top to bottom)?");
		double length= UI.askInt("Length of the car?");
		double height= UI.askInt("Height of the car?");
		
		String col= UI.askString("What color for the head part?Please choose from red, blue, yellow,black,green.");  //from Ali
	
		Color c = Color.white;    //color c is variable, white is default color
		
		if(col.equals("black")) {
			c = Color.black;
		}
		
		else if (col.equals("red")){
			c = Color.red;
		}
		
		else if  (col.equals("blue")) {
			c = Color.blue;
		}
		
		else if(col.equals("green")) {
			c = Color.green;
		}
		
		else if(col.equals("yellow")) {
			c = Color.yellow;
		}
		
		
		String cola= UI.askString("What color for the body part?Please choose from red, blue, yellow,black,green.");
		
		Color ca = Color.white;    //color c is variable, white is default color
		
		if(cola.equals("black")) {
			ca = Color.black;
		}
		
		else if (cola.equals("red")){
			ca = Color.red;
		}
		
		else if  (cola.equals("blue")) {
			ca = Color.blue;
		}
		
		else if(cola.equals("green")) {
			ca = Color.green;
		}
		
		else if(cola.equals("yellow")) {
			ca = Color.yellow;
		}
		
		
		String colw= UI.askString("What color for the 1st wheel part?Please choose from red, blue, yellow,black,green.");
		
        Color cw = Color.black;    //color c is variable, white is default color
		
		if(colw.equals("black")) {
			cw = Color.black;
		}
		
		else if (colw.equals("red")){
			cw = Color.red;
		}
		
		else if  (colw.equals("blue")) {
			cw = Color.blue;
		}
		
		else if(colw.equals("green")) {
			cw = Color.green;
		}
		
		else if(colw.equals("yellow")) {
			cw = Color.yellow;
		}
		
String colwa= UI.askString("What color for the 2nd wheel part?Please choose from red, blue, yellow, black, green.");
		
        Color cwa = Color.black;    //color c is variable, white is default color
		
		if(colwa.equals("black")) {
			cwa = Color.black;
		}
		
		else if (colwa.equals("red")){
			cwa = Color.red;
		}
		
		else if  (colwa.equals("blue")) {
			cwa = Color.blue;
		}
		
		else if(colwa.equals("green")) {
			cwa = Color.green;
		}
		
		else if(colwa.equals("yellow")) {
			cwa = Color.yellow;
		}
		
		this.drawCar(x, y, c, ca, cw, cwa, length, height);
		
		
		this.drawCar(x+100, y+100, ca, ca, ca, ca, length, height);
		
		
	}
	
	public void drawCar(double left,double top,Color col1, Color col2, Color col3, Color col4, double length, double height) {
		UI.println("Innnnnnn " + left + " "+top);
		UI.setColor(col1);
		UI.fillRect(left, top, length/3, height);  
		UI.setColor(col2);
		UI.fillRect(left, top+height, length, height);
		UI.setColor(col3);
		UI.fillOval(left, top+2*height,length/10 ,length/10 );   //from Ali
		UI.setColor(col4);
		UI.fillOval(left+length, top+2*height,length/10 ,length/10); 
		
	}
	
	
	/* UI.setLineWidth(3);
	 * UI.drawLine(x-length,y+2*height,x+3*length,y+2*height); //draw a line of road
	 * UI.setColor(Color.green);
	 * UI.fillOval(x+2*length, 
	 */
	
	
	public static void main(String[] args) {
		//
		new DrawCar();
	}

}
