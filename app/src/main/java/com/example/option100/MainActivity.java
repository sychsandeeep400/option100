package com.example.option100;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuInflater;
        import android.view.MenuItem;
        import android.widget.Switch;
        import android.widget.Toast;

        import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity implements MainActivity1 {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.option100,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.fs:
                Toast.makeText(this, "cgpa=6.2", Toast.LENGTH_LONG).show();
                break;
        }
        switch (item.getItemId()) {
            case R.id.ss:
                Toast.makeText(this, "cgpa=6.2", Toast.LENGTH_LONG).show();
                break;

        }
        switch (item.getItemId()) {
            case R.id.ts:
                Toast.makeText(this, "cgpa=7.5", Toast.LENGTH_LONG).show();
                break;

        }
        switch (item.getItemId()) {
            case R.id.fours:
                Toast.makeText(this, "cgpa=7.6", Toast.LENGTH_LONG).show();
                break;
        }
        switch (item.getItemId()) {
            case R.id.fifs:
                Toast.makeText(this, "cgpa=7.5", Toast.LENGTH_LONG).show();
                break;
        }
        switch (item.getItemId()) {
            case R.id.sixs:
                Toast.makeText(this, "cgpa=6.9", Toast.LENGTH_LONG).show();
                break;
        }
        switch (item.getItemId()) {
            case R.id.sevens:
                Toast.makeText(this, "result yet to be announced", Toast.LENGTH_LONG).show();
                break;
        }
        switch (item.getItemId()) {
            case R.id.es:
                Toast.makeText(this, "result yet to be announced", Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }}