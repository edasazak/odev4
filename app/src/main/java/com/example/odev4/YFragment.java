package com.example.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentYBinding;

public class YFragment extends Fragment {
    private FragmentYBinding binding;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentYBinding.inflate(inflater, container, false);
        binding.buttonBitir.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.sayfaYdenAnasafyayaGecis);
        });
        return binding.getRoot();
    }
}