package it.annalisa.myapplication;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView footerbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        footerbar = (BottomNavigationView) findViewById(R.id.footerbar);
        footerbar.setOnNavigationItemSelectedListener(this);

        /*TextView textView = (TextView) findViewById(R.id.textmain);
        textView.setText("Hello World!");*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
        }else if (id == R.id.action_help) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        if (id == R.id.home) {
           ft.replace(R.id.fragmentcontainer, new HomeFragment());
        } else if (id == R.id.profile) {
            ft.replace(R.id.fragmentcontainer, new ProfileFragment());
        } else if (id == R.id.team) {
            ft.replace(R.id.fragmentcontainer, new TeamFragment());
        } else if (id == R.id.training) {
            ft.replace(R.id.fragmentcontainer, new TrainingFragment());
        } else if (id == R.id.game) {
            Intent intent = new Intent(this, GameActivity.class);
            startActivity(intent);
        }
        ft.addToBackStack(null);
        ft.commit();
        return true;
    }
}
