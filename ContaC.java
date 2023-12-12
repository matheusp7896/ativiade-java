package AtividadeContas;

class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(int numero, String titular, double limiteChequeEspecial) {
        super(numero, "Corrente", titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

 
    public void sacar(double valor) {
        double saldoDisponivel = getSaldo() + limiteChequeEspecial;

        if (saldoDisponivel >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        }
    }

    
    public void solicitarEmprestimo(double valor) {
        if (valor <= 5000) {
            setSaldo(getSaldo() + valor);
            System.out.println("Empréstimo de R$" + valor + " aprovado para conta corrente. Saldo atual: R$" + getSaldo());
        } else {
            System.out.println("Valor de empréstimo excede o limite para conta corrente.");
        }
    }

   
    public String toString() {
        return "ContaCorrente{" +
                "limiteChequeEspecial=" + limiteChequeEspecial +
                "} " + super.toString();
    }
}

