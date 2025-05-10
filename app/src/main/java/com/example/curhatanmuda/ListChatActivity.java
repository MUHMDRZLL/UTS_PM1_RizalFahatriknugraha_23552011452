package com.example.curhatanmuda;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class ListChatActivity extends AppCompatActivity {
    ListView listView;
    String[] chats = {"Capek jadi dewasa", "Aku butuh healing", "Kenapa semua berubah?"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_chat);

        listView = findViewById(R.id.chatListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, chats);
        listView.setAdapter(adapter);
    }
}