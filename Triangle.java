
package abstractexper;

public class Triangle extends Figure{
    public Triangle(int a,int b){
    super(a,b);
    
    }
    
    
    double Area(){
    System.out.println("The are of the triangle is: ");
    return (dim1*dim2)/2;
    
    }
    
}
