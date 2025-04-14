package banca;

public class ContoCorrente {
    private String nomeTitolare;
    private String numeroConto;
    private double saldo;

    public ContoCorrente(String nomeTitolare, String numeroConto, double saldoIniziale) {
        this.nomeTitolare = nomeTitolare;
        this.numeroConto = numeroConto;
        this.saldo = saldoIniziale;
    }

    public void deposito(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Deposito di " + importo + " effettuato con successo.");
        } else {
            System.out.println("L'importo del deposito deve essere maggiore di zero.");
        }
    }

    public void prelievo(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelievo di " + importo + " effettuato con successo.");
        } else {
            System.out.println("Fondi insufficienti o importo non valido per il prelievo.");
        }
    }

    public void stampaSaldo() {
        System.out.println("Saldo attuale del conto corrente (" + numeroConto + "): " + saldo);
    }

    public static void main(String[] args) {
        ContoCorrente mioConto = new ContoCorrente("Mario Rossi", "12345", 1000.0);

        mioConto.stampaSaldo();
        mioConto.deposito(500.0);
        mioConto.stampaSaldo();
        mioConto.prelievo(200.0);
        mioConto.stampaSaldo();
        mioConto.prelievo(1500.0); // Tentativo di prelievo di un importo superiore al saldo.
    }
}