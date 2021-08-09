package com.example.whatsappui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<DesignUI> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdata();
        initRecyclerview();




    }

    private void initdata() {
        userList = new ArrayList<>();
        userList.add(new DesignUI(R.drawable.girl1, "Aditi Gautam", "It's Amazing!!", "10:54pm"));
        userList.add(new DesignUI(R.drawable.boy2, "Vansh Meheta", "Classes will resume from Monday", "10:52pm"));
        userList.add(new DesignUI(R.drawable.boy1, "Milind Gautam", "Have you completed your assignment", "10:00pm"));
        userList.add(new DesignUI(R.drawable.girl2, "Riya Singhal", "It's Amazing!!", "4:54pm"));
        userList.add(new DesignUI(R.drawable.boy2, "Nalin", "Thankyou so much", "8:54pm"));
        userList.add(new DesignUI(R.drawable.girl1, "Shweta ", "Have a nice day bub", "6:00pm"));
        userList.add(new DesignUI(R.drawable.boy1, "Rahul Bansal", "I will be sending you the notes", "4:00pm"));
        userList.add(new DesignUI(R.drawable.girl2, "Avni Gondwal", "Congratulations", "2:33pm"));
        userList.add(new DesignUI(R.drawable.boy2, "Aman", "It's Amazing!!", "12:00pm"));
        userList.add(new DesignUI(R.drawable.girl1, "Kritika Rawat", "May I know if you had...", "10:58am"));
        userList.add(new DesignUI(R.drawable.boy1, "Ayush Singh", "You left", "10:44am"));
        userList.add(new DesignUI(R.drawable.girl2, "Welcome", "It's Amazing!!", "8:30am"));

    }

    private void initRecyclerview() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}


