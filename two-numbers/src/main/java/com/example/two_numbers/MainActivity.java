package com.example.two_numbers;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.text.InputType;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ListView;

        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText edit_Text_a;
    private EditText edit_Text_b;
    private Button btn_Add;
    private Button btn_Subtract;
    private Button btn_Multi;
    private Button btn_Divide;
    private ListView listView;
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_Text_a = findViewById(R.id.edit_Text_a);
        edit_Text_b = findViewById(R.id.edit_Text_b);
        listView = findViewById(R.id.list);

        edit_Text_a.setInputType(InputType.TYPE_CLASS_NUMBER |
                InputType.TYPE_NUMBER_FLAG_DECIMAL);
        edit_Text_b.setInputType(InputType.TYPE_CLASS_NUMBER |
                InputType.TYPE_NUMBER_FLAG_DECIMAL);
        arrayList = new ArrayList<String>();
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);


        btn_Add = findViewById(R.id.btn_Add);
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(edit_Text_a.getText().toString());
                double b = Double.parseDouble(edit_Text_b.getText().toString());
                double result = a+b;
                arrayList.add("a + b = "+result);
                arrayAdapter.notifyDataSetChanged();
            }
        });

        btn_Subtract = findViewById(R.id.btn_Subtract);
        btn_Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(edit_Text_a.getText().toString());
                double b = Double.parseDouble(edit_Text_b.getText().toString());
                double result = a-b;
                arrayList.add("a - b = "+result);
                arrayAdapter.notifyDataSetChanged();

            }
        });

        btn_Multi = findViewById(R.id.btn_Multi);
        btn_Multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(edit_Text_a.getText().toString());
                double b = Double.parseDouble(edit_Text_b.getText().toString());
                double result = a*b;
                arrayList.add("a * b = "+result);
                arrayAdapter.notifyDataSetChanged();

            }
        });

        btn_Divide = findViewById(R.id.btn_Div);
        btn_Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(edit_Text_a.getText().toString());
                double b = Double.parseDouble(edit_Text_b.getText().toString());
                double result = a/b;
                arrayList.add("a / b = "+result);
                arrayAdapter.notifyDataSetChanged();
            }
        });

    }

}