package com.gevondov.core.screen.views.list

class ListValue(
    val items: List<Item>?
) {

    interface Item {
        val id: String
    }

}
