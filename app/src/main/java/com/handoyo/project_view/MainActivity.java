package com.handoyo.project_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);


        Project [] projects = {
                new Project("Manchester United","Ini adalah klub Terbaik Liga Inggris Mempunyai gelar terbanyak, Optimis Trebel Winner GGMU", R.drawable.manchester),
                new Project("Chelsea","Klub ini mempunyai julukan The Blues, yang kemarin baru saja menjuarai UCL. Semoga tidak bisa EPL tahun ini aokoakwokawk ", R.drawable.chelsea),
                new Project("Arsenal","Klubnya Coach Justin ini (GOAHAHAHAHA) sangat serius untuk bersaing di dasar klasemen EPL. Bagaimana tidak?, dari 3 match aja belom pernah ngegolin", R.drawable.arsenal),
                new Project("Liverpool","Sudah tidak diragukan lagi, ya Liverpool atau The Reds, Tetap di obok2 king Ronaldo :)", R.drawable.liverpool),
                new Project("Bayern Munchen","Klub berlokasi di Munich Jerman Memiliki segudang prestasi. Karena Bila ada pemain hebat di bundesliga, mesti pindahnya di Bayern", R.drawable.bayern),

        };

        ProjectAdapter adapter = new ProjectAdapter(projects);

        list.setAdapter(adapter);



    }
}