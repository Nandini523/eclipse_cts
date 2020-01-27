class car
{   
    constructor(...type)
    {this.type=type}
    disp()
    {
    console.log("run car");
    }
}
class marsuz extends car
{   
    
    constructor(id ,color)
    {   super();
        this.id=id;
        this.color=color;
    }
    disp ()
    {
        console.log("run marsuz")
    }
}
class marsuz100 extends marsuz
{
    constructor(speed ,engine)
    {   super();
        this.speed=speed;
        this.engine=engine;
    }
    disp ()
    {
        console.log(this.type)
    }
}

var b=new marsuz100(car1,523,blue,80,wow);
b.disp();