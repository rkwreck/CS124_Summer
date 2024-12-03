public class Simple {
    private int storedInt = 0; 

    public int setValue (int setValue) {
        storedInt = setValue;
        return storedInt; 
    }

    public int squared() {
        return (storedInt*storedInt); 
    }

    public int inverse(){
        return (-1*storedInt); 
    }

} 