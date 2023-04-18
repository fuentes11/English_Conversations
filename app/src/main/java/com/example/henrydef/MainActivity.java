package com.example.henrydef;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.henrydef.U1.conver1;
import com.example.henrydef.U2.U2C1;
import com.example.henrydef.U3.U3C1;
import com.example.henrydef.U4.U4C1;
import com.example.henrydef.U5.U5C1;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Unit 1", "Unit 2", "Unit 3", "Unit 4", "Unit 5"};
    String mDescription[] = {"BUSINESS SKILLS", "MAKING ARRANGEMENTS", "MARKETING FEVER FAIR", "OFFICE ISSUES.", "STARTING MY OWN BUSINESS"};
    int images[] = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e};
    // so our images and other things are set in array

    // now paste some images in drawable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        // now create an adapter class

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
        // there is my mistake...
        // now again check this..

        // now set item click on list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    Intent intent=new Intent(getApplicationContext(), conver1.class);
                    startActivity(intent);
                }
                if (position ==  1) {
                    Intent intent=new Intent(getApplicationContext(), U2C1.class);
                    startActivity(intent);
                }
                if (position ==  2) {
                    Intent intent=new Intent(getApplicationContext(), U3C1.class);
                    startActivity(intent);
                }
                if (position ==  3) {
                    Intent intent=new Intent(getApplicationContext(), U4C1.class);
                    startActivity(intent);
                }
                if (position ==  4) {
                    Intent intent=new Intent(getApplicationContext(), U5C1.class);
                    startActivity(intent);
                }
            }
        });
        // so item click is done now check list view
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);




            return row;
        }
    }
}