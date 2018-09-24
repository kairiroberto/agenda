package salao.myapplocation.jose.myappsalao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import modelo.Agenda;
import modelo.AgendaDAO;
import modelo.Horario;

public class AgendarActivity extends AppCompatActivity implements View.OnClickListener {

    Button bAgendar, bAgendarData;
    EditText etAgendarData, etAgendarCelular;
    Horario horario;
    String celular;
    TelephonyManager tm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agendar_activity);
        /*tm = (TelephonyManager)getSystemService(TELEPHONY_SERVICE);
        celular = tm.getLine1Number();*/
        etAgendarData = (EditText) findViewById(R.id.etAgendarData);
        etAgendarCelular = (EditText) findViewById(R.id.etAgendarCelular);
        etAgendarCelular.setText(celular);
        bAgendarData = (Button) findViewById(R.id.bAgendarData);
        bAgendarData.setOnClickListener(this);
        bAgendar = (Button) findViewById(R.id.bAgendar);
        bAgendar.setOnClickListener(this);
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            horario = (Horario) intent.getExtras().get("horario");
            etAgendarData.setText(
                    "" + horario.getDayOfMonth() + "/"
                    + horario.getMonth() + "/"
                    + horario.getYear() + ", "
                    + horario.getHours() + ":"
                    + horario.getMinute()
            );
        }
    }

    @Override
    public void onClick(View v) {
        try {
            Intent intent = null;
            if (v.getId() == R.id.bAgendarData) {
                intent = new Intent(this, AgendarCalendarioActivity.class);
            } else if (v.getId() == R.id.bAgendar) {
                AgendaDAO.horarioListReservado.add(new Agenda(horario, "ROBERTO"));
                intent = new Intent(this, MenuPrincipalActivity.class);
            }
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
        }
    }

}
