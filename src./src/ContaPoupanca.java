public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente donoConta, double limite, double saldo, int num) {
        super(donoConta, limite, saldo, num);
    }

    @Override
    public boolean setLimite(double limite) {
        if (limite < 1000 || limite > 100) {
            return true;
        } else {
            return false;
        }
    }
}
