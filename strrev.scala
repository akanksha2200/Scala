object strrev
{
     def reverseString(ch:Char):Char =
     {
          if(ch.isLower)
             ch.toUpper;
          else
             ch.toLower;
       
     }
     def main(args:Array[String])
     {
         var ch = ' ';
         var str = "";
         println("Enter String :");
         str = scala.io.StdIn.readLine();
         var str1 = new StringBuilder(str);
         println("Enter Character :");
         ch = scala.io.StdIn.readChar();
         str1.deleteCharAt(str1.indexOf(ch.toString()));
         var str3 = str1.deleteCharAt(str1.lastIndexOf(ch.toString())).toString;
         var str4 = str3.map(reverseString);
         println(str4);
     }
}
