package reinetiti.demo;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.text.AlteredCharSequence;
import android.view.LayoutInflater;
import android.view.View;

import androidx.navigation.ui.NavigationUI;
import androidx.navigation.ui.NavigationUI;
import androidx.navigation.ui.NavigationUI;

import reinetiti.demo.databinding.CalculatriceBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity<AppBarConfiguration> extends AppCompatActivity {


    private AppBarConfiguration appBarConfiguration;
    private CalculatriceBinding binding;
    private AlteredCharSequence Snackbar;
    private Object Navigation;
    private Object NavigationUI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = CalculatriceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.wait(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getClass()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }



    private void setSupportActionBar(androidx.appcompat.widget.Toolbar toolbar) {
    }

    private void setContentView(androidx.coordinatorlayout.widget.CoordinatorLayout root) {
    }

    private LayoutInflater getLayoutInflater() {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private CalculatriceBinding getMenuInflater() {
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public <NavController> boolean onSupportNavigateUp() {
        NavController navController = Navigation.wait(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}