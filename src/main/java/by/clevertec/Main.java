package by.clevertec;

import static by.clevertec.util.Util.BUILDING_TYPE_HOSPITAL;

import by.clevertec.model.Animal;
import by.clevertec.model.Car;
import by.clevertec.model.Examination;
import by.clevertec.model.Flower;
import by.clevertec.model.House;
import by.clevertec.model.Person;
import by.clevertec.model.Student;
import by.clevertec.util.TimeUtil;
import by.clevertec.util.Util;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static final String FEMALE = "Female";
  public static final String MALE = "Male";

  public static void main(String[] args) {
    //    task1();
    //    task2();
    //    task3();
    //    task4();
    //    task5();
    //    task6();
    //    task7();
    //    task8();
    //    task9();
    //    task10();
    //    task11();
    //    task12();
//    task13();
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
              if (animal.getGender().equals(FEMALE)) {
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
        animals.stream().filter(animal -> animal.getGender().equals(FEMALE)).count());
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
                animal -> !animal.getGender().equals(MALE) && !animal.getGender().equals(FEMALE)));
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
    System.out.println(
        animals.stream()
            .map(animal -> animal.getBread().toCharArray())
            .min(Comparator.comparingInt(arr -> arr.length))
            .map(arr -> arr.length)
            .orElse(0));
  }

  public static void task10() {
    List<Animal> animals = Util.getAnimals();
    System.out.println(animals.stream().map(Animal::getAge).mapToInt(Integer::intValue).sum());
  }

  public static void task11() {
    List<Animal> animals = Util.getAnimals();
    System.out.println(
        animals.stream()
            .filter(animal -> animal.getOrigin().equals("Indonesian"))
            .map(Animal::getAge)
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0));
  }

  public static void task12() {
    List<Person> persons = Util.getPersons();
    persons.stream()
        .filter(person -> person.getGender().equals(MALE))
        .filter(
            person ->
                TimeUtil.getYearsBetweenDateAndNow(person.getDateOfBirth()) > 18
                    && TimeUtil.getYearsBetweenDateAndNow(person.getDateOfBirth()) < 27)
        .sorted(Comparator.comparingInt(Person::getRecruitmentGroup))
        .limit(200)
        .forEach(System.out::println);
  }

  public static void task13() {
    List<House> houses = Util.getHouses();
    List<Person> personsFromHospital =
        houses.stream()
            .filter(house -> house.getBuildingType().equals(BUILDING_TYPE_HOSPITAL))
            .map(House::getPersonList)
            .flatMap(Collection::stream)
            .toList();
    List<Person> childrenAndOldMen =
        houses.stream()
            .filter(house -> !house.getBuildingType().equals(BUILDING_TYPE_HOSPITAL))
            .map(House::getPersonList)
            .flatMap(Collection::stream)
            .sorted((person1, person2) -> comparePersonsAge(person1.getAge(), person2.getAge()))
            .limit(getEmptyPlacesFirstWave(personsFromHospital))
            .toList();
    List<Person> firstWave =
        Stream.of(personsFromHospital, childrenAndOldMen)
            .flatMap(Collection::stream)
            .peek(System.out::println)
            .toList();
  }

  private static int comparePersonsAge(int personAge1, int personAge2) {
    boolean isPerson1childrenOrOldMen = isChildrenOrOldMen(personAge1);
    boolean isPerson2childrenOrOldMen = isChildrenOrOldMen(personAge2);
    if (isPerson1childrenOrOldMen && !isPerson2childrenOrOldMen) {
      return -1;
    } else if (isPerson2childrenOrOldMen && !isPerson1childrenOrOldMen) {
      return 1;
    } else {
      return 0;
    }
  }

  private static boolean isChildrenOrOldMen(int personAge1) {
    return personAge1 < 18 || personAge1 > 65;
  }

  private static int getEmptyPlacesFirstWave(List<Person> personsFromHospital) {
    return Math.max(500 - personsFromHospital.size(), 0);
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
    students.stream()
        .filter(student -> student.getAge() < 18)
        .sorted(Comparator.comparing(Student::getSurname))
        .forEach(System.out::println);
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
