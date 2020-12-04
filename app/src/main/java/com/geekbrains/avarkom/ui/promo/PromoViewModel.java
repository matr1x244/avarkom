package com.geekbrains.avarkom.ui.promo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PromoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PromoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Внимание ⚠ \n Хочешь получить 300 рублей? \n Присоединяйся к гибдд12.рф в вайбере, и получай скидки и подарки!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}