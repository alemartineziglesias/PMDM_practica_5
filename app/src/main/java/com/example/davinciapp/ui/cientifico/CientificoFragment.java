package com.example.davinciapp.ui.cientifico;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.davinciapp.databinding.FragmentCientificoBinding;

public class CientificoFragment extends Fragment {

    private FragmentCientificoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CientificoViewModel cientificoViewModel =
                new ViewModelProvider(this).get(CientificoViewModel.class);

        binding = FragmentCientificoBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}