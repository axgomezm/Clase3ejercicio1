package ejercicioclase3;

public class Ejercicioclase3 {
    
    public static void main(String[] args) {
        Banco p1=new Banco(1012,1234,"Magdalena sanchez",0);
        p1.consignar(100000);
        System.out.println("Su nuevo saldo es: "+p1.getSaldo());
        Banco p2=new Banco(1013,9876,"Joselito Perez",500000);
        p2.cambiar(1225);
        p2.consultar();
        System.out.println("Su saldo es: "+p2.consultar());
        System.out.println(p2.getClave());
    }
    
    
}
