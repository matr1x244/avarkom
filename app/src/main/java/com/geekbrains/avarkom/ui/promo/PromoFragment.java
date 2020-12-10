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

    /*
    public void btnViber(View view) {
        if (view.getId() == R.id.viber_chat) {
            Uri addres = Uri.parse("https://invite.viber.com/?g2=AQAGeqj2hdJKQ0xFqA6uyYtg6DPwDSUogFRwLftcGzah48i4o7Dn%2BjUAkp2HhSCt&lang=ru");
            Intent Web = new Intent(Intent.ACTION_VIEW, addres);
            if (DEBAG) {
                Log.d(TAG, "viber_chat");
                startActivity(Web);
            }
        }
    }
    */
}