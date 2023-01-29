package com.asgar.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SearchView extends AppCompatActivity {

    ListView listview_searchone;
    androidx.appcompat.widget.SearchView searchView_one;
    String[] names={"Asgar","Hasan","Shajar","Aman","Taqi","Naqi","Shabab","Meezan","Fahmi","Shuja","Akbar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);

        listview_searchone = findViewById(R.id.listview_searchone);
        searchView_one = findViewById(R.id.searchView_one);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,names);
        listview_searchone.setAdapter(adapter);

        searchView_one.setOnQueryTextListener(new androidx.appcompat.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) { //jaise hee search btn ke click hoga toh ye method execute hoga.
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) { //jaise hee text type hoga oo search krne lagega
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}