package com.example.smahali1.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by SMAHALI1 on 12/28/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
