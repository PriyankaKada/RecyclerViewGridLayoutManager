package com.journaldev.recyclerviewgridlayoutmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.ItemListener {


    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        arrayList = new ArrayList<>();
        arrayList.add(new DataModel("Ooty", R.drawable.ooty, "#09A9FF"));
        arrayList.add(new DataModel("Delhi", R.drawable.delhi, "#09A9FF"));
        arrayList.add(new DataModel("Goa", R.drawable.goa, "#3E51B1"));
        arrayList.add(new DataModel("Ellora", R.drawable.ellora, "#673BB7"));
        arrayList.add(new DataModel("Mahableshwar", R.drawable.maha, "#4BAA50"));
        arrayList.add(new DataModel("Gulmarg", R.drawable.gulmarg, "#F94336"));
        arrayList.add(new DataModel("Ooty", R.drawable.ooty, "#0A9B88"));
        arrayList.add(new DataModel("Udaipur", R.drawable.udaipur, "#0A9B88"));
        arrayList.add(new DataModel("Delhi", R.drawable.delhi, "#0A9B88"));
        arrayList.add(new DataModel("Ellora", R.drawable.ellora, "#0A9B88"));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, arrayList, this);
        recyclerView.setAdapter(adapter);

        /**
         AutoFitGridLayoutManager that auto fits the cells by the column width defined.
         **/

        AutoFitGridLayoutManager layoutManager = new AutoFitGridLayoutManager(this, 500);
        recyclerView.setLayoutManager(layoutManager);


        /**
         Simple GridLayoutManager that spans two columns
         **/
        /*GridLayoutManager manager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);*/
    }

    @Override
    public void onItemClick(DataModel item) {

        Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();

    }
}
