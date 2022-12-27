package Homework10;

import java.util.ArrayList;

public interface FamilyTreeInterface <T>{
    T setLastName(T lastName); // Задаёт фамилию человека.

    T setFirstName(T firstName); // Задаёт имя человека.

    T setSecondName(T secondName); // Задаёт отчество человека.

    T setBirthday(T birthday); // Задаёт день рождения человека.

    T setSex(T sex); // Задаёт пол человека.

    T setPersonalId(T personalId); // Задаёт персональный ID человека.

    T setFatherId(T fatherId); // Задаёт ID отца человека.

    T setMotherId(T motherId); // Задаёт ID матери человека.

    T getLastName(); // Возвращает фамилию человека.

    T getFirstName(); // Возвращает имя ID человека.

    T getSecondName(); // Возвращает отчество ID человека.

    T getPersonalId(); // Возвращает персональный ID человека.

    T getFatherId(); // Возвращает ID отца человека.

    T getMotherId(); // Возвращает ID матери человека.

    T getSexId(); // Возвращает пол человека.

    void printAll(ArrayList<FamilyTree<T>> family); // Вывод всего дерева в консоль.

    void printParent(ArrayList<FamilyTree<T>> family); // Вывод родителей в консоль.

    void printBrotherSister(ArrayList<FamilyTree<T>> family); // Вывод братьев или сестёр в консоль.

    void printChildrens(ArrayList<FamilyTree<T>> family); // Вывод детей в консоль.

    void printGrandParent(ArrayList<FamilyTree<T>> family); // Вывод дедушек или бабушек в консоль.

    void familyTreeToFile(ArrayList<FamilyTree<T>> family); // Сохранение дерева в файл.
}
