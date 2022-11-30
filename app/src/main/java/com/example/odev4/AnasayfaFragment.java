package com.example.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentAnasayfaBinding;

public class AnasayfaFragment extends Fragment {
private FragmentAnasayfaBinding binding;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);
        binding.buttonGitA.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.sayfaAyaGecis);
        });
        binding.buttonGitX.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.sayfaXeGecis);
        });
        return binding.getRoot();
    }
}