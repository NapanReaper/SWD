package duydtn.testretrofit2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import duydtn.testretrofit2.model.Api;
import duydtn.testretrofit2.model.PromotionsDatum;
import duydtn.testretrofit2.model.PromotionAdapter;
import duydtn.testretrofit2.model.Promotions;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TextView txtList;
    private List<PromotionsDatum> promotionsDatumList2;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtList = findViewById(R.id.txtList);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        promotionsDatumList2 = new ArrayList<>();
        getList();

        PromotionAdapter adapter = new PromotionAdapter(this, promotionsDatumList2);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }

    private void getList() {
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl(Api.BASE_URL).
                addConverterFactory(GsonConverterFactory.create()).
                build();
        Api api = retrofit.create(Api.class);
        Call<Promotions> call = api.getPromotions();
        call.enqueue(new Callback<Promotions>() {
            @Override
            public void onResponse(Call<Promotions> call, Response<Promotions> response) {
                Promotions resource = response.body();
                List<PromotionsDatum> promotionsDatumList = resource.data;
                String result = "";
                for (PromotionsDatum promotionsDatum : promotionsDatumList) {
                    promotionsDatum = new PromotionsDatum(promotionsDatum.getName(), promotionsDatum.getDescription(), promotionsDatum.getBrandCode(), promotionsDatum.getImageUrl(), promotionsDatum.getBeginTime(), promotionsDatum.getEndTime());
                    promotionsDatumList2.add(promotionsDatum);
//                    result += promotionsDatum.name + " " + promotionsDatum.brandCode + " " + promotionsDatum.active + "\n";
                }
//                txtList.setText(result);
            }

            @Override
            public void onFailure(Call<Promotions> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void clickToView(View view) {

    }
}
