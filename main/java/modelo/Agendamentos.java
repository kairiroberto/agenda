package modelo;

/**
 * Created by JOSE on 23-9-18.
 */

public class Agendamentos {

    private int year;
    private int month;
    private int dayOfMonth;

    public Agendamentos() {
    }

    public Agendamentos(int year, int month, int dayOfMonth) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    @Override
    public String toString() {
        String retorno = "Ano: " + year + "\nMês: " + month + "\nDia: " + dayOfMonth;
        //return super.toString();
        return retorno;
    }
}
