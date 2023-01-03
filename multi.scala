object multi
{
   def main(args:Array[String])
   {
         println("Enter no of rows and columns of 1st matrix :");
         var r = readInt();
         var c = readInt();
         println("Enter no of rows and columns of 2ns matrix :");
         var r1 = readInt();
         var c1 = readInt();
         var a = Array.ofDim[Int](r,c);
         var b = Array.ofDim[Int](r1,c1)
         var d = Array.ofDim[Int](r,c1);
         if(r1!=c)
         {
             println("Multiplication is not possible");
          }
          else
          {
              println("Enter first matrix ");
              for(i<-0 to (r-1))
              {
                  for(j<-0 to (c-1))
                   {
                        a(i)(j) = readInt();
                    }
              }
             println("Enter Second matrix ");
              for(i<-0 to (r1-1))
              {
                  for(j<-0 to (c1-1))
                   {
                        b(i)(j) = readInt();
                    }
              }
              println("Matrix First ");
              for(i<-0 to (r-1))
              {
                    
                  for(j<-0 to (c-1))
                   {
                        print("\t"+a(i)(j));
                    }
                    println();
              }
              println("Matrix Second ");
              for(i<-0 to (r1-1))
              {
                    println();
                  for(j<-0 to (c1-1))
                   {
                        print("\t"+b(i)(j));
                    }
                    println();
              }
              for(i<-0 to (r-1))
              {
                  for(j<-0 to (c1-1))
                  {
                     d(i)(j) = 0;
                     for(k<-0 to (c-1))
                     {
                         d(i)(j) = d(i)(j) + a(i)(k)*b(k)(j);
                     }
                  }
              }
              println("Multiplication of Matrix :");
              for(i<-0 to (r-1))
              {
                 //println();
                 for(j<-0 to (c1-1))
                  {
                       print("\t" + d(i)(j));
                  }
                  println();
               }
              
          }
          var count = 0;
          for(i<-1 to (r-1))
          {
             for(j<-0 to (i-1))
             {
                 if(d(i)(j) != 0)
                 {
                      count = count + 1;
                  }
             }
           }
          if(count == 0)
          {
                 println("Matrix is Upper Traingular");
           }
           else
           {
                  println("Matrix is not Upper Traingular");
           }
    }
}

               
          








 
