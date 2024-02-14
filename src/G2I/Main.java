package G2I;
 
public class Main {
 
    public static void main(String[] args) {
        operativa_cuenta();
    }
 
    public static void operativa_cuenta() {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es: " + saldoActual);
 
        try {
            cuenta1.retirar(2300);
            System.out.println("Retiro realizado con éxito.");
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }
 
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            System.out.println("Ingreso realizado con éxito.");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
 
        // Uso del método operativa_cuenta con un parámetro cantidad
        float cantidad = -500; // Ejemplo de cantidad negativa para retirar
        cuenta1.operativa_cuenta(cantidad);
    }
}
