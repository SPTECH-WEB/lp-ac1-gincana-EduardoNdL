package school.sptech;

public class Main {
    public static void main(String[] args) {
        System.out.println("Boa sorte!");
        System.out.println("Você pode testar manualmente a classe Gincana aqui se quiser....");
        Gincana aa = new Gincana("gincana1", 25.00 );
        aa.inscrever(10);
        System.out.println(aa.remover(2));

        Gincana bb = new Gincana("gincana2", 30.00 );
        bb.inscrever(10);


        aa.transferir(bb, 4);
        System.out.println(aa.getQtdInscrito());
        System.out.println(bb.getQtdInscrito());

        System.out.println(bb.reajustarPremio(0.5));
    }
}