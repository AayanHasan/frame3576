package com.example.tshirtprinting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.printing_recy);
        List<printModal> modal1=new ArrayList<>();
        modal1.add(new printModal(R.drawable.left_chest,"Left chest"));
        modal1.add(new printModal(R.drawable.tshirtprint,"Right chest"));
        modal1.add(new printModal(R.drawable.tshirtprint,"Front chest"));
        modal1.add(new printModal(R.drawable.tshirtprint,"Full Front chest"));
        modal1.add(new printModal(R.drawable.tshirtprint,"Lower Left"));
        modal1.add(new printModal(R.drawable.tshirtprint,"Lower Right"));
        modal1.add(new printModal(R.drawable.tshirtprint,"Centre Back"));
        modal1.add(new printModal(R.drawable.tshirtprint,"Full Back"));
        modal1.add(new printModal(R.drawable.tshirtprint,"Top Back"));
        modal1.add(new printModal(R.drawable.tshirtprint,"Lower Back"));
        modal1.add(new printModal(R.drawable.tshirtprint,"Vertical Back"));
        modal1.add(new printModal(R.drawable.tshirtprint,"Left Sleeve"));
        modal1.add(new printModal(R.drawable.tshirtprint,"Right Sleeve"));



        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        printAdapter adapter3 =new printAdapter(modal1,this);
        recyclerView.setAdapter(adapter3);
    }

}