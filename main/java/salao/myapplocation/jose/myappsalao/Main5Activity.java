package salao.myapplocation.jose.myappsalao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import modelo.Agendamentos;

public class Main5Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    List<Agendamentos> agendamentosList = new ArrayList<Agendamentos>();
    ListView lvAgendarDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        agendamentosList.add(new Agendamentos(2018, 9, 10));
        agendamentosList.add(new Agendamentos(2018, 9, 10));
        agendamentosList.add(new Agendamentos(2018, 9, 11));
        agendamentosList.add(new Agendamentos(2018, 9, 12));
        agendamentosList.add(new Agendamentos(2018, 9, 13));
        agendamentosList.add(new Agendamentos(2018, 9, 14));
        lvAgendarDatas = (ListView) findViewById(R.id.lvAgendarDatas);
        ArrayAdapter<Agendamentos> adapter = new ArrayAdapter<Agendamentos>(this, android.R.layout.simple_list_item_1, agendamentosList);
        lvAgendarDatas.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

}
