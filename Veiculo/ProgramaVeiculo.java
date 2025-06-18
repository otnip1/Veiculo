public class ProgramaVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo();
        Carro c = new Carro();

        System.out.println("=== Veículo ===");
        v.mover();

        System.out.println("\n=== Carro ===");
        c.mover();
    }
}
