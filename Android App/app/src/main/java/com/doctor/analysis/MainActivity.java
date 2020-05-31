package com.doctor.analysis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;

import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final int GALLERY_INTENT_CODE = 1023 ;
    TextView fullName,email,phone,verifyMsg;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userId;

    Button resetPassLocal;
    FirebaseUser user;
    StorageReference storageReference;
    ListView listview;
    String[]listviewitem=new String[]{

            "01) patient ID:151",
            "02) patient ID:152",
            "03) patient ID:153",
            "04) patient ID:154",
            "05) patient ID:155",
            "06) patient ID:156",
            "07) patient ID:157",
            "08) patient ID:158",
            "09) patient ID:155",
            "10) patient ID:156",
            "11)patient ID:157",
            "12) patient ID:158",
            "13) patient ID:159",
            "14) patient ID:160",
            "15) patient ID:161",
            "16) patient ID:162"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState)


    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resetPassLocal = findViewById(R.id.resetPasswordLocal);
        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        storageReference = FirebaseStorage.getInstance().getReference();

        userId = fAuth.getCurrentUser().getUid();
         user = fAuth.getCurrentUser();
        ListView listView=(ListView)findViewById(R.id.listview);






        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,listviewitem);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview=listviewitem[position].toString();
                Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                intent.putExtra("ID",Templistview);
                startActivity(intent);
            }


        });




    }



    public void logout(View view)
    {
        FirebaseAuth.getInstance().signOut();//logout
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }


}
