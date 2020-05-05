package java_com_classes.Elevador;

public class Elevador {

    private int andarAtual = 0;
    private int totalAndares;
    private int capacidadeElevador;
    private int numeroPessoasPresentes = 0;
    private boolean inicializado = false;

    public void inicializa(int capacidadeElevador, int totalAndares) {
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
        exibirCaracteristicas();
        System.out.println("Elevador inicializado!");
        inicializado = true;
    }

    public void entra(int numeroPessoas) {
        numeroPessoasPresentes += numeroPessoas;
        exibirNumeroPessoasPresentes();
    }

    public void sai(int numeroPessoas) {
        if (numeroPessoasPresentes == 0) {
            System.out.println("Não há ninguém no elevador.");
        } else if ((numeroPessoasPresentes - numeroPessoas) < 0) {
            System.out.println("Não existe esse número de pessoas atualmente no elevador");
        } else {
            numeroPessoasPresentes -= numeroPessoas;
            exibirNumeroPessoasPresentes();
        }
    }

    public void sobe(int numeroAndares) {
        if (capacidadeElevador < numeroPessoasPresentes) {
            System.out.println("Não é possível subir. A capacidade do elevador foi excedida");
            int ajuste = numeroPessoasPresentes - capacidadeElevador;
            System.out.println("É necessário que " + ajuste + " pessoa(s) saiam do elevador");
        } else if ((andarAtual + numeroAndares) > totalAndares) {
            System.out.println("Não foi possível subir. A escolha excede o número de andares deste prédio");
        } else {
            andarAtual += numeroAndares;
            exibirAndarAtual();
        }
    }

    public void desce(int numeroAndares) {
        if (capacidadeElevador < numeroPessoasPresentes) {
            System.out.println("Não é possível descer. A capacidade do elevador foi excedida");
            int ajuste = numeroPessoasPresentes - capacidadeElevador;
            System.out.println("É necessário que " + ajuste + " pessoa(s) saiam do elevador");
        } else if ((andarAtual - numeroAndares) < 0) {
        System.out.println("Não foi possível descer. A escolha levaria o elevador para o subsolo, que não existe");
        } else {
            andarAtual -= numeroAndares;
            exibirAndarAtual();
        }
    }

    public void exibirNumeroPessoasPresentes() {
        System.out.println("Existem " + numeroPessoasPresentes + " pessoas à bordo");
    }

    public void exibirAndarAtual() {
        System.out.println("Andar atual: " + andarAtual);
    }

    public void exibirCaracteristicas() {
        System.out.println("Capacidade do elevador: " + this.capacidadeElevador + " pessoas");
        System.out.println("Total de andares: " + this.totalAndares);
    }

    public boolean checarIniciado() {
        if (inicializado == false) {
            return false;
        } else {
            return true;
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getNumeroPessoasPresentes() {
        return numeroPessoasPresentes;
    }

    public void setNumeroPessoasPresentes(int numeroPessoasPresentes) {
        this.numeroPessoasPresentes = numeroPessoasPresentes;
    }


}
