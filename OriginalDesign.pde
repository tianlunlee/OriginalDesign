int xPos = 0;
int opacity = 60;
void setup()
{
	size(480, 640);
	background(0);
	fill(60, 45, 10);
	rect(0, 540, 480, 100);

}
void draw()
{
	fill(25, 50, 100, opacity);
	rect(xPos,0,480,640);
	fill(255, 255, 255);
	circle();
	mouseClicked();
}

void mouseClicked()
{
	if (mousePressed == true) {
		opacity = 0;
	}
	else if (mousePressed == false) {
		opacity = 100;
	}
}

void circle() {
	ellipse (400,120,70,70);
}
