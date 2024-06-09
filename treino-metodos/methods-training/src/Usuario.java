public class Usuario {
    /* Essa classe é por onde tudo começará, por isso tem o método main */
    public static void main (String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Em qual canal? " + smartTv.canal);
        System.out.println("Em qual volume? " + smartTv.volume);

        /* Puxando os métodos criados na classe SmarTv para cá */

        smartTv.ligar ();
        System.out.println("Tv ligada? " + smartTv.ligada);
        




    }
    
}
