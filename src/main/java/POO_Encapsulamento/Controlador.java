package POO_Encapsulamento;

public interface Controlador {

    //MÉTODOS ABSTRATOS
    public abstract void Ligar();
    public abstract void Desligar();

    public abstract void AbrirMenu();
    public abstract void FecharMenu();

    public abstract void MaisVolume();
    public abstract void MenosVolume();

    public abstract void LigarMudo();
    public abstract void DesligarMudo();

    public abstract void Play();
    public abstract void Pause();
}
