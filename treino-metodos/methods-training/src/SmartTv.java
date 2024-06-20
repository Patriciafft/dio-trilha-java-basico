public class SmartTv {
    /* definição do estado inicial com variáveis já iniciadas */
    boolean ligada = true;
    int canal = 1;
    int volume = 25;
    boolean desligada = false;

    /* criação dos métodos */
    public void ligar () {
        ligada = true;
    }

    public void desligar () {
        ligada = false;
    }


}