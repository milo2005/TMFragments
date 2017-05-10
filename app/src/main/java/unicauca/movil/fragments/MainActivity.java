package unicauca.movil.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import unicauca.movil.fragments.fragments.ColorFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        putFragment(R.id.container1, ColorFragment.instance(ColorFragment.AZUL));
        putFragment(R.id.container2, ColorFragment.instance(ColorFragment.NARANJA));

    }

    public void putFragment(int container, Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(container, fragment);
        transaction.commit();
    }
}
