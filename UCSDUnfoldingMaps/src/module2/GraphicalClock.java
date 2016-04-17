package module2;
import processing.core.*;

public class GraphicalClock extends PApplet{
	private String URL = "http://www.trin.cam.ac.uk/sites/www.trin.cam.ac.uk/files/styles/standard_crop/public/standard_page_1_2.png?itok=GrDLxGCV";
	private PImage backgroundImg;
	private int count = 0;
	private boolean isUp = true;
	
	public void setup()
	{
		size(500,500);
		backgroundImg = loadImage(URL,"png");
		
	}
	public void draw()
	{	
		backgroundImg.resize(0, height);
		image(backgroundImg,0,0);
		
		if (isUp){
			count ++;
		}
		else{ 
			count --;
		}
		if (count == 256 && isUp)
		{	
			count--;
			isUp = false;
		}
		
		if (count == 0 && !isUp)
		{	
			count++;
			isUp = true;
		}
		
		
		fill(count % 256,100 ,0);
		ellipse(width/3,height/8,width/5,height/5);
		
	}
}
