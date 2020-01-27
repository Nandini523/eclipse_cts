class car
{
    run()
    {
    console.log("run car");
    }
}
class marsuz extends car
{
    run ()
    {
        console.log("run marsuz")
    }
}
class marsuz extends marsuz100
{
    run ()
    {
        console.log("run marsuz100")
    }
}
var c=new car();
c.run();
var c=new marsuz();
c.run();
var c=new marsuz100();
c.run();