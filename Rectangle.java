
package abstractexper;

public class Rectangle extends Figure {
    public Rectangle(int a,int b){
    super(a,b);
    }
    
    double Area(){
    System.out.println("The area of this rectangle is: ");
    return dim1*dim2;
    }
    
}
