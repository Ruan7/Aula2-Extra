package br.edu.ifsc.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void converte(View view) {

        int F, C;

        TextView texto1 = findViewById(R.id.editText);
        TextView texto2 = findViewById(R.id.editText2);
        TextView texto3 = findViewById(R.id.textView);

        if (!texto1.getText().toString().isEmpty() && !texto2.getText().toString().isEmpty()) {
            texto3.setText("Digite apenas um por vez para conversão");
        } else if (!texto1.getText().toString().isEmpty()) {
            C = Integer.parseInt(texto1.getText().toString());
            F = (int) (C * 1.8 + 32);
            texto3.setText(String.valueOf(F).toString());

        } else if (!texto2.getText().toString().isEmpty()) {

            F = Integer.parseInt(texto2.getText().toString());
            C = (int) ((F - 32) / 1.8);
            texto3.setText(String.valueOf(C).toString());
        } else {
            texto3.setText("Campos não informados");
        }
    }
}
