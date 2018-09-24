package modelo;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by JOSE on 23-9-18.
 */

public class Horario implements Serializable {

    private int year;
    private int month;
    private int dayOfMonth;
    private int hours;
    private int minute;
    private String reservado;

    public Horario() {
    }

    public Horario(int year, int month, int dayOfMonth, int hours, int minute, String reservado) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.hours = hours;
        this.minute = minute;
        this.reservado = reservado;
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

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String getReservado() {
        return reservado;
    }

    public void setReservado(String reservado) {
        this.reservado = reservado;
    }

    @Override
    public String toString() {
        String retorno = "Data: " + dayOfMonth + "/" + month + "/" + year + "\nHora: " + hours + ":" + minute + "\nReservado: " + reservado;
        //return super.toString();
        return retorno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horario)) return false;

        Horario horario = (Horario) o;

        if (getYear() != horario.getYear()) return false;
        if (getMonth() != horario.getMonth()) return false;
        if (getDayOfMonth() != horario.getDayOfMonth()) return false;
        if (getHours() != horario.getHours()) return false;
        if (getMinute() != horario.getMinute()) return false;
        return getReservado().equals(horario.getReservado());

    }

    @Override
    public int hashCode() {
        int result = getYear();
        result = 31 * result + getMonth();
        result = 31 * result + getDayOfMonth();
        result = 31 * result + getHours();
        result = 31 * result + getMinute();
        result = 31 * result + getReservado().hashCode();
        return result;
    }

}
