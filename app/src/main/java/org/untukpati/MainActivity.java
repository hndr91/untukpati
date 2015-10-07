package org.untukpati;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import org.untukpati.models.TypeModel;
import org.untukpati.services.TypeService;

import java.io.IOException;
import java.util.List;

import retrofit.Callback;
import retrofit.Response;


public class MainActivity extends AppCompatActivity {

    private TypeService typeService;
    private List<TypeModel> typeModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        typeService = new TypeService();

        getAllType();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void getAllType() {
        try {
            typeService.getAllTypes(new Callback() {
                @Override
                public void onResponse(Response response) {
                    Log.d("cuy", ""+response.body());
                }

                @Override
                public void onFailure(Throwable t) {

                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
