package momocompany.td1;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Momo on 28/01/2017.
 */

public class NumberPicker extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_picker);

        final android.widget.NumberPicker numberPicker = (android.widget.NumberPicker)findViewById(R.id.numpicker);
        numberPicker.setMinValue(10);
        numberPicker.setMaxValue(20);
        numberPicker.setWrapSelectorWheel(false);
    }
}