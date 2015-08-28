
PImage img;
int randomColor;
void setup()
{
	
	size(480, 640);
	background(255);
	img = loadImage("patrick.jpg");
}
void draw()
{
	randomColor = (int)(Math.random()*255);
	if (mousePressed == true) {
		
		fill(mouseY, mouseX, randomColor);
	}
	if (keyPressed == true && keyCode == SPACE) {
		fill(255);
		rect(0, 0, 480, 640);
	}
	mouseClicked();
}


void mouseClicked(){
	int x = 0;
	int y = 0;
	if (mousePressed == true && mouseButton == LEFT) {
		noStroke();
		ellipse(mouseX+x, mouseY+y, 10, 10);
	}
	else if (mousePressed == true && mouseButton == RIGHT)
	{
		image(img, mouseX-210, mouseY-118);
	}
}
