object strdisp
{
      def main(args:Array[String])
      {
           var str:Array[String] = Array("Hello Good Morning ","Hello Good Night","Hello Good Afternoon");
           var str1 = " ";
           println("Enter String : ");
           str1 = readLine();
           var str2 = str:+str1;
           for(j<-str2)
           {
              println(j);
           }
     }
}

