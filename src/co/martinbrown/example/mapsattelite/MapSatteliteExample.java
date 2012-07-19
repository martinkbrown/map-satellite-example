package co.martinbrown.example.mapsattelite;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;

public class MapSatteliteExample extends MapActivity {

    MapView mapView;
    MapController mapController;
    Button toggleSatelliteBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        toggleSatelliteBtn = (Button) findViewById(R.id.toggleSatteliteBtn);
        mapView = (MapView) findViewById(R.id.mapView);
        mapController = mapView.getController();

        toggleSatelliteBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                mapView.setSatellite(!mapView.isSatellite());
            }
        });
    }

    @Override
    protected boolean isRouteDisplayed() {
        return false;
    }
}