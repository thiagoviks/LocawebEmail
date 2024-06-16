package br.com.fiap.locawebemail.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.fiap.locawebemail.model.Email


@Dao
interface EmailDao {

    @Insert
    fun save(email: Email)

    @Update
    fun update(email: Email)

    @Delete
    fun delete(email: Email)

    @Query("Select * FROM tb_email WHERE subject = :subject")
    fun findEmailBySubject(subject: String): Email

    @Query("SELECT * FROM tb_email ORDER BY sendedbydate ASC")
    fun listAllEmail(): List<Email>
}