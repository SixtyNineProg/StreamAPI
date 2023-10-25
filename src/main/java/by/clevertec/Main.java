package by.clevertec;

import by.clevertec.model.Animal;
import by.clevertec.model.Car;
import by.clevertec.model.Examination;
import by.clevertec.model.Flower;
import by.clevertec.model.House;
import by.clevertec.model.Person;
import by.clevertec.model.Student;
import by.clevertec.util.Util;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    //    task1();
    //    task2();
    //    task3();
    //    task4();
    //    task5();
    //    task6();
//    task7();
    task8();
    task9();
    task10();
    task11();
    task12();
    task13();
    task14();
    task15();
    task16();
    task17();
    task18();
    task19();
    task20();
    task21();
    task22();
  }

  public static void task1() {
    AtomicInteger counter = new AtomicInteger();
    List<Animal> animals = Util.getAnimals();
    System.out.println(
        animals.stream()
            .filter(animal -> animal.getAge() >= 10 && animal.getAge() <= 20)
            .sorted(Comparator.comparingInt(Animal::getAge))
            .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / 7))
            .get(3));
  }

  public static void task2() {
    List<Animal> animals = Util.getAnimals();
    animals.stream()
        .filter(animal -> animal.getOrigin().equals("Japanese"))
        .forEach(
            animal -> {
              if (animal.getGender().equals("Female")) {
                animal.setBread(animal.getBread().toUpperCase());
              }
              System.out.println(animal);
            });
  }

  public static void task3() {
    List<Animal> animals = Util.getAnimals();
    animals.stream()
        .filter(animal -> animal.getAge() > 30)
        .map(Animal::getOrigin)
        .distinct()
        .filter(origin -> origin.startsWith("A"))
        .forEach(System.out::println);
  }

  public static void task4() {
    List<Animal> animals = Util.getAnimals();
    System.out.println(
        animals.stream().filter(animal -> animal.getGender().equals("Female")).count());
  }

  public static void task5() {
    List<Animal> animals = Util.getAnimals();
    System.out.println(
        animals.stream()
            .filter(animal -> animal.getAge() >= 20 && animal.getAge() <= 30)
            .anyMatch(animal -> animal.getOrigin().equals("Hungarian")));
  }

  public static void task6() {
    List<Animal> animals = Util.getAnimals();
    System.out.println(
        animals.stream()
            .anyMatch(
                animal ->
                    !animal.getGender().equals("Male") && !animal.getGender().equals("Female")));
  }

  public static void task7() {
    List<Animal> animals = Util.getAnimals();
    System.out.println(animals.stream().noneMatch(animal -> animal.getOrigin().equals("Oceania")));
  }

  public static void task8() {
    List<Animal> animals = Util.getAnimals();
    animals.stream()
        .sorted(Comparator.comparing(Animal::getBread))
        .limit(100)
        .forEach(System.out::println);
  }

  public static void task9() {
    List<Animal> animals = Util.getAnimals();
    //        animals.stream() Продолжить ...
  }

  public static void task10() {
    List<Animal> animals = Util.getAnimals();
    //        animals.stream() Продолжить ...
  }

  public static void task11() {
    List<Animal> animals = Util.getAnimals();
    //        animals.stream() Продолжить ...
  }

  public static void task12() {
    List<Person> persons = Util.getPersons();
    //        persons.stream() Продолжить ...
  }

  public static void task13() {
    List<House> houses = Util.getHouses();
    //        houses.stream() Продолжить ...
  }

  public static void task14() {
    List<Car> cars = Util.getCars();
    //        cars.stream() Продолжить ...
  }

  public static void task15() {
    List<Flower> flowers = Util.getFlowers();
    //        flowers.stream() Продолжить ...
  }

  public static void task16() {
    List<Student> students = Util.getStudents();
    //        students.stream() Продолжить ...
  }

  public static void task17() {
    List<Student> students = Util.getStudents();
    //        students.stream() Продолжить ...
  }

  public static void task18() {
    List<Student> students = Util.getStudents();
    List<Examination> examinations = Util.getExaminations();
    //        students.stream() Продолжить ...
  }

  public static void task19() {
    List<Student> students = Util.getStudents();
    //        students.stream() Продолжить ...
  }

  public static void task20() {
    List<Student> students = Util.getStudents();
    //        students.stream() Продолжить ...
  }

  public static void task21() {
    List<Student> students = Util.getStudents();
    //        students.stream() Продолжить ...
  }

  public static void task22() {
    List<Student> students = Util.getStudents();
    //        students.stream() Продолжить ...
  }
}
