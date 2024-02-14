package G2I;

/**
 * Clase que representa una cuenta bancaria.
 */
public class CCuenta {

    private String nombre; // Nombre del titular de la cuenta
    private String cuenta; // Número de cuenta
    private double saldo; // Saldo de la cuenta
    private double tipoInteres; // Tipo de interés de la cuenta

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor de la clase CCuenta.
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * Obtiene el número de cuenta.
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * @param cuenta El número de cuenta a establecer.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo de la cuenta.
     * @return El saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * @param saldo El saldo de la cuenta a establecer.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Asigna un nombre al titular de la cuenta.
     * @param nom El nombre del titular de la cuenta.
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * @return El nombre del titular de la cuenta.
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Obtiene el estado actual de la cuenta (saldo).
     * @return El saldo de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Realiza un ingreso en la cuenta.
     * @param cantidad La cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Realiza una retirada de dinero de la cuenta.
     * @param cantidad La cantidad a retirar de la cuenta.
     * @throws Exception Si la cantidad es negativa o si no hay saldo suficiente.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay saldo suficiente");
        saldo = saldo - cantidad;
    }

    /**
     * Obtiene el número de cuenta.
     * @return El número de cuenta.
     */
    public String obtenerCuenta() {
        return cuenta;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * @return El nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * @param nombre El nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * @return El tipo de interés de la cuenta.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     * @param tipoInteres El tipo de interés de la cuenta.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Realiza operaciones sobre la cuenta.
     * @param cantidad La cantidad a operar sobre la cuenta.
     */
    public void operativa_cuenta(float cantidad) {
        // TODO Auto-generated method stub
    }
}
