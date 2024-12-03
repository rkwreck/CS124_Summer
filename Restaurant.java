//data modeling 1 practice problems
//yay this works!!

public class Restaurant {
    private String name; 
    private int capacity; 

    public Restaurant(String theName, int theCapacity) {
        assert theCapacity > 0 : "Capacity must be a value greater than 0";
        assert theName != null : "Name cannot be null"; 
        this.name = theName; 
        this.capacity = theCapacity; 
    }

    public int getCapacity() {  
        return this.capacity; 
    }

    public String getName() {
        return this.name; 
    }
}

Restaurant r1 = new Restaurant("Rini's Kitchen", 50);  
System.out.println(r1.getCapacity()); 
Restaurant r2 = new Restaurant("Rini's Kitchen", -5);
Restaurant r3 = new Restaurant(null, 50);