package salao.myapplocation.jose.myappsalao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Button bAgendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bAgendar = (Button) findViewById(R.id.bAgendar);
        bAgendar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        if (v.getId() == R.id.bAgendar) {
            intent = new Intent(this, Main3Activity.class);
        }
        startActivity(intent);
    }
    
}
