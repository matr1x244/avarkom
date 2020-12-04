package com.geekbrains.avarkom.ui.firma;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FirmashowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FirmashowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("ИП Ковалёва Ю.С.\n" +
                "инн 121524178574 огрнип 316121500063612\n" +
                "Городская Инспекция Безопасности Дорожного Движения\n" +
                "г.Йошкар-Ола, ул.Красноармейская, д.84а, офис 2.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}