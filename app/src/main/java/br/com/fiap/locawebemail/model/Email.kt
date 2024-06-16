package br.com.fiap.locawebemail.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "tb_email")
data class Email(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val to: String,
    val subject: String,
    val sendedbydate: Date
)
