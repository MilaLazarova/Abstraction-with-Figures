
package abstractexper;


public abstract class Figure {
    int dim1;
    int dim2;
    public Figure(int a,int b){
    this.dim1=a;
    this.dim2=b;
    
    }
    abstract double Area();
}
