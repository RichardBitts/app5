package com.example.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cb11, cb22, cb33;

    RadioButton rb11, rb22, rb33;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb11 = (CheckBox) findViewById(R.id.cb1);
        cb22 = (CheckBox) findViewById(R.id.cb2);
        cb33 = (CheckBox) findViewById(R.id.cb3);

        rb11 = (RadioButton) findViewById(R.id.rb1);
        rb22 = (RadioButton) findViewById(R.id.rb2);
        rb33 = (RadioButton) findViewById(R.id.rb3);

    }

    public void BT1 (View view){

        //Toast.makeText(this, "hola", Toast.LENGTH_SHORT).show();

//texto para rb1 activo con cb1, cb2, cb3
        if (cb11.isChecked()&&cb22.isChecked()&&cb33.isChecked()&&rb11.isChecked()){
            Toast.makeText(this, "select cb1, cb2, cb3 y rb1", Toast.LENGTH_SHORT).show();
        }else if (cb11.isChecked()&&cb22.isChecked()&&cb33.isChecked()&&rb22.isChecked()){
            Toast.makeText(this, "select cb1, cb2, cb3 y rb2", Toast.LENGTH_SHORT).show();
        }else if (cb11.isChecked()&&cb22.isChecked()&&cb33.isChecked()&&rb33.isChecked()){
            Toast.makeText(this, "select cb1, cb2, cb3 y rb3", Toast.LENGTH_SHORT).show();
        }

//texto para rb2 activo con cb1 y cb2
        else if (cb11.isChecked()&&cb22.isChecked()&&rb11.isChecked()){
            Toast.makeText(this, "select cb1, cb2 y rb1", Toast.LENGTH_SHORT).show();
        }else if (cb11.isChecked()&&cb22.isChecked()&&rb22.isChecked()){
            Toast.makeText(this, "select cb1, cb2 y rb2", Toast.LENGTH_SHORT).show();
        }else if (cb11.isChecked()&&cb22.isChecked()&&rb33.isChecked()){
            Toast.makeText(this, "select cb1, cb2 y rb3", Toast.LENGTH_SHORT).show();
        }

//texto para cb2 y cb3 con rb1,rb2,rb3
        else if (cb22.isChecked()&&cb33.isChecked()&&rb11.isChecked()){
            Toast.makeText(this, "select cb2, cb3 y rb1", Toast.LENGTH_SHORT).show();
        }else if (cb22.isChecked()&&cb33.isChecked()&&rb22.isChecked()){
            Toast.makeText(this, "select cb2, cb3 y rb2", Toast.LENGTH_SHORT).show();
        }else if (cb22.isChecked()&&cb33.isChecked()&&rb33.isChecked()){
            Toast.makeText(this, "select cb2, cb3 y rb3", Toast.LENGTH_SHORT).show();
        }

//texto para cb1 y cb3 con rb1,rb2,rb3
        else if (cb11.isChecked()&&cb33.isChecked()&&rb11.isChecked()){
            Toast.makeText(this, "select cb1, cb3 y rb1", Toast.LENGTH_SHORT).show();
        }else if (cb11.isChecked()&&cb33.isChecked()&&rb22.isChecked()){
            Toast.makeText(this, "select cb1, cb3 y rb2", Toast.LENGTH_SHORT).show();
        }else if (cb11.isChecked()&&cb33.isChecked()&&rb33.isChecked()){
            Toast.makeText(this, "select cb1, cb3 y rb3", Toast.LENGTH_SHORT).show();
        }

//texto un check con todos los rb
        else if (cb11.isChecked()&&rb11.isChecked()){
            Toast.makeText(this, "select cb1 y rb1", Toast.LENGTH_SHORT).show();
        }else if (cb22.isChecked()&&rb11.isChecked()){
            Toast.makeText(this, "select cb2 y rb1", Toast.LENGTH_SHORT).show();
        }else if (cb33.isChecked()&&rb11.isChecked()){
            Toast.makeText(this, "select cb3 y rb1", Toast.LENGTH_SHORT).show();
        }else if (cb11.isChecked()&&rb22.isChecked()){
            Toast.makeText(this, "select cb1 y rb2", Toast.LENGTH_SHORT).show();
        }else if (cb22.isChecked()&&rb22.isChecked()){
            Toast.makeText(this, "select cb2 y rb2", Toast.LENGTH_SHORT).show();
        }else if (cb33.isChecked()&&rb22.isChecked()){
            Toast.makeText(this, "select cb3 y rb2", Toast.LENGTH_SHORT).show();
        }else if (cb11.isChecked()&&rb33.isChecked()){
            Toast.makeText(this, "select cb1 y rb3", Toast.LENGTH_SHORT).show();
        }else if (cb22.isChecked()&&rb33.isChecked()){
            Toast.makeText(this, "select cb2 y rb3", Toast.LENGTH_SHORT).show();
        }else if (cb33.isChecked()&&rb33.isChecked()){
            Toast.makeText(this, "select cb3 y rb3", Toast.LENGTH_SHORT).show();
        }

//texto para cualquier rb activo sin check
        else if (rb11.isChecked()){
            Toast.makeText(this, "select rb1", Toast.LENGTH_SHORT).show();
        }else if (rb22.isChecked()){
            Toast.makeText(this, "select rb2", Toast.LENGTH_SHORT).show();
        }else if (rb33.isChecked()){
            Toast.makeText(this, "select rb3", Toast.LENGTH_SHORT).show();
        }

//texto para seleccionoar mas de dos check
        else if (cb11.isChecked()&&cb22.isChecked()&&cb33.isChecked()){
            Toast.makeText(this, "select cb1, cb2, cb3", Toast.LENGTH_SHORT).show();
        }else if (cb11.isChecked()&&cb22.isChecked()){
            Toast.makeText(this, "select cb1 y cb2", Toast.LENGTH_SHORT).show();
        }else if (cb11.isChecked()&&cb33.isChecked()){
            Toast.makeText(this, "select cb1 y cb3", Toast.LENGTH_SHORT).show();
        }else if (cb22.isChecked()&&cb33.isChecked()){
            Toast.makeText(this, "select cb2 y cb3", Toast.LENGTH_SHORT).show();
        }

//texto para seleccionar solo un check
        else if (cb11.isChecked()){
            Toast.makeText(this, "select cb1", Toast.LENGTH_SHORT).show();
        }else if (cb22.isChecked()){
            Toast.makeText(this, "select cb2", Toast.LENGTH_SHORT).show();
        }else if (cb33.isChecked()){
            Toast.makeText(this, "select cb3", Toast.LENGTH_SHORT).show();
        }
    }
}