package com.pillpals.pillbuddies

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration
import com.pillpals.pillbuddies.data.Seed

class PillPalsApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        //val config = RealmConfiguration.Builder().build()
        val config = RealmConfiguration
            .Builder()
            .deleteRealmIfMigrationNeeded()
            .initialData(Seed())
            .build()
        Realm.setDefaultConfiguration(config)
    }
}
