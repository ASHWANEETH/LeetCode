class MyHashMap {

    class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    Node[] map;
    int size = 1000;

    public MyHashMap() {
        map = new Node[size];
    }

    public void put(int key, int value) {

        int index = key % size;

        if (map[index] == null) {
            map[index] = new Node(key, value);
            return;
        }

        Node curr = map[index];

        while (true) {

            if (curr.key == key) {
                curr.value = value;
                return;
            }

            if (curr.next == null)
                break;

            curr = curr.next;
        }

        curr.next = new Node(key, value);
    }

    public int get(int key) {

        int index = key % size;

        Node curr = map[index];

        while (curr != null) {

            if (curr.key == key)
                return curr.value;

            curr = curr.next;
        }

        return -1;
    }

    public void remove(int key) {

        int index = key % size;

        Node curr = map[index];
        Node prev = null;

        while (curr != null) {

            if (curr.key == key) {

                if (prev == null) {
                    map[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }

                return;
            }

            prev = curr;
            curr = curr.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */