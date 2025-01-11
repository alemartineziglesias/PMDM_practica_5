package com.example.davinciapp.ui.escultor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.davinciapp.databinding.FragmentEscultorBinding;

public class EscultorFragment extends Fragment {

    private FragmentEscultorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        EscultorViewModel escultorViewModel =
                new ViewModelProvider(this).get(EscultorViewModel.class);

        binding = FragmentEscultorBinding.inflate(inflater, container, false);


        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}