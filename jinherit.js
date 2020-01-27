 
class Shape { 
   shape(a)
   {
   this.Area=a;
   }
} 
class Circle extends Shape { 
    disp(r)
    {
    const x=3.14
    this.Area=x*r*r
      console.log("Area of the circle:  "+this.Area) 
   } 
} 
class Rectangle extends Shape {
    disp(a,b)
    {
        this.Area=a*b
        console.log("area of rectangle: "+this.Area)
    } 
}
var rj = new Circle(); 
rj.disp(5) 
var  dj=new Rectangle();
dj.disp(3,2)