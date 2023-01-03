object tranpose_lt
{
     def main(args:Array[String])
     {
           var mat = Array.ofDim[Int](3,3);
           var rmat = Array.ofDim[Int](3,3);
           var isLower:Boolean= true;
           println("Enter Matrix ");
           for(i<-0 to 2)
           {
               for(j<-0 to 2)             
               {
                   mat(i)(j) = readInt();
                }
           }
           println("Matrix is :");
           for(i<-0 to 2)
           {
              for(j<-0 to 2)
               {
                     print(mat(i)(j) + " ");
                }
                println();
           }
            for(i<-0 to 2)
           {
              for(j<-0 to 2)
               {
                    rmat(i)(j) = mat(j)(i);
                }
           }
           println("Tranpose of Matrix :");
           for(i<-0 to 2)
           {
                for(j<- 0 to 2)
                {
                    print(rmat(i)(j) + "");
                }
                println();
          }
          for(i<-0 to 2)
           {
                 for(j<-0 to 2)
                 {
                    if(i<j)
                     {
                         if(rmat(i)(j)!=0)
                           isLower = false;
                      }
                }
            }
            if(isLower == true)
                println("Is lower Trainglar");
             else
                println("Is not Lower Traingular");
           }
}

