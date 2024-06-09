public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        final String MEUPAIS = "Brasil";
        System.out.println(MEUPAIS);

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



      }
}
