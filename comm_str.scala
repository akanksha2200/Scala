object comm_str
{
      def main(args:Array[String])
      {
          var str1:Set[String]= Set("Hello","Good Morning");
          var str2:Set[String]= Set("Hello","Good Night");
          var str3=str1.diff(str2);
          println(str1);
          println(str2);
          println(str3);
          var str4 = str2.diff(str1);
          println(str4);
          str3 ++= str4;
          println(str3);
      }
} 
