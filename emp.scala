class employee(var ename:String,var dept:String)
{
       def display()
       {
           println("________________________");
           println("Name :" + ename);
           println("Department Name : " +dept);
        }
}
object emp
{
        def main(args:Array[String])
        {
            var e1 = new employee("Vishnu","finance"); 
            var e2 = new employee("Sumit","finance");
            var e3 = new employee("ABC","Marketing");
            var e4 = new employee("XyZ","finance");
            var e5 = new employee("Tushar","Marketing");
            var m1:Map[Int,employee] = Map(1->e1 ,2->e2 , 3->e3 , 4->e4 , 5->e5);
            for((k,v)<-m1)
            {
                if(v.dept.equalsIgnoreCase("marketing"))
                v.display();
            }
}
}
