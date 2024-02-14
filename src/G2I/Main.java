package G2I;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



public class Main {

    public static void main(String[] args) {
        CCuenta cuenta_1;
        double saldoActual;

        cuenta_1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta_1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta_1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta_1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    
}
