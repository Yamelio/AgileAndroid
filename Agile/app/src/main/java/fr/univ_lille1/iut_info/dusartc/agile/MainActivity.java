package fr.univ_lille1.iut_info.dusartc.agile;

//import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.view.View;
import  android.content.Intent;


import static android.widget.AdapterView.*;

public class MainActivity extends Activity {
    final String EXTRA_LOGIN = "user_login";
    final String EXTRA_PASSWORD = "user_password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*final Spinner choix = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adStudent = ArrayAdapter.createFromResource(this, R.array.souhait, android.R.layout.simple_spinner_item);
        choix.setAdapter(adStudent);
        choix.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView statut = (TextView) findViewById(R.id.textView);
                statut.setText(choix.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                TextView eleve = (TextView) findViewById(R.id.textView);
                eleve.setText("");

            }
        });
        */
        final EditText login = (EditText) findViewById(R.id.login);
        final EditText pass = (EditText) findViewById(R.id.mdp);
        final Button loginButton = (Button) findViewById(R.id.buttonConnection);
        loginButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginDisplayActivity.class);
                intent.putExtra(EXTRA_LOGIN, login.getText().toString());
                intent.putExtra(EXTRA_PASSWORD, pass.getText().toString());
                startActivity(intent);
            }
        });
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
        }

        return super.onOptionsItemSelected(item);
    }
}
