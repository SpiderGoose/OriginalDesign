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

int circleSize = 10;
boolean Circles = false;

public void setup()
{
size(500,500);
background(150);
}








public void draw()
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
text(circleSize,10,10);
fill(150);
rect(10,10,40,40);


}










public void mousePressed()
{
	Circles = true;
 
}



// erase board
public void Wipe()
{
	if( keyPressed)
	{
		if(key == 'w')
		background(150);
	}

}


public void BrushSize()
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
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
