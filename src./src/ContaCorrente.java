public class ContaCorrente extends  Conta {
    public ContaCorrente(Cliente donoConta, double saldo, int num) {
        super(donoConta, saldo, num);
    }

    @Override
    public boolean setLimite(double limite) {
        if (limite < -100) {
            return false;
        } else {
            return true;
        }
    }
}