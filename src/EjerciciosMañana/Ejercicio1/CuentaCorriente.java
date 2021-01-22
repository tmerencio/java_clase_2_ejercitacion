package EjerciciosMañana.Ejercicio1;

public class CuentaCorriente {
    private int identificador;
    private String nombre;
    private String apellido;
    private double saldo;

    public CuentaCorriente(){

    }

    public CuentaCorriente(int identificador, String nombre, String apellido) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = 0;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.identificador = cuentaCorriente.getIdentificador();
        this.nombre = cuentaCorriente.getNombre();
        this.apellido = cuentaCorriente.getApellido();
        this.saldo = cuentaCorriente.getSaldo();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void ingreso(double cantidadDinero) {
        this.saldo += cantidadDinero;
    }

    public void egreso(double cantidadDinero) {
        this.saldo -= cantidadDinero;
    }

    public void reintegro(double cantidadDinero) {
        this.saldo += cantidadDinero;
    }

    public void transferencia(CuentaCorriente cuentaCorriente, double cantidadDinero) {
        cuentaCorriente.ingreso(cantidadDinero);
        this.egreso(cantidadDinero);
    }
}
