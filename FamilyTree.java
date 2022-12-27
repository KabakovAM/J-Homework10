package Homework10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FamilyTree <T> implements FamilyTreeInterface<T> {
    private T lastName;
    private T firstName;
    private T secondName;
    private T birthday;
    private T sex;
    private T personalId;
    private T fatherId;
    private T motherId;

    public FamilyTree(T lastName, T firstName, T secondName, T birthday, T sex,
            T personalId,
            T fatherId, T motherId) {// Конструктор объекта.
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.sex = sex;
        this.personalId = personalId;
        this.fatherId = fatherId;
        this.motherId = motherId;
    }

    @Override
    public T setLastName (T lastName) { // Задаёт фамилию человека.
        return this.lastName = lastName;
    }

    @Override
    public T setFirstName(T firstName) { // Задаёт имя человека.
        return this.firstName = firstName;
    }

    @Override
    public T setSecondName(T secondName) { // Задаёт отчество человека.
        return this.secondName = secondName;
    }

    @Override
    public T setBirthday(T birthday) { // Задаёт день рождения человека.
        return this.birthday = birthday;
    }

    @Override
    public T setSex(T sex) { // Задаёт пол человека.
        return this.sex = sex;
    }

    @Override
    public T setPersonalId(T personalId) { // Задаёт персональный ID человека.
        return this.personalId = personalId;
    }

    @Override
    public T setFatherId(T fatherId) { // Задаёт ID отца человека.
        return this.fatherId = fatherId;
    }

    @Override
    public T setMotherId(T motherId) { // Задаёт ID матери человека.
        return this.motherId = motherId;
    }

    @Override
    public String toString() { // Перегрузка метода toString
        return lastName + " " + firstName + " " + secondName + ", " + birthday;
    }

    @Override
    public T getLastName() { // Возвращает фамилию человека.
        return lastName;
    }

    @Override
    public T getFirstName() { // Возвращает имя человека.
        return firstName;
    }

    @Override
    public T getSecondName() { // Возвращает отчество человека.
        return secondName;
    }

    @Override
    public T getPersonalId() { // Возвращает персональный ID человека.
        return personalId;
    }

    @Override
    public T getFatherId() { // Возвращает ID отца человека.
        return fatherId;
    }

    @Override
    public T getMotherId() { // Возвращает ID матери человека.
        return motherId;
    }

    @Override
    public T getSexId() { // Возвращает пол человека.
        return sex;
    }

    @Override
    public void printAll(ArrayList<FamilyTree<T>> familyList) { // Вывод всего дерева в консоль.
        for (FamilyTree<T> person : familyList) {
            System.out.println(person);
        }
    }

    @Override
    public void printParent(ArrayList<FamilyTree<T>> familyList) { // Вывод родителей в консоль.
        System.out.println("Родители " + this.getLastName() + " " + this.firstName + " " + this.secondName + ":");
        for (FamilyTree<T> person : familyList) {
            if (person.getPersonalId() == fatherId) {
                System.out.println("Отец:");
                System.out.println(person);
            } else if (person.getPersonalId() == motherId) {
                System.out.println("Мать:");
                System.out.println(person);
            }
        }
    }

    @Override
    public void printBrotherSister(ArrayList<FamilyTree<T>> familyList) { // Вывод братьев или сестёр в консоль.
        System.out
                .println("Братья и сёстры " + this.getLastName() + " " + this.firstName + " " + this.secondName + ":");
        for (FamilyTree<T> person : familyList) {
            if (person.getFatherId() == fatherId && person.getPersonalId() != personalId) {
                if (person.getSexId() == "м") {
                    System.out.println("Брат:");
                    System.out.println(person);
                } else {
                    System.out.println("Сестра:");
                    System.out.println(person);
                }
            }
        }
    }

    @Override
    public void printChildrens(ArrayList<FamilyTree<T>> familyList) { // Вывод детей в консоль.
        System.out.println("Дети " + this.getLastName() + " " + this.firstName + " " + this.secondName + ":");
        for (FamilyTree<T> person : familyList) {
            if (person.getFatherId() == personalId) {
                if (person.getSexId() == "м") {
                    System.out.println("Сын:");
                    System.out.println(person);
                } else {
                    System.out.println("Дочь:");
                    System.out.println(person);
                }
            }
        }
    }

    @Override
    public void printGrandParent(ArrayList<FamilyTree<T>> familyList) { // Вывод дедушек или бабушек в консоль.
        System.out.println(
                "Бабушки и дедушки " + this.getLastName() + " " + this.firstName + " " + this.secondName + ":");
        for (FamilyTree<T> person : familyList) {
            if (person.getPersonalId() == fatherId || person.getPersonalId() == motherId) {
                for (FamilyTree<T> person2 : familyList) {
                    if (person.getFatherId() == person2.getPersonalId()) {
                        System.out.println("Дедушка:");
                        System.out.println(person2);
                    } else if (person.getMotherId() == person2.getPersonalId()) {
                        System.out.println("Бабушка:");
                        System.out.println(person2);
                    }
                }
            }
        }
    }

    @Override
    public void familyTreeToFile(ArrayList<FamilyTree<T>> familyList) { // Сохранение дерева в файл.
        try (FileWriter writer = new FileWriter("tree.txt", true)) {
            for (FamilyTree<T> person : familyList) {
                writer.write(person.toString() + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
