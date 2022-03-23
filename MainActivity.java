package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton opc1, opc2, opc3;
    TextView numpregunta, pregunta;
    Button siguiente, salir;

    int calificacion = 0; int Npregunta = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opc1 = (RadioButton)findViewById(R.id.respuesta1);
        opc2 = (RadioButton)findViewById(R.id.respuesta2);
        opc3 = (RadioButton)findViewById(R.id.respuesta3);

        numpregunta = (TextView)findViewById(R.id.npregunta);
        pregunta = (TextView)findViewById(R.id.textopregunta);

        siguiente = (Button)findViewById(R.id.siguiente);
        salir = (Button)findViewById(R.id.salir);
    }

    public void siguiente (View v){

        if(opc1.isChecked() == false && opc2.isChecked() == false && opc3.isChecked()==false){
            Toast.makeText(this, "por favor eliga una opcción", Toast.LENGTH_SHORT).show();
        }else if(Npregunta == 1){

            if(opc2.isChecked()){
                calificacion = calificacion + 0;
            }
            Npregunta = Npregunta + 1;

            numpregunta.setText("Pregunta 1");
            pregunta.setText("para que sirve un textview");
            opc1.setText(" es un widget que muestra texto al usuario como su nombre lo sugiere");
            opc2.setText("para adornar el texto ");
            opc3.setText(" para mostrar un texto aleatorio");

            opc1.setChecked(false);
            opc3.setChecked(false);
            opc3.setChecked(false);
        }else if(Npregunta == 2) {

            if (opc1.isChecked()) {
                calificacion = calificacion + 1;
            }

            Npregunta = Npregunta + 1;

            numpregunta.setText("Pregunta 2");
            pregunta.setText("para que sirve el Onclick??");
            opc1.setText("para poner un texto");
            opc2.setText("para cambiar el color del boton");
            opc3.setText("Para definir el controlador de evento de clic de un botón");

            opc1.setChecked(false);
            opc2.setChecked(false);
            opc3.setChecked(false);
        }else if(Npregunta == 3) {

            if (opc3.isChecked()) {
                calificacion = calificacion + 1;
            }

            Npregunta = Npregunta + 1;

            numpregunta.setText("Pregunta 3");
            pregunta.setText("para que sirve el textsize");
            opc1.setText("para cambiar el tamaño del texto ");
            opc2.setText("para cambiar de colo el texto");
            opc3.setText("para cambiar el tipo de letra ");

            opc1.setChecked(false);
            opc2.setChecked(false);
            opc3.setChecked(false);
        }else if(Npregunta == 4) {

            if (opc1.isChecked()) {
                calificacion = calificacion + 1;
            }

            Npregunta = Npregunta + 1;

            numpregunta.setText("Pregunta 4");
            pregunta.setText("para que sirve un else??");
            opc1.setText("para indicar una instruccion");
            opc2.setText("sirve para indicar instrucciones a realizar en caso de no cumplirse la condición.");
            opc3.setText("para indicarle una accion a un boton");

            opc1.setChecked(false);
            opc2.setChecked(false);
            opc3.setChecked(false);
        }else if(Npregunta == 5) {

            if (opc2.isChecked()) {
                calificacion = calificacion + 1;
            }

            Npregunta = Npregunta + 1;

            numpregunta.setText("Pregunta 5");
            pregunta.setText("para que sirve un linear layout");
            opc1.setText("establece los componentes visuales uno junto al otro, ya sea horizontal o verticalmente.");
            opc2.setText("para que los botones se acomoden en horizontal ");
            opc3.setText("para que los botones se acomoden hasta abajo");

            opc1.setChecked(false);
            opc3.setChecked(false);
            opc3.setChecked(false);
        }else if(Npregunta == 6) {

            if (opc1.isChecked()) {
                calificacion = calificacion + 1;
            }

            Npregunta = Npregunta + 1;

            numpregunta.setText("Pregunta 6");
            pregunta.setText("¿para que sirve el setText??");
            opc1.setText("para editar el texto");
            opc2.setText("para escribir un texto");
            opc3.setText("para reemplazar el texto existente por el texto nuevo.");

            opc1.setChecked(false);
            opc2.setChecked(false);
            opc3.setChecked(false);
        }else if(Npregunta == 7) {

            if (opc3.isChecked()) {
                calificacion = calificacion + 1;
            }

            Npregunta = Npregunta + 1;

            numpregunta.setText("Pregunta 7");
            pregunta.setText("para que sirve un if ??");
            opc1.setText("se utiliza en Java para tomar decisiones sobre un valor preexistente");
            opc2.setText("se utiliza para poder hacer que un boton haga una accion");
            opc3.setText("se utiliza para realizar una opccion secundaria ");

            opc1.setChecked(false);
            opc2.setChecked(false);
            opc3.setChecked(false);
        }else if(Npregunta == 8) {

            if (opc1.isChecked()) {
                calificacion = calificacion + 1;
            }

            Npregunta = Npregunta + 1;

            numpregunta.setText("Pregunta 8");
            pregunta.setText("para que sirve un public void??");
            opc1.setText("para hacer publica una accion");
            opc2.setText("es un método especial que permite ejecutar el código de un programa, o aplicación.");
            opc3.setText("para hacer que se vea el texto");

            opc1.setChecked(false);
            opc2.setChecked(false);
            opc3.setChecked(false);
        }else if(Npregunta == 9) {

            if (opc2.isChecked()) {
                calificacion = calificacion + 1;

            }

            Npregunta = Npregunta + 1;

            numpregunta.setText("Pregunta 9");
            pregunta.setText("¿para que sirve int?'");
            opc1.setText("para agregar un boton");
            opc2.setText("Define un número entero, es decir un número sin decimales incluyendo el cero y los números negativos.");
            opc3.setText("para cambiarle el nombre a una variable");

            opc1.setChecked(false);
            opc2.setChecked(false);
            opc3.setChecked(false);
        }else if(Npregunta == 10) {

            if (opc2.isChecked()) {
                calificacion = calificacion + 1;

            }

            Npregunta = Npregunta + 1;

            numpregunta.setText("Pregunta 9");
            pregunta.setText("¿para que sirve un public class?''");
            opc1.setText("para crear un grupo de variables");
            opc2.setText("para crear una variable");
            opc3.setText("para crear una clase de tipo public");

            opc1.setChecked(false);
            opc2.setChecked(false);
            opc3.setChecked(false);
        }else if(Npregunta == 11) {

            if (opc3.isChecked()) {
                calificacion = calificacion + 1;

            }





            numpregunta.setText("Nota obtenida: "+calificacion);

            if(calificacion >= 6){
                pregunta.setText("Estado: Aprobado");
            }else{
                pregunta.setText("Estado: Reprobado");
            }

            opc1.setVisibility(View.GONE);
            opc2.setVisibility(View.GONE);
            opc3.setVisibility(View.GONE);
            siguiente.setVisibility(View.GONE);
        }
    }

    public void Salir(View v){
        finish();
    }
}


