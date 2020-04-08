package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Supercars Brand");

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.arrinera, "Arrinera",
                "Arrinera Automotive S.A., is a Polish supercar manufacturer based in Warsaw."));
        exampleList.add(new ExampleItem(R.drawable.aston_martin, "Aston Martin",
                "Aston Martin Lagonda Global Holdings plc is a British independent car manufacturer."));
        exampleList.add(new ExampleItem(R.drawable.bugatti, "Bugatti",
                "Automobiles Ettore Bugatti was a French car manufacturer."));
        exampleList.add(new ExampleItem(R.drawable.ferarri, "Ferarri",
                "Ferrari is an Italian luxury sports car manufacturer based in Maranello."));
        exampleList.add(new ExampleItem(R.drawable.koenigsegg, "Koenigsegg",
                "Koenigsegg Automotive AB is a Swedish sports car manufacturer."));
        exampleList.add(new ExampleItem(R.drawable.lambo, "Lamborghini",
                "Automobili Lamborghini S.p.A. is an Italian car manufacturer."));
        exampleList.add(new ExampleItem(R.drawable.mclaren, "McLaren",
                "McLaren Automotive is a British automotive manufacturer based at the Woking, Surrey."));
        exampleList.add(new ExampleItem(R.drawable.noble, "Noble",
                "Noble Automotive Ltd is a British sports car manufacturer based in Leicester."));
        exampleList.add(new ExampleItem(R.drawable.pagani, "Pagani",
                "Pagani Automobili S.p.A. is an Italian sports car manufacturer."));
        exampleList.add(new ExampleItem(R.drawable.porsche, "Porsce",
                "Dr.-Ing. h.c. F. Porsche AG is a German automobile manufacturer."));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
