import java.util.*;
class Vector{
    double x;
    double y;

    //constryctor
    Vector(double x,double y){
        this.x = x;
        this.y = y;
    }


    //return double
    public double getlenght(){
        double l = Math.sqrt(x*x+y*y);
        return l;
    }
    public double dot(Vector v){
        return v.x*this.x + v.y*this.y;
        //v.x x=input
        //this.x = x this
    }
    public double getdirection(){
        return Math.atan2(y, x);
    }

    public Vector plus(Vector v){
        double ux = this.x+ v.x;
        double uy = this.y + v.y;
        Vector u = new Vector(ux,uy);
        return u; 
    }
    public double getUniVector(double x, double y){
       this.x = x/getlenght();
       this.y = y/getlenght();
       return Vector(this.x,this.y);
    }
}
