public class Carro extends Veiculo {
    @Override
    public void mover() {
        super.mover(); // Chama o comportamento da superclasse
        System.out.println("O carro está andando na estrada.");
    }
}
