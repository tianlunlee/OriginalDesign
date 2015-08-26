
int oP = 100;
void setup()
{
	size(480, 640);
	background(0);
	fill(60, 45, 10);
	rect(0, 540, 480, 100);

}
void draw()
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

void mouseClicked()
{
	if (oP == 100) {
	oP = 0;
	}
	else if (oP == 0) {
	oP = 100;
	}
}


void circle()
{
	ellipse (400,120,70,70);
}
