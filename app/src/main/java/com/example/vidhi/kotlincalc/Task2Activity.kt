package com.example.vidhi.kotlincalc

import android.icu.lang.UCharacter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.text.TextUtils
import android.util.Log
import java.util.*

class Task2Activity : AppCompatActivity() {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val emails: Array<String> = arrayOf("v@gmail.com", "a@gmail.com", "p@git.org.in", "b@git.org.in")
    val lamda = numbers.map({ x -> x * 2 })
    val numSquare:Array<Int> = arrayOf(1,2,3,4,5)
    val square =numSquare.map({x->x*x})
    val list: List<String> = listOf("a", "b", "c", "d", "e")
    var name: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task2)

        println("""task 13:
                    vidhi
                    patel""")
        println(lamda)

        var nEmails: List<String> = emails.filter { it.endsWith("com") }
        println(nEmails)
        chechNull(8)
        println(square)


        var user1 = User("vidhi", "v@gmail.com")
        var user2 = User("priya", "p@git.org.in")
        var user3 = User("abc", "abc@gmail.com")


        val mUser: Array<User> = arrayOf(user1, user2, user3)
        mUser.filter { it.email.endsWith("com") }.forEach { println(it) }

        val user4 = user1.copy(name = "xyz")
        println("Copy function " + user4)

        task5(list1 = list, sp = "#", ed = "}")

        val myUser2 = User2("", "abcd@gmail.com").apply { extractName() }
        println(myUser2)
        task9().let { myString -> println(myString) }

        var r1 = task10(3)
        with(r1) {
            for (i in 1..50) {
                inc()
            }
            println(myInt)

            for (i in 1..20) {
                dec()
            }
            println(myInt)
            Log.d("TAG","task"+myInt)
        }

        user1.isUserOf("gmail")
        println(user1 isUserOf "Gmail")




    }


    fun task9() = "hiiii"

    fun chechNull(mInt: Int?) {
        if (mInt != null) {
            println(mInt)
        } else {
            println(" Task : 8 ......myInt is null Integer")
        }
    }

    data class User(val name: String = "", val email: String = "") {
        infix fun isUserOf(string: String): Boolean {
            return this.email.contains("@$string.", ignoreCase = true)
        }
    }


}


data class User2(var name: String, var email: String) {
    fun extractName() {
        name = if (name.isEmpty()) email.split("@")[0].capitalize() else name
    }
}

data class task10(var myInt: Int) {
    fun inc() = ++myInt
    fun dec() = --myInt

}


fun task5(sd: String = "[", list1: List<String>, sp: String = ",", ed: String = "]") {
    println(sd + TextUtils.join(sp, list1) + ed)
}



