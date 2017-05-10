package unicauca.movil.fragments;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import unicauca.movil.fragments.adapters.ColorAdapter;
import unicauca.movil.fragments.databinding.ActivityTabsBinding;
import unicauca.movil.fragments.fragments.ColorFragment;

public class TabsActivity extends AppCompatActivity {

    ActivityTabsBinding binding;
    ColorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tabs);
        setSupportActionBar(binding.toolbar);

        List<Fragment> data = new ArrayList<>();
        data.add(ColorFragment.instance(ColorFragment.AZUL));
        data.add(ColorFragment.instance(ColorFragment.ROJO));
        data.add(ColorFragment.instance(ColorFragment.AMARILLO));
        data.add(ColorFragment.instance(ColorFragment.NARANJA));
        data.add(ColorFragment.instance(ColorFragment.VIOLETA));
        data.add(ColorFragment.instance(ColorFragment.VERDE));

        adapter = new ColorAdapter(getSupportFragmentManager(), data);
        binding.pager.setAdapter(adapter);

        binding.tabs.setupWithViewPager(binding.pager);
    }
}
