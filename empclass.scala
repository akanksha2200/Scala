abstract class Employee
{
     def computesal();
}
class worker extends Employee
{
    var hr:Double = 0.0;
    var rate:Double = 0.0;
    var tot:Double = 0.0;
    def computesal()
    {
        println("Enter no of hours emp work :");
        hr = scala.io.StdIn.readDouble();
        println("Enter rate per hours work :");
        rate = scala.io.StdIn.readDouble();
        tot = hr*rate;
        println("Total Salary of worker is : " + tot);
    }
}
class Manager extends Employee
{
     var basic:Double = 0.0;
     var hra:Double = 0.0;
     var da:Double  = 0.0;
     var ta:Double = 0.0;
     var IT:Double = 0.0;
     var PF:Double = 0.0;
     var netsal:Double = 0.0;
     def computesal()
     {
        println("Enter Basic Salary of Managaer :");
        basic = scala.io.StdIn.readDouble();
        hra = 0.10*basic;
        ta = 0.08*basic;
        da = 0.12*basic;
        IT = 0.15*basic;
        PF = 0.12*basic;
        netsal = (basic+hra+da+ta) - (IT+PF);
        println("Salary of Manager is : " + netsal);
    }
}
object empclass
{
      def main(args:Array[String])
      {
           var e1 = new worker();
           var e2 = new Manager();
           e1.computesal();
           e2.computesal();
      }
}

