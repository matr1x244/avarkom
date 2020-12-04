package com.geekbrains.avarkom.ui.firma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.geekbrains.avarkom.R;

public class FirmashowFragment extends Fragment {

    private FirmashowViewModel firmashowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        firmashowViewModel =
                ViewModelProviders.of(this).get(FirmashowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_firma, container, false);
        final TextView textView = root.findViewById(R.id.text_firma_header);
        firmashowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}