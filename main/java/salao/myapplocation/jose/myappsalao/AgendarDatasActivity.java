package salao.myapplocation.jose.myappsalao;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import modelo.Agenda;
import modelo.AgendaDAO;
import modelo.Horario;

public class AgendarDatasActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    List<Horario> horarioList = new ArrayList<Horario>();
    ArrayAdapter<Horario> adapter;
    ListView lvAgendarDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agendar_datas_activity);
        Intent intent = getIntent();
        int year = 0;
        int month = 0;
        int dayOfMonth = 0;
        if  (intent.getExtras() != null) {
            year = (int) intent.getExtras().get("year");
            month = (int) intent.getExtras().get("month");
            dayOfMonth = (int) intent.getExtras().get("dayOfMonth");
        }
        horarioList.clear();
        for (int i = 8; i <= 20; i++) {
            Horario horario = new Horario(year, month, dayOfMonth, i, 0, "SIM");
            if (AgendaDAO.horarioListReservado.size() > 0) {
                for (Agenda a : AgendaDAO.horarioListReservado) {
                    if (a.getHorario().equals(horario)) {
                        horarioList.add(horario);
                    } else {
                        horario.setReservado("NÃO");
                        horarioList.add(horario);
                    }
                }
            } else {
                horario.setReservado("NÃO");
                horarioList.add(horario);
            }
        }
        lvAgendarDatas = (ListView) findViewById(R.id.lvAgendarDatas);
        adapter = new ArrayAdapter<Horario>(this, android.R.layout.simple_list_item_1, horarioList);
        lvAgendarDatas.setAdapter(adapter);
        lvAgendarDatas.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        int year = horarioList.get(position).getYear();
        int month = horarioList.get(position).getMonth();
        int dayOfMonth = horarioList.get(position).getDayOfMonth();
        int hours = horarioList.get(position).getHours();
        int minute = horarioList.get(position).getMinute();
        Horario horario = new Horario(year, month, dayOfMonth, hours, minute, "SIM");
        Intent intent = new Intent(this, AgendarActivity.class);
        intent.putExtra("horario", horario);
        startActivity(intent);
    }

}
