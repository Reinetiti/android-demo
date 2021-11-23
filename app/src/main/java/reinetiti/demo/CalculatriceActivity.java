package reinetiti.demo;

//import androidx.AppCompatActivity.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatriceActivity extends AppCompatActivity {

    Button zero;
    private Button un;
    private Button deux;
    private Button trois;
    private Button quatre;
    private Button cinq;
    private Button six;
    private Button sept;
    private Button huit;
    private Button neuf;
    private Button pm;
    private Button pc;
    private Button div;
    private Button mul;
    private Button sub;
    private Button add;
    private Button equal;
    private Button coma;
    private Button ac;
    private TextView view;
    private final String DIVISION = "/";
    private final String MULTIPLICATION = "*";
    private final String SOUSTRATION = "-";
    private final String ADDITION = "+";
    private final String EQU = "0";
    private double val1 = Double.NaN;
    private double val2;
    private String ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculatrice);

        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "0");
            }
        });

        un.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "1");
            }
        });

        deux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "2");
            }
        });

        trois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "3");
            }
        });

        quatre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "4");
            }
        });

        cinq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "six");
            }
        });

        sept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "7");
            }
        });

        huit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "8");
            }
        });

        neuf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "9");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculer();
                ACTION = DIVISION;
                view.setText(String.valueOf(val1) + "/");
                view.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculer();
                ACTION = MULTIPLICATION;
                view.setText(String.valueOf(val1) + "*");
                view.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculer();
                ACTION = SOUSTRATION;
                view.setText(String.valueOf(val1) + "-");
                view.setText(null);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculer();
                ACTION = ADDITION;
                view.setText(String.valueOf(val1) + "+");
                view.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculer();
                ACTION = EQU;
                view.setText(view.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                view.setText(null);
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (view.getText().length() > 0){
                    CharSequence name = view.getText().toString();
                    view.setText(name.subSequence(0, name.length()-1));
                }
                else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    view.setText(null);
                    view.setText(null);
                }
            }
        });
    }

    private void setupUIViews(){
        zero = (Button) findViewById(R.id.btn0);
        un = (Button) findViewById(R.id.btn1);
        deux = (Button) findViewById(R.id.btn2);
        trois = (Button) findViewById(R.id.btn3);
        quatre = (Button) findViewById(R.id.btn4);
        cinq = (Button) findViewById(R.id.btn5);
        six = (Button) findViewById(R.id.btn6);
        sept = (Button) findViewById(R.id.btn7);
        huit = (Button) findViewById(R.id.btn8);
        neuf = (Button) findViewById(R.id.btn9);
        pm = (Button) findViewById(R.id.btnpm);
        pc = (Button) findViewById(R.id.btnpc);
        div = (Button) findViewById(R.id.btndiv);
        mul = (Button) findViewById(R.id.btnmul);
        sub = (Button) findViewById(R.id.btnsub);
        add = (Button) findViewById(R.id.btnadd);
        equal = (Button) findViewById(R.id.btnequal);
        coma = (Button) findViewById(R.id.btncoma);
        ac = (Button) findViewById(R.id.btnAC);
        view = (TextView) findViewById(R.id.view);
    }

    private void calculer(){
        if (!Double.isNaN(val1)){
            val2 = Double.parseDouble(view.getText().toString());

            switch (ACTION){
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case SOUSTRATION:
                    val1 = val1 - val2;
                    break;
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case EQU:
                    break;
            }
        }
        else {
            val1 = Double.parseDouble(view.getText().toString());
        }
    }

    //private void setContentView(int calculatrice) {
    //}
}



