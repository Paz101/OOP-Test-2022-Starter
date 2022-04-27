package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(800, 800);
		loadNematodes();
        printNematodes();
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();				
	}
	

	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");

        for(TableRow row:table.rows())
        {
            nematode Nematode = new nematode(row);
            nematode.add(Nematode);
        }
	}

	public void printNematodes()
    {
        for(nematode t:Nematodes)
        {
            println(t);
        }
    }
    public void draw()
    {
        background(0);
        displayNematodes();
    }
}