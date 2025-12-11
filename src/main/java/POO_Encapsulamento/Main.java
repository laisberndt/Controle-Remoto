package POO_Encapsulamento;

public class Main {
    public static void main(String[] args) {
        Controle c1 = new Controle();

        //1. testar o estado atual
        System.out.println("\n1. ESTADO INICIAL");
        c1.AbrirMenu();

        //2. ligar o dispositivo
        System.out.println("\n2. LIGANDO...");
        c1.Ligar();

        //3. teste de volume
        System.out.println("\n3. VOLUME...");
        c1.MaisVolume();
        c1.MaisVolume();
        c1.MenosVolume();
        c1.LigarMudo();
        c1.DesligarMudo();

        //4.reprodução de mídia
        System.out.println("\n4. MÍDIA...");
        c1.Play();
        c1.Pause();

        //5. testar desligar
        System.out.println("\n5. DESLIGANDO...");
        c1.Desligar();
    }
}