class savingAccount(var acno:Int , var name:String , var balance:Int , var minbalance:Int)
{
   def withdraw()
   {
      println("Enter Amount :");
      var n1 = readInt();
      balance = balance - n1;
      if(balance<minbalance)
      {
         println("Transcantion Failed ");
         balance = balance + n1;
      }
      else
      {
         println("Transcantion Successfull");
      }
   }
   def deposit()
   {
      println("Enter Amount : ");
      var n1 = readInt();
      balance = balance + n1;
   }
   def viewbalance()
   {
      println("Account Number : " + acno);
      println("name : " + name);
      println("Balance : " +balance);
      println("Minimum Balance : "+ minbalance);
   }
}
object save
{
    def main(args:Array[String])
    {
        var s1 = new Array[savingAccount](5);
        var ch = 0;
        s1(0) = new savingAccount(1,"Akshay Borse",2000090,10000); 
        s1(1) = new savingAccount(2,"XYZ",2000000,10000); 
        s1(2) = new savingAccount(3,"ABC",278000,100000); 
        s1(3) = new savingAccount(4,"OPI",78575788,1000);
        s1(4) = new savingAccount(5,"Pietro",2978580,10000);
        println("Enter Account Number : ");
        var ac = readInt();
        for(i<-0 to 4)
        {
            if(s1(i).acno == ac)
            {   
                println("Account number Exists : ");
                println("1.Cash Withdraw : ");
                println("2.Cash Deposite : ");
                println("3.View Balance : ");
                println("4.Exit");
                while(ch!= 5)
                {
                    println("Enter Your Choice :");
                    var ch = readInt();
                    ch match
                    {
                        case 1 => s1(i).withdraw();
                        case 2 => s1(i).deposit();
                        case 3 => s1(i).viewbalance();
                        case 4 => System.exit(1);
                    }
                }
            }
        }
         println();
    }
}
