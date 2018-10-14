package dsa.eetac.upc.edu.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Let's declare the variables of the buttons (Button type), thw switch (Switch type) and the TextViews (TextView type)
    //Also we declare the char constants like add, subtract, etc
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button num0;
    private Button pi;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private Button decimal;
    private Button equal;
    private Button clear;
    private Button sin;
    private Button cos;
    private Button tan;
    private Switch grarad;
    private TextView result;

    private final char ADDITION = '+';
    private final char SUBTRACT = '-';
    private final char MULTIPLY = '*';
    private final char DIVIDE = '/';
    private final char EQUAL = '0';
    private final char SIN = 's';
    private final char COS = 'c';
    private final char TAN = 't';

    private char ACTION;

    private double val1 = Double.NaN;
    private double val2;

    //This method is called when the program starts. Here we call our function setupUIViews()
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        //Let's declare what will happen when we click the buttons and the switch
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "1");
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "9");
            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "0");
            }
        });

        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + Math.PI);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            //When we click the button add, we have to call compute() method and the ACTION will be ADDITION
            //We will show the val1 (which is the sum of values) and + symbol, and the result textbox will be null (blank space)
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(val1) + "+");
                result.setText(null);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            //When we click the button subtract, we have to call compute() method and the ACTION will be SUBTRACT
            //We will show the val1 (which is the subtract of values) and - symbol, and the result textbox will be null (blank space)
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBTRACT;
                result.setText(String.valueOf(val1) + "-");
                result.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            //When we click the button multiply, we have to call compute() method and the ACTION will be MULTIPLY
            //We will show the val1 (which is the multiply of values) and * symbol, and the result textbox will be null (blank space)
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MULTIPLY;
                result.setText(String.valueOf(val1) + "*");
                result.setText(null);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            //When we click the button divide, we have to call compute() method and the ACTION will be DIVIDE
            //We will show the val1 (which is the divide of values) and / symbol, and the result textbox will be null (blank space)
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIVIDE;
                result.setText(String.valueOf(val1) + "/");
                result.setText(null);
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            //When we click the button divide, we have to call compute() method and the ACTION will be DIVIDE
            //We will show the val1 (which is the divide of values) and / symbol, and the result textbox will be null (blank space)
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SIN;
                result.setText(String.valueOf(val1));
                result.setText(null);
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            //When we click the button divide, we have to call compute() method and the ACTION will be DIVIDE
            //We will show the val1 (which is the divide of values) and / symbol, and the result textbox will be null (blank space)
            @Override
            public void onClick(View v) {
                compute();
                ACTION = COS;
                result.setText(String.valueOf(val1));
                result.setText(null);
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            //When we click the button divide, we have to call compute() method and the ACTION will be DIVIDE
            //We will show the val1 (which is the divide of values) and / symbol, and the result textbox will be null (blank space)
            @Override
            public void onClick(View v) {
                compute();
                ACTION = TAN;
                result.setText(String.valueOf(val1));
                result.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            //When we click the button Equal, we have to call compute() method and the ACTION will be EQUAL
            //We will show the result of the operations and = symbol, and the result textbox will be null (blank space)
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQUAL;
                //Imagine the following operation: 5 + 4 = 9
                //In the result we have the 5 + of the previous operation; in the val2 we have the new value entered by the user; then the equal symbol;
                //and finally the new result, which is stored in val1
                result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                result.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Double.NaN;
                val2 = Double.NaN;
                result.setText(null);
            }
        });
    }

    //Let's associate each one of this variables to the id in the xml file
    private void setupUIViews(){
        num1 = (Button) findViewById(R.id.onebtn);
        num2 = (Button) findViewById(R.id.twobtn);
        num3 = (Button) findViewById(R.id.threebtn);
        num4 = (Button) findViewById(R.id.fourbtn);
        num5 = (Button) findViewById(R.id.fivebtn);
        num6 = (Button) findViewById(R.id.sixbtn);
        num7 = (Button) findViewById(R.id.sevenbtn);
        num8 = (Button) findViewById(R.id.eigthbtn);
        num9 = (Button) findViewById(R.id.ninebtn);
        num0 = (Button) findViewById(R.id.zerobtn);
        pi= (Button) findViewById(R.id.pibtn);
        add = (Button) findViewById(R.id.addbtn);
        subtract = (Button) findViewById(R.id.subtractbtn);
        multiply = (Button) findViewById(R.id.multiplybtn);
        divide = (Button) findViewById(R.id.dividebtn);
        decimal = (Button) findViewById(R.id.decimalbtn);
        equal = (Button) findViewById(R.id.equalbtn);
        clear = (Button) findViewById(R.id.clearbtn);
        sin = (Button) findViewById(R.id.sinbtn);
        cos = (Button) findViewById(R.id.cosbtn);
        tan = (Button) findViewById(R.id.tanbtn);
        grarad = (Switch) findViewById(R.id.switchbtn);
        result = (TextView) findViewById(R.id.tvResult);
    }

    //Let's declare a method that will be called when some button operation is called (sum, multiply, sin, etc)
    private void compute(){
        //Let's see if the switch is checked
        Boolean switchState = grarad.isChecked();
        //If the number val1 isn't NaN (null)
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(result.getText().toString());

            //We have to switch among the possible options (add, subtract, etc)
            switch(ACTION){
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACT:
                    val1 = val1 - val2;
                    break;
                case DIVIDE:
                    val1 = val1 / val2;
                    break;
                case MULTIPLY:
                    val1 = val1 * val2;
                    break;
                case SIN:
                    if(switchState==false) val1 = Math.sin(val2);
                    else {
                        val2 = Math.toRadians(val2);
                        val1 = Math.sin(val2);
                    }
                    break;
                case COS:
                    if(switchState==false) val1 = Math.cos(val2);
                    else {
                        val2 = Math.toRadians(val2);
                        val1 = Math.cos(val2);
                    }
                    break;
                case TAN:
                    if(switchState==false) val1 = Math.tan(val2);
                    else {
                        val2 = Math.toRadians(val2);
                        val1 = Math.tan(val2);
                    }
                    break;
                case EQUAL:
                    break;
            }
        }

        //Whatever number is stored in val1
        else {
            val1 = Double.parseDouble(result.getText().toString());
        }
    }
}
