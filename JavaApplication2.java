
package javaapplication2;

public class JavaApplication2 {

    // encapsulation
    
    private String color;
    private String brand;
    
    public void SetofColor (String color) {
        this.color = color;
        
    }
    public String getColor () {
        return this.color;
    }
    
}

// It should be in separate FILE


package javaapplication2;

public class TestCar {
      
    public static void main(String[] args) {
        JavaApplication2 c1 = new JavaApplication2();
          c1.SetofColor("black");
    System.out.println (c1.getColor());
    }
    
}




    
    

