object conv
{
     def binary(num:Int)
     {
          var bstr = " ";   //binary String 
          var rem = 0;
          println(num);
          var n1 = num;
          while(n1>0)
          {
               rem = n1 %2;
               n1 = n1/2;
               bstr = bstr+rem;
           }
           println("Binary :" + bstr);
      }
      def octal(num:Int)
      {
           var ostr = " " ; //binary string
           var rem = 0;
           println();
           println(num);
           var n1 = num;
           while(n1>0)
           {
                rem = n1%8;
                n1 = n1/8;
                ostr = rem + ostr;
            }
            println("Octal:"+ostr);
      }
      def main(args:Array[String])
      {
           var r = new scala.util.Random;
           binary (r.nextInt(100));   //take a number from 0 to 100 
           octal(r.nextInt(15));
      }
}
