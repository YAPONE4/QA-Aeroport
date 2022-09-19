package ru.ayaks.qa_airport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ru.ayaks.qa_airport.View.StartPage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button button_start = (Button) findViewById(R.id.start_button);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStartPage();
            }
        });
    }

    public void openStartPage() {
        Intent intent = new Intent(this, StartPage.class);
        startActivity(intent);
    }
}