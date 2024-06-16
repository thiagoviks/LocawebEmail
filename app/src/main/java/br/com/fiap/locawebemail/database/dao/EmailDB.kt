package br.com.fiap.locawebemail.database.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.fiap.locawebemail.model.Email

@Database(entities = [Email::class], version = 1)
abstract class EmailDB : RoomDatabase(){
    abstract fun emailDao(): EmailDao

    companion object{
        private lateinit var instance: EmailDB

        fun getDatabase(context: Context): EmailDB{
            if (!::instance.isInitialized){
                instance = Room.databaseBuilder(
                    context, EmailDB::class.java,
                    "email_db" //name of the database
                )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance
        }
    }
}