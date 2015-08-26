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


int oP = 100;
public void setup()
{
	size(480, 640);
	background(0);
	fill(60, 45, 10);
	rect(0, 540, 480, 100);

}
public void draw()
{
	if (oP == 100) {
		fill((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
		noLoop();
	}
	else if (oP == 0){
		fill((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
	}
	rect(0,0,480,640);
	fill(255, 255, 255);
	circle();

}

public void mouseClicked()
{
	if (oP == 100) {
	oP = 0;
	}
	else if (oP == 0) {
	oP = 100;
	}
}


public void circle()
{
	ellipse (400,120,70,70);
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
