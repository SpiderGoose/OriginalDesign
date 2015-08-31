int circleSize = 10;
boolean Circles = false;

void setup()
{
size(500,500);
background(150);
}








void draw()
{
// Drawing 
	if(Circles == true){
	noStroke();
	fill(0,mouseX,mouseY);
  ellipse(mouseX,mouseY,circleSize,circleSize);
}



// Toggle on/off mouseclick
if(mousePressed == false)
{
	Circles = false;
}
Wipe();
BrushSize();



}










void mousePressed()
{
	Circles = true;
 
}



// erase board
void Wipe()
{
	if( keyPressed)
	{
		if(key == 'w')
		background(150);
	}

}


void BrushSize()
{
	if(keyPressed)
	{
		if(key == 's')
		{
			circleSize = circleSize + 1;
		}
		else if(key == 'a' && circleSize > 0)
			{circleSize = circleSize - 1;
			}
	}
}