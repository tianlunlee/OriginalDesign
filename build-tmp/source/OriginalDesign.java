import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {


PImage img;
public void setup()
{
	
	size(480, 640);
	background(255);
	img = loadImage("patrick.jpg");
}
public void draw()
{
	
	if (mousePressed == true) {
		fill((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));

	}
	else if (mousePressed == false){
		fill(255, 255, 255);
	}

	mouseClicked();
}


public void mouseClicked(){
	int x = 0;
	int y = 0;
	if (mousePressed == true && mouseButton == LEFT) {
		ellipse(mouseX+x, mouseY+y, 50, 50);
	}
	else if (mousePressed == true && mouseButton == RIGHT)
	{
		image(img, mouseX-210, mouseY-118);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
