package mendes.nascimento.nycolly.galeriapublica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    setContentView(R.layout.activity_main);
    final MainViewModel vm = new
            ViewModelProvider(this).get(MainViewModel.class);
        bottomNavigationView = findViewById(R.id.btNav);
        bottomNavigationView.setOnItem   (new
                NavigationBarView.OnItemSelectedListener()


    }