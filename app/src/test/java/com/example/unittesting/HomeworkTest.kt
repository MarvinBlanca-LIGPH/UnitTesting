package com.example.unittesting

import com.google.common.truth.Truth.assertThat
import junit.framework.TestCase

class HomeworkTest : TestCase() {
    fun `test if 0`() {
        val fib = Homework.fib(0)
        println(fib)
        assertThat(fib)
    }

    fun `test if 1`() {
        val fib = Homework.fib(1)
        println(fib)
        assertThat(fib)
    }

    fun `test if other number`() {
        val fib = Homework.fib(16)
        println(fib)
        assertThat(fib)
    }
}