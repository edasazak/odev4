package com.example.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentBBinding;

public class BFragment extends Fragment {
    private FragmentBBinding binding;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBBinding.inflate(inflater, container, false);
        binding.buttonBdenY.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.sayfaBdenYyeGecis);
        });
        return binding.getRoot();
    }
}