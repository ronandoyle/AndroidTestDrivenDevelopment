package nanorstudios.ie.testdrivendevelopment;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Counter mCounter;

    private TextView mTextViewCounter;
    private Button mButtonAdd;
    private Button mButtonSubtract;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCounter = new Counter(0);

        mTextViewCounter = (TextView) findViewById(R.id.text_view_counter);
        mButtonAdd = (Button) findViewById(R.id.button_add);
        mButtonSubtract = (Button) findViewById(R.id.button_subtract);

        mButtonAdd.setOnClickListener(this);
        mButtonSubtract.setOnClickListener(this);
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }

    @Override
    public void onClick(View view) {
        if (view == mButtonAdd) {
            mCounter.addCounter();
            mTextViewCounter.setText(String.valueOf(mCounter.getCount()));
        } else if (view == mButtonSubtract) {
            mCounter.subtractCounter();
            mTextViewCounter.setText(String.valueOf(mCounter.getCount()));
        }
    }
}
