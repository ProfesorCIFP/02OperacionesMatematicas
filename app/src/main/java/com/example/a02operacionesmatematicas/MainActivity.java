package com.example.a02operacionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText operando1, operando2;
    public TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operando1 = findViewById(R.id.operando1);
        operando2 = findViewById(R.id.operando2);

        resultado = findViewById(R.id.tvResultado);

    }

    public void onClick(View view) {

        float op1 = Float.parseFloat(operando1.getText().toString());
        float op2 = Float.parseFloat(operando2.getText().toString());

        switch (view.getId()) {
            case R.id.btnSuma: mostrarResultado (sumar(op1, op2));
                break;
            case R.id.btnResta: mostrarResultado (restar(op1, op2));
                break;
            case R.id.btnProducto: mostrarResultado (multiplicar(op1, op2));
                break;
            case R.id.btnCociente: mostrarResultado (dividir(op1, op2));
                break;
        }
    }

    private float sumar(float op1, float op2) {
        return op1 + op2;
    }

    private float restar(float op1, float op2) {
        return op1 - op2;
    }

    private float multiplicar(float op1, float op2) {
        return op1 * op2;
    }

    private float dividir(float op1, float op2) {
        if (op2 == 0)
            Toast.makeText(this, "Advertencia: División por cero", Toast.LENGTH_LONG).show();
        else
            return op1 / op2;

        return 0;
    }

    public void mostrarResultado(float valor) {
        resultado.setText("Resultado: " + valor);
    }

}
