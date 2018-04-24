package sing.materialrefreshlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_scrollview);

        findViewById(R.id.simple1).setOnClickListener(this);
        findViewById(R.id.simple2).setOnClickListener(this);
        findViewById(R.id.simple3).setOnClickListener(this);
        findViewById(R.id.simple4).setOnClickListener(this);
        findViewById(R.id.simple5).setOnClickListener(this);
        findViewById(R.id.simple6).setOnClickListener(this);
        findViewById(R.id.simple7).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.simple1:
                startActivity(new Intent(this, ActSimple1.class));
                break;
            case R.id.simple2:
                startActivity(new Intent(this, ActSimple2.class));
                break;
            case R.id.simple3:
                Intent intent = new Intent(this, ActSimple3.class);
                startActivity(intent);
                break;
            case R.id.simple4:
                Intent intent2 = new Intent(this, ActSimple4.class);
                startActivity(intent2);
                break;
            case R.id.simple5:
                startActivity(new Intent(this, ActSimple5.class));
                break;
            case R.id.simple6:
                startActivity(new Intent(this, ActSimple6.class));
                break;
            case R.id.simple7:
                startActivity(new Intent(this, ActSimple7.class));
                break;
        }
    }
}
