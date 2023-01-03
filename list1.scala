object list1
{
   def main(args:Array[String])
   {
       var list = 10::20::30::Nil;
       println("Lisp Style is : " + list);
       
        var list2 = List(11,22,33);
       println("Java Style is : " + list2);
       
       var x3 = List.fill(3)("food");
       println("Fill is : " + x3);
             
       var x1 = List.range(1,10);
       println("Range is : " + x1);

      var x4 = List.tabulate(5)(n=>n*n);
      println("Tabulate Format is : " + x4);
       

   }
}
