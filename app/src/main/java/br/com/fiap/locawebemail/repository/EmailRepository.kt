package br.com.fiap.locawebemail.repository

import android.content.Context
import br.com.fiap.locawebemail.database.dao.EmailDB
import br.com.fiap.locawebemail.model.Email

class EmailRepository(context: Context) {

    private val db = EmailDB.getDatabase(context).emailDao()

    fun save(email: Email){
        return db.save(email)
    }

    fun update(email: Email){
        return db.update(email)
    }

    fun delete(email: Email){
        return db.delete(email)
    }

    fun listAllEmail(): List<Email>{
        return db.listAllEmail()
    }

    fun findEmailBySubject(subject: String): Email{
        return db.findEmailBySubject(subject)
    }
}