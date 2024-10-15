package LinkedList;

import java.util.Comparator;

public class MinionComparator implements Comparator<Minion> {

    @Override
    public int compare(Minion o1, Minion o2) {
        if (o1.getAge() == o2.getAge()) {
            if (o1.getName().equals(o2.getName())) {
                return o2.getEyes() - o1.getEyes();
            }
            return o1.getName().length() - o2.getName().length();
        }
        return o1.getAge() - o2.getAge();
    }
}
