package salao.myapplocation.jose.myappsalao;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener, CalendarView.OnDateChangeListener {

    int year, month, dayOfMonth;
    CalendarView cv;
    Button btAgendarCalendarioSelecionar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        cv = (CalendarView) findViewById(R.id.cvAgendarCalendario);
        cv.setOnDateChangeListener(this);
        btAgendarCalendarioSelecionar = (Button) findViewById(R.id.btAgendarCalendarioSelecionar);
        btAgendarCalendarioSelecionar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        if (v.getId() == R.id.btAgendarCalendarioSelecionar) {
            intent = new Intent(this, Main5Activity.class);
            intent.putExtra("year", year);
            intent.putExtra("month", month);
            intent.putExtra("dayOfMonth", dayOfMonth);
        }
        startActivity(intent);
    }

    @Override
    public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
        Toast.makeText(this, "" + dayOfMonth + "/" + (month + 1) + "/" + year, Toast.LENGTH_LONG).show();
        this.year = year;
        this.month = month + 1;
        this.dayOfMonth = dayOfMonth;
    }

}
