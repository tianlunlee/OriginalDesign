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

public void setup()
{
	int opaque = 100;
	size(480, 640);
	background(0);
	fill(60, 45, 10);
	rect(0, 540, 480, 100);
	fill(0, 0, 0);
	rect(0,0,480,640);
}
public void draw()
{
	int cloudx;
	int cloudy;
	circle();

}

public void mouseClicked()
{
	opaque = 0;
}
public void mouseReleased(){
	opaque = 100;
}

public void circle() {
	ellipse (400,120,70,70);
}
public void lines(){

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
