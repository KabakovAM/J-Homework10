package Homework10;

import java.util.ArrayList;

public class IvanovFamily { // дерево семьи ивановых
        public static void main(String[] args) {
                ArrayList<FamilyTree<String>> family = new ArrayList<FamilyTree<String>>();
                FamilyTree<String> person1 = new FamilyTree<String>("Иванов", "Алексей", "Иванович", "25.10.1995", "м",
                                "1", "2", "3");
                FamilyTree<String> person2 = new FamilyTree<String>("Иванов", "Антон", "Иванович",
                                "02.09.1993", "м", "4", "2", "3");
                FamilyTree<String> person3 = new FamilyTree<String>("Иванов", "Иван", "Борисович",
                                "09.04.1975", "м", "2", "5", "6");
                FamilyTree<String> person4 = new FamilyTree<String>("Иванова", "Ольга", "Олеговна",
                                "16.07.1977", "ж", "3", "7", "8");
                FamilyTree<String> person5 = new FamilyTree<String>("Иванов", "Борис", "Евгеньевич",
                                "13.05.1944", "м", "5", "9", "10");
                FamilyTree<String> person6 = new FamilyTree<String>("Иванова", "Ангелина", "Никитична",
                                "05.01.1939", "ж", "6", "11", "12");
                FamilyTree<String> person7 = new FamilyTree<String>("Иванов", "Олег", "Витальевич",
                                "09.04.1936", "м", "7", "13", "14");
                FamilyTree<String> person8 = new FamilyTree<String>("Иванова", "Кристина", "Александровна",
                                "14.07.1938", "ж", "8", "15", "16");
                family.add(person1);
                family.add(person2);
                family.add(person3);
                family.add(person4);
                family.add(person5);
                family.add(person6);
                family.add(person7);
                family.add(person8);
                person1.printBrotherSister(family);
                person6.printChildrens(family);
                person2.printGrandParent(family);
                person4.printChildrens(family);
                person5.printChildrens(family);
                person7.printChildrens(family);
                person8.printChildrens(family);
                person1.printParent(family);
        }
}
