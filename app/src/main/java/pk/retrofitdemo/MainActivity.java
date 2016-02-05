package pk.retrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import pk.retrofitdemo.plugin.RetrofitPlugin;
import pk.retrofitdemo.test.Entity;
import pk.retrofitdemo.test.UserApi;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private UserApi userApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userApi = new RetrofitPlugin().getRetrofit().create(UserApi.class);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userApi.testRequest("wzj", "123")
                        .enqueue(new Callback<Entity>() {
                            @Override
                            public void onResponse(Response<Entity> response) {
                                T(response.body());
                            }

                            @Override
                            public void onFailure(Throwable t) {
                                T(t.getMessage());
                            }
                        });
            }
        });

    }

    private void T(Object s) {
        Toast.makeText(this, s + "", Toast.LENGTH_SHORT).show();
    }

}
