package com.epam.l7;

public class Cat {
    String catName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return catName != null ? catName.equals(cat.catName) : cat.catName == null;
    }

    @Override
    public int hashCode() {
        return catName != null ? catName.hashCode() : 0;
    }

    @Override

    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                '}';
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Cat(String catName) {

        this.catName = catName;
    }
}
