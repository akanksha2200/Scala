import scala.collection.mutable.ListBuffer
object list
{
    def main(args:Array[String])
    {
        var l1 = List.range(1,10);
        var l2:ListBuffer[Int] = ListBuffer();
        for(i<-l1)
        {
           for(j<-1 to i)
           {
              if(i==j*j)
                l2 += i; 
           }
        }
        println("Perfect Number : " + l2);
    }
}
 
