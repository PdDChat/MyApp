package com.myapp.di;

import com.myapp.presentation.count.view.CountActivity;
import com.myapp.presentation.countDialog.view.CountDownDialogFragment;
import com.myapp.presentation.main.view.MainActivity;

import dagger.Component;

@Component (modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
    void inject(CountActivity activity);
    void inject(CountDownDialogFragment fragment);
}
