package salao.myapplocation.jose.myappsalao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import modelo.Agenda;
import modelo.AgendaDAO;

public class MAgendaActivity extends AppCompatActivity {

    ListView lvMAgenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magenda);
        lvMAgenda = (ListView) findViewById(R.id.lvMAgenda);
        ArrayAdapter<Agenda> adapter = new ArrayAdapter<Agenda>(this, android.R.layout.simple_expandable_list_item_1, AgendaDAO.horarioListReservado);
        lvMAgenda.setAdapter(adapter);
    }
}
