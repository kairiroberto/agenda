package modelo;

import java.io.Serializable;

/**
 * Created by JOSE on 24-9-18.
 */

public class Agenda implements Serializable {

    private Horario horario;
    private String usuario;

    public Agenda() {
    }

    public Agenda(Horario horario, String usuario) {
        this.horario = horario;
        this.usuario = usuario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "horario=" + horario +
                ", usuario='" + usuario + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Agenda)) return false;

        Agenda agenda = (Agenda) o;

        if (!getHorario().equals(agenda.getHorario())) return false;
        return getUsuario().equals(agenda.getUsuario());

    }

    @Override
    public int hashCode() {
        int result = getHorario().hashCode();
        result = 31 * result + getUsuario().hashCode();
        return result;
    }

}
