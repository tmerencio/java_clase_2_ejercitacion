package EjerciciosMañana.Ejercicio5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    private GregorianCalendar gregorianCalendar;

    public Fecha() {

    }

    public Fecha(int anio, int mes, int dia) {
        this.gregorianCalendar = new GregorianCalendar(anio, mes, dia);
    }

    public GregorianCalendar getGregorianCalendar() {
        return gregorianCalendar;
    }

    public void setGregorianCalendar(GregorianCalendar gregorianCalendar) {
        this.gregorianCalendar = gregorianCalendar;
    }

    public boolean esCorrecta() {
        boolean mismoAnio = this.gregorianCalendar.get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR);
        boolean mismoMes = this.gregorianCalendar.get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH);
        boolean mismoDia = this.gregorianCalendar.get(Calendar.DATE) == Calendar.getInstance().get(Calendar.DATE);
        return mismoAnio && mismoMes && mismoDia;
    }

    public void sumarUnDia(){
        gregorianCalendar.add(Calendar.DATE, 1);
    }

    @Override
    public String toString() {
        return this.gregorianCalendar.get(Calendar.YEAR) + "/" +
                (this.gregorianCalendar.get(Calendar.MONTH) + 1) + "/" +
                this.gregorianCalendar.get(Calendar.DATE);
    }

    public static void main(String[] args) {
        Fecha fecha = new Fecha(2021, 0, 22);

        System.out.println(fecha.toString());

        System.out.println("Es correcta? " + fecha.esCorrecta());

        fecha.sumarUnDia();

        System.out.println(fecha.toString());
    }
}
