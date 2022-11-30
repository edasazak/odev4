package com.example.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavAction;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentXBinding;

public class XFragment extends Fragment {
    private FragmentXBinding binding;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentXBinding.inflate(inflater, container, false);
        binding.buttonXdenY.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.sayfaXdenYyeGecis);
        });
        return binding.getRoot();
    }
}