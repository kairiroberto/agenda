package salao.myapplocation.jose.myappsalao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    Button bAgendarData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        bAgendarData = (Button) findViewById(R.id.bAgendarData);
        bAgendarData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        if (v.getId() == R.id.bAgendarData) {
            intent = new Intent(this, Main4Activity.class);
        }
        startActivity(intent);
    }

}
