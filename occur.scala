object occur
{
     def main(args:Array[String])
     {
          var sc = new java.util.Scanner(System.in);
          println("Enter First String:");
          val first = sc.nextLine();
          println("Enter Second String:");
          val second = sc.nextLine();
          if(first.contains(second) == true)
          {
              println("Second String is part of the first string");
          }
          else
          {
              println("Second String is not part of the first string");
          }
    }
}
          
