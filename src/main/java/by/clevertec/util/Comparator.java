package by.clevertec.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Comparator {
  public static int comparePersonsAge(int personAge1, int personAge2) {
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
}
