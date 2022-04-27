package ie.tudublin;

import processing.data.TableRow;

public class nematode
{
    private String name;
    private int start;
    private int end;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public nematode(String name, int start, int end)
    {
        this.name = name;
        this.start = start;
        this.end = end;
    }



    public nematode(TableRow tr)
    {
        this(tr.getString("nematode"), tr.getInt("Start"), tr.getInt("End"));
    }

    @Override
    public String toString() {
        return "nematode [end=" + end + ", name=" + name + ", start=" + start + "]";
    }
    
}