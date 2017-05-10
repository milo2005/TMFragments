package unicauca.movil.fragments.fragments;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import unicauca.movil.fragments.R;
import unicauca.movil.fragments.databinding.FragmentColorBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {

    public static final int AZUL = 0;
    public static final int ROJO = 1;
    public static final int AMARILLO = 2;
    public static final int NARANJA = 3;
    public static final int VIOLETA = 4;
    public static final int VERDE = 5;

    public static ColorFragment instance(int color){
        ColorFragment fragment = new ColorFragment();
        Bundle  args = new Bundle();
        args.putInt("color", color);
        fragment.setArguments(args);
        return fragment;
    }

    FragmentColorBinding binding;

    public ColorFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(getLayoutInflater(null),R.layout.fragment_color
                ,container, false);

        int pos = getArguments().getInt("color");
        binding.setPos(pos);

        return binding.getRoot();
    }

}
