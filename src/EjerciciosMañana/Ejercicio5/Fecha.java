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
        return this.gregorianCalendar.getTime().equals(Calendar.getInstance().getTime());
    }

    public void sumarUnDia(){
        gregorianCalendar.add(Calendar.DATE, 1);
    }

    @Override
    public String toString() {
        return this.gregorianCalendar.get(Calendar.YEAR) + "/" +
                this.gregorianCalendar.get(Calendar.MONTH) + "/" +
                this.gregorianCalendar.get(Calendar.DATE);
    }
}
