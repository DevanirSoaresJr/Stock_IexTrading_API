package devanir.soaresjunior.stock_api;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etKey;
    Button btnSearch;
    TextView tvResults;
    TextView tvWelcome;
    TextView tvStockName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvWelcome = findViewById(R.id.tvTitle);
        tvStockName = findViewById(R.id.tvStockName);
        etKey = findViewById(R.id.etKey);
        btnSearch = findViewById(R.id.btnSearch);
        tvResults = findViewById(R.id.tvResults);

        btnSearch.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSearch:
                searchClicked();
                break;
        }
    }

    private void searchClicked() {
        String key = etKey.getText().toString();
        String url = "https://api.iextrading.com/1.0/stock/" + key + "/quote";
        try {
            new APIWorker().execute(new URL(url));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    class APIWorker extends AsyncTask<URL, Void, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(URL... urls) {
            StringBuilder result = new StringBuilder();
            try {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection)
                        urls[0].openConnection();
                InputStream inputStream = new
                        BufferedInputStream(httpsURLConnection.getInputStream());
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(inputStream));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    result.append(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return result.toString();
        }

        @Override
        protected void onPostExecute(String results) {
            super.onPostExecute(results);

            Gson gson = new Gson();
            StockKeyProfile stockKeyProfile = gson.fromJson(results, StockKeyProfile.class);

            String symbol = stockKeyProfile.getSymbol();
            String companyName = stockKeyProfile.getCompanyName();
            String sector = stockKeyProfile.getSector();
            String calculationPrice = stockKeyProfile.getCalculationPrice();
            String result = "Company Name: " + companyName + "\n" +
                    "Company Symbol: " + symbol + "\n" +
                    "Sector: " + sector + "\n" +
                    "CalculationPrice: " + calculationPrice;

            tvResults.setText(result);
        }
    }
}


