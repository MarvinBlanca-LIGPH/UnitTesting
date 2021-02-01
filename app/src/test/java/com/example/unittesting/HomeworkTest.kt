package com.example.unittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest {
    @Test
    fun `test if 0`() {
        val fib = Homework.fib(0)
        println(fib)
        assertThat(fib).isEqualTo(0)
    }

    @Test
    fun `test if 1`() {
        val fib = Homework.fib(1)
        println(fib)
        assertThat(fib).isEqualTo(1)
    }

    @Test
    fun `test if other number`() {
        val fib = Homework.fib(16)
        println(fib)
        assertThat(fib).isEqualTo(987)
    }

    @Test
    fun `login test`() {
        val login = Homework.login("user","pass")
        println(login)
        assertThat(login).isEqualTo("Success")
    }

    @Test
    fun `login error test`() {
        val login = Homework.login("user","xx")
        println(login)
        assertThat(login).isEqualTo("Failed")
    }
}