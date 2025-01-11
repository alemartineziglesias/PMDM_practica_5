package com.example.davinciapp.ui.pintor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.davinciapp.databinding.FragmentPintorBinding;

public class PintorFragment extends Fragment {

    private FragmentPintorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PintorViewModel pintorViewModel =
                new ViewModelProvider(this).get(PintorViewModel.class);

        binding = FragmentPintorBinding.inflate(inflater, container, false);


        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}