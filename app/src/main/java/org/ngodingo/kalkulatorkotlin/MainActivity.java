package org.ngodingo.kalkulatorkotlin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnKalkulatorJava = (Button) findViewById(R.id.btnKalkulatorJava);
        Button btnKalkulatorKotlin = (Button) findViewById(R.id.btnKalkulatorKotlin);

        btnKalkulatorJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), JavaCalculatorActivity.class));
            }
        });

        btnKalkulatorKotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), KotlinCalculatorActivity.class));
            }
        });

    }
}
