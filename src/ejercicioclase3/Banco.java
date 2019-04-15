/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase3;

public class Banco {
    private double numeroc;
    private double clave;
    private String persona;
    private double saldo;
    public boolean consignar(double valor){
    if(valor>0){
       this.saldo=valor+this.saldo;
      return true;  
    }
    else{
      return false;
    }
    }
    public boolean retirar(double valor){
     if(valor>0&&valor>=this.saldo){
        this.saldo=valor-this.saldo;
      return true;  
    }
    else{
         return false;
     }
    }
    public double consultar(){
    return saldo;
    }
    public boolean cambiar(int valor){
          if(valor>0){
        this.clave=valor;
      return true;  
    }
    else{
         return false;
     } 
    }
    

    public Banco(double numeroc, double clave, String persona, double saldo) {
        this.numeroc = numeroc;
        this.clave = clave;
        this.persona = persona;
        this.saldo = saldo;
    }
    

    public double getNumeroc() {
        return numeroc;
    }

    public void setNumeroc(double numeroc) {
        this.numeroc = numeroc;
    }

    public double getClave() {
        return clave;
    }

    public void setClave(double clave) {
        this.clave = clave;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
