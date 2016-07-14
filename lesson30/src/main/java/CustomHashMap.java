public class CustomHashMap {

    Node[] table;

    public CustomHashMap() {
        table = new Node[100];
    }

    public void put(Student key, Grade value) {
        int index = hash(key);

        Node node = new Node(key, value);

        if (table[index] == null) {
            table[index] = node;
            return;
        }

        Node currentNode = table[index];
        while (currentNode.next != null) {
            if (currentNode.key.equals(key)) {
                currentNode.value = value;
                return;
            }
            currentNode = currentNode.next;
        }

        currentNode.next = node;
    }

    private int hash(Student key) {
        return Math.abs(key.hashCode()) % 100;
    }

    public Grade get(Student key) {
        int index = hash(key);

        Node currentNode = table[index];
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                return currentNode.value;
            }

            currentNode = currentNode.next;
        }

        return null;
    }

    private class Node {

        private Student key;
        private Grade value;

        private Node next;

        public Node(Student key, Grade value) {
            this.key = key;
            this.value = value;
        }
    }

}
