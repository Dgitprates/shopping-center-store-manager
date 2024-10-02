package etapa01.domain;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    //Construtor
    public Data(int dia, int mes, int ano) {
        if (!dataValida(dia, mes, ano)) {
            System.out.println("Data inválida. Alterando para 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    // Getters e Setters
    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    //toString
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    private boolean dataValida(int dia, int mes, int ano) {
        if (ano < 1) {
            return false;
        }
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > diasNoMes(mes, ano)) {
            return false;
        }
        return true;
    }

    private int diasNoMes(int mes, int ano) {
        if (mes == 2) {
            return verificaAnoBissexto() ? 29 : 28;
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        }
        return 31;
    }
}

