package com.shuchenysh.exchangerates.pojo

class CurrencyList(val message: String) {

    private val list = mutableListOf<Currency>()

    fun getList(): MutableList<Currency> {
        return list
    }
}