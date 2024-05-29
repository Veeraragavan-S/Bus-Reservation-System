package busreservation;

public class Bus //Data model
{
    private int busNo;
    private boolean ac;
    private int capacity;

    Bus(int busNo,boolean ac,int capacity)
    {
        this.busNo=busNo;
        this.ac=ac;
        this.capacity=capacity;
    }

    public int getBusNo() 
    {
        return busNo;
    }
    public boolean getac()
    {
        return ac;
    }
    public int getCapacity() 
    {
        return capacity;
    }
    public void setBusNo(int busNo) 
    {
        this.busNo = busNo;
    }
    public void setAc(boolean ac) 
    {
        this.ac = ac;
    }
    public void setCapacity(int capacity) 
    {
        this.capacity = capacity;
    }

    
}
