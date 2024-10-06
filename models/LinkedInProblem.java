package models;

import java.util.List;

public class LinkedInProblem {
    public static void main(String[] args) {

    }
}

class Item {
    protected String name;
    protected Category category;

    public Item(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    enum Category {ELECTRONICS, BOOKS, FASHION}

    //TODO: Replace PLACEHOLDER_FUNCTIONAL_INTERFACE with appropriate functional interface
    interface SearchCriteria extends PLACEHOLDER_FUNCTIONAL_INTERFACE { }
}

class ItemSearchEngine {
    private static List<Item> storedItems = List.of( new Item("A", Item.Category.ELECTRONICS),
                                                     new Item("B", Item.Category.BOOKS));

    static void searchAndPrint(Item.SearchCriteria criteria) {
        for(Item item: storedItems) {
            if(criteria.test(item)) { System.out.println("Item " + item.name + " satisfied criteria"); }
        }
    }
}