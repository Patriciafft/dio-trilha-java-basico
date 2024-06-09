public class Operadores {

    public static void main(String[] args) {
        

        int number = 58;
        System.out.println(number);

        number++;
        System.out.println(number);
        System.out.println(number++);
        System.out.println(number);

        /* Testando operador ternário */

        int number1, number2;
        number1 = 1;
        number2 = 2;

        String result = number1 + number1 == 2 ? "true" : "false";
        System.out.println(result);

        /* Entendendo equals e == */

        if (number1 == number2) { 
            
            System.out.println("Os valores são iguais!");}
         else 
        
         {System.out.println("Os valores são diferentes");}

        String nome1 = "Patrícia";
        String nome2 = new String ("Patrícia");

        if (nome1 == nome2) { 
            System.out.println("Nomes iguais");
        }
        else {
            System.out.println("Nomes diferentes");}

        System.out.println(nome1.equals(nome2));


        }



    
}
