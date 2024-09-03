
package areaofshape;

public class AreaOfShape {

    
    private int num1;
    private int num2;
    private int choice;
    private String message;

 
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    
    public double areaOfCircle() {
        return 3.1416 * this.num1 * this.num1;
    }

    public double areaOfTriangle() {
        return (this.num1 * this.num2) / 2.0;
    }

    public double areaOfSquare() {
        return this.num1 * this.num1;
    }

    public double areaOfRectangle() {
        return this.num1 * this.num2;
    }

    public double computeAreaOfShape(int num1) {
        this.num1 = num1;

        if (this.choice == 1) { 
            return areaOfCircle();
        } else if (this.choice == 2 || this.choice == 4) { 
            return computeAreaOfShape(num1, this.num2);
        } else if (this.choice == 3) {
            return areaOfSquare();
        } else {
            throw new IllegalArgumentException("Invalid choice. Must be 1-4.");
        }
    }

    public double computeAreaOfShape(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

        if (this.choice == 2) { 
            return areaOfTriangle();
        } else if (this.choice == 4) { 
            return areaOfRectangle();
        } else {
            throw new IllegalArgumentException("This method is not applicable for the current shape choice.");
        }
    }

   
    public String display() {
        

        this.message="Area of";

        if (this.choice==1){

            message+="circle is "+ this.areaOfCircle();

            message+="\nOther areas are:\nTriangle: "+ this.areaOfTriangle()+

                    "\nSquare: "+ this.areaOfSquare() +"\nRectangle: "+

                    this.areaOfRectangle();

        }else if(this.choice==2){

            message+="Triangle is "+ this.areaOfTriangle();

            message+="\nOther areas are:\nCircle: "+ this.areaOfCircle()+

                    "\nSquare: "+ this.areaOfSquare() +"\nRectangle: "+

                    this.areaOfRectangle();

        }else if (this.choice==3){

            message+="Square is "+ this.areaOfSquare();

            message+="\nOther areas are:\nTriangle: "+ this.areaOfTriangle()+

                    "\nCircle: "+ this.areaOfCircle()+"\nRectangle: "+

                    this.areaOfRectangle();

        }else if(this.choice==4){

            message+="Rectangle is "+ this.areaOfRectangle();

            message+="\nOther areas are:\nTriangle: "+ this.areaOfTriangle()+

                    "\nCircle: "+ this.areaOfCircle()+"\nSquare: "+

                    this.areaOfSquare();

        }
        return message;
    }


}


