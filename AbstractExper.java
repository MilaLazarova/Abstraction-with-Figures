
package abstractexper;

public class AbstractExper {

   
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(7,8);
        Triangle t1=new Triangle(7,7);
        System.out.println(r1.Area());
        System.out.println(t1.Area());
        
        
        System.out.println(r1.getClass());
    }
    
}
