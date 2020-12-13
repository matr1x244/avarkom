package com.geekbrains.avarkom.ui.promo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.geekbrains.avarkom.R;


public class PromoFragment extends Fragment {

    private static final String TAG = PromoFragment.class.getSimpleName(); // TAG для логов
    private final static boolean DEBAG = true; //включение DEBAGa для логов.
    private PromoViewModel promoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                                  ViewGroup container, Bundle savedInstanceState) {
        promoViewModel = ViewModelProviders.of(this).get(PromoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_promo, container, false);
        return root;
    }
}