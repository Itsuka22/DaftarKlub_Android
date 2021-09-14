package com.handoyo.project_view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_fragment);
        BottomNavigationView bottomNavigationView;


        RecyclerView list = findViewById(R.id.recycler_view_projects);


        Project [] projects = {
                new Project("Manchester United","Ini adalah klub Terbaik Liga Inggris Mempunyai gelar terbanyak, Optimis Trebel Winner GGMU", R.drawable.manchester),
                new Project("Chelsea","Klub ini mempunyai julukan The Blues, yang kemarin baru saja menjuarai UCL. Semoga tidak bisa EPL tahun ini aokoakwokawk ", R.drawable.chelsea),
                new Project("Arsenal HAHAHAHA","Klubnya Coach Justin ini (GOAHAHAHAHA) sangat serius untuk bersaing di dasar klasemen EPL (20).", R.drawable.arsenal),
                new Project("Liverpool","Sudah tidak diragukan lagi, ya Liverpool atau The Reds, Tetap di obok2 king Ronaldo :)", R.drawable.liverpool),
                new Project("Bayern Munchen","Klub berlokasi di Munich Jerman Memiliki segudang prestasi. Karena Bila ada pemain hebat di bundesliga, mesti pindahnya di Bayern", R.drawable.bayern),

        };

        ProjectAdapter adapter = new ProjectAdapter(projects);

        list.setAdapter(adapter);



        bottomNavigationView=findViewById(R.id.bn_main);


//        Untuk BottomNavigation sudah saya coba berkali2 tapi gradelnya kyak eror gitu mas.
//        Dan Mohon maaf karena codingan saya banyak yang kurang mas karena fokus sama bottomNavigation. Mungkin kedepannya saya akan memperbaiki kekurangan saya.
//        Dan berlatih lebih lagi. Makasih

    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this) ;
        builder.setIcon(R.drawable.ic_baseline_search_24);
        builder.setTitle("Setuju Keluar");
        builder.setMessage("Apakah Kamu ingin Keluar?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("Batal",null);
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}