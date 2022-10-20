public class Lavadora implements Lavavel{

    public void lavar(Lavavel lavavel) {
        Garrafa garrafa = null;
        lavavel.lavar(garrafa);
    }

    /*É necessário que a classe Garrafa extenda a classe Lavadora. Além disso é precisso que um
    * objeto referente a garrafa seja criado na classe Lavadora.*/
}
