package sdu.cs58.kritsada.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    EditText number1EditText, number2EditText;
    TextView resultTextView;
    Button addButton,minusButton,multiButton,divideButton;
    int num1,num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial view
        number1EditText = findViewById(R.id.edtNumber1);
        number2EditText = findViewById(R.id.edtNumber2);
        addButton = findViewById(R.id.btnAdd);
        minusButton = findViewById(R.id.btmMinus);
        multiButton = findViewById(R.id.btnMulti);
        divideButton = findViewById(R.id.btnDivide);
        resultTextView = findViewById(R.id.txvResult);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //แปลงค่าที่รับจาก editTextเ ป็นตัวเลข
                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result = num1 + num2;
                resultTextView.setText(result + "");

            }
        }); //end setOnclicklistener

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result = num1 - num2;
                resultTextView.setText(result + "");
            }

        });
        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result = num1 * num2;
                resultTextView.setText(result + "");
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result = num1 / num2;
                resultTextView.setText(result + "");
            }
        });

    }// end method onCreate
}//end class
