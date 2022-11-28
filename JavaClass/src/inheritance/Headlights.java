package inheritance;

public class Headlights {
int no,brightness;
String color,shape;

        Headlights(int no,int brightness,String color,String shape)
        {
        	this.no=no;
        	this.brightness=brightness;
        	this.color=color;
        	this.shape=shape;
        }

public String toString()
{
	return no+" "+brightness+" "+color+" "+shape;
}

}
