public class ContaUniversitaria extends Conta{
    public ContaUniversitaria(Cliente donoConta, double limite, double saldo, int num) {
        super(donoConta, limite, saldo, num);
    }

    @Override
    public boolean setLimite(double limite) {
        if (limite < 500 || limite > 0) {
            return true;
        } else {
            return false;
        }
    }
}
