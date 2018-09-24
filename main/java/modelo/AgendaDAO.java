package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JOSE on 24-9-18.
 */

public class AgendaDAO {

    public static List<Agenda> horarioListReservado = new ArrayList<Agenda>();

    public static Boolean isAgendaHorario (Horario horario) {
        for (Agenda a : horarioListReservado) {
            if (a.getHorario().equals(horario)) {
                return true;
            }
        }
        return false;
    }

}
