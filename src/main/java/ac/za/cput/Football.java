package ac.za.cput;

public class Football {

   private String name;

   public Football(String name)
   {
       this.name = name;
   }

   public static void main(String[]args)
   {
       Football player1 = new Football("Messi");
       Football player2 = player1;
       Football player3 = new Football("Eto'o");

       System.out.print(player1 == player2);
       System.out.print(player1==player3);
   }

}
