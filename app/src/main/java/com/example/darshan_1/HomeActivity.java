package com.example.darshan_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity  {
//    SearchView searchView;
//    ListView listView;
//    ArrayList<String> list;
//    ArrayAdapter<String > adapter1;
    private TextView mTextMessage;
    CardView places,pooja,pack,cab,hotel;

    private RecyclerView recyclerView,recyclerView4,recyclerView3,recyclerView2,recyclerView1;
    private ArrayList<FruitModel> imageModelArrayList;
    private FruitAdapter adapter;

    private int[] myImageList = new int[]{ R.drawable.haridwar,
            R.drawable.mathura,
            R.drawable.vrindawan,
            R.drawable.varansi1
            };
    private String[] myImageNameList = new String[]{"Shree Ram Mandir","Vrindavan","Mata Mansa Devi","Kashi Vishwanath"};
    private String[] myImageNameList2 = new String[]{"Ayodhya,Uttar Pradesh","Mathura,Uttar Pradesh","Hardiwar,Uttrakhand","Varansi,Uttar Pradesh"};

    BottomNavigationView navView;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                   // mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    //mTextMessage.setText(R.string.title_dashboard);
                    Intent i1=new Intent(HomeActivity.this,DashActivity.class);
                    startActivity(i1);
                    return true;
                case R.id.navigation_profile:
                    Intent i2=new Intent(HomeActivity.this,ProfileActivity.class);
                    startActivity(i2);
                    //mTextMessage.setText("Profile");
                    return true;
                case R.id.navigation_help:
                    Intent i3=new Intent(HomeActivity.this,HelpActivity.class);
                    startActivity(i3);
                    //mTextMessage.setText("Help");
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navView.getMenu().getItem(0).setChecked(true);

        places=findViewById(R.id.card_view1);
        pooja=findViewById(R.id.card_view2);
        pack=findViewById(R.id.card_view3);
        cab=findViewById(R.id.card_view4);
        hotel=findViewById(R.id.card_view);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView3 = (RecyclerView) findViewById(R.id.recycler3);
        recyclerView4 = (RecyclerView) findViewById(R.id.recycler4);
        recyclerView1 = (RecyclerView) findViewById(R.id.recycler1);
        recyclerView2 = (RecyclerView) findViewById(R.id.recycler2);
        imageModelArrayList = eatFruits();
        adapter = new FruitAdapter(this, imageModelArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView3.setAdapter(adapter);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView4.setAdapter(adapter);
        recyclerView4.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView2.setAdapter(adapter);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView1.setAdapter(adapter);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));

        //        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPage1);
//        slide_adapter adapterView = new slide_adapter(this);
//        mViewPager.setAdapter(adapterView);
//
//        ViewPager mViewPager1 = (ViewPager) findViewById(R.id.viewPage2);
//        mViewPager1.setAdapter(adapterView);

//        ViewPager mViewPager2 = (ViewPager) findViewById(R.id.viewPage3);
//        mViewPager2.setAdapter(adapterView);
//
//        ViewPager mViewPager3 = (ViewPager) findViewById(R.id.viewPage4);
//        mViewPager3.setAdapter(adapterView);
//        searchView = (SearchView) findViewById(R.id.searchView);
//        listView = (ListView) findViewById(R.id.lv1);
//
//        list = new ArrayList<>();
//        list.add("Apple");
//        list.add("Banana");
//        list.add("Aapple");
//        list.add("Pineapple");
//        list.add("Orange");
//        list.add("Lychee");
//        list.add("Gavava");
//        list.add("Peech");
//        list.add("Melon");
//        list.add("Watermelon");
//        list.add("Papaya");
//
//        adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
//        listView.setAdapter(adapter1);
//
//
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                searchView.clearFocus();
//
//                if(list.contains(query)){
//                    adapter1.getFilter().filter(query);
//                }else{
//                    Toast.makeText(HomeActivity.this, "No Match found",Toast.LENGTH_LONG).show();
//                }
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                //    adapter.getFilter().filter(newText);
//
//                listView.setVisibility(View.VISIBLE);
//
//                adapter1.getFilter().filter(newText);
//
//                if(newText.equals(""))
//                {
//                    listView.setVisibility(View.INVISIBLE);
//                }
//
//
//                return false;
//            }
//        });

        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "clicked places", Toast.LENGTH_SHORT).show();

            }
        });
        pooja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Pooja clicked", Toast.LENGTH_SHORT).show();
            }
        });
        pack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "packages clicked", Toast.LENGTH_SHORT).show();
            }

        });
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "hotel clicked ", Toast.LENGTH_SHORT).show();
            }
        });
        cab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, " cab clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HomeActivity.this,CabActivity.class);
                startActivity(intent);
            }
        });


        final AutoCompleteTextView autoCompleteTextView = findViewById(R.id.search1);
        final ArrayAdapter<String> adpater2= new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,myImageNameList2);
        autoCompleteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                autoCompleteTextView.showDropDown();
            }
        });
        autoCompleteTextView.setAdapter(adpater2);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(HomeActivity.this, "You Selected "+myImageNameList2[position], Toast.LENGTH_SHORT).show();
            }
        });



    }

    private ArrayList<FruitModel> eatFruits(){

        ArrayList<FruitModel> list = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            FruitModel fruitModel = new FruitModel();
            fruitModel.setName(myImageNameList[i]);
            fruitModel.setName1(myImageNameList2[i]);
            fruitModel.setImage_drawable(myImageList[i]);
            list.add(fruitModel);
        }

        return list;
    }

    @Override
    protected void onResume() {
        super.onResume();
        navView=findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navView.getMenu().getItem(0).setChecked(true);
    }
}
