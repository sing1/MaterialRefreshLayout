package sing.materialrefreshlayout;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import sing.MaterialRefreshLayout;
import sing.MaterialRefreshListener;

public class SunActivity extends BaseActivity{

    private MaterialRefreshLayout materialRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        String[] array = new String[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = "啊哈哈哈哈哈 " + i;
        }

        final ListView listView = (ListView) findViewById(R.id.lv);
        listView.setAdapter(new android.widget.ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array));
        materialRefreshLayout = (MaterialRefreshLayout) findViewById(R.id.refresh);
        materialRefreshLayout.setSunStyle(true);
        materialRefreshLayout.setMaterialRefreshListener(new MaterialRefreshListener() {
            @Override
            public void onRefresh(final MaterialRefreshLayout materialRefreshLayout) {
                materialRefreshLayout.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        materialRefreshLayout.finishRefresh();
                    }
                }, 3000);

            }

            @Override
            public void onfinish() {
                Toast.makeText(SunActivity.this, "finish", Toast.LENGTH_LONG).show();
            }
        });
    }
}