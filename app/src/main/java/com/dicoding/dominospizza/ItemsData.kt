package com.dicoding.dominospizza

import java.util.ArrayList

object ItemsData {
    private val itemsTitles = arrayOf(
        "American Classic Cheeseburger",
        "Cheesy Meatball Blast",
        "Chicken Dominator",
        "Grilled Beef Supreme",
        "Ultimate Cheese Melt",
        "NewYorker Alfredo Beef Mushroom Truffle",
        "NewYorker Alfredo Chicken Mushroom Truffle",
        "Mexican Beef Nachos",
        "Mexican Chicken Nachos",
        "Chicken Lovers"
    )

    private val itemsDetails = arrayOf(
        "Tomato Sauce, Mustard Sauce, Tomato, Beef Rasher, Beef Crumble, Onion, Slice Cheese, Mozzarella Cheese",
        "BBQ Sauce, Liquid Cheese Sauce, Onion, Meatball, Parsley, Champignon Mushroom, Mozzarella Cheese",
        "Rustic Sauce, Green Paprika, Corn, Chili Chicken, Chicken Pepperoni, Chicken Sausage, Onion, Mozzarella Cheese",
        "BBQ Sauce, Cheese Sauce, Onion, Beef Burger, Jalapeno, Mozzarella Cheese",
        "Liquid Cheese Sauce,Keju Mozzarella, Cheddar Cheese Sauce, Keju Ricotta, Mozzarella String, Keju Parmesan, Parsley",
        "Truffle Alfredo Sauce, Keju Mozzarella, Beef Burger, Onion, Jamur Champignon, Keju Parmesan, Parsley",
        "Truffle Alfredo Sauce, Keju Mozzarella, Chili Chicken, Onion, Jamur Champignon, Keju Parmesan, Parsley",
        "Saus Domino's Pizza, Keju Mozzarella, Saus Keju Cheddar, Liquid Cheese Sauce, Beef Burger, Beef Crumble, Bawang, Tomat, Jalapeno, Mexican Seasoning, Nachos Chips",
        "Saus Domino's Pizza, Keju Mozzarella, Saus Keju Cheddar, Liquid Cheese Sauce, Chili Chicken, Sosis Ayam, Bawang, Tomat, Jalapeno, Mexican Seasoning, Nachos Chips",
        "Tomato Sauce, Chicken Rasher, parsley, Chicken Pepperoni, Marinated Chicken, Cheesy Bites, Mozzarella Cheese"
    )

    private val itemsImages = intArrayOf(
        R.drawable.american_classic_cheeseburger,
        R.drawable.meatball_pizza,
        R.drawable.chiken_dominator,
        R.drawable.grill_beef_supreme,
        R.drawable.ultimatecheesemeltnew,
        R.drawable.newyorkeralfredobeefmushroomtrufflebig,
        R.drawable.newyorkeralfredochickenmushroomtrufflebig_1,
        R.drawable.mexicanbeefnachos,
        R.drawable.mexicanchickennachos_1,
        R.drawable.chiken_lovers
    )

    val listData: ArrayList<Items>
        get() {
            val list = arrayListOf<Items>()
            for (position in itemsTitles.indices) {
                val item = Items()
                item.titles = itemsTitles[position]
                item.descriptions = itemsDetails[position]
                item.images = itemsImages[position]
                list.add(item)
            }
            return list
        }
}
