void setup()
{
background(0);
}
void draw()
{
	change();
	circle();
}

void change()
{

	if (mousePressed == true) {
		fill (random(0,255), random(0,255), random(0,255));
	}

}
void circle() {
	ellipse (50,50,30,30);
}
void lines(){

}