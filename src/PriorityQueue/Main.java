package PriorityQueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    String runPriorityQueue(String input) {
        Scanner scanner = new Scanner(input);
        int capacity = Integer.parseInt(scanner.nextLine());

        TreeSet<Entry> queue = new TreeSet<>();

        String line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] params = line.split(" ");
            if (params[0].equals("enqueue")) {
                if (queue.size() < capacity) {
                    queue.add(new Entry(Integer.parseInt(params[1]), Integer.parseInt(params[2])));
                } else if (queue.size() == capacity) {
                    boolean hasBiggerPriority = queue.last().getPriority() < Integer.parseInt(params[2]) ? true : false;
                    if (hasBiggerPriority) {
                        queue.pollLast();
                        queue.add(new Entry(Integer.parseInt(params[1]), Integer.parseInt(params[2])));
                    }
                }
            } else if (params[0].equals("dequeue")) {
                queue.pollFirst();
            }
        }
        return queueToStringResult(queue);
    }

    private String queueToStringResult(Collection<Entry> queue) {
        StringBuilder builder = new StringBuilder();
        for(Entry current : queue) {
            builder.append(current.toString()+ "\n");
        }

        return builder.toString();
    }
}

class Entry implements Comparable<Entry>{
    private int value;
    private int priority;

    public Entry(int value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return this.value + " " + this.priority;
    }

    @Override
    public int compareTo(Entry o) {
        return this.priority <= o.getPriority() ? 1 : -1;
    }
}