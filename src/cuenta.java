public class cuenta {
    private String numero;//encapsulamineto
    private String tipo;
    private double saldoactual=0;
    private double saldominimo=0;
    private double valorinicial=0;

    public cuenta(String numero, String tipo, double valorinicial) {
        this.numero = numero;
        if (tipo.equalsIgnoreCase("ahorro") || tipo.equalsIgnoreCase("credito"))
        {
            this.tipo = tipo;
            this.valorinicial = valorinicial;
            this.saldoactual = valorinicial;
            this.saldominimo = valorinicial * 0.1;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(double saldoactual) {
        this.saldoactual = saldoactual;
    }

    public double getSaldominimo() {
        return saldominimo;
    }

    public void setSaldominimo(double saldominimo) {
        this.saldominimo = saldominimo;
    }

    public double getValorinicial() {
        return valorinicial;
    }

    public void setValorinicial(double valorinicial) {
        this.valorinicial = valorinicial;
    }

    public void consignar(double monto)
    {
      this.saldoactual+=monto;
    }

    public void retirar(double monto)
    {
      if ((this.saldoactual-monto)< this.saldominimo)
      {
        System.out.println("saldo insuficiente");
          System.out.println("el valor retirado es :" + (this.saldoactual-this.saldominimo));
        this.saldoactual=this.saldoinicual;
      }
      else
     {
        this.saldoactual-monto;
     }

    }

    @Override
    public String toString() {
        return "cuenta{" +
                "numero='" + numero + '\'' +
                ", tipo='" + tipo + '\'' +
                ", saldoactual=" + saldoactual +
                ", saldominimo=" + saldominimo +
                ", valorinicial=" + valorinicial +
                '}';
    }
}
