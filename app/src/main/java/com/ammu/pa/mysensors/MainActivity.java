package com.ammu.pa.mysensors;
/* Lists all available sensors
 * Written by Aneesh PA on 01 July 2018
 */
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.List;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ListView listView;
    private ListAdapter listAdapter;

    private SensorManager sensorManager;
    private List<Sensor> sensorList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensorList = sensorManager.getSensorList(Sensor.TYPE_ALL);
        listAdapter = new ArrayAdapter<Sensor>(this, android.R.layout.simple_list_item_1, sensorList);
        listView = findViewById(R.id.sensor_list_view);
        listView.setAdapter(listAdapter);
    }

    // onItemClick is left empty
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
