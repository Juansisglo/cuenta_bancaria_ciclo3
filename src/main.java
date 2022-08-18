public class main {
    public static void main(String[] args) {
        //instaanciar clase
        cuenta micuenta= new cuenta(numero:"123456", tipo:"ahorro", valorinicial:1500000 );
        System.out.println("saldo minimo" + micuenta.getSaldominimo();
        micuenta.consignar(monto:80000);
        System.out.println("saldoactual: " + micuenta.getSaldoactual());
        System.out.println(micuenta.toString ());

        cuenta pedrocuenta=new cuenta(numero:"52222", tipo:"prestamo". valorinicial: 5000);
        System.out.println(pedrocuenta.toString ());

    }
}
