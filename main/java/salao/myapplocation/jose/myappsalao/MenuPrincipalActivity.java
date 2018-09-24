package salao.myapplocation.jose.myappsalao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipalActivity extends AppCompatActivity implements View.OnClickListener {

    Button bAgendar, bMAgenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_activity);
        bAgendar = (Button) findViewById(R.id.bAgendar);
        bAgendar.setOnClickListener(this);
        bMAgenda = (Button) findViewById(R.id.bMAgenda);
        bMAgenda.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        if (v.getId() == R.id.bAgendar) {
            intent = new Intent(this, AgendarActivity.class);
        } else if (v.getId() == R.id.bMAgenda) {
            intent = new Intent(this, MAgendaActivity.class);
        }
        startActivity(intent);
    }
    
}
