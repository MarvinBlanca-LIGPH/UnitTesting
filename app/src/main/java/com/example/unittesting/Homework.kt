package com.example.unittesting

object Homework {

    /**
     * Returns the n-th fibonacci number
     * They are defined like this:
     * fib(0) = 0
     * fib(1) = 1
     * fib(n) = fib(n-2) + fib(n-1)
     */
    fun fib(n: Int): Long {
        if (n == 0 || n == 1) {
            return n.toLong()
        }
        var a = 0L
        var b = 1L
        var c = 1L
        (1 until n).forEach { _ ->
            c = a + b
            a = b
            b = c
        }
        return c
    }

    fun login(username: String, password: String): String {
        if (username.isNotEmpty() && password.length >= 4) return "Success"
        return "Failed"
    }
}