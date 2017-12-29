package com.example.smahali1.criminalintent;

import android.content.Context;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by SMAHALI1 on 12/28/2017.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;

    private List<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #"+i);
            crime.setSolved(i % 2 ==0);
            mCrimes.add(crime);
        }
    }

    public Crime getCrime(UUID uuid){
        for (Crime crime: mCrimes) {
            if(crime.getId().equals(uuid)){
                return crime;
            }
        }
        return null;
    }

    public static CrimeLab getCrimeLab() {
        return sCrimeLab;
    }

    public static void setCrimeLab(CrimeLab crimeLab) {
        sCrimeLab = crimeLab;
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

}
