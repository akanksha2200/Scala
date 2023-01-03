object matmult
{
     def main(args:Array[String])
     {
          var arr1 = Array.ofDim[Int](2,2);
          var arr2 = Array.ofDim[Int](2,2);
          var raar = Array.ofDim[Int](2,2);
          println("Enter Fisrt Matrix : ");
          for(i<-0 to 1)
          {
             for(j<-0 to 1)
             {
                arr1(i)(j) = readInt();
             }
          }
          println("Enter Second Matrix : ");
          for(i<-0 to 1)
          {
             for(j<-0 to 1)
             {
                arr2(i)(j) = readInt();
             }
          }
          println("Fisrt Matrix : ");
          for(i<-0 to 1)
          {
             for(j<-0 to 1)
             {
                print(arr1(i)(j) + " ");
             }
             println();
          }
          println("Second Matrix : ");
          for(i<-0 to 1)
          {
             for(j<-0 to 1)
             {
                print(arr2(i)(j) + " ");
             }
             println();
          }
          for(i<-0 to 1)
          {
              for(j<-0 to 1)
              {
                  raar(i)(j) = 0;
                  for(k<-0 to 1)
                  {
                       raar(i)(j) = raar(i)(j) + arr1(i)(k)*arr2(k)(j);
                  }
              }
          }
          println("Resultant Matrix : ");
          for(i<-0 to 1)
          {
              for(j<-0 to 1)
              {
                 print(raar(i)(j) + " " );
              }
              println();
          }
          var det = (raar(0)(0)*raar(1)(1))-(raar(0)(0)*raar(1)(0));
          println("Determinant : " + det);
     }
}
