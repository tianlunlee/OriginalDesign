void setup()
{
	int opaque = 100;
	size(480, 640);
	background(0);
	fill(60, 45, 10);
	rect(0, 540, 480, 100);
	fill(0, 0, 0);
	rect(0,0,480,640);
}
void draw()
{
	int cloudx;
	int cloudy;
	circle();

}

void mouseClicked()
{
	opaque = 0;
}
void mouseReleased(){
	opaque = 100;
}

void circle() {
	ellipse (400,120,70,70);
}
void lines(){

}