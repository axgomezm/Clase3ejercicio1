package ejercicioclase3;

public class Ejercicioclase3 {
    
    public static void main(String[] args) {
        boolean resultado;
        Banco p1=new Banco(1012,1234,"Magdalena sanchez",0);
        resultado=p1.consignar(100000);
        if(resultado==true)
        {
            System.out.println("consignacion exitosa:)");
        }
        else{
        System.out.println("consignacion denegada:(");
        }
        
        System.out.println(p1.getPersona()+" su nuevo saldo es: "+p1.getSaldo());
        Banco p2=new Banco(1013,9876,"Joselito Perez",500000);
        resultado=p2.cambiar(1228);
        if(resultado==true)
        {
            System.out.println("Cambio de clave exitoso:)");
        }
        else{
        System.out.println("Cambio de denegado :(");
        }
        p2.consultar();
        System.out.println(p2.getPersona()+" su saldo es: "+p2.consultar());
        System.out.println(p2.getPersona()+" su nueva clave es: "+p2.getClave());
    }
    
    
}
